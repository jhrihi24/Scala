object forExpresion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
  	
  	//Uso del for para recorrer dos ranges
  	val xValues = 1 to 4;System.out.println("""xValues  : scala.collection.immutable.Range.Inclusive = """ + $show(xValues ));$skip(23); 
		val yValues = 1 to 2;System.out.println("""yValues  : scala.collection.immutable.Range.Inclusive = """ + $show(yValues ));$skip(75); 
		val coordinates = for {
		  x ← xValues
		  y ← yValues
		} yield (x, y);System.out.println("""coordinates  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(coordinates ));$skip(17); val res$0 = 
		coordinates(4);System.out.println("""res0: (Int, Int) = """ + $show(res$0));$skip(137); 
  	
  	
  	
  	
  	
  	//Con un for se puede hacer el codigo mas legible
  	val nums = List(List(1), List(2), List(3), List(4), List(5));System.out.println("""nums  : List[List[Int]] = """ + $show(nums ));$skip(173); 
		val result = for {
		   //Obtiene la Lista interior
		  numList ← nums
		  //Obtiene el valor de la lista interior
		  num ← numList
		  if (num % 2 == 0)
		} yield (num);System.out.println("""result  : List[Int] = """ + $show(result ));$skip(9); val res$1 = 
		result;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(79); val res$2 = 
		// Which is the same as
		nums.flatMap(numList ⇒ numList).filter(_ % 2 == 0);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(54); val res$3 = 
		// or the same as
		nums.flatten.filter(_ % 2 == 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(100); 
		
		
		
		
		
		
		
		//For y Foreach
	  val lenguajes = Seq("Java", "Scala", "Kotlin", "Clojure");System.out.println("""lenguajes  : Seq[String] = """ + $show(lenguajes ));$skip(61); 
	  val opiniones= Seq("Conciso", "bueno", "malo", "regular");System.out.println("""opiniones  : Seq[String] = """ + $show(opiniones ));$skip(75); 
	  lenguajes.foreach(l => println(s"me parece un muy buen lenguaje ${l}"));$skip(134); 
	  for(l <- lenguajes if l.endsWith("a"); o <- opiniones) {
	  	println(s"me parece un muy buen lenguaje ${l} de la opinion de ${o}")}
	  }
}
