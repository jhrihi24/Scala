package controllers

import javax.inject._

import play.api.mvc._
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._
import play.core.server.AkkaHttpServer

class AkkaServer@Inject()(controller: ResultController) extends SimpleRouter{
  override def routes: Routes = {
    /*val server = AkkaHttpServer.fromRouterWithComponents() { components =>
      import Results._
      import components.{ defaultActionBuilder => Action }
      {
        case GET(p"/hello/$to") => Action {
          Ok(s"Hello $to")
        }
      }
    }*/
    case GET(p"/redirect/$to") => controller.postContent
  }
}