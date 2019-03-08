package controllers

import play.api.mvc._
import akka.actor._
import akka.pattern.ask
import akka.util.Timeout
import javax.inject._
import actors.HolaPersona._
import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

@Singleton
class UsoActoresController  @Inject()(@Named("hola-persona") holaPersona: ActorRef, cc:ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc){
    
    implicit val timeout: Timeout = 5.seconds
  
    def decirHola(nombre: String) = Action.async{
      (holaPersona ? SaludarPersona(nombre)).mapTo[String].map{
        mensaje => Ok(mensaje)
      }
    }
  
}