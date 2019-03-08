object Listas {
	//Comparacion de listas
  val a = List(1, 2, 3)                           //> a  : List[Int] = List(1, 2, 3)
	val b = List(1, 2, 3)                     //> b  : List[Int] = List(1, 2, 3)
	//eq prueba si es el mismo objeto
	(a eq b)                                  //> res0: Boolean = false
	//igualan el contenido
	(a == b)                                  //> res1: Boolean = true
	
		
	//Acceso a listas
	val c = List(1, 2, 3)                     //> c  : List[Int] = List(1, 2, 3)
	c.headOption                              //> res2: Option[Int] = Some(1)
	c.tail                                    //> res3: List[Int] = List(2, 3)
	
	
	//Remover un numero de una lista
	val d = List(1, 3, 5, 7, 9)               //> d  : List[Int] = List(1, 3, 5, 7, 9)
	val e = d.filterNot(v ⇒ v == 5)           //> e  : List[Int] = List(1, 3, 7, 9)
	
	
	//Diferentes metodos de las listas
	val f = List(1, 3, 5, 7, 9)               //> f  : List[Int] = List(1, 3, 5, 7, 9)
	f.length                                  //> res4: Int = 5
	f.reverse                                 //> res5: List[Int] = List(9, 7, 5, 3, 1)
	f.map { v ⇒ v * 2 }                       //> res6: List[Int] = List(2, 6, 10, 14, 18)
	f.filter { v ⇒  v % 3 == 0	}         //> res7: List[Int] = List(3, 9)
	
	//Reduccion de listas
	val g = List(1, 3, 5, 7)                  //> g  : List[Int] = List(1, 3, 5, 7)
	g.reduceLeft(_ + _)                       //> res8: Int = 16
	g.reduceLeft(_ * _)                       //> res9: Int = 105
	
	val h = List(1, 3, 5, 7)                  //> h  : List[Int] = List(1, 3, 5, 7)
	// Funciona igual que el reduce solo que se le coloca un valor inicial
	h.foldLeft(0)(_ + _)                      //> res10: Int = 16
	h.foldLeft(10)(_ + _)                     //> res11: Int = 26
	h.foldLeft(1)(_ * _)                      //> res12: Int = 105
	h.foldLeft(0)(_ * _)                      //> res13: Int = 0
	
	//Lista de un rango
	val i = (1 to 5).toList                   //> i  : List[Int] = List(1, 2, 3, 4, 5)
	
	//Añadir elementos a la lista
	val j = List(1, 3, 5, 7)                  //> j  : List[Int] = List(1, 3, 5, 7)
	0 :: j                                    //> res14: List[Int] = List(0, 1, 3, 5, 7)
	val head = List(1, 3)                     //> head  : List[Int] = List(1, 3)
	val tail = List(5, 7)                     //> tail  : List[Int] = List(5, 7)
	head ::: tail                             //> res15: List[Int] = List(1, 3, 5, 7)
	head ::: Nil                              //> res16: List[Int] = List(1, 3)
	
	//Nil es lo mismo a List()
	val q = Nil                               //> q  : scala.collection.immutable.Nil.type = List()
	val k = 3 :: q                            //> k  : List[Int] = List(3)
	val l = 2 :: k                            //> l  : List[Int] = List(2, 3)
	val m = 1 :: l                            //> m  : List[Int] = List(1, 2, 3)
	m.tail                                    //> res17: List[Int] = List(2, 3)
	l.tail                                    //> res18: List[Int] = List(3)
	k.tail                                    //> res19: List[Int] = List()
}