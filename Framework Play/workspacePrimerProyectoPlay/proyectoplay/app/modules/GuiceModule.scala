package modules

import com.google.inject.AbstractModule
import com.google.inject.name.Names

import guice.Colombia
import guice.Espanol

class GuiceModule extends AbstractModule{
  override def configure() = {

    bind(classOf[Espanol])
      .annotatedWith(Names.named("en"))
      .to(classOf[Colombia])

    
  }
}