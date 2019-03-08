object traversables {
  
  //Unir un Set y un List da resultado el que se coloque primero en la union
  val set = Set(1, 9, 10, 22)                     //> set  : scala.collection.immutable.Set[Int] = Set(1, 9, 10, 22)
	val list = List(3, 4, 5, 10)              //> list  : List[Int] = List(3, 4, 5, 10)
	val result = set ++ list                  //> result  : scala.collection.immutable.Set[Int] = Set(5, 10, 1, 9, 22, 3, 4)
  val result2 = list ++ set                       //> result2  : List[Int] = List(3, 4, 5, 10, 1, 9, 10, 22)


	
	//Utilizacion de la funcion map
	val setMap = Set(1, 3, 4, 6)              //> setMap  : scala.collection.immutable.Set[Int] = Set(1, 3, 4, 6)
	val resultMap = setMap.map(_ * 4)         //> resultMap  : scala.collection.immutable.Set[Int] = Set(4, 12, 16, 24)
	resultMap.lastOption                      //> res0: Option[Int] = Some(24)
	
	
	
	
	//Uso de la opcion flatten para unir listas de listas
	val listFlatten = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10))
                                                  //> listFlatten  : List[List[Int]] = List(List(1), List(2, 3, 4), List(5, 6, 7),
                                                  //|  List(8, 9, 10))
	listFlatten.flatten                       //> res1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	
	
	
	//Uso de la opcion flatMap para unir la lista y multiplicar todos * 4
	val listFlatMap = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10))
                                                  //> listFlatMap  : List[List[Int]] = List(List(1), List(2, 3, 4), List(5, 6, 7),
                                                  //|  List(8, 9, 10))
	val resultFlatMap = listFlatMap.flatMap(_.map(_ * 4))
                                                  //> resultFlatMap  : List[Int] = List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40)
	resultFlatMap                             //> res2: List[Int] = List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40)
	
	
	
	//Usando flatMap pero filtrando solo por algunos
	val listFlatMapFilter = List(1, 2, 3, 4, 5)
                                                  //> listFlatMapFilter  : List[Int] = List(1, 2, 3, 4, 5)
	val resultFlatMapFilter = listFlatMapFilter.flatMap(it ⇒ if (it % 2 == 0) Some(it) else None)
                                                  //> resultFlatMapFilter  : List[Int] = List(2, 4)
	resultFlatMapFilter                       //> res3: List[Int] = List(2, 4)
	
	
	
	
	
	
	//Uso de la funcion collect para crear una nueva lista
	val listCollect = List(4, 6, 7, 8, 9, 13, 14)
                                                  //> listCollect  : List[Int] = List(4, 6, 7, 8, 9, 13, 14)
	val resultCollect = listCollect.collect {
  	case x: Int if (x % 2 == 0) ⇒ x * 3
	}                                         //> resultCollect  : List[Int] = List(12, 18, 24, 42)
	resultCollect                             //> res4: List[Int] = List(12, 18, 24, 42)
	
	
	
	
	
	//Uso de funciones parciales para crear nuevas collecciones
	val listFunc = List(4, 6, 7, 8, 9, 13, 14)//> listFunc  : List[Int] = List(4, 6, 7, 8, 9, 13, 14)
	val partialFunction1: PartialFunction[Int, Int] = {
	  case x: Int if x % 2 == 0 ⇒ x * 3
	}                                         //> partialFunction1  : PartialFunction[Int,Int] = <function1>
	val partialFunction2: PartialFunction[Int, Int] = {
	  case y: Int if y % 2 != 0 ⇒ y * 4
	}                                         //> partialFunction2  : PartialFunction[Int,Int] = <function1>
	val resultFunc = listFunc.collect(partialFunction1 orElse partialFunction2)
                                                  //> resultFunc  : List[Int] = List(12, 18, 28, 24, 36, 52, 42)
	resultFunc                                //> res5: List[Int] = List(12, 18, 28, 24, 36, 52, 42)
	
	
	
	
	//Utilizacion del metodo foreach, este metodo no devuelve
	val listForeach = List(4, 6, 7, 8, 9, 13, 14)
                                                  //> listForeach  : List[Int] = List(4, 6, 7, 8, 9, 13, 14)
	listForeach.foreach(num ⇒ println(num * 4))
                                                  //> 16
                                                  //| 24
                                                  //| 28
                                                  //| 32
                                                  //| 36
                                                  //| 52
                                                  //| 56
	listForeach                               //> res6: List[Int] = List(4, 6, 7, 8, 9, 13, 14)
	
	
	
	
	//Uso del tipo de dato stream lista perezosa evalua los objetos a medida que se necesiten
	val listStream = List(4, 6, 7, 8, 9, 13, 14)
                                                  //> listStream  : List[Int] = List(4, 6, 7, 8, 9, 13, 14)
	val resultStream = listStream.toStream    //> resultStream  : scala.collection.immutable.Stream[Int] = Stream(4, ?)
	resultStream.isInstanceOf[Stream[_]]      //> res7: Boolean = true
	resultStream take 3                       //> res8: scala.collection.immutable.Stream[Int] = Stream(4, ?)
	
	
	
	
	//Validar si esta vacio o lleno
	val mapLLeno = Map("Phoenix" → "Arizona", "Austin" → "Texas")
                                                  //> mapLLeno  : scala.collection.immutable.Map[String,String] = Map(Phoenix -> 
                                                  //| Arizona, Austin -> Texas)
	mapLLeno.isEmpty                          //> res9: Boolean = false
	val mapNoLleno = Map("Phoenix" → "Arizona", "Austin" → "Texas")
                                                  //> mapNoLleno  : scala.collection.immutable.Map[String,String] = Map(Phoenix -
                                                  //| > Arizona, Austin -> Texas)
	mapNoLleno.nonEmpty                       //> res10: Boolean = true
	
	
	
	
	
	//Comprobar la longitud
	val mapSize = Map("Phoenix" → "Arizona", "Austin" → "Texas")
                                                  //> mapSize  : scala.collection.immutable.Map[String,String] = Map(Phoenix -> A
                                                  //| rizona, Austin -> Texas)
	mapSize.size                              //> res11: Int = 2
	
	
	
	
	//Head devolvera el primer elemento
	val listHead = List(10, 19, 45, 1, 22)    //> listHead  : List[Int] = List(10, 19, 45, 1, 22)
	listHead.head                             //> res12: Int = 10
	
	
	
	
	//HeadOption devolvera el primer elemento pero controlando si no existe
	val listHeadOpcion = List(10, 19, 45, 1, 22)
                                                  //> listHeadOpcion  : List[Int] = List(10, 19, 45, 1, 22)
	listHeadOpcion.headOption                 //> res13: Option[Int] = Some(10)
	val list2HeadOption = List()              //> list2HeadOption  : List[Nothing] = List()
	list2HeadOption.headOption                //> res14: Option[Nothing] = None
	
	
	
	
	//Last devolvera el ultmo elemento
	val listLast = List(10, 19, 45, 1, 22)    //> listLast  : List[Int] = List(10, 19, 45, 1, 22)
	listLast.last                             //> res15: Int = 22
	
	
	
	
	//LastOption devolvera el ultimo elemento pero controlando si no existe
	val listLastOption = List(10, 19, 45, 1, 22)
                                                  //> listLastOption  : List[Int] = List(10, 19, 45, 1, 22)
	listLastOption.lastOption                 //> res16: Option[Int] = Some(22)
	
	val list2LastOption = List()              //> list2LastOption  : List[Nothing] = List()
	list2LastOption.lastOption                //> res17: Option[Nothing] = None
	
	
	
	
	//Find encontrar el primer elemento que concuerde con la condicion
	val listFind = List(10, 19, 45, 1, 22)    //> listFind  : List[Int] = List(10, 19, 45, 1, 22)
	listFind.find(_ % 2 != 0)                 //> res18: Option[Int] = Some(19)
	
	
	
	
	//Init Devolvemos el resto de la coleccion sin el primer elemento
	val listTail = List(10, 19, 45, 1, 22)    //> listTail  : List[Int] = List(10, 19, 45, 1, 22)
	listTail.tail                             //> res19: List[Int] = List(19, 45, 1, 22)
	
	
	
	//Init Devolvera el resto de la coleccion Menos el ultimo
	val listInit = List(10, 19, 45, 1, 22)    //> listInit  : List[Int] = List(10, 19, 45, 1, 22)
	listInit.init                             //> res20: List[Int] = List(10, 19, 45, 1)
	
	
		
	//Slice parte la lista desde - hasta
	val listSlice = List(10, 19, 45, 1, 22)   //> listSlice  : List[Int] = List(10, 19, 45, 1, 22)
	listSlice.slice(1, 3)                     //> res21: List[Int] = List(19, 45)
	
	
	//Take devolvera el primer numero de los elementos
	val listTake = List(10, 19, 45, 1, 22)    //> listTake  : List[Int] = List(10, 19, 45, 1, 22)
	listTake.take(3)                          //> res22: List[Int] = List(10, 19, 45)
	
	
	
	//Uso de Take y Drop en Streams
	def streamer(v: Int): Stream[Int] = Stream.cons(v, streamer(v + 1))
                                                  //> streamer: (v: Int)Stream[Int]
	val a = streamer(2)                       //> a  : Stream[Int] = Stream(2, ?)
	(a take 3 toList)                         //> res23: List[Int] = List(2, 3, 4)
	//Drop tomara el resto de numeros que no fueron dados
	((a drop 6) take 3).toList                //> res24: List[Int] = List(8, 9, 10)
	
	
	
	
	//TakeWhile, DropWhile, Filter, FilterNOt llenara elementos que satisfaga la condicion
	val listContinuos = List(87, 44, 5, 4, 200, 10, 39, 100)
                                                  //> listContinuos  : List[Int] = List(87, 44, 5, 4, 200, 10, 39, 100)
	listContinuos.takeWhile(_ < 100)          //> res25: List[Int] = List(87, 44, 5, 4)
	listContinuos.dropWhile(_ < 100)          //> res26: List[Int] = List(200, 10, 39, 100)
	listContinuos.filter(_ < 100)             //> res27: List[Int] = List(87, 44, 5, 4, 10, 39)
	listContinuos.filterNot(_ < 100)          //> res28: List[Int] = List(200, 100)
	
	
	
	
	/*
	** SplitAt divide los arreglos
	** Span divide los arreglos hasta que ya no coincide la condicion
	** Partition divide los arreglos deacuerdo de la condicion
	*/
	val arraySplitSpan = Array(87, 44, 5, 4, 200, 10, 39, 100)
                                                  //> arraySplitSpan  : Array[Int] = Array(87, 44, 5, 4, 200, 10, 39, 100)
	val resultSplit = arraySplitSpan splitAt 3//> resultSplit  : (Array[Int], Array[Int]) = (Array(87, 44, 5),Array(4, 200, 1
                                                  //| 0, 39, 100))
	resultSplit._1                            //> res29: Array[Int] = Array(87, 44, 5)
	resultSplit._2                            //> res30: Array[Int] = Array(4, 200, 10, 39, 100)
	val resultSpan = arraySplitSpan span (_ < 100)
                                                  //> resultSpan  : (Array[Int], Array[Int]) = (Array(87, 44, 5, 4),Array(200, 10
                                                  //| , 39, 100))
	resultSpan._1                             //> res31: Array[Int] = Array(87, 44, 5, 4)
	resultSpan._2                             //> res32: Array[Int] = Array(200, 10, 39, 100)
	val resultPartition = arraySplitSpan partition  (_ < 100)
                                                  //> resultPartition  : (Array[Int], Array[Int]) = (Array(87, 44, 5, 4, 10, 39),
                                                  //| Array(200, 100))
	resultPartition._1                        //> res33: Array[Int] = Array(87, 44, 5, 4, 10, 39)
	resultPartition._2                        //> res34: Array[Int] = Array(200, 100)
	
	
	
	
	//Group By categorizara un arreglo deacuerdocon una funcion
	val arrayGroup = Array(87, 44, 5, 4, 200, 10, 39, 100)
                                                  //> arrayGroup  : Array[Int] = Array(87, 44, 5, 4, 200, 10, 39, 100)
	val oddAndSmallPartial: PartialFunction[Int, String] = {
	  case x: Int if x % 2 != 0 && x < 100 ⇒ "Odd and less than 100"
	}                                         //> oddAndSmallPartial  : PartialFunction[Int,String] = <function1>
	val evenAndSmallPartial: PartialFunction[Int, String] = {
	  case x: Int if x != 0 && x % 2 == 0 && x < 100 ⇒ "Even and less than 100"
	}                                         //> evenAndSmallPartial  : PartialFunction[Int,String] = <function1>
	val negativePartial: PartialFunction[Int, String] = {
	  case x: Int if x < 0 ⇒ "Negative Number"
	}                                         //> negativePartial  : PartialFunction[Int,String] = <function1>
	val largePartial: PartialFunction[Int, String] = {
	  case x: Int if x > 99 ⇒ "Large Number"
	}                                         //> largePartial  : PartialFunction[Int,String] = <function1>
	val zeroPartial: PartialFunction[Int, String] = {
	  case x: Int if x == 0 ⇒ "Zero"
	}                                         //> zeroPartial  : PartialFunction[Int,String] = <function1>
	val resultGroup = arrayGroup groupBy {
	  oddAndSmallPartial orElse
	  evenAndSmallPartial orElse
	  negativePartial orElse
	  largePartial orElse
	  zeroPartial                             //> resultGroup  : scala.collection.immutable.Map[String,Array[Int]] = Map(Even
                                                  //|  and less than 100 -> Array(44, 4, 10), Odd and less than 100 -> Array(87, 
                                                  //| 5, 39), Large Number -> Array(200, 100))
	}
	(resultGroup("Even and less than 100"))   //> res35: Array[Int] = Array(44, 4, 10)
	(resultGroup("Large Number"))             //> res36: Array[Int] = Array(200, 100)
	
	
	
	
	/*
	**ForAll verifica si todos los miembros del arreglo cumplen con la funcion
	**Exists verifica si algun elemento cumple con la condicion
	**Count contrar el numero de elementos que cumplen con la condicion
	*/
	val listForAll = List(87, 44, 5, 4, 200, 10, 39, 100)
                                                  //> listForAll  : List[Int] = List(87, 44, 5, 4, 200, 10, 39, 100)
	val resultForAll = listForAll forall (_ < 100)
                                                  //> resultForAll  : Boolean = false
  val resultExists = listForAll exists (_ < 100)  //> resultExists  : Boolean = true
	val resultCount = listForAll count (_ < 100)
                                                  //> resultCount  : Int = 6
	resultForAll                              //> res37: Boolean = false
	resultExists                              //> res38: Boolean = true
	resultCount                               //> res39: Int = 6
	
	
	
	
	//FoldLeft lo que hace cada una de estas funciones es esta operacion (((((0 - 5) - 4) - 3) - 2) - 1)
	val listFold = List(5, 4, 3, 2, 1)        //> listFold  : List[Int] = List(5, 4, 3, 2, 1)
	val resultFold = (0 /: listFold) { (`running total`, `next element`) ⇒
	  `running total` - `next element`
	}                                         //> resultFold  : Int = -15
	resultFold                                //> res40: Int = -15
	val result2Fold = listFold.foldLeft(0) { (`running total`, `next element`) ⇒
	  `running total` - `next element`
	}                                         //> result2Fold  : Int = -15
	result2Fold                               //> res41: Int = -15
	val result3Fold = (0 /: listFold)(_ - _) //Short hand
                                                  //> result3Fold  : Int = -15
	result3Fold                               //> res42: Int = -15
	val result4Fold = listFold.foldLeft(0)(_ - _)
                                                  //> result4Fold  : Int = -15
	result4Fold                               //> res43: Int = -15
	
	
	
	
	//FoldRigt lo que hace cada una de estas funciones es esta operacion (5 - (4 - (3 - (2 - (1 - 0)))))
	val listFoldRigt = List(5, 4, 3, 2, 1)    //> listFoldRigt  : List[Int] = List(5, 4, 3, 2, 1)
	val resultFoldRigt = (listFoldRigt :\ 0) { (`next element`, `running total`) ⇒
	  `next element` - `running total`
	}                                         //> resultFoldRigt  : Int = 3
	resultFoldRigt                            //> res44: Int = 3
	val result2FoldRigt = listFoldRigt.foldRight(0) { (`next element`, `running total`) ⇒
	  `next element` - `running total`
	}                                         //> result2FoldRigt  : Int = 3
	result2FoldRigt                           //> res45: Int = 3
	val result3FoldRigt = (listFoldRigt :\ 0)(_ - _) //Short hand
                                                  //> result3FoldRigt  : Int = 3
	result3FoldRigt                           //> res46: Int = 3
	val result4FoldRigt = listFoldRigt.foldRight(0)(_ - _)
                                                  //> result4FoldRigt  : Int = 3
	result4FoldRigt                           //> res47: Int = 3
	
	
	
	//ReduceLeft lo que hace estas funciones es la siguiente operacion ((((5-4)-3)-2)-1)
	val intList = List(5, 4, 3, 2, 1)         //> intList  : List[Int] = List(5, 4, 3, 2, 1)
	intList.reduceLeft {
	  _ - _
	}                                         //> res48: Int = -5
	intList.reverse.reduceLeft((x, y) => y - x)
                                                  //> res49: Int = 3
  val stringList = List("Do", "Re", "Me", "Fa", "So", "La", "Te", "Do")
                                                  //> stringList  : List[String] = List(Do, Re, Me, Fa, So, La, Te, Do)
	stringList.reduceLeft {
	  _ + _
	}                                         //> res50: String = DoReMeFaSoLaTeDo
	
	
	//ReduceRigth hace lo mismo que FoldRigt solo que la semilla no es 0 si no el ultimo valor
	intList.reduceRight {
	  _ - _
	}                                         //> res51: Int = 3
	//Este se hace para que no haya un desbordamiento
	intList.reduceRight((x, y) => x - y)      //> res52: Int = 3
	stringList.reduceRight {
	  _ + _
	}                                         //> res53: String = DoReMeFaSoLaTeDo
	
	
	
	
	//Operaciones Matematicas sum= Suma, product= Multiplicacion, min= Elemento mas pequeño, max= Elemento mas grande
	val listMate = List(5.5, 4, 3, 2, 1)      //> listMate  : List[Double] = List(5.5, 4.0, 3.0, 2.0, 1.0)
	listMate.sum                              //> res54: Double = 15.5
	listMate.product                          //> res55: Double = 132.0
	listMate.max                              //> res56: Double = 5.5
	listMate.min                              //> res57: Double = 1.0
	
	
	
	
	//Transpose esta funcion agrupa diferentes listas por su posicion
	val listTranspose = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
                                                  //> listTranspose  : List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(
                                                  //| 7, 8, 9))
	listTranspose.transpose                   //> res58: List[List[Int]] = List(List(1, 4, 7), List(2, 5, 8), List(3, 6, 9))
                                                  //| 
	val list2Transpose = List(List(1), List(4))
                                                  //> list2Transpose  : List[List[Int]] = List(List(1), List(4))
	list2Transpose.transpose                  //> res59: List[List[Int]] = List(List(1, 4))
	
	
	
	//Transforma la lista en un string
	val listString = List(1, 2, 3, 4, 5)      //> listString  : List[Int] = List(1, 2, 3, 4, 5)
	listString.mkString(",")                  //> res60: String = 1,2,3,4,5
	listString.mkString(">", ",", "<")        //> res61: String = >1,2,3,4,5<
	
	
	
	
	//StringBuilder es un objeto de un string
	val stringBuilder = new StringBuilder()   //> stringBuilder  : StringBuilder = 
	val listBuilder = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
                                                  //> listBuilder  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 
                                                  //| 14, 15)
	stringBuilder.append("I want all numbers 6-12: ")
                                                  //> res62: StringBuilder = I want all numbers 6-12: 
	listBuilder.filter(it ⇒ it > 5 && it < 13).addString(stringBuilder, ",")
                                                  //> res63: StringBuilder = I want all numbers 6-12: 6,7,8,9,10,11,12
	stringBuilder.mkString                    //> res64: String = I want all numbers 6-12: 6,7,8,9,10,11,12
		
		
		
}