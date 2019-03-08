object Listas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
	//Comparacion de listas
  val a = List(1, 2, 3);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(23); 
	val b = List(1, 2, 3);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(45); val res$0 = 
	//eq prueba si es el mismo objeto
	(a eq b);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(34); val res$1 = 
	//igualan el contenido
	(a == b);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(47); 
	
		
	//Acceso a listas
	val c = List(1, 2, 3);System.out.println("""c  : List[Int] = """ + $show(c ));$skip(14); val res$2 = 
	c.headOption;System.out.println("""res2: Option[Int] = """ + $show(res$2));$skip(8); val res$3 = 
	c.tail;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(67); 
	
	
	//Remover un numero de una lista
	val d = List(1, 3, 5, 7, 9);System.out.println("""d  : List[Int] = """ + $show(d ));$skip(33); 
	val e = d.filterNot(v ⇒ v == 5);System.out.println("""e  : List[Int] = """ + $show(e ));$skip(69); 
	
	
	//Diferentes metodos de las listas
	val f = List(1, 3, 5, 7, 9);System.out.println("""f  : List[Int] = """ + $show(f ));$skip(10); val res$4 = 
	f.length;System.out.println("""res4: Int = """ + $show(res$4));$skip(11); val res$5 = 
	f.reverse;System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(21); val res$6 = 
	f.map { v ⇒ v * 2 };System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(30); val res$7 = 
	f.filter { v ⇒  v % 3 == 0	};System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(51); 
	
	//Reduccion de listas
	val g = List(1, 3, 5, 7);System.out.println("""g  : List[Int] = """ + $show(g ));$skip(21); val res$8 = 
	g.reduceLeft(_ + _);System.out.println("""res8: Int = """ + $show(res$8));$skip(21); val res$9 = 
	g.reduceLeft(_ * _);System.out.println("""res9: Int = """ + $show(res$9));$skip(28); 
	
	val h = List(1, 3, 5, 7);System.out.println("""h  : List[Int] = """ + $show(h ));$skip(94); val res$10 = 
	// Funciona igual que el reduce solo que se le coloca un valor inicial
	h.foldLeft(0)(_ + _);System.out.println("""res10: Int = """ + $show(res$10));$skip(23); val res$11 = 
	h.foldLeft(10)(_ + _);System.out.println("""res11: Int = """ + $show(res$11));$skip(22); val res$12 = 
	h.foldLeft(1)(_ * _);System.out.println("""res12: Int = """ + $show(res$12));$skip(22); val res$13 = 
	h.foldLeft(0)(_ * _);System.out.println("""res13: Int = """ + $show(res$13));$skip(48); 
	
	//Lista de un rango
	val i = (1 to 5).toList;System.out.println("""i  : List[Int] = """ + $show(i ));$skip(59); 
	
	//Añadir elementos a la lista
	val j = List(1, 3, 5, 7);System.out.println("""j  : List[Int] = """ + $show(j ));$skip(8); val res$14 = 
	0 :: j;System.out.println("""res14: List[Int] = """ + $show(res$14));$skip(23); 
	val head = List(1, 3);System.out.println("""head  : List[Int] = """ + $show(head ));$skip(23); 
	val tail = List(5, 7);System.out.println("""tail  : List[Int] = """ + $show(tail ));$skip(15); val res$15 = 
	head ::: tail;System.out.println("""res15: List[Int] = """ + $show(res$15));$skip(14); val res$16 = 
	head ::: Nil;System.out.println("""res16: List[Int] = """ + $show(res$16));$skip(43); 
	
	//Nil es lo mismo a List()
	val q = Nil;System.out.println("""q  : scala.collection.immutable.Nil.type = """ + $show(q ));$skip(16); 
	val k = 3 :: q;System.out.println("""k  : List[Int] = """ + $show(k ));$skip(16); 
	val l = 2 :: k;System.out.println("""l  : List[Int] = """ + $show(l ));$skip(16); 
	val m = 1 :: l;System.out.println("""m  : List[Int] = """ + $show(m ));$skip(8); val res$17 = 
	m.tail;System.out.println("""res17: List[Int] = """ + $show(res$17));$skip(8); val res$18 = 
	l.tail;System.out.println("""res18: List[Int] = """ + $show(res$18));$skip(8); val res$19 = 
	k.tail;System.out.println("""res19: List[Int] = """ + $show(res$19))}
}
