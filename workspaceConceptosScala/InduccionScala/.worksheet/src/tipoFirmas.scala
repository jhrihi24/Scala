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
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(263); 
	val intRand = new IntRandomizer;System.out.println("""intRand  : tipoFirmas.IntRandomizer = """ + $show(intRand ));$skip(31); val res$0 = 
	(intRand.draw < Int.MaxValue);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(102); val res$1 = 
  
  
  //La metainformacion se puede usar para el nombre de clase
  classOf[String].getCanonicalName;System.out.println("""res1: String = """ + $show(res$1));$skip(31); val res$2 = 
	classOf[String].getSimpleName;System.out.println("""res2: String = """ + $show(res$2));$skip(91); 
	
	
	//La metainformacion se puede usar para la referencia de un objeto
	val zoom = "zoom";System.out.println("""zoom  : String = """ + $show(zoom ));$skip(27); val res$3 = 
	zoom.isInstanceOf[String];System.out.println("""res3: Boolean = """ + $show(res$3));$skip(32); val res$4 = 
	zoom.getClass.getCanonicalName;System.out.println("""res4: String = """ + $show(res$4));$skip(29); val res$5 = 
	zoom.getClass.getSimpleName;System.out.println("""res5: String = """ + $show(res$5))}
  
}
