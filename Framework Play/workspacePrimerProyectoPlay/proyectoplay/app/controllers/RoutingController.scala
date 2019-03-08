package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class RoutingController @Inject()(config: Configuration, cc: ControllerComponents) extends AbstractController(cc){
  
  
  def resultNombre(name: String) = Action { implicit request: Request[AnyContent] =>
    Ok("Hello: "+name)
  }
  
  def guardar() = Action { implicit request: Request[AnyContent] =>
    Ok("POST: "+request.headers)
  }
  
  def modificarTodo() = Action { implicit request: Request[AnyContent] =>
    Ok("PUT: "+request.headers)
  }
  
  def eliminar = Action { implicit request: Request[AnyContent] =>
    Ok("DELETE: "+request.headers)
  }
  
  def modificarParcial = Action { implicit request: Request[AnyContent] =>
    Ok("PATCH: "+request.headers)
  }
  
  def errorExceptionHadler = Action { implicit request: Request[AnyContent] =>
    throw new IllegalArgumentException()
  }
  
}