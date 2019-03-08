package controllers

import org.scalatestplus.play._

import services.CalculosService
import services.CalculosServiceImpl

import org.scalatest.AsyncFlatSpec
import scala.concurrent.Future

class CalculosSpec extends AsyncFlatSpec{
  
  val calculos= new CalculosServiceImpl()
  
  it should "Deberia generar una suma en el servicio" in {      
      val resultado = calculos.realizarOperacion(Seq(1, 2, 3.5), "suma")      
      resultado.map{f=> 
        assert(f.isInstanceOf[Double], true)
        assert(f.equals(6.5), true)
      }    
   } 
  
  it should "Deberia generar una multiplicacion en el servicio" in {      
      val resultado = calculos.realizarOperacion(Seq(1, 2, 3.5), "multiplicacion")      
      resultado.map{f=> 
        assert(f.isInstanceOf[Double], true)
        assert(f.equals(7.0), true)
      }    
   }
  
  it should "Deberia generar una division en el servicio" in {      
      val resultado = calculos.realizarOperacion(Seq(10, 2), "division")      
      resultado.map{f=> 
        assert(f.isInstanceOf[Double], true)
        assert(f.equals(5.0), true)
      }    
   }
  
  it should "Deberia generar un exponente en el servicio" in {      
      val resultado = calculos.realizarOperacion(Seq(10, 3), "exponente")      
      resultado.map{f=> 
        assert(f.isInstanceOf[Double], true)
        assert(f.equals(1000.0), true)
      }    
   }
  
  it should "Deberia generar un seno en el servicio" in {      
      val resultado = calculos.realizarOperacion(Seq(45), "seno")      
      resultado.map{f=> 
        assert(f.isInstanceOf[Double], true)
        assert(f.equals(0.85), true)
      }    
   }
  
  it should "Deberia generar un coseno en el servicio" in {      
      val resultado = calculos.realizarOperacion(Seq(45), "coseno")      
      resultado.map{f=> 
        assert(f.isInstanceOf[Double], true)
        assert(f.equals(0.53), true)
      }    
   }
  
  it should "Deberia generar una radicacion en el servicio" in {      
      val resultado = calculos.realizarOperacion(Seq(45), "radicacion")      
      resultado.map{f=> 
        assert(f.isInstanceOf[Double], true)
        assert(f.equals(6.71), true)
      }    
   }
  
  it should "Deberia generar un mensaje diciendo que la operacion no existe" in {      
      val resultado = calculos.realizarOperacion(Seq(45), "euler")      
      resultado.map{f=> 
        assert(f.isInstanceOf[String], true)
        assert(f.equals("Esa operacion no existe"), true)
      }    
   }
}