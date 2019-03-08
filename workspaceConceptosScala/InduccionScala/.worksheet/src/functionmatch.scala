object functionmatch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(46); 
  
  val stuff = "blue";System.out.println("""stuff  : String = """ + $show(stuff ));$skip(238); 
	val myStuff = stuff match {
	  case "red" ⇒
	    println("RED"); 1
	  case "blue" ⇒
	    println("BLUE"); 2
	  case "green" ⇒
	    println("GREEN"); 3
	  case _ ⇒
	    println(stuff); 0 // case _ will trigger if all other cases fail.
	};System.out.println("""myStuff  : Int = """ + $show(myStuff ));$skip(61); 
  //Devolver valores complejos
  val stuffComplejos = "blue";System.out.println("""stuffComplejos  : String = """ + $show(stuffComplejos ));$skip(167); 
	val myStuffComplejos = stuff match {
	  case "red" ⇒ (255, 0, 0)
	  case "green" ⇒ (0, 255, 0)
	  case "blue" ⇒ (0, 0, 255)
	  case _ ⇒ println(stuffComplejos); 0
	};System.out.println("""myStuffComplejos  : Any = """ + $show(myStuffComplejos ));$skip(251); 
  
  //Realizar case complejos
  def goldilocks(expr: Any) = expr match {
	  case ("porridge", "Papa") ⇒ "Papa eating porridge"
	  case ("chair", _) ⇒ "Mama eating porridge"
	  case ("porridge", "Baby") ⇒ "Baby eating porridge"
	  case _ ⇒ "what?"
	};System.out.println("""goldilocks: (expr: Any)String""");$skip(34); val res$0 = 
	goldilocks(("porridge", "Papa"));System.out.println("""res0: String = """ + $show(res$0));$skip(31); val res$1 = 
	goldilocks(("chair", "Papa"));System.out.println("""res1: String = """ + $show(res$1));$skip(373); 
  
  
  //Coincidencia de patrones que puede sustituir expresiones
  def goldilocksSustituir(expr: Any) = expr match {
	  case ("porridge", bear) ⇒     bear + " said someone's been eating my porridge"
	  case ("chair", bear) ⇒ bear + " said someone's been sitting in my chair"
	  case ("bed", bear) ⇒ bear + " said someone's been sleeping in my bed"
	  case _ ⇒ "what?"
	};System.out.println("""goldilocksSustituir: (expr: Any)String""");$skip(43); val res$2 = 
	goldilocksSustituir(("porridge", "Papa"));System.out.println("""res2: String = """ + $show(res$2));$skip(87); 
	
	
	//Validar con una variable ya declarada afuera
	val foodItemPorridge = "porridge";System.out.println("""foodItemPorridge  : String = """ + $show(foodItemPorridge ));$skip(191); 
	def goldilocksPorridge(expr: Any) = expr match {
	  case (`foodItemPorridge`, _) ⇒ "eating"
	  case ("chair", "Mama") ⇒ "sitting"
	  case ("bed", "Baby") ⇒ "sleeping"
	  case _ ⇒ "what?"
	};System.out.println("""goldilocksPorridge: (expr: Any)String""");$skip(42); val res$3 = 
	goldilocksPorridge(("porridge", "Papa"));System.out.println("""res3: String = """ + $show(res$3));$skip(39); val res$4 = 
	goldilocksPorridge(("chair", "Mama"));System.out.println("""res4: String = """ + $show(res$4));$skip(150); 
	
	
	
	//Validar con una variable enviada dentro de la funcion
	def patternEquals(i: Int, j: Int) = j match {
	  case `i` ⇒ true
	  case _ ⇒ false
	};System.out.println("""patternEquals: (i: Int, j: Int)Boolean""");$skip(21); val res$5 = 
	patternEquals(3, 3);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(21); val res$6 = 
	patternEquals(7, 9);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(193); 
	
	
	
	
	//Utilizar el match en una lista para obtener el segundo elemento donde xs es el segundo elemento
	val secondElement = List(1, 2, 3) match {
	  case x :: xs ⇒ xs.head
	  case _ ⇒ 0
	};System.out.println("""secondElement  : Int = """ + $show(secondElement ));$skip(206); 
	
	
	
	
	//Utilizacion del Nil que es lo mismo que la List solo que es mas idiomatico
	val r = List(1, 2, 3) match {
	  case x :: y :: Nil ⇒ y // only matches a list with exactly two items
	  case _ ⇒ 0
	};System.out.println("""r  : Int = """ + $show(r ));$skip(3); val res$7 = 
	r;System.out.println("""res7: Int = """ + $show(res$7))}
}
