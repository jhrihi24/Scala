object ByNameParameter {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(235); 
  
  //No se tiene que especificar la palabra Unit
  def calc(x: ⇒ Int): Either[Throwable, Int] = {
  //x is a call by name parameter
	  try {
	    Right(x)
	  } catch {
	    case b: Throwable ⇒ Left(b)
	  }
	};System.out.println("""calc: (x: => Int)Either[Throwable,Int]""");$skip(172); 
	val y = calc {
	  //This looks like a natural block
	  println("Here we go!") //Some superfluous call
	  val z = List(1, 2, 3, 4) //Another superfluous call
	  49 + 20
	}
	
	
	
	
	
	//Puede usar object y apply para hacer llamadas
	object PigLatinizer {
	  def apply(x: ⇒ String) = x.tail + x.head + "ay"
	};System.out.println("""y  : Either[Throwable,Int] = """ + $show(y ));$skip(239); 
	val result = PigLatinizer {
	  val x = "pret"
	  val z = "zel"
	  x ++ z //concatenate the strings
	};System.out.println("""result  : String = """ + $show(result ))}
}
