package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.mvc.Results._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import scala.concurrent.TimeoutException

@Singleton
class FutureController @Inject()(cc: ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc){
  
  def algunFuturo= Action.async{
    FutureObject.devolverEstadoFuturo().map { result =>
      Ok(s"El estado del futuro es: ${result}")
    }.recover {
      case e: TimeoutException =>
        InternalServerError("Calculation timed out!")
    }
  }
  
}

object FutureObject{
      
  def devolverEstadoFuturo(): Future[String] = {
    Future.successful("Malo")
  }
  
}