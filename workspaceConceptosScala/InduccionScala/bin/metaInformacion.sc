object tipoFirmas {
  
  //Uso de Trait y definicion de unas clases
  trait Randomizer[A] {
	  def draw(): A
	}
	class IntRandomizer extends Randomizer[Int] {
	  def draw() = {
	    import util.Random
	    Random.nextInt()
	  }
	}
	val intRand = new IntRandomizer           //> intRand  : tipoFirmas.IntRandomizer = tipoFirmas$IntRandomizer@5ce65a89
	(intRand.draw < Int.MaxValue)             //> res0: Boolean = true
  
  
  //La metainformacion se puede usar para el nombre de clase
  classOf[String].getCanonicalName                //> res1: String = java.lang.String
	classOf[String].getSimpleName             //> res2: String = String
	
	
	//La metainformacion se puede usar para la referencia de un objeto
	val zoom = "zoom"                         //> zoom  : String = zoom
	zoom.isInstanceOf[String]                 //> res3: Boolean = true
	zoom.getClass.getCanonicalName            //> res4: String = java.lang.String
	zoom.getClass.getSimpleName               //> res5: String = String
  
}