package services

import javax.inject._

import models.Persona
import repository.PersonaRepository
import java.sql.Date
import org.joda.time
import java.time.LocalDate
import java.util.GregorianCalendar
import java.util.Calendar

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import scala.concurrent.{ExecutionContext, Future}
import org.joda.time.DateTime
import org.joda.time.Years

trait PersonaCommandService{
  def insertarPersona(persona: Persona): Future[Any]
  def modificarPersona(persona: Persona): Future[Any]
  def eliminarPersona(idPersona: Int): Future[Unit]
}

class PersonaCommandServiceImpl@Inject()(personaRepository: PersonaRepository) extends PersonaCommandService{
  
  def insertarPersona(persona: Persona) = {
    if(validarMayorEdad(persona.fecha_nacimiento))
      personaRepository.insertarPersona(persona)
    else
      Future.successful(false)
  }
  
  def modificarPersona(persona: Persona) = {
    if(validarMayorEdad(persona.fecha_nacimiento))
      personaRepository.modificarPersona(persona)
    else
      Future.successful(false)
  }
  
  def eliminarPersona(idPersona: Int) = personaRepository.eliminarPersona(idPersona)
  
  private def validarMayorEdad(fecha: Date): Boolean= {
    /*val localDate = fecha.toLocalDate()
    
    val calendar= new GregorianCalendar()
    val fechaActual= new java.util.Date
    calendar.setTime(fechaActual)
    
    val inicio = new DateTime(localDate.getYear, localDate.getMonthValue, localDate.getDayOfMonth)
    val fin = new DateTime(calendar.get(Calendar.YEAR), (calendar.get(Calendar.MONTH) + 1), calendar.get(Calendar.DAY_OF_MONTH))
    val anos = Years.yearsBetween(inicio.toLocalDate(), fin.toLocalDate()).getYears
     
    if(anos >= 18) true else false*/
     
     val fechaNac = new java.util.Date(fecha.getTime)
     val calendar= new GregorianCalendar()
     calendar.setTime(fechaNac)
     
     val today = Calendar.getInstance();

     var diff_year = today.get(Calendar.YEAR) -  calendar.get(Calendar.YEAR);
     val diff_month = today.get(Calendar.MONTH) - calendar.get(Calendar.MONTH);
     val diff_day = today.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH);

     if (diff_month < 0 || (diff_month == 0 && diff_day < 0)) {
        diff_year = diff_year - 1;
     }
     
      if(diff_year >= 18) true else false
    
  }
  
}