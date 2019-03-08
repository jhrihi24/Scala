object ByNameParameter {
  
  //No se tiene que especificar la palabra Unit
  def calc(x: ⇒ Int): Either[Throwable, Int] = {
  //x is a call by name parameter
	  try {
	    Right(x)
	  } catch {
	    case b: Throwable ⇒ Left(b)
	  }
	}                                         //> calc: (x: => Int)Either[Throwable,Int]
	val y = calc {
	  //This looks like a natural block
	  println("Here we go!") //Some superfluous call
	  val z = List(1, 2, 3, 4) //Another superfluous call
	  49 + 20
	}                                         //> Here we go!
                                                  //| y  : Either[Throwable,Int] = Right(69)
	
	
	
	
	
	//Puede usar object y apply para hacer llamadas
	object PigLatinizer {
	  def apply(x: ⇒ String) = x.tail + x.head + "ay"
	}
	val result = PigLatinizer {
	  val x = "pret"
	  val z = "zel"
	  x ++ z //concatenate the strings
	}                                         //> result  : String = retzelpay
}