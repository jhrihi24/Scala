package modules

import com.google.inject.AbstractModule
import play.api.libs.concurrent.AkkaGuiceSupport

import actors.HolaPersona

class ActorsModule extends AbstractModule with AkkaGuiceSupport {
  override def configure = {
    bindActor[HolaPersona]("hola-persona")
  }
}