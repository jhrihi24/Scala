package controllers

import javax.inject._

import play.api.mvc._
import services.PersonaService

import play.api.libs.json._
import play.api.libs.functional.syntax._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import scala.concurrent.TimeoutException
import services.PersonaService

@Singleton
class PersonaController @Inject() (cc: ControllerComponents, personaService: PersonaService)(implicit ec: ExecutionContext) extends AbstractController(cc) {
  
  def buscarId(id: Int) = Action { implicit request: Request[AnyContent] =>
    val resultado= personaService.buscarPorId(id)
    if(resultado.size>0) Ok(s"Resultado: ${resultado.toString()}") else NotFound("No se encontro la persona")
  }
  
  def buscarNombre(nombre: String) = Action { implicit request: Request[AnyContent] =>
    val resultado= personaService.buscarPorNombre(nombre)
    if(resultado.size>0) Ok(s"Resultado: ${resultado.toString()}") else NotFound("No se encontro la persona")
  }
  
}