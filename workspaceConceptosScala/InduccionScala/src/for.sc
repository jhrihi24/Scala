object forExpresion {
  	
  	//Uso del for para recorrer dos ranges
  	val xValues = 1 to 4                      //> xValues  : scala.collection.immutable.Range.Inclusive = Range 1 to 4
		val yValues = 1 to 2              //> yValues  : scala.collection.immutable.Range.Inclusive = Range 1 to 2
		val coordinates = for {
		  x ← xValues
		  y ← yValues
		} yield (x, y)                    //> coordinates  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1
                                                  //| ,1), (1,2), (2,1), (2,2), (3,1), (3,2), (4,1), (4,2))
		coordinates(4)                    //> res0: (Int, Int) = (3,1)
  	
  	
  	
  	
  	
  	//Con un for se puede hacer el codigo mas legible
  	val nums = List(List(1), List(2), List(3), List(4), List(5))
                                                  //> nums  : List[List[Int]] = List(List(1), List(2), List(3), List(4), List(5))
                                                  //| 
		val result = for {
		   //Obtiene la Lista interior
		  numList ← nums
		  //Obtiene el valor de la lista interior
		  num ← numList
		  if (num % 2 == 0)
		} yield (num)                     //> result  : List[Int] = List(2, 4)
		result                            //> res1: List[Int] = List(2, 4)
		// Which is the same as
		nums.flatMap(numList ⇒ numList).filter(_ % 2 == 0)
                                                  //> res2: List[Int] = List(2, 4)
		// or the same as
		nums.flatten.filter(_ % 2 == 0)   //> res3: List[Int] = List(2, 4)
		
		
		
		
		
		
		
		//For y Foreach
	  val lenguajes = Seq("Java", "Scala", "Kotlin", "Clojure")
                                                  //> lenguajes  : Seq[String] = List(Java, Scala, Kotlin, Clojure)
	  val opiniones= Seq("Conciso", "bueno", "malo", "regular")
                                                  //> opiniones  : Seq[String] = List(Conciso, bueno, malo, regular)
	  lenguajes.foreach(l => println(s"me parece un muy buen lenguaje ${l}"))
                                                  //> me parece un muy buen lenguaje Java
                                                  //| me parece un muy buen lenguaje Scala
                                                  //| me parece un muy buen lenguaje Kotlin
                                                  //| me parece un muy buen lenguaje Clojure
	  for(l <- lenguajes if l.endsWith("a"); o <- opiniones) {
	  	println(s"me parece un muy buen lenguaje ${l} de la opinion de ${o}")
                                                  //> me parece un muy buen lenguaje Java de la opinion de Conciso
                                                  //| me parece un muy buen lenguaje Java de la opinion de bueno
                                                  //| me parece un muy buen lenguaje Java de la opinion de malo
                                                  //| me parece un muy buen lenguaje Java de la opinion de regular
                                                  //| me parece un muy buen lenguaje Scala de la opinion de Conciso
                                                  //| me parece un muy buen lenguaje Scala de la opinion de bueno
                                                  //| me parece un muy buen lenguaje Scala de la opinion de malo
                                                  //| me parece un muy buen lenguaje Scala de la opinion de regular
	  }
}