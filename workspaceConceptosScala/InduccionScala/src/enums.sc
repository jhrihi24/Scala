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
	}
  Planets.Mercury.id                              //> res0: Int = 0
	Planets.Venus.id                          //> res1: Int = 1
	Planets.Mercury.toString                  //> res2: String = Mercury
	Planets.Venus.toString                    //> res3: String = Venus
	(Planets.Earth == Planets.Earth)          //> res4: Boolean = true
	(Planets.Neptune == Planets.Jupiter)      //> res5: Boolean = false
	  
	  
	 
	 
	 
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
	 }
	 
	 GreekPlanets.Mercury.id                  //> res6: Int = 1
	 GreekPlanets.Venus.id                    //> res7: Int = 2
	 GreekPlanets.Mercury.toString            //> res8: String = Hermes
	 GreekPlanets.Venus.toString              //> res9: String = Aphrodite
	 (GreekPlanets.Earth == GreekPlanets.Earth)
                                                  //> res10: Boolean = true
	 (GreekPlanets.Neptune == GreekPlanets.Jupiter)
                                                  //> res11: Boolean = false
	  
	  
	
	
	
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
	
	}
	
	PlanetsExtends.Earth.mass                 //> res12: Double = 5.976E24
	PlanetsExtends.Earth.radius               //> res13: Double = 6378140.0
	
	
	
	
	 
	  
}