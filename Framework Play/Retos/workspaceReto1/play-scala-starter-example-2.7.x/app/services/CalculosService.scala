package services

import javax.inject._
import scala.concurrent.Future
import play.api.mvc.Results._

trait CalculosService {
  def realizarOperacion(numeros: Seq[Double], operacion: String): Future[Any]
}

@Singleton
class CalculosServiceImpl extends CalculosService{  
  def realizarOperacion(numeros: Seq[Double], operacion: String): Future[Any] = {
    val resultado= operacion match {
      case "suma" =>  numeros.sum
      case "multiplicacion" => numeros.product
      case "division" => division(numeros)
      case "exponente" => exponente(numeros)
      case "seno" => seno(numeros)
      case "coseno" => coseno(numeros)
      case "radicacion" => radicacion(numeros)
      case _ => "Esa operacion no existe"
    }
    
    Future.successful(resultado)
  }
  
  private def division(numeros: Seq[Double]): Any = {
    if(numeros.size==2) numeros(0) / numeros(1) else "La longitud de valores no es la correcta"
  }
  
  private def exponente(numeros: Seq[Double]): Any = {
    if(numeros.size==2) math.pow(numeros(0), numeros(1)) else "La longitud de valores no es la correcta"
  }  
   
  private def seno(numeros: Seq[Double]): Any = {
    if(numeros.size==1) redondear(math.sin(numeros(0))) else "La longitud de valores no es la correcta"
  }
  
  private def coseno(numeros: Seq[Double]): Any = {
    if(numeros.size==1) redondear(math.cos(numeros(0))) else "La longitud de valores no es la correcta"
  }
  
  private def radicacion(numeros: Seq[Double]): Any = {
    if(numeros.size==1) redondear(math.sqrt(numeros(0))) else "La longitud de valores no es la correcta"
  }
  
  private def redondear(numero: Double) = (math rint numero * 100) / 100
}