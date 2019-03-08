package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import java.nio.file._


@Singleton
class CargarFilesController @Inject()(config: Configuration, cc: ControllerComponents) extends AbstractController(cc){
  
  
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.cargarfiles())    
  }
  
  def upload = Action(parse.multipartFormData) { request =>
    request.body.file("picture").map { picture =>
            
      // only get the last part of the filename
      // otherwise someone can send a path like ../../home/foo/bar.txt to write to other files on the system
      val filename = Paths.get(picture.filename).getFileName
      
      picture.ref.moveTo(Paths.get(s"C:/Archivos Cargados Play Framework/$filename"), replace = true)
      Ok("File uploaded")
    }.getOrElse {
      Redirect("/cargarFiles").flashing(
        "error" -> "Missing file")
    }
  }
  
  
}