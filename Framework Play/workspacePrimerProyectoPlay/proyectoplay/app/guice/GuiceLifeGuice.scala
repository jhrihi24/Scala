package guice

import scala.concurrent.Future
import javax.inject._
import play.api.inject.ApplicationLifecycle
import play.api.Logger

@Singleton
class GuiceLifeGuice @Inject() (lifecycle: ApplicationLifecycle){
  
  val start = 20
  val end   = 30
  val rnd = scala.util.Random
  start + rnd.nextInt( (end - start) + 1 ) 
  
  lifecycle.addStopHook { () =>
    val resultado= start - 15
    Logger.info(s"La aplicacion cuando empezo ${start} despues ${resultado}s.")
    Future.successful(())
  }  
  
}