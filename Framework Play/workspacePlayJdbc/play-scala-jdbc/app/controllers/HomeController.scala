package controllers

import play.api.cache._
import play.api.mvc._
import javax.inject.Inject

import javax.inject.Inject
import javax.inject.Singleton
import play.api.db.Database
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.Writes
import play.api.mvc.BaseController
import play.api.mvc.ControllerComponents
import scala.collection.mutable.ListBuffer
import scala.concurrent.ExecutionContext
import play.api.libs.json._
import play.api.libs.functional.syntax._
import java.sql._

import scala.concurrent.Future
import scala.concurrent.TimeoutException
import scala.concurrent.duration._

@Singleton
class HomeController @Inject()(cache: AsyncCacheApi, db: Database, val controllerComponents: ControllerComponents)(implicit ec: ExecutionContext) extends BaseController{
  
        
    def obtenerTodos = Action.async {
        val futureUser: Future[List[Persona]] = cache.getOrElseUpdate[List[Persona]]("item.personas") {             
          val personasList= consultarPersonas()
          cache.set("item.personas", personasList, 15.minutes)
          Future.successful(personasList)
        }
        futureUser.map(f => {
          val resultMap= HomeController.llenarComunidadJson(f)
          Ok(s"las personas son: ${resultMap}")
        })
    }
    
    def consultarPersonas(): List[Persona] = {
       val resultado= db.withConnection{implicit connection =>
         val stmt = connection.createStatement
         val rs = stmt.executeQuery("SELECT * FROM `Personas`")
         var personasListBuffer= new ListBuffer[Persona]();
         while (rs.next()) {
           personasListBuffer += new Persona(rs.getString("nombres"), rs.getString("apellidos"), rs.getInt("edad"), rs.getString("telefono"), rs.getString("nroDocumento"))      
         }
         val personalist = personasListBuffer.toList
         personalist
       }
       resultado
    }
    
    def validateJson[A : Reads] = parse.json.validate(
      _.validate[A].asEither.left.map(e => BadRequest(JsError.toJson(e)))
    )
    
    import Persona._
    def guardarPersona = Action(validateJson[Persona]) { request =>
      val persona= request.body
      val inserto= db.withConnection { implicit connection =>
        val preparedStmt: PreparedStatement = connection.prepareStatement("INSERT INTO `Personas`(`nombres`, `apellidos`, `edad`, `telefono`, `nroDocumento`) VALUES (?,?,?,?,?)")           
        preparedStmt.setString(1, persona.nombres)
        preparedStmt.setString(2, persona.apellidos)
        preparedStmt.setInt(3, persona.edad)
        preparedStmt.setString(4, persona.telefono)
        preparedStmt.setString(5, persona.nroDocumento)          
        val sw= preparedStmt.executeUpdate()
        sw
      }
      if(inserto > 0) Ok("Persona guardada con exito") else InternalServerError("No se pudo insertar")
      
    }
    
    def modificarPersona = Action(validateJson[Persona]) { request =>
      val persona= request.body
      val inserto= db.withConnection { implicit connection =>
        val preparedStmt: PreparedStatement = connection.prepareStatement("UPDATE `Personas` SET `nombres`=?,`apellidos`=?,`edad`=?,`telefono`=? WHERE `nroDocumento`=?")           
        preparedStmt.setString(1, persona.nombres)
        preparedStmt.setString(2, persona.apellidos)
        preparedStmt.setInt(3, persona.edad)
        preparedStmt.setString(4, persona.telefono)
        preparedStmt.setString(5, persona.nroDocumento)          
        val sw= preparedStmt.executeUpdate()
        sw
      }
      if(inserto > 0) Ok("Persona modificada con exito") else InternalServerError("No se pudo modificar")
    }
    
    def eliminarPersona = Action (validateJson[Persona]) { request =>
      val persona= request.body
      val inserto= db.withConnection { implicit connection =>
        val preparedStmt: PreparedStatement = connection.prepareStatement("DELETE FROM `Personas` WHERE `nroDocumento`=?")           
        preparedStmt.setString(1, persona.nroDocumento)          
        val sw= preparedStmt.executeUpdate()
        sw
      }
      if(inserto > 0) Ok("Persona eliminada con exito") else InternalServerError("No se pudo eliminar")
    }

}

case class Persona(nombres: String, apellidos: String, edad: Int, telefono: String, nroDocumento: String)
case class Comunidad(personas: List[Persona])
object HomeController{
    
  implicit val personaJsonWrites=  new Writes[Persona] {
    def writes(persona: Persona) = Json.obj(
      "nombres" -> persona.nombres,
      "apellidos" -> persona.apellidos,
      "edad" -> persona.edad,
      "telefono" -> persona.telefono,
      "nroDocumento" -> persona.nroDocumento
    )
  }
  
  implicit val comunidadJsonWrites=  new Writes[Comunidad] {
    def writes(comunidad: Comunidad) = Json.obj(
      "personas" -> comunidad.personas
    )
  }
        
  def llenarComunidadJson(personas: List[Persona]): JsValue = {
      val comunidad= Comunidad(personas)      
      Json.toJson(comunidad)
  }  
  
}

object Persona{
   implicit val personaJsonReads: Reads[Persona] = (
    (JsPath \ "nombres").read[String] and
    (JsPath \ "apellidos").read[String] and
    (JsPath \ "edad").read[Int] and
    (JsPath \ "telefono").read[String] and
    (JsPath \ "nroDocumento").read[String]
  )(Persona.apply _)
}