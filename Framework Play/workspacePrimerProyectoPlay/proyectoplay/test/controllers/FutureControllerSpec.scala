package controllers

import org.scalatest._
import org.scalatestplus.play._

import play.api.test._
import play.api.test.Helpers.{ GET => GET_REQUEST, _ }

import scala.concurrent.Future
import scala.concurrent.ExecutionContext

import play.api.mvc._
import play.api.test._
import play.api.test.Helpers._
import play.api.inject.guice.GuiceInjectorBuilder
import play.api.inject.bind

import play.api.inject.guice.GuiceApplicationBuilder


class FutureControllerSpec extends PlaySpec with Results {
    
  "Future Page#algunFuturo" should {
    "deberia devolver un mensaje" in {
      val controllerComponents = Helpers.stubControllerComponents()
      val controller = new FutureController(controllerComponents)(controllerComponents.executionContext)
      val result: Future[Result] = controller.algunFuturo().apply(FakeRequest())
      val bodyText: String = contentAsString(result)
      bodyText mustBe "El estado del futuro es: Malo"
    }
  }
}