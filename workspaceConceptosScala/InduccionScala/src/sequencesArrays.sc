object sequencesArrays {

	//Convertir una Lista en Array
  val l = List(1, 2, 3)                           //> l  : List[Int] = List(1, 2, 3)
	val a = l.toArray                         //> a  : Array[Int] = Array(1, 2, 3)
	a                                         //> res0: Array[Int] = Array(1, 2, 3)
	
	
	//Convertir un array en seq y la seq en una list
	val arr = Array(1, 2, 3)                  //> arr  : Array[Int] = Array(1, 2, 3)
	val seq = a.toSeq                         //> seq  : Seq[Int] = WrappedArray(1, 2, 3)
	val lis = seq.toList                      //> lis  : List[Int] = List(1, 2, 3)
	lis                                       //> res1: List[Int] = List(1, 2, 3)
	
	
	//Crear un vector a partir de un for y convertirlo en lista
	val s = for (v ← 1 to 4) yield v          //> s  : scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4)
	s.toList                                  //> res2: List[Int] = List(1, 2, 3, 4)
	
	val t = for (v ← 1 to 10 if v % 3 == 0) yield v
                                                  //> t  : scala.collection.immutable.IndexedSeq[Int] = Vector(3, 6, 9)
	t.toList                                  //> res3: List[Int] = List(3, 6, 9)
	
	
	//Filtrar una sequencia
	val seqFilter = Seq("hello", "to", "you") //> seqFilter  : Seq[String] = List(hello, to, you)
	val filtered = seqFilter.filter(_.length > 2)
                                                  //> filtered  : Seq[String] = List(hello, you)
	filtered                                  //> res4: Seq[String] = List(hello, you)
	
	
	
	//Puedo cambiar los valores de una secuencia usando el operador map
	val sreverse = Seq("hello", "world")      //> sreverse  : Seq[String] = List(hello, world)
	val reve = sreverse map {
  	_.reverse                                 //> reve  : Seq[String] = List(olleh, dlrow)
	}
	reve                                      //> res5: Seq[String] = List(olleh, dlrow)
}