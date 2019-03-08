object funcionesOrdenSuperior {
	//Llamada de funciones
  def lambda = { x: Int ⇒
	  x + 1
	}                                         //> lambda: => Int => Int
	def lambda2 = (x: Int) ⇒ x + 2            //> lambda2: => Int => Int
	val lambda3 = (x: Int) ⇒ x + 3            //> lambda3  : Int => Int = funcionesOrdenSuperior$$$Lambda$8/1513712028@2752f6e
                                                  //| 2
	
	val lambda4 = new Function1[Int, Int] {
	  def apply(v1: Int): Int = v1 - 1
	}                                         //> lambda4  : Int => Int = <function1>
	
	def lambda5(x: Int) = x + 1               //> lambda5: (x: Int)Int
	
	val result = lambda(3)                    //> result  : Int = 4
	val `result1andhalf` = lambda.apply(3)    //> result1andhalf  : Int = 4
	
	val result2 = lambda2(3)                  //> result2  : Int = 5
	val result3 = lambda3(3)                  //> result3  : Int = 6
	val result4 = lambda4(3)                  //> result4  : Int = 2
	val result5 = lambda5(3)                  //> result5  : Int = 4
	
	
	//Variables externas
	var incrementer = 1                       //> incrementer  : Int = 1
	def closure = { x: Int ⇒
	  x + incrementer
	}                                         //> closure: => Int => Int
	val resultVarExterna = closure(10)        //> resultVarExterna  : Int = 11
	
	incrementer = 2
	val result2VarExterna = closure(10)       //> result2VarExterna  : Int = 12
	
	
	//Funciones de orden superior: SOn funciones que toman otras funciones como argumentos
	def summation(x: Int, y: Int ⇒ Int) = y(x)//> summation: (x: Int, y: Int => Int)Int

	var incrementerOrdenSuperior = 3          //> incrementerOrdenSuperior  : Int = 3
	def closureOrdenSuperior = (x: Int) ⇒ x + incrementerOrdenSuperior
                                                  //> closureOrdenSuperior: => Int => Int
	
	val resultOrdenSuperior = summation(10, closureOrdenSuperior)
                                                  //> resultOrdenSuperior  : Int = 13
	
	incrementerOrdenSuperior = 4
	val result2OrdenSuperior = summation(10, closureOrdenSuperior)
                                                  //> result2OrdenSuperior  : Int = 14
                                                  
                                                  
  //Funcion devolviendo de otra funcion
  def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
		  new Function1[Int, Int]() {
		    def apply(y: Int): Int = x + y
		  }
	}                                         //> addWithoutSyntaxSugar: (x: Int)Int => Int
	addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]]
                                                  //> res0: Boolean = true
	
	addWithoutSyntaxSugar(2)(3)               //> res1: Int = 5
	
	def fiveAdder: Function1[Int, Int] = addWithoutSyntaxSugar(5)
                                                  //> fiveAdder: => Int => Int
	fiveAdder(5)                              //> res2: Int = 10
	
	
	
	//Composicion de funciones
	def makeUpper(xs: List[String]) = xs map {
	  _.toUpperCase
	}                                         //> makeUpper: (xs: List[String])List[String]
	def makeWhatEverYouLike(xs: List[String], sideEffect: String ⇒ String) =
	  xs map sideEffect                       //> makeWhatEverYouLike: (xs: List[String], sideEffect: String => String)List[S
                                                  //| tring]
	makeUpper(List("abc", "xyz", "123"))      //> res3: List[String] = List(ABC, XYZ, 123)
	makeWhatEverYouLike(List("ABC", "XYZ", "123"), { x ⇒
	  x.toLowerCase
	})                                        //> res4: List[String] = List(abc, xyz, 123)
	val myName = (name: String) => s"My name is $name"
                                                  //> myName  : String => String = funcionesOrdenSuperior$$$Lambda$18/2036958521@
                                                  //| 73f792cf
	makeWhatEverYouLike(List("John", "Mark"), myName)
                                                  //> res5: List[String] = List(My name is John, My name is Mark)

	
	//Funciones void
	def pintar(x: String) { println("pintar") }
                                                  //> pintar: (x: String)Unit
}