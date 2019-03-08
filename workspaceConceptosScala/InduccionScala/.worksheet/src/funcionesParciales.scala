object funcionesParciales {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(342); 
  
  //Crear una funcion parcial, un tipo de funciones parciales cuentan con isDefinedAt y apply
  val doubleEvens: PartialFunction[Int, Int] =  new PartialFunction[Int, Int] {
    //Si su respuesta es verdadera ejecuta la funcion apply.
    def isDefinedAt(x: Int) = x % 2 == 0
    def apply(v1: Int) = v1 * 2
  };System.out.println("""doubleEvens  : PartialFunction[Int,Int] = """ + $show(doubleEvens ));$skip(151); 
	val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
	  def isDefinedAt(x: Int) = x % 2 != 0
	  def apply(v1: Int) = v1 * 3
	};System.out.println("""tripleOdds  : PartialFunction[Int,Int] = """ + $show(tripleOdds ));$skip(46); 
	val whatToDo = doubleEvens orElse tripleOdds;System.out.println("""whatToDo  : PartialFunction[Int,Int] = """ + $show(whatToDo ));$skip(14); val res$0 = 
  whatToDo(3);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
	whatToDo(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(156); 
	
	
	//otra manera de utilizar las funciones parciales es con CASE
	val doubleEvensCase: PartialFunction[Int, Int] = {
  	case x if (x % 2) == 0 ⇒ x * 2
	};System.out.println("""doubleEvensCase  : PartialFunction[Int,Int] = """ + $show(doubleEvensCase ));$skip(88); 
	val tripleOddsCase: PartialFunction[Int, Int] = {
  	case x if (x % 2) != 0 ⇒ x * 3
	};System.out.println("""tripleOddsCase  : PartialFunction[Int,Int] = """ + $show(tripleOddsCase ));$skip(32); 
	val addFive = (x: Int) ⇒ x + 5;System.out.println("""addFive  : Int => Int = """ + $show(addFive ));$skip(196); 
	//Uso de andThen para cuando termine alguna de las funciones siga con esa
	val whatToDoCase = doubleEvensCase orElse tripleOddsCase andThen addFive;System.out.println("""whatToDoCase  : PartialFunction[Int,Int] = """ + $show(whatToDoCase ));$skip(17); val res$2 =  //Here we chain the partial functions together
	whatToDoCase(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(17); val res$3 = 
	whatToDoCase(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(128); 
	
	
	//Ejecutar orElse dentro de andThen
	val printEven: PartialFunction[Int, String] = {
	  case x if (x % 2) == 0 ⇒ "Even"
	};System.out.println("""printEven  : PartialFunction[Int,String] = """ + $show(printEven ));$skip(85); 
	val printOdd: PartialFunction[Int, String] = {
	  case x if (x % 2) != 0 ⇒ "Odd"
	};System.out.println("""printOdd  : PartialFunction[Int,String] = """ + $show(printOdd ));$skip(97); 
	val whatToDoAndThen = doubleEvensCase orElse tripleOddsCase andThen (printEven orElse printOdd);System.out.println("""whatToDoAndThen  : PartialFunction[Int,String] = """ + $show(whatToDoAndThen ));$skip(20); val res$4 = 
	whatToDoAndThen(3);System.out.println("""res4: String = """ + $show(res$4));$skip(20); val res$5 = 
	whatToDoAndThen(4);System.out.println("""res5: String = """ + $show(res$5))}
}
