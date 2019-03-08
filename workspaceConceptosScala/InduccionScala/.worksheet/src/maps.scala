object maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(124); 
  //Creacion de mapas
  val myMap =
  Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa");System.out.println("""myMap  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(myMap ));$skip(12); val res$0 = 
	myMap.size;System.out.println("""res0: Int#892 = """ + $show(res$0));$skip(126); 
	
	
	//Adicionar un key a un map
	val myMapAdd = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan");System.out.println("""myMapAdd  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(myMapAdd ));$skip(46); 
	val aNewMap = myMapAdd + ("IL" → "Illinois");System.out.println("""aNewMap  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(aNewMap ));$skip(24); val res$1 = 
	aNewMap.contains("IL");System.out.println("""res1: Boolean#1711 = """ + $show(res$1));$skip(132); 
	
	
	//Iteracion entre los mapas
	val myMapIteracion = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan");System.out.println("""myMapIteracion  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(myMapIteracion ));$skip(39); 
	val mapValues = myMapIteracion.values;System.out.println("""mapValues  : Iterable#3867[String#228] = """ + $show(mapValues ));$skip(23); val res$2 = 
  myMapIteracion("MI");System.out.println("""res2: String#228 = """ + $show(res$2));$skip(16); val res$3 = 
	mapValues.size;System.out.println("""res3: Int#892 = """ + $show(res$3));$skip(16); val res$4 = 
	mapValues.head;System.out.println("""res4: String#228 = """ + $show(res$4));$skip(16); val res$5 = 
	mapValues.tail;System.out.println("""res5: Iterable#3867[String#228] = """ + $show(res$5));$skip(34); 
	val lastElement = mapValues.last;System.out.println("""lastElement  : String#228 = """ + $show(lastElement ));$skip(13); val res$6 = 
	lastElement;System.out.println("""res6: String#228 = """ + $show(res$6));$skip(97); 
	
	
	//Las keys pueden ser de tipo mixto
	val myMapMixto = Map("Ann Arbor" → "MI", 49931 → "MI");System.out.println("""myMapMixto  : scala#25.collection#1880.immutable#4184.Map#6196[Any#666,String#228] = """ + $show(myMapMixto ));$skip(25); val res$7 = 
	myMapMixto("Ann Arbor");System.out.println("""res7: String#228 = """ + $show(res$7));$skip(19); val res$8 = 
	myMapMixto(49931);System.out.println("""res8: String#228 = """ + $show(res$8));$skip(125); 
	
	
	//Control de errores Map
	val myMapIntercept = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa");System.out.println("""myMapIntercept  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(myMapIntercept ));$skip(48); val res$9 = 
	myMapIntercept.getOrElse("TX", "missing data");System.out.println("""res9: String#228 = """ + $show(res$9));$skip(134); 

	val myMapmyMapIntercept2 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa") withDefaultValue "missing data";System.out.println("""myMapmyMapIntercept2  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(myMapmyMapIntercept2 ));$skip(28); val res$10 = 
	myMapmyMapIntercept2("TX");System.out.println("""res10: String#228 = """ + $show(res$10));$skip(130); 
	
	
	//Eliminar elementos de un Map
	val myMapDelete =
  Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa");System.out.println("""myMapDelete  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(myMapDelete ));$skip(45); 
	val aNewMapmyMapDelete = myMapDelete - "MI";System.out.println("""aNewMapmyMapDelete  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(aNewMapmyMapDelete ));$skip(35); val res$11 = 
	aNewMapmyMapDelete.contains("MI");System.out.println("""res11: Boolean#1711 = """ + $show(res$11));$skip(28); val res$12 = 
	myMapDelete.contains("MI");System.out.println("""res12: Boolean#1711 = """ + $show(res$12));$skip(60); 
	val aNewMapDeleteMultiple= myMapDelete -- List("MI", "OH");System.out.println("""aNewMapDeleteMultiple  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(aNewMapDeleteMultiple ));$skip(136); 
	
	
	//Comparar dos mapas, no importa el orden
	val myMap1 =  Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa");System.out.println("""myMap1  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(myMap1 ));$skip(88); 
	val myMap2 =  Map("WI" → "Wisconsin", "MI" → "Michigan", "IA" → "Iowa", "OH" → "Ohio");System.out.println("""myMap2  : scala#25.collection#1880.immutable#4184.Map#6196[String#228,String#228] = """ + $show(myMap2 ));$skip(24); val res$13 = 

	myMap1.equals(myMap2);System.out.println("""res13: Boolean#1711 = """ + $show(res$13))}
	
	
}
