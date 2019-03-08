object funcionesParciales {
  
  //Crear una funcion parcial, un tipo de funciones parciales cuentan con isDefinedAt y apply
  val doubleEvens: PartialFunction[Int, Int] =  new PartialFunction[Int, Int] {
    //Si su respuesta es verdadera ejecuta la funcion apply.
    def isDefinedAt(x: Int) = x % 2 == 0
    def apply(v1: Int) = v1 * 2
  }                                               //> doubleEvens  : PartialFunction[Int,Int] = <function1>
	val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
	  def isDefinedAt(x: Int) = x % 2 != 0
	  def apply(v1: Int) = v1 * 3
	}                                         //> tripleOdds  : PartialFunction[Int,Int] = <function1>
	val whatToDo = doubleEvens orElse tripleOdds
                                                  //> whatToDo  : PartialFunction[Int,Int] = <function1>
  whatToDo(3)                                     //> res0: Int = 9
	whatToDo(4)                               //> res1: Int = 8
	
	
	//otra manera de utilizar las funciones parciales es con CASE
	val doubleEvensCase: PartialFunction[Int, Int] = {
  	case x if (x % 2) == 0 ⇒ x * 2
	}                                         //> doubleEvensCase  : PartialFunction[Int,Int] = <function1>
	val tripleOddsCase: PartialFunction[Int, Int] = {
  	case x if (x % 2) != 0 ⇒ x * 3
	}                                         //> tripleOddsCase  : PartialFunction[Int,Int] = <function1>
	val addFive = (x: Int) ⇒ x + 5            //> addFive  : Int => Int = funcionesParciales$$$Lambda$8/1209271652@58ceff1
	//Uso de andThen para cuando termine alguna de las funciones siga con esa
	val whatToDoCase = doubleEvensCase orElse tripleOddsCase andThen addFive //Here we chain the partial functions together
                                                  //> whatToDoCase  : PartialFunction[Int,Int] = <function1>
	whatToDoCase(3)                           //> res2: Int = 14
	whatToDoCase(4)                           //> res3: Int = 13
	
	
	//Ejecutar orElse dentro de andThen
	val printEven: PartialFunction[Int, String] = {
	  case x if (x % 2) == 0 ⇒ "Even"
	}                                         //> printEven  : PartialFunction[Int,String] = <function1>
	val printOdd: PartialFunction[Int, String] = {
	  case x if (x % 2) != 0 ⇒ "Odd"
	}                                         //> printOdd  : PartialFunction[Int,String] = <function1>
	val whatToDoAndThen = doubleEvensCase orElse tripleOddsCase andThen (printEven orElse printOdd)
                                                  //> whatToDoAndThen  : PartialFunction[Int,String] = <function1>
	whatToDoAndThen(3)                        //> res4: String = Odd
	whatToDoAndThen(4)                        //> res5: String = Even
}