package models

import play.api.libs.json._
import play.api.libs.functional.syntax._

case class Numeros(numeros: Seq[Double], operacion: String)
object Numeros{
  
  implicit val numerosReads: Reads[Numeros] = (
    (JsPath \ "numeros").read[Seq[Double]] and
    (JsPath \ "operacion").read[String] 
  )(Numeros.apply _)
  
   //Leer el objeto Place como JSON
  implicit val numerosWrites: Writes[Numeros] = (
    (JsPath \ "numeros").write[Seq[Double]] and
    (JsPath \ "operacion").write[String]
  )(unlift(Numeros.unapply))
  
}