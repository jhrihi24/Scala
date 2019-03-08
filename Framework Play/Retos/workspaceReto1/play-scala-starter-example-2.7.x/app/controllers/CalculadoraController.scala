package controllers

import javax.inject._

import play.api.mvc._
import services.CalculosService

import play.api.libs.json._
import play.api.libs.functional.syntax._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import scala.concurrent.TimeoutException

import models.Numeros

@Singleton
class CalculadoraController @Inject() (cc: ControllerComponents, calculos: CalculosService)(implicit ec: ExecutionContext) extends AbstractController(cc) { 
  
  import Numeros._
  
  def validateJson[A : Reads] = parse.json.validate(
    _.validate[A].asEither.left.map(e => BadRequest(JsError.toJson(e)))
  )
  
  def calcular= Action.async(validateJson[Numeros]) { request =>
    val operacionUtilizar = request.body
    val resultado: Future[Any]= calculos.realizarOperacion(operacionUtilizar.numeros, operacionUtilizar.operacion)
    resultado.map{f=>
      if(f.isInstanceOf[Double]){
        Ok(s"El resultado de la operacion ${operacionUtilizar.operacion} es ${f}")
      }else{
        BadRequest(s"Error: ${f}")
      }
    }
  }
  
}