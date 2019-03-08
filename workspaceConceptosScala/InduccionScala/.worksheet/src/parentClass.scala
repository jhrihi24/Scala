object parentClass {
  
  //La jerarquia de clases es lineal, una clase solo puede extenderse desde una clase principal
  class Soldier(val firstName: String, val lastName: String) {}
	class Pilot(override val firstName: String, override val lastName: String, val squadron: Long) extends Soldier(firstName, lastName);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(365); 
	val pilot = new Pilot("John", "Yossarian", 256);System.out.println("""pilot  : parentClass.Pilot = """ + $show(pilot ));$skip(18); val res$0 = 
  pilot.firstName;System.out.println("""res0: String = """ + $show(res$0));$skip(16); val res$1 = 
	pilot.lastName;System.out.println("""res1: String = """ + $show(res$1));$skip(78); 
	//Se puede usar la clase padre como clase hijo
	val soldier: Soldier = pilot;System.out.println("""soldier  : parentClass.Soldier = """ + $show(soldier ));$skip(19); val res$2 = 
	soldier.firstName;System.out.println("""res2: String = """ + $show(res$2));$skip(18); val res$3 = 
	soldier.lastName
	
	
	
  
  
  
  //Una clase abstracta no puede ser instanciada, solo herdada
  abstract class SoldierAbstract(val firstName: String, val lastName: String) {
	  class Catch(val number: Long) {
	    // nothing to do here.  Just observe that it compiles
	  }
	}
	class PilotAbstract(override val firstName: String, override val lastName: String, val squadron: Long) extends SoldierAbstract(firstName, lastName);System.out.println("""res3: String = """ + $show(res$3));$skip(475); 
	val PilotAbstract = new PilotAbstract("John", "Yossarian", 256);System.out.println("""PilotAbstract  : parentClass.PilotAbstract = """ + $show(PilotAbstract ));$skip(109); 
	val catchNo = new PilotAbstract.Catch(22);System.out.println("""catchNo  : parentClass.PilotAbstract.Catch = """ + $show(catchNo ));$skip(16); val res$4 =  //using the pilot instance's path, create an catch object for it.
	catchNo.number;System.out.println("""res4: Long = """ + $show(res$4))}
  
  
  
  
  
  
  
}
