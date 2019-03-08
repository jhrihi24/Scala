package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.mvc.Results._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext

@Singleton
class ActionsCompositionController @Inject()(loggingAction: LoggingAction, cc: ControllerComponents) extends AbstractController(cc){
  
  def index = loggingAction {
    Ok("Logueado correctamente")
  }
  
}

class LoggingAction @Inject() (parser: BodyParsers.Default)(implicit ec: ExecutionContext) extends ActionBuilderImpl(parser) {
  override def invokeBlock[A](request: Request[A], block: (Request[A]) => Future[Result]) = {
    request.headers.get("tkn") match {
      case Some(s) => block(request)
      case None => Future.successful(Forbidden("No se pudo loggear"))
      
    }
         
  }  
}