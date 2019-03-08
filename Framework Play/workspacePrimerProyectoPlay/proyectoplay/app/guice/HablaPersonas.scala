package guice

import play.mvc.With

trait Espanol {
  def hablar(posible: Boolean): String
}

class Colombia extends Espanol{
  
  def hablar(posible: Boolean) = if(posible) "Si hablan español" else "No hablan español"
  
}