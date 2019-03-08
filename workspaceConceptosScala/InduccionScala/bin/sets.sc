object sets {
  //CReacion de set
  val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySet  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Set(M
                                                  //| ichigan, Ohio, Wisconsin, Iowa)
	mySet.size                                //> res0: Int#892 = 4
	
	
	//Agregar elementos a un set
	val mySetAdd = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySetAdd  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = S
                                                  //| et(Michigan, Ohio, Wisconsin, Iowa)
	val aNewSet = mySetAdd + "Illinois"       //> aNewSet  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Se
                                                  //| t(Wisconsin, Ohio, Illinois, Iowa, Michigan)
	
	
	//Un set puede ser de tipo mixto
	val mySetMixto = Set("Michigan", "Ohio", 12)
                                                  //> mySetMixto  : scala#25.collection#1880.immutable#4184.Set#6637[Any#666] = Se
                                                  //| t(Michigan, Ohio, 12)
	
	
	//Comprobar la existencia de un valor
	val mySetExits = Set("Michigan", "Ohio", 12)
                                                  //> mySetExits  : scala#25.collection#1880.immutable#4184.Set#6637[Any#666] = Se
                                                  //| t(Michigan, Ohio, 12)
	mySetExits(12)                            //> res1: Boolean#1711 = true
	
	
	//Eliminar los elementos de un set
	val mySetDelete = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySetDelete  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] 
                                                  //| = Set(Michigan, Ohio, Wisconsin, Iowa)
	val aNewSetDelete = mySetDelete - "Michigan"
                                                  //> aNewSetDelete  : scala#25.collection#1880.immutable#4184.Set#6637[String#228
                                                  //| ] = Set(Ohio, Wisconsin, Iowa)
  
  //Eliminacion Multiple
  val mySetDeleteMUltiple = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySetDeleteMUltiple  : scala#25.collection#1880.immutable#4184.Set#6637[Stri
                                                  //| ng#228] = Set(Michigan, Ohio, Wisconsin, Iowa)
	val aNewSetDeleteMultiple = mySetDeleteMUltiple -- List("Michigan", "Ohio")
                                                  //> aNewSetDeleteMultiple  : scala#25.collection#1880.immutable#4184.Set#6637[St
                                                  //| ring#228] = Set(Wisconsin, Iowa)
                                                  
   //Intersectar dos set
   val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySet1  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Set
                                                  //| (Michigan, Ohio, Wisconsin, Iowa)
	 val mySet2 = Set("Wisconsin", "Michigan", "Minnesota")
                                                  //> mySet2  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Set
                                                  //| (Wisconsin, Michigan, Minnesota)
	 val aNewSetIntersect = mySet1 intersect mySet2
                                                  //> aNewSetIntersect  : scala#25.collection#1880.immutable#4184.Set#6637[String#
                                                  //| 228] = Set(Michigan, Wisconsin)
                                                  
                                                  
    //Unir dos set
    val mySet3 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySet3  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Se
                                                  //| t(Michigan, Ohio, Wisconsin, Iowa)
		val mySet4 = Set("Wisconsin", "Michigan", "Minnesota")
                                                  //> mySet4  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Se
                                                  //| t(Wisconsin, Michigan, Minnesota)
		val aNewSetUnion = mySet3 union mySet4
                                                  //> aNewSetUnion  : scala#25.collection#1880.immutable#4184.Set#6637[String#228
                                                  //| ] = Set(Minnesota, Wisconsin, Ohio, Iowa, Michigan)
                                                  
                                                  
     //Ver si uno es subconjunto de otro
    val mySet5 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySet5  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Se
                                                  //| t(Michigan, Ohio, Wisconsin, Iowa)
		val mySet6 = Set("Wisconsin", "Michigan", "Minnesota")
                                                  //> mySet6  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Se
                                                  //| t(Wisconsin, Michigan, Minnesota)
		
		mySet6 subsetOf mySet5            //> res2: Boolean#1711 = false
		
		
		//Diferencia entre dos set
		val mySet7 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySet7  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Se
                                                  //| t(Michigan, Ohio, Wisconsin, Iowa)
		val mySet8 = Set("Wisconsin", "Michigan")
                                                  //> mySet8  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Se
                                                  //| t(Wisconsin, Michigan)
		val aNewSetDife = mySet7 diff mySet8
                                                  //> aNewSetDife  : scala#25.collection#1880.immutable#4184.Set#6637[String#228]
                                                  //|  = Set(Ohio, Iowa)
                                                  
                                                  
     //La equivalencia es independiente del orden
     val mySet9 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
                                                  //> mySet9  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = Se
                                                  //| t(Michigan, Ohio, Wisconsin, Iowa)
		 val mySet10 = Set("Wisconsin", "Michigan", "Ohio", "Iowa")
                                                  //> mySet10  : scala#25.collection#1880.immutable#4184.Set#6637[String#228] = S
                                                  //| et(Wisconsin, Michigan, Ohio, Iowa)
		 mySet9.equals(mySet10)           //> res3: Boolean#1711 = true
}