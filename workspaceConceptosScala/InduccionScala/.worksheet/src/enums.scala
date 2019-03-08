object enums {
  
  //Asignar valores por defecto
  object Planets extends Enumeration {
	  val Mercury = Value
	  val Venus = Value
	  val Earth = Value
	  val Mars = Value
	  val Jupiter = Value
	  val Saturn = Value
	  val Uranus = Value
	  val Neptune = Value
	  val Pluto = Value
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(308); val res$0 = 
  Planets.Mercury.id;System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 
	Planets.Venus.id;System.out.println("""res1: Int = """ + $show(res$1));$skip(26); val res$2 = 
	Planets.Mercury.toString;System.out.println("""res2: String = """ + $show(res$2));$skip(24); val res$3 = 
	Planets.Venus.toString;System.out.println("""res3: String = """ + $show(res$3));$skip(34); val res$4 = 
	(Planets.Earth == Planets.Earth);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(38); val res$5 = 
	(Planets.Neptune == Planets.Jupiter)
	  
	  
	 
	 
	 
	 //Asignar Valores manualmente
	 object GreekPlanets extends Enumeration {
		  val Mercury = Value(1, "Hermes")
		  val Venus = Value(2, "Aphrodite")
		  val Earth = Value(3, "Gaia")
		  val Mars = Value(4, "Ares")
		  val Jupiter = Value(5, "Zeus")
		  val Saturn = Value(6, "Cronus")
		  val Uranus = Value(7, "Ouranus")
		  val Neptune = Value(8, "Poseidon")
		  val Pluto = Value(9, "Hades")
	 };System.out.println("""res5: Boolean = """ + $show(res$5));$skip(447); val res$6 = 
	 
	 GreekPlanets.Mercury.id;System.out.println("""res6: Int = """ + $show(res$6));$skip(24); val res$7 = 
	 GreekPlanets.Venus.id;System.out.println("""res7: Int = """ + $show(res$7));$skip(32); val res$8 = 
	 GreekPlanets.Mercury.toString;System.out.println("""res8: String = """ + $show(res$8));$skip(30); val res$9 = 
	 GreekPlanets.Venus.toString;System.out.println("""res9: String = """ + $show(res$9));$skip(45); val res$10 = 
	 (GreekPlanets.Earth == GreekPlanets.Earth);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(49); val res$11 = 
	 (GreekPlanets.Neptune == GreekPlanets.Jupiter)
	  
	  
	
	
	
	//Ampliar la enumeracion  extendiendo la value
	object PlanetsExtends extends Enumeration {
	  val G = 6.67300E-11
	  class PlanetValue(val i: Int, val name: String, val mass: Double, val radius: Double) extends Val(i: Int, name: String) {
	    def surfaceGravity = G * mass / (radius * radius)
	    def surfaceWeight(otherMass: Double) = otherMass * surfaceGravity
	    def compare(that: PlanetValue) = this.i - that.i
	  }
		val Mercury = new PlanetValue(0, "Mercury", 3.303e+23, 2.4397e6)
	  val Venus = new PlanetValue(1, "Venus", 4.869e+24, 6.0518e6)
	  val Earth = new PlanetValue(2, "Earth", 5.976e+24, 6.37814e6)
	  val Mars = new PlanetValue(3, "Mars", 6.421e+23, 3.3972e6)
	  val Jupiter = new PlanetValue(4, "Jupiter", 1.9e+27, 7.1492e7)
	  val Saturn = new PlanetValue(5, "Saturn", 5.688e+26, 6.0268e7)
	  val Uranus = new PlanetValue(6, "Uranus", 8.686e+25, 2.5559e7)
	  val Neptune = new PlanetValue(7, "Neptune", 1.024e+26, 2.4746e7)
	  val Pluto = new PlanetValue(8, "Pluto", 1.27e+22, 1.137e6)
	
	};System.out.println("""res11: Boolean = """ + $show(res$11));$skip(1060); val res$12 = 
	
	PlanetsExtends.Earth.mass;System.out.println("""res12: Double = """ + $show(res$12));$skip(29); val res$13 = 
	PlanetsExtends.Earth.radius;System.out.println("""res13: Double = """ + $show(res$13))}
	
	
	
	
	 
	  
}
