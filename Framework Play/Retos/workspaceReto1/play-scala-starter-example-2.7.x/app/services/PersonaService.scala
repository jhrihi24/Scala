package services

import javax.inject._
import scala.concurrent.Future
import play.api.mvc.Results._

import models._

trait PersonaService {
  def buscarPorId(id: Int): List[Persona]
  def buscarPorNombre(nombre: String): List[Persona]
}

@Singleton
class PerosnaServiceImpl extends PersonaService {
  
  import Persona._
   
  def buscarPorId(id: Int): List[Persona] = {   
    val resultado= listPersona.filter(p => p.id==id)
    resultado
  }
  
  def buscarPorNombre(nombre: String): List[Persona] = {
    val resultado= listPersona.filter(p=> p.nombreCompleto.toLowerCase().contains(nombre.toLowerCase()))
    resultado
  }
  
}

