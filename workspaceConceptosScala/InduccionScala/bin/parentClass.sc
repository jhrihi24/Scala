object parentClass {
  
  //La jerarquia de clases es lineal, una clase solo puede extenderse desde una clase principal
  class Soldier(val firstName: String, val lastName: String) {}
	class Pilot(override val firstName: String, override val lastName: String, val squadron: Long) extends Soldier(firstName, lastName)
	val pilot = new Pilot("John", "Yossarian", 256)
                                                  //> pilot  : parentClass.Pilot = parentClass$Pilot@5ce65a89
  pilot.firstName                                 //> res0: String = John
	pilot.lastName                            //> res1: String = Yossarian
	//Se puede usar la clase padre como clase hijo
	val soldier: Soldier = pilot              //> soldier  : parentClass.Soldier = parentClass$Pilot@5ce65a89
	soldier.firstName                         //> res2: String = John
	soldier.lastName                          //> res3: String = Yossarian
	
	
	
  
  
  
  //Una clase abstracta no puede ser instanciada, solo herdada
  abstract class SoldierAbstract(val firstName: String, val lastName: String) {
	  class Catch(val number: Long) {
	    // nothing to do here.  Just observe that it compiles
	  }
	}
	class PilotAbstract(override val firstName: String, override val lastName: String, val squadron: Long) extends SoldierAbstract(firstName, lastName)
	val PilotAbstract = new PilotAbstract("John", "Yossarian", 256)
                                                  //> PilotAbstract  : parentClass.PilotAbstract = parentClass$PilotAbstract$1@1cd
                                                  //| 072a9
	val catchNo = new PilotAbstract.Catch(22) //using the pilot instance's path, create an catch object for it.
                                                  //> catchNo  : parentClass.PilotAbstract.Catch = parentClass$SoldierAbstract$1$
                                                  //| Catch@7c75222b
	catchNo.number                            //> res4: Long = 22
  
  
  
  
  
  
  
}