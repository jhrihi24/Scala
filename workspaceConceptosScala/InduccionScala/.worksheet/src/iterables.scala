object iterables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  
  //Generar un iterable
  val list = List(3, 5, 9, 11, 15, 19, 21);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(24); 
	val it = list.iterator;System.out.println("""it  : Iterator[Int] = """ + $show(it ));$skip(33); val res$0 = 
	if (it.hasNext) {
	  it.next
	};System.out.println("""res0: AnyVal = """ + $show(res$0));$skip(111); 
  
  
  //partir una lista en varias subseccion
  val listSubsecciones = List(3, 5, 9, 11, 15, 19, 21, 24, 32);System.out.println("""listSubsecciones  : List[Int] = """ + $show(listSubsecciones ));$skip(49); 
	val itSubsecciones = listSubsecciones grouped 3;System.out.println("""itSubsecciones  : Iterator[List[Int]] = """ + $show(itSubsecciones ));$skip(23); val res$1 = 
	itSubsecciones.next();System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(23); val res$2 = 
	itSubsecciones.next();System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(23); val res$3 = 
	itSubsecciones.next();System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(112); 
 
 
 	//partir la lista en subsecciones pero iterando
 	val listSliding = List(3, 5, 9, 11, 15, 19, 21, 24, 32);System.out.println("""listSliding  : List[Int] = """ + $show(listSliding ));$skip(44); 
	val itSliding = listSliding sliding (3, 3);System.out.println("""itSliding  : Iterator[List[Int]] = """ + $show(itSliding ));$skip(18); val res$4 = 
	itSliding.next();System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(18); val res$5 = 
	itSliding.next();System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(18); val res$6 = 
	itSliding.next();System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(110); 
  
  
  //Recuperar los ultimos elementos de la lista
  val listTaken = List(3, 5, 9, 11, 15, 19, 21, 24, 32);System.out.println("""listTaken  : List[Int] = """ + $show(listTaken ));$skip(25); val res$7 = 
	(listTaken takeRight 3);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(133); 
	
	
	
	//Borrara un numero indicado de numeris que se encuentran en la derecha
	val listDrop = List(3, 5, 9, 11, 15, 19, 21, 24, 32);System.out.println("""listDrop  : List[Int] = """ + $show(listDrop ));$skip(24); val res$8 = 
	(listDrop dropRight 3);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(66); 
	
	
	
	//Unir dos iterables de dos listas
	val xs = List(3, 5, 9);System.out.println("""xs  : List[Int] = """ + $show(xs ));$skip(39); 
	val ys = List("Bob", "Ann", "Stella");System.out.println("""ys  : List[String] = """ + $show(ys ));$skip(13); val res$9 = 
	(xs zip ys);System.out.println("""res9: List[(Int, String)] = """ + $show(res$9));$skip(88); 
	
	
	//Cuando al unir los dos iterables son de diferente tamaño
	val hs = List(3, 5, 9);System.out.println("""hs  : List[Int] = """ + $show(hs ));$skip(29); 
	val yh = List("Bob", "Ann");System.out.println("""yh  : List[String] = """ + $show(yh ));$skip(13); val res$10 = 
	(hs zip yh);System.out.println("""res10: List[(Int, String)] = """ + $show(res$10));$skip(87); 
	
	
	
	//Uso del ZipAll para resolver el tamaño que esta desigual
	val xt = List(3, 5);System.out.println("""xt  : List[Int] = """ + $show(xt ));$skip(39); 
	val yt = List("Bob", "Ann", "Stella");System.out.println("""yt  : List[String] = """ + $show(yt ));$skip(27); val res$11 = 
	(xt zipAll (yt, -1, "?"));System.out.println("""res11: List[(Int, String)] = """ + $show(res$11));$skip(111); 
	
	
	//Creara una nueva lista uniendola con la posicion del elemento
	val xsZip = List("Manny", "Moe", "Jack");System.out.println("""xsZip  : List[String] = """ + $show(xsZip ));$skip(20); val res$12 = 
	xsZip.zipWithIndex;System.out.println("""res12: List[(String, Int)] = """ + $show(res$12));$skip(151); 
	
	
	//Verifica si dos listas tienen los mismos elementos en el mismo orden no se cumple para los tipo Set
	val xsOrden = List("Manny", "Moe", "Jack");System.out.println("""xsOrden  : List[String] = """ + $show(xsOrden ));$skip(44); 
	val ysOrden = List("Manny", "Moe", "Jack");System.out.println("""ysOrden  : List[String] = """ + $show(ysOrden ));$skip(32); val res$13 = 
	(xsOrden sameElements ysOrden);System.out.println("""res13: Boolean = """ + $show(res$13));$skip(36); 
	val xs1 = Set(3, 2, 1, 4, 5, 6, 7);System.out.println("""xs1  : scala.collection.immutable.Set[Int] = """ + $show(xs1 ));$skip(36); 
	val ys1 = Set(7, 2, 1, 4, 5, 6, 3);System.out.println("""ys1  : scala.collection.immutable.Set[Int] = """ + $show(ys1 ));$skip(24); val res$14 = 
	(xs1 sameElements ys1);System.out.println("""res14: Boolean = """ + $show(res$14))}
}
