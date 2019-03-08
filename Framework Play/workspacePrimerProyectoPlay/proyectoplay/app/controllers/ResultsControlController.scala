package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class ResultsControlController @Inject()(config: Configuration, cc: ControllerComponents) extends AbstractController(cc){
  
  def result200() = Action { implicit request: Request[AnyContent] =>
    Ok("Got request [" + request + "]")   
  }
  
  def result401() = Action { implicit request: Request[AnyContent] =>
    Unauthorized("Got request [" + request + "]")
  }
  
  def result500() = Action { implicit request: Request[AnyContent] =>
    InternalServerError("Got request [" + request + "]")
  }
      
  def getPdf() = Action { implicit request: Request[AnyContent] => 
      Redirect("assets/prueba.pdf")
  }
  
}