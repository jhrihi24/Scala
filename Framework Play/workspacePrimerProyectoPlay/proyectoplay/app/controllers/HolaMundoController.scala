package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import config.AppConfig

@Singleton
class HolaMundoController @Inject()(config: Configuration, cc: ControllerComponents) extends AbstractController(cc){
  
  def index() = Action { implicit request: Request[AnyContent] =>
    
    //Llamar una propiedad del aplication.conf
    //config.gett[String]("application.name")
        
    //Llamar una propiedad personalizada
    //Ok(config.get[AppConfig]("app.config").toString())  
    
    //LLamar una pagina
    Ok(views.html.holamundo())
    
  } 
}