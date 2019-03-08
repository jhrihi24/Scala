package controllers

import play.api.libs.json._
import play.api.libs.functional.syntax._

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class JsonController  @Inject()(cc: ControllerComponents) extends AbstractController(cc){
      
      def getJson() = Action { implicit request: Request[AnyContent] =>
        val json= JsonController.llenarJson()
        Ok(s"Estructura ${json.toString()} nombres solos: ${getNombresBarrios(json)}")
      }
      
      def getNombresBarrios(json: JsValue): String = {
        val nameResult: JsResult[String] = (json \ "nombre").validate[String]
        nameResult.toString()
      }
    
}

case class Barrio(nombre: String, indicativo: Int)
case class Ciudad(nombre: String, barrios: Seq[Barrio])
object JsonController{
    
  implicit val barrioJson=  new Writes[Barrio] {
    def writes(barrio: Barrio) = Json.obj(
      "nombre" -> barrio.nombre,
      "indicativo" -> barrio.indicativo
    )
  }
  
  implicit val ciudadJson= new Writes[Ciudad] {
    def writes(ciudad: Ciudad) = Json.obj(
      "nombre" -> ciudad.nombre,
      "barrios" -> ciudad.barrios
    )
  }  
  
  def llenarJson(): JsValue = {
      val place= Ciudad("Medellin", Seq(
        Barrio("Soledad", 1),
        Barrio("Robledo", 2)
      ))
      
      Json.toJson(place)
  } 
}