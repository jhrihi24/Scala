package models


import play.api.libs.json._
import play.api.libs.functional.syntax._

case class Persona(id: Int, nombreCompleto: String)
object Persona {
  
 implicit val placeWrites: Writes[Persona] = (
    (JsPath \ "id").write[Int] and
    (JsPath \ "nombreCompleto").write[String]
  )(unlift(Persona.unapply))
    
  implicit val placeReads: Reads[Persona] = (
    (JsPath \ "id").read[Int] and
    (JsPath \ "nombre").read[String]
  )(Persona.apply _)
  
  var listPersona: List[Persona] = {
    List(
      Persona(
        1,
        "Jhon Edison Rivera"
      ),
      Persona(
        2,
        "Maria Clara Cardona"
      ),
      Persona(
        3,
        "Jhon Esteban Serna"
      )
    )
  }
  
}