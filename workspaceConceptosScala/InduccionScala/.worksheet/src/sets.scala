object sets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  //CReacion de set
  val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySet  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet ));$skip(12); val res$0 = 
	mySet.size;System.out.println("""res0: Int#892 = """ + $show(res$0));$skip(95); 
	
	
	//Agregar elementos a un set
	val mySetAdd = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySetAdd  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySetAdd ));$skip(37); 
	val aNewSet = mySetAdd + "Illinois";System.out.println("""aNewSet  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(aNewSet ));$skip(84); 
	
	
	//Un set puede ser de tipo mixto
	val mySetMixto = Set("Michigan", "Ohio", 12);System.out.println("""mySetMixto  : scala#25.collection#1880.immutable#4184.Set#6637[Any#666] = """ + $show(mySetMixto ));$skip(89); 
	
	
	//Comprobar la existencia de un valor
	val mySetExits = Set("Michigan", "Ohio", 12);System.out.println("""mySetExits  : scala#25.collection#1880.immutable#4184.Set#6637[Any#666] = """ + $show(mySetExits ));$skip(16); val res$1 = 
	mySetExits(12);System.out.println("""res1: Boolean#1711 = """ + $show(res$1));$skip(104); 
	
	
	//Eliminar los elementos de un set
	val mySetDelete = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySetDelete  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySetDelete ));$skip(46); 
	val aNewSetDelete = mySetDelete - "Michigan";System.out.println("""aNewSetDelete  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(aNewSetDelete ));$skip(101); 
  
  //Eliminacion Multiple
  val mySetDeleteMUltiple = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySetDeleteMUltiple  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySetDeleteMUltiple ));$skip(77); 
	val aNewSetDeleteMultiple = mySetDeleteMUltiple -- List("Michigan", "Ohio");System.out.println("""aNewSetDeleteMultiple  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(aNewSetDeleteMultiple ));$skip(137); 
                                                  
   //Intersectar dos set
   val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySet1  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet1 ));$skip(57); 
	 val mySet2 = Set("Wisconsin", "Michigan", "Minnesota");System.out.println("""mySet2  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet2 ));$skip(49); 
	 val aNewSetIntersect = mySet1 intersect mySet2;System.out.println("""aNewSetIntersect  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(aNewSetIntersect ));$skip(183); 
                                                  
                                                  
    //Unir dos set
    val mySet3 = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySet3  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet3 ));$skip(57); 
		val mySet4 = Set("Wisconsin", "Michigan", "Minnesota");System.out.println("""mySet4  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet4 ));$skip(41); 
		val aNewSetUnion = mySet3 union mySet4;System.out.println("""aNewSetUnion  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(aNewSetUnion ));$skip(205); 
                                                  
                                                  
     //Ver si uno es subconjunto de otro
    val mySet5 = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySet5  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet5 ));$skip(57); 
		val mySet6 = Set("Wisconsin", "Michigan", "Minnesota");System.out.println("""mySet6  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet6 ));$skip(28); val res$2 = 
		
		mySet6 subsetOf mySet5;System.out.println("""res2: Boolean#1711 = """ + $show(res$2));$skip(95); 
		
		
		//Diferencia entre dos set
		val mySet7 = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySet7  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet7 ));$skip(44); 
		val mySet8 = Set("Wisconsin", "Michigan");System.out.println("""mySet8  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet8 ));$skip(39); 
		val aNewSetDife = mySet7 diff mySet8;System.out.println("""aNewSetDife  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(aNewSetDife ));$skip(215); 
                                                  
                                                  
     //La equivalencia es independiente del orden
     val mySet9 = Set("Michigan", "Ohio", "Wisconsin", "Iowa");System.out.println("""mySet9  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet9 ));$skip(62); 
		 val mySet10 = Set("Wisconsin", "Michigan", "Ohio", "Iowa");System.out.println("""mySet10  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = """ + $show(mySet10 ));$skip(26); val res$3 = 
		 mySet9.equals(mySet10);System.out.println("""res3: Boolean#1711 = """ + $show(res$3))}
}
