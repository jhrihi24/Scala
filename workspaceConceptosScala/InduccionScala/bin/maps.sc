object maps {
  //Creacion de mapas
  val myMap =
  Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
                                                  //> myMap  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#
                                                  //| 228] = Map(MI -> Michigan, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
	myMap.size                                //> res0: Int#892 = 4
	
	
	//Adicionar un key a un map
	val myMapAdd = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan")
                                                  //> myMapAdd  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,Stri
                                                  //| ng#228] = Map(MI -> Michigan, OH -> Ohio, WI -> Wisconsin)
	val aNewMap = myMapAdd + ("IL" → "Illinois")
                                                  //> aNewMap  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,Strin
                                                  //| g#228] = Map(MI -> Michigan, OH -> Ohio, WI -> Wisconsin, IL -> Illinois)
	aNewMap.contains("IL")                    //> res1: Boolean#1711 = true
	
	
	//Iteracion entre los mapas
	val myMapIteracion = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan")
                                                  //> myMapIteracion  : scala#25.collection#1880.immutable#4184.Map#6196[String#22
                                                  //| 8,String#228] = Map(MI -> Michigan, OH -> Ohio, WI -> Wisconsin)
	val mapValues = myMapIteracion.values     //> mapValues  : Iterable#3867[String#228] = MapLike.DefaultValuesIterable(Michi
                                                  //| gan, Ohio, Wisconsin)
  myMapIteracion("MI")                            //> res2: String#228 = Michigan
	mapValues.size                            //> res3: Int#892 = 3
	mapValues.head                            //> res4: String#228 = Michigan
	mapValues.tail                            //> res5: Iterable#3867[String#228] = List(Ohio, Wisconsin)
	val lastElement = mapValues.last          //> lastElement  : String#228 = Wisconsin
	lastElement                               //> res6: String#228 = Wisconsin
	
	
	//Las keys pueden ser de tipo mixto
	val myMapMixto = Map("Ann Arbor" → "MI", 49931 → "MI")
                                                  //> myMapMixto  : scala#25.collection#1880.immutable#4184.Map#6196[Any#666,Strin
                                                  //| g#228] = Map(Ann Arbor -> MI, 49931 -> MI)
	myMapMixto("Ann Arbor")                   //> res7: String#228 = MI
	myMapMixto(49931)                         //> res8: String#228 = MI
	
	
	//Control de errores Map
	val myMapIntercept = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
                                                  //> myMapIntercept  : scala#25.collection#1880.immutable#4184.Map#6196[String#22
                                                  //| 8,String#228] = Map(MI -> Michigan, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
                                                  //| 
	myMapIntercept.getOrElse("TX", "missing data")
                                                  //> res9: String#228 = missing data

	val myMapmyMapIntercept2 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa") withDefaultValue "missing data"
                                                  //> myMapmyMapIntercept2  : scala#25.collection#1880.immutable#4184.Map#6196[St
                                                  //| ring#228,String#228] = Map(MI -> Michigan, OH -> Ohio, WI -> Wisconsin, IA 
                                                  //| -> Iowa)
	myMapmyMapIntercept2("TX")                //> res10: String#228 = missing data
	
	
	//Eliminar elementos de un Map
	val myMapDelete =
  Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
                                                  //> myMapDelete  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,
                                                  //| String#228] = Map(MI -> Michigan, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
                                                  //| 
	val aNewMapmyMapDelete = myMapDelete - "MI"
                                                  //> aNewMapmyMapDelete  : scala#25.collection#1880.immutable#4184.Map#6196[Stri
                                                  //| ng#228,String#228] = Map(OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
	aNewMapmyMapDelete.contains("MI")         //> res11: Boolean#1711 = false
	myMapDelete.contains("MI")                //> res12: Boolean#1711 = true
	val aNewMapDeleteMultiple= myMapDelete -- List("MI", "OH")
                                                  //> aNewMapDeleteMultiple  : scala#25.collection#1880.immutable#4184.Map#6196[S
                                                  //| tring#228,String#228] = Map(WI -> Wisconsin, IA -> Iowa)
	
	
	//Comparar dos mapas, no importa el orden
	val myMap1 =  Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
                                                  //> myMap1  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,Strin
                                                  //| g#228] = Map(MI -> Michigan, OH -> Ohio, WI -> Wisconsin, IA -> Iowa)
	val myMap2 =  Map("WI" → "Wisconsin", "MI" → "Michigan", "IA" → "Iowa", "OH" → "Ohio")
                                                  //> myMap2  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,Strin
                                                  //| g#228] = Map(WI -> Wisconsin, MI -> Michigan, IA -> Iowa, OH -> Ohio)

	myMap1.equals(myMap2)                     //> res13: Boolean#1711 = true
	
	
}