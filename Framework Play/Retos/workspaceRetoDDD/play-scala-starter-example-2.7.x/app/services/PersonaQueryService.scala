package services

import javax.inject._

import models.Persona
import repository.PersonaRepository

import scala.concurrent.{ExecutionContext, Future}

trait PersonaQueryService{
  def obtenerTodos(): Future[Seq[Persona]]
  def obtenerPersona(idPersona: Int): Future[Seq[Persona]]
}

@Singleton
class PersonaQueryServiceImpl @Inject()(personaRepository: PersonaRepository) extends PersonaQueryService{
  
  def obtenerTodos() = personaRepository.obtenerTodos()
  
  def obtenerPersona(idPersona: Int) = personaRepository.obtenerPersona(idPersona)
  
}