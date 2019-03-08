package dto

import play.api.libs.json._
import play.api.libs.functional.syntax._
import models.Persona

case class Respuesta(success: Boolean, mensaje: String, data: Seq[Persona])
object Respuesta {
  implicit val respuestaJson=  new Writes[Respuesta] {
    def writes(respuesta: Respuesta) = Json.obj(
      "success" -> respuesta.success,
      "mensaje" -> respuesta.mensaje,
      "data" -> respuesta.data
    )
  }    
}