object iterables {
  
  //Generar un iterable
  val list = List(3, 5, 9, 11, 15, 19, 21)        //> list  : List[Int] = List(3, 5, 9, 11, 15, 19, 21)
	val it = list.iterator                    //> it  : Iterator[Int] = non-empty iterator
	if (it.hasNext) {
	  it.next
	}                                         //> res0: AnyVal = 3
  
  
  //partir una lista en varias subseccion
  val listSubsecciones = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
                                                  //> listSubsecciones  : List[Int] = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
	val itSubsecciones = listSubsecciones grouped 3
                                                  //> itSubsecciones  : Iterator[List[Int]] = non-empty iterator
	itSubsecciones.next()                     //> res1: List[Int] = List(3, 5, 9)
	itSubsecciones.next()                     //> res2: List[Int] = List(11, 15, 19)
	itSubsecciones.next()                     //> res3: List[Int] = List(21, 24, 32)
 
 
 	//partir la lista en subsecciones pero iterando
 	val listSliding = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
                                                  //> listSliding  : List[Int] = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
	val itSliding = listSliding sliding (3, 3)//> itSliding  : Iterator[List[Int]] = non-empty iterator
	itSliding.next()                          //> res4: List[Int] = List(3, 5, 9)
	itSliding.next()                          //> res5: List[Int] = List(11, 15, 19)
	itSliding.next()                          //> res6: List[Int] = List(21, 24, 32)
  
  
  //Recuperar los ultimos elementos de la lista
  val listTaken = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
                                                  //> listTaken  : List[Int] = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
	(listTaken takeRight 3)                   //> res7: List[Int] = List(21, 24, 32)
	
	
	
	//Borrara un numero indicado de numeris que se encuentran en la derecha
	val listDrop = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
                                                  //> listDrop  : List[Int] = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
	(listDrop dropRight 3)                    //> res8: List[Int] = List(3, 5, 9, 11, 15, 19)
	
	
	
	//Unir dos iterables de dos listas
	val xs = List(3, 5, 9)                    //> xs  : List[Int] = List(3, 5, 9)
	val ys = List("Bob", "Ann", "Stella")     //> ys  : List[String] = List(Bob, Ann, Stella)
	(xs zip ys)                               //> res9: List[(Int, String)] = List((3,Bob), (5,Ann), (9,Stella))
	
	
	//Cuando al unir los dos iterables son de diferente tamaño
	val hs = List(3, 5, 9)                    //> hs  : List[Int] = List(3, 5, 9)
	val yh = List("Bob", "Ann")               //> yh  : List[String] = List(Bob, Ann)
	(hs zip yh)                               //> res10: List[(Int, String)] = List((3,Bob), (5,Ann))
	
	
	
	//Uso del ZipAll para resolver el tamaño que esta desigual
	val xt = List(3, 5)                       //> xt  : List[Int] = List(3, 5)
	val yt = List("Bob", "Ann", "Stella")     //> yt  : List[String] = List(Bob, Ann, Stella)
	(xt zipAll (yt, -1, "?"))                 //> res11: List[(Int, String)] = List((3,Bob), (5,Ann), (-1,Stella))
	
	
	//Creara una nueva lista uniendola con la posicion del elemento
	val xsZip = List("Manny", "Moe", "Jack")  //> xsZip  : List[String] = List(Manny, Moe, Jack)
	xsZip.zipWithIndex                        //> res12: List[(String, Int)] = List((Manny,0), (Moe,1), (Jack,2))
	
	
	//Verifica si dos listas tienen los mismos elementos en el mismo orden no se cumple para los tipo Set
	val xsOrden = List("Manny", "Moe", "Jack")//> xsOrden  : List[String] = List(Manny, Moe, Jack)
	val ysOrden = List("Manny", "Moe", "Jack")//> ysOrden  : List[String] = List(Manny, Moe, Jack)
	(xsOrden sameElements ysOrden)            //> res13: Boolean = true
	val xs1 = Set(3, 2, 1, 4, 5, 6, 7)        //> xs1  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 7, 3, 4)
	val ys1 = Set(7, 2, 1, 4, 5, 6, 3)        //> ys1  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 7, 3, 4)
	(xs1 sameElements ys1)                    //> res14: Boolean = true
}