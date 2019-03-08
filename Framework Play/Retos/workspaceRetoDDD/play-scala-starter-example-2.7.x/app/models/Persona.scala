package models

import java.sql.Date
import play.api.libs.json._

case class Persona(id: Int, documento: String, nombres: String, apellidos: String, fecha_nacimiento: Date, telefono: String)
object Persona {
  implicit val personaFormat= Json.format[Persona]
}