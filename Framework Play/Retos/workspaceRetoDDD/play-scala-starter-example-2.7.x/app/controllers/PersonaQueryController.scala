package controllers

import javax.inject._

import play.api._
import play.api.libs.json.{Json, Writes}
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}

import services.PersonaQueryService
import dto.Respuesta

@Singleton
class PersonaQueryController @Inject()(cc: ControllerComponents, personaService: PersonaQueryService)(implicit executionContext: ExecutionContext) extends AbstractController(cc){
  
  def obtenerTodos() = Action.async { implicit request: Request[AnyContent] =>
    val personasFuture= personaService.obtenerTodos()
    personasFuture.map{s =>
      val respuesta= Respuesta(true, "Personas recuperadas correctamente", s)
      Ok(Json.toJson(respuesta))
    }
  }
  
  def obtenerPersona(idPersona: Int) = Action.async{ implicit request: Request[AnyContent] =>
    val personaFuture= personaService.obtenerPersona(idPersona)
    personaFuture.map{s=> 
      if(s.size==1){
        val respuesta= Respuesta(true, "Persona recuperada correctamente", s)
        Ok(Json.toJson(respuesta))  
      }else{
        val respuesta= Respuesta(false, "Persona no encontrada", s)
        NotFound(Json.toJson(respuesta))
      }
    }
  }
  
}