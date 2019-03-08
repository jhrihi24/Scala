package actors

import akka.actor._

object HolaPersona {
  def props = Props[HolaPersona]
  
  case class SaludarPersona(nombre: String)
}

class HolaPersona extends Actor{
  import HolaPersona._
  
  def receive = {
    case SaludarPersona(nombre: String) =>
      sender() ! s"Hola, ${nombre}"    
  }  
}