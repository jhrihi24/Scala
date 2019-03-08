object functionmatch {
  
  val stuff = "blue"                              //> stuff  : String = blue
	val myStuff = stuff match {
	  case "red" ⇒
	    println("RED"); 1
	  case "blue" ⇒
	    println("BLUE"); 2
	  case "green" ⇒
	    println("GREEN"); 3
	  case _ ⇒
	    println(stuff); 0 // case _ will trigger if all other cases fail.
	}                                         //> BLUE
                                                  //| myStuff  : Int = 2
  //Devolver valores complejos
  val stuffComplejos = "blue"                     //> stuffComplejos  : String = blue
	val myStuffComplejos = stuff match {
	  case "red" ⇒ (255, 0, 0)
	  case "green" ⇒ (0, 255, 0)
	  case "blue" ⇒ (0, 0, 255)
	  case _ ⇒ println(stuffComplejos); 0
	}                                         //> myStuffComplejos  : Any = (0,0,255)
  
  //Realizar case complejos
  def goldilocks(expr: Any) = expr match {
	  case ("porridge", "Papa") ⇒ "Papa eating porridge"
	  case ("chair", _) ⇒ "Mama eating porridge"
	  case ("porridge", "Baby") ⇒ "Baby eating porridge"
	  case _ ⇒ "what?"
	}                                         //> goldilocks: (expr: Any)String
	goldilocks(("porridge", "Papa"))          //> res0: String = Papa eating porridge
	goldilocks(("chair", "Papa"))             //> res1: String = Mama eating porridge
  
  
  //Coincidencia de patrones que puede sustituir expresiones
  def goldilocksSustituir(expr: Any) = expr match {
	  case ("porridge", bear) ⇒     bear + " said someone's been eating my porridge"
	  case ("chair", bear) ⇒ bear + " said someone's been sitting in my chair"
	  case ("bed", bear) ⇒ bear + " said someone's been sleeping in my bed"
	  case _ ⇒ "what?"
	}                                         //> goldilocksSustituir: (expr: Any)String
	goldilocksSustituir(("porridge", "Papa")) //> res2: String = Papa said someone's been eating my porridge
	
	
	//Validar con una variable ya declarada afuera
	val foodItemPorridge = "porridge"         //> foodItemPorridge  : String = porridge
	def goldilocksPorridge(expr: Any) = expr match {
	  case (`foodItemPorridge`, _) ⇒ "eating"
	  case ("chair", "Mama") ⇒ "sitting"
	  case ("bed", "Baby") ⇒ "sleeping"
	  case _ ⇒ "what?"
	}                                         //> goldilocksPorridge: (expr: Any)String
	goldilocksPorridge(("porridge", "Papa"))  //> res3: String = eating
	goldilocksPorridge(("chair", "Mama"))     //> res4: String = sitting
	
	
	
	//Validar con una variable enviada dentro de la funcion
	def patternEquals(i: Int, j: Int) = j match {
	  case `i` ⇒ true
	  case _ ⇒ false
	}                                         //> patternEquals: (i: Int, j: Int)Boolean
	patternEquals(3, 3)                       //> res5: Boolean = true
	patternEquals(7, 9)                       //> res6: Boolean = false
	
	
	
	
	//Utilizar el match en una lista para obtener el segundo elemento donde xs es el segundo elemento
	val secondElement = List(1, 2, 3) match {
	  case x :: xs ⇒ xs.head
	  case _ ⇒ 0
	}                                         //> secondElement  : Int = 2
	
	
	
	
	//Utilizacion del Nil que es lo mismo que la List solo que es mas idiomatico
	val r = List(1, 2, 3) match {
	  case x :: y :: Nil ⇒ y // only matches a list with exactly two items
	  case _ ⇒ 0
	}                                         //> r  : Int = 0
	r                                         //> res7: Int = 0
}