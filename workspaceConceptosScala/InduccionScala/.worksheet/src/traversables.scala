object traversables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(131); 
  
  //Unir un Set y un List da resultado el que se coloque primero en la union
  val set = Set(1, 9, 10, 22);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(30); 
	val list = List(3, 4, 5, 10);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(26); 
	val result = set ++ list;System.out.println("""result  : scala.collection.immutable.Set[Int] = """ + $show(result ));$skip(28); 
  val result2 = list ++ set;System.out.println("""result2  : List[Int] = """ + $show(result2 ));$skip(67); 


	
	//Utilizacion de la funcion map
	val setMap = Set(1, 3, 4, 6);System.out.println("""setMap  : scala.collection.immutable.Set[Int] = """ + $show(setMap ));$skip(35); 
	val resultMap = setMap.map(_ * 4);System.out.println("""resultMap  : scala.collection.immutable.Set[Int] = """ + $show(resultMap ));$skip(22); val res$0 = 
	resultMap.lastOption;System.out.println("""res0: Option[Int] = """ + $show(res$0));$skip(142); 
	
	
	
	
	//Uso de la opcion flatten para unir listas de listas
	val listFlatten = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10));System.out.println("""listFlatten  : List[List[Int]] = """ + $show(listFlatten ));$skip(21); val res$1 = 
	listFlatten.flatten;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(158); 
	
	
	
	
	//Uso de la opcion flatMap para unir la lista y multiplicar todos * 4
	val listFlatMap = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10));System.out.println("""listFlatMap  : List[List[Int]] = """ + $show(listFlatMap ));$skip(55); 
	val resultFlatMap = listFlatMap.flatMap(_.map(_ * 4));System.out.println("""resultFlatMap  : List[Int] = """ + $show(resultFlatMap ));$skip(15); val res$2 = 
	resultFlatMap;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(101); 
	
	
	
	//Usando flatMap pero filtrando solo por algunos
	val listFlatMapFilter = List(1, 2, 3, 4, 5);System.out.println("""listFlatMapFilter  : List[Int] = """ + $show(listFlatMapFilter ));$skip(95); 
	val resultFlatMapFilter = listFlatMapFilter.flatMap(it ⇒ if (it % 2 == 0) Some(it) else None);System.out.println("""resultFlatMapFilter  : List[Int] = """ + $show(resultFlatMapFilter ));$skip(21); val res$3 = 
	resultFlatMapFilter;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(115); 
	
	
	
	
	
	
	//Uso de la funcion collect para crear una nueva lista
	val listCollect = List(4, 6, 7, 8, 9, 13, 14);System.out.println("""listCollect  : List[Int] = """ + $show(listCollect ));$skip(85); 
	val resultCollect = listCollect.collect {
  	case x: Int if (x % 2 == 0) ⇒ x * 3
	};System.out.println("""resultCollect  : List[Int] = """ + $show(resultCollect ));$skip(15); val res$4 = 
	resultCollect;System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(115); 
	
	
	
	
	
	//Uso de funciones parciales para crear nuevas collecciones
	val listFunc = List(4, 6, 7, 8, 9, 13, 14);System.out.println("""listFunc  : List[Int] = """ + $show(listFunc ));$skip(93); 
	val partialFunction1: PartialFunction[Int, Int] = {
	  case x: Int if x % 2 == 0 ⇒ x * 3
	};System.out.println("""partialFunction1  : PartialFunction[Int,Int] = """ + $show(partialFunction1 ));$skip(93); 
	val partialFunction2: PartialFunction[Int, Int] = {
	  case y: Int if y % 2 != 0 ⇒ y * 4
	};System.out.println("""partialFunction2  : PartialFunction[Int,Int] = """ + $show(partialFunction2 ));$skip(77); 
	val resultFunc = listFunc.collect(partialFunction1 orElse partialFunction2);System.out.println("""resultFunc  : List[Int] = """ + $show(resultFunc ));$skip(12); val res$5 = 
	resultFunc;System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(114); 
	
	
	
	
	//Utilizacion del metodo foreach, este metodo no devuelve
	val listForeach = List(4, 6, 7, 8, 9, 13, 14);System.out.println("""listForeach  : List[Int] = """ + $show(listForeach ));$skip(45); 
	listForeach.foreach(num ⇒ println(num * 4));$skip(13); val res$6 = 
	listForeach;System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(145); 
	
	
	
	
	//Uso del tipo de dato stream lista perezosa evalua los objetos a medida que se necesiten
	val listStream = List(4, 6, 7, 8, 9, 13, 14);System.out.println("""listStream  : List[Int] = """ + $show(listStream ));$skip(40); 
	val resultStream = listStream.toStream;System.out.println("""resultStream  : scala.collection.immutable.Stream[Int] = """ + $show(resultStream ));$skip(38); val res$7 = 
	resultStream.isInstanceOf[Stream[_]];System.out.println("""res7: Boolean = """ + $show(res$7));$skip(21); val res$8 = 
	resultStream take 3;System.out.println("""res8: scala.collection.immutable.Stream[Int] = """ + $show(res$8));$skip(104); 
	
	
	
	
	//Validar si esta vacio o lleno
	val mapLLeno = Map("Phoenix" → "Arizona", "Austin" → "Texas");System.out.println("""mapLLeno  : scala.collection.immutable.Map[String,String] = """ + $show(mapLLeno ));$skip(18); val res$9 = 
	mapLLeno.isEmpty;System.out.println("""res9: Boolean = """ + $show(res$9));$skip(65); 
	val mapNoLleno = Map("Phoenix" → "Arizona", "Austin" → "Texas");System.out.println("""mapNoLleno  : scala.collection.immutable.Map[String,String] = """ + $show(mapNoLleno ));$skip(21); val res$10 = 
	mapNoLleno.nonEmpty;System.out.println("""res10: Boolean = """ + $show(res$10));$skip(97); 
	
	
	
	
	
	//Comprobar la longitud
	val mapSize = Map("Phoenix" → "Arizona", "Austin" → "Texas");System.out.println("""mapSize  : scala.collection.immutable.Map[String,String] = """ + $show(mapSize ));$skip(14); val res$11 = 
	mapSize.size;System.out.println("""res11: Int = """ + $show(res$11));$skip(85); 
	
	
	
	
	//Head devolvera el primer elemento
	val listHead = List(10, 19, 45, 1, 22);System.out.println("""listHead  : List[Int] = """ + $show(listHead ));$skip(15); val res$12 = 
	listHead.head;System.out.println("""res12: Int = """ + $show(res$12));$skip(127); 
	
	
	
	
	//HeadOption devolvera el primer elemento pero controlando si no existe
	val listHeadOpcion = List(10, 19, 45, 1, 22);System.out.println("""listHeadOpcion  : List[Int] = """ + $show(listHeadOpcion ));$skip(27); val res$13 = 
	listHeadOpcion.headOption;System.out.println("""res13: Option[Int] = """ + $show(res$13));$skip(30); 
	val list2HeadOption = List();System.out.println("""list2HeadOption  : List[Nothing] = """ + $show(list2HeadOption ));$skip(28); val res$14 = 
	list2HeadOption.headOption;System.out.println("""res14: Option[Nothing] = """ + $show(res$14));$skip(84); 
	
	
	
	
	//Last devolvera el ultmo elemento
	val listLast = List(10, 19, 45, 1, 22);System.out.println("""listLast  : List[Int] = """ + $show(listLast ));$skip(15); val res$15 = 
	listLast.last;System.out.println("""res15: Int = """ + $show(res$15));$skip(127); 
	
	
	
	
	//LastOption devolvera el ultimo elemento pero controlando si no existe
	val listLastOption = List(10, 19, 45, 1, 22);System.out.println("""listLastOption  : List[Int] = """ + $show(listLastOption ));$skip(27); val res$16 = 
	listLastOption.lastOption;System.out.println("""res16: Option[Int] = """ + $show(res$16));$skip(32); 
	
	val list2LastOption = List();System.out.println("""list2LastOption  : List[Nothing] = """ + $show(list2LastOption ));$skip(28); val res$17 = 
	list2LastOption.lastOption;System.out.println("""res17: Option[Nothing] = """ + $show(res$17));$skip(116); 
	
	
	
	
	//Find encontrar el primer elemento que concuerde con la condicion
	val listFind = List(10, 19, 45, 1, 22);System.out.println("""listFind  : List[Int] = """ + $show(listFind ));$skip(27); val res$18 = 
	listFind.find(_ % 2 != 0);System.out.println("""res18: Option[Int] = """ + $show(res$18));$skip(115); 
	
	
	
	
	//Init Devolvemos el resto de la coleccion sin el primer elemento
	val listTail = List(10, 19, 45, 1, 22);System.out.println("""listTail  : List[Int] = """ + $show(listTail ));$skip(15); val res$19 = 
	listTail.tail;System.out.println("""res19: List[Int] = """ + $show(res$19));$skip(105); 
	
	
	
	//Init Devolvera el resto de la coleccion Menos el ultimo
	val listInit = List(10, 19, 45, 1, 22);System.out.println("""listInit  : List[Int] = """ + $show(listInit ));$skip(15); val res$20 = 
	listInit.init;System.out.println("""res20: List[Int] = """ + $show(res$20));$skip(86); 
	
	
		
	//Slice parte la lista desde - hasta
	val listSlice = List(10, 19, 45, 1, 22);System.out.println("""listSlice  : List[Int] = """ + $show(listSlice ));$skip(23); val res$21 = 
	listSlice.slice(1, 3);System.out.println("""res21: List[Int] = """ + $show(res$21));$skip(96); 
	
	
	//Take devolvera el primer numero de los elementos
	val listTake = List(10, 19, 45, 1, 22);System.out.println("""listTake  : List[Int] = """ + $show(listTake ));$skip(18); val res$22 = 
	listTake.take(3);System.out.println("""res22: List[Int] = """ + $show(res$22));$skip(108); 
	
	
	
	//Uso de Take y Drop en Streams
	def streamer(v: Int): Stream[Int] = Stream.cons(v, streamer(v + 1));System.out.println("""streamer: (v: Int)Stream[Int]""");$skip(21); 
	val a = streamer(2);System.out.println("""a  : Stream[Int] = """ + $show(a ));$skip(19); val res$23 = 
	(a take 3 toList);System.out.println("""res23: List[Int] = """ + $show(res$23));$skip(83); val res$24 = 
	//Drop tomara el resto de numeros que no fueron dados
	((a drop 6) take 3).toList;System.out.println("""res24: List[Int] = """ + $show(res$24));$skip(154); 
	
	
	
	
	//TakeWhile, DropWhile, Filter, FilterNOt llenara elementos que satisfaga la condicion
	val listContinuos = List(87, 44, 5, 4, 200, 10, 39, 100);System.out.println("""listContinuos  : List[Int] = """ + $show(listContinuos ));$skip(34); val res$25 = 
	listContinuos.takeWhile(_ < 100);System.out.println("""res25: List[Int] = """ + $show(res$25));$skip(34); val res$26 = 
	listContinuos.dropWhile(_ < 100);System.out.println("""res26: List[Int] = """ + $show(res$26));$skip(31); val res$27 = 
	listContinuos.filter(_ < 100);System.out.println("""res27: List[Int] = """ + $show(res$27));$skip(34); val res$28 = 
	listContinuos.filterNot(_ < 100);System.out.println("""res28: List[Int] = """ + $show(res$28));$skip(235); 
	
	
	
	
	/*
	** SplitAt divide los arreglos
	** Span divide los arreglos hasta que ya no coincide la condicion
	** Partition divide los arreglos deacuerdo de la condicion
	*/
	val arraySplitSpan = Array(87, 44, 5, 4, 200, 10, 39, 100);System.out.println("""arraySplitSpan  : Array[Int] = """ + $show(arraySplitSpan ));$skip(44); 
	val resultSplit = arraySplitSpan splitAt 3;System.out.println("""resultSplit  : (Array[Int], Array[Int]) = """ + $show(resultSplit ));$skip(16); val res$29 = 
	resultSplit._1;System.out.println("""res29: Array[Int] = """ + $show(res$29));$skip(16); val res$30 = 
	resultSplit._2;System.out.println("""res30: Array[Int] = """ + $show(res$30));$skip(48); 
	val resultSpan = arraySplitSpan span (_ < 100);System.out.println("""resultSpan  : (Array[Int], Array[Int]) = """ + $show(resultSpan ));$skip(15); val res$31 = 
	resultSpan._1;System.out.println("""res31: Array[Int] = """ + $show(res$31));$skip(15); val res$32 = 
	resultSpan._2;System.out.println("""res32: Array[Int] = """ + $show(res$32));$skip(59); 
	val resultPartition = arraySplitSpan partition  (_ < 100);System.out.println("""resultPartition  : (Array[Int], Array[Int]) = """ + $show(resultPartition ));$skip(20); val res$33 = 
	resultPartition._1;System.out.println("""res33: Array[Int] = """ + $show(res$33));$skip(20); val res$34 = 
	resultPartition._2;System.out.println("""res34: Array[Int] = """ + $show(res$34));$skip(125); 
	
	
	
	
	//Group By categorizara un arreglo deacuerdocon una funcion
	val arrayGroup = Array(87, 44, 5, 4, 200, 10, 39, 100);System.out.println("""arrayGroup  : Array[Int] = """ + $show(arrayGroup ));$skip(127); 
	val oddAndSmallPartial: PartialFunction[Int, String] = {
	  case x: Int if x % 2 != 0 && x < 100 ⇒ "Odd and less than 100"
	};System.out.println("""oddAndSmallPartial  : PartialFunction[Int,String] = """ + $show(oddAndSmallPartial ));$skip(139); 
	val evenAndSmallPartial: PartialFunction[Int, String] = {
	  case x: Int if x != 0 && x % 2 == 0 && x < 100 ⇒ "Even and less than 100"
	};System.out.println("""evenAndSmallPartial  : PartialFunction[Int,String] = """ + $show(evenAndSmallPartial ));$skip(102); 
	val negativePartial: PartialFunction[Int, String] = {
	  case x: Int if x < 0 ⇒ "Negative Number"
	};System.out.println("""negativePartial  : PartialFunction[Int,String] = """ + $show(negativePartial ));$skip(97); 
	val largePartial: PartialFunction[Int, String] = {
	  case x: Int if x > 99 ⇒ "Large Number"
	};System.out.println("""largePartial  : PartialFunction[Int,String] = """ + $show(largePartial ));$skip(88); 
	val zeroPartial: PartialFunction[Int, String] = {
	  case x: Int if x == 0 ⇒ "Zero"
	};System.out.println("""zeroPartial  : PartialFunction[Int,String] = """ + $show(zeroPartial ));$skip(163); 
	val resultGroup = arrayGroup groupBy {
	  oddAndSmallPartial orElse
	  evenAndSmallPartial orElse
	  negativePartial orElse
	  largePartial orElse
	  zeroPartial
	};System.out.println("""resultGroup  : scala.collection.immutable.Map[String,Array[Int]] = """ + $show(resultGroup ));$skip(44); val res$35 = 
	(resultGroup("Even and less than 100"));System.out.println("""res35: Array[Int] = """ + $show(res$35));$skip(31); val res$36 = 
	(resultGroup("Large Number"));System.out.println("""res36: Array[Int] = """ + $show(res$36));$skip(277); 
	
	
	
	
	/*
	**ForAll verifica si todos los miembros del arreglo cumplen con la funcion
	**Exists verifica si algun elemento cumple con la condicion
	**Count contrar el numero de elementos que cumplen con la condicion
	*/
	val listForAll = List(87, 44, 5, 4, 200, 10, 39, 100);System.out.println("""listForAll  : List[Int] = """ + $show(listForAll ));$skip(48); 
	val resultForAll = listForAll forall (_ < 100);System.out.println("""resultForAll  : Boolean = """ + $show(resultForAll ));$skip(49); 
  val resultExists = listForAll exists (_ < 100);System.out.println("""resultExists  : Boolean = """ + $show(resultExists ));$skip(46); 
	val resultCount = listForAll count (_ < 100);System.out.println("""resultCount  : Int = """ + $show(resultCount ));$skip(14); val res$37 = 
	resultForAll;System.out.println("""res37: Boolean = """ + $show(res$37));$skip(14); val res$38 = 
	resultExists;System.out.println("""res38: Boolean = """ + $show(res$38));$skip(13); val res$39 = 
	resultCount;System.out.println("""res39: Int = """ + $show(res$39));$skip(146); 
	
	
	
	
	//FoldLeft lo que hace cada una de estas funciones es esta operacion (((((0 - 5) - 4) - 3) - 2) - 1)
	val listFold = List(5, 4, 3, 2, 1);System.out.println("""listFold  : List[Int] = """ + $show(listFold ));$skip(111); 
	val resultFold = (0 /: listFold) { (`running total`, `next element`) ⇒
	  `running total` - `next element`
	};System.out.println("""resultFold  : Int = """ + $show(resultFold ));$skip(12); val res$40 = 
	resultFold;System.out.println("""res40: Int = """ + $show(res$40));$skip(117); 
	val result2Fold = listFold.foldLeft(0) { (`running total`, `next element`) ⇒
	  `running total` - `next element`
	};System.out.println("""result2Fold  : Int = """ + $show(result2Fold ));$skip(13); val res$41 = 
	result2Fold;System.out.println("""res41: Int = """ + $show(res$41));$skip(55); 
	val result3Fold = (0 /: listFold)(_ - _);System.out.println("""result3Fold  : Int = """ + $show(result3Fold ));$skip(13); val res$42 =  //Short hand
	result3Fold;System.out.println("""res42: Int = """ + $show(res$42));$skip(47); 
	val result4Fold = listFold.foldLeft(0)(_ - _);System.out.println("""result4Fold  : Int = """ + $show(result4Fold ));$skip(13); val res$43 = 
	result4Fold;System.out.println("""res43: Int = """ + $show(res$43));$skip(150); 
	
	
	
	
	//FoldRigt lo que hace cada una de estas funciones es esta operacion (5 - (4 - (3 - (2 - (1 - 0)))))
	val listFoldRigt = List(5, 4, 3, 2, 1);System.out.println("""listFoldRigt  : List[Int] = """ + $show(listFoldRigt ));$skip(119); 
	val resultFoldRigt = (listFoldRigt :\ 0) { (`next element`, `running total`) ⇒
	  `next element` - `running total`
	};System.out.println("""resultFoldRigt  : Int = """ + $show(resultFoldRigt ));$skip(16); val res$44 = 
	resultFoldRigt;System.out.println("""res44: Int = """ + $show(res$44));$skip(126); 
	val result2FoldRigt = listFoldRigt.foldRight(0) { (`next element`, `running total`) ⇒
	  `next element` - `running total`
	};System.out.println("""result2FoldRigt  : Int = """ + $show(result2FoldRigt ));$skip(17); val res$45 = 
	result2FoldRigt;System.out.println("""res45: Int = """ + $show(res$45));$skip(63); 
	val result3FoldRigt = (listFoldRigt :\ 0)(_ - _);System.out.println("""result3FoldRigt  : Int = """ + $show(result3FoldRigt ));$skip(17); val res$46 =  //Short hand
	result3FoldRigt;System.out.println("""res46: Int = """ + $show(res$46));$skip(56); 
	val result4FoldRigt = listFoldRigt.foldRight(0)(_ - _);System.out.println("""result4FoldRigt  : Int = """ + $show(result4FoldRigt ));$skip(17); val res$47 = 
	result4FoldRigt;System.out.println("""res47: Int = """ + $show(res$47));$skip(127); 
	
	
	
	//ReduceLeft lo que hace estas funciones es la siguiente operacion ((((5-4)-3)-2)-1)
	val intList = List(5, 4, 3, 2, 1);System.out.println("""intList  : List[Int] = """ + $show(intList ));$skip(34); val res$48 = 
	intList.reduceLeft {
	  _ - _
	};System.out.println("""res48: Int = """ + $show(res$48));$skip(45); val res$49 = 
	intList.reverse.reduceLeft((x, y) => y - x);System.out.println("""res49: Int = """ + $show(res$49));$skip(72); 
  val stringList = List("Do", "Re", "Me", "Fa", "So", "La", "Te", "Do");System.out.println("""stringList  : List[String] = """ + $show(stringList ));$skip(37); val res$50 = 
	stringList.reduceLeft {
	  _ + _
	};System.out.println("""res50: String = """ + $show(res$50));$skip(131); val res$51 = 
	
	
	//ReduceRigth hace lo mismo que FoldRigt solo que la semilla no es 0 si no el ultimo valor
	intList.reduceRight {
	  _ - _
	};System.out.println("""res51: Int = """ + $show(res$51));$skip(89); val res$52 = 
	//Este se hace para que no haya un desbordamiento
	intList.reduceRight((x, y) => x - y);System.out.println("""res52: Int = """ + $show(res$52));$skip(38); val res$53 = 
	stringList.reduceRight {
	  _ + _
	};System.out.println("""res53: String = """ + $show(res$53));$skip(161); 
	
	
	
	
	//Operaciones Matematicas sum= Suma, product= Multiplicacion, min= Elemento mas pequeño, max= Elemento mas grande
	val listMate = List(5.5, 4, 3, 2, 1);System.out.println("""listMate  : List[Double] = """ + $show(listMate ));$skip(14); val res$54 = 
	listMate.sum;System.out.println("""res54: Double = """ + $show(res$54));$skip(18); val res$55 = 
	listMate.product;System.out.println("""res55: Double = """ + $show(res$55));$skip(14); val res$56 = 
	listMate.max;System.out.println("""res56: Double = """ + $show(res$56));$skip(14); val res$57 = 
	listMate.min;System.out.println("""res57: Double = """ + $show(res$57));$skip(146); 
	
	
	
	
	//Transpose esta funcion agrupa diferentes listas por su posicion
	val listTranspose = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9));System.out.println("""listTranspose  : List[List[Int]] = """ + $show(listTranspose ));$skip(25); val res$58 = 
	listTranspose.transpose;System.out.println("""res58: List[List[Int]] = """ + $show(res$58));$skip(45); 
	val list2Transpose = List(List(1), List(4));System.out.println("""list2Transpose  : List[List[Int]] = """ + $show(list2Transpose ));$skip(26); val res$59 = 
	list2Transpose.transpose;System.out.println("""res59: List[List[Int]] = """ + $show(res$59));$skip(80); 
	
	
	
	//Transforma la lista en un string
	val listString = List(1, 2, 3, 4, 5);System.out.println("""listString  : List[Int] = """ + $show(listString ));$skip(26); val res$60 = 
	listString.mkString(",");System.out.println("""res60: String = """ + $show(res$60));$skip(36); val res$61 = 
	listString.mkString(">", ",", "<");System.out.println("""res61: String = """ + $show(res$61));$skip(92); 
	
	
	
	
	//StringBuilder es un objeto de un string
	val stringBuilder = new StringBuilder();System.out.println("""stringBuilder  : StringBuilder = """ + $show(stringBuilder ));$skip(75); 
	val listBuilder = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);System.out.println("""listBuilder  : List[Int] = """ + $show(listBuilder ));$skip(51); val res$62 = 
	stringBuilder.append("I want all numbers 6-12: ");System.out.println("""res62: StringBuilder = """ + $show(res$62));$skip(74); val res$63 = 
	listBuilder.filter(it ⇒ it > 5 && it < 13).addString(stringBuilder, ",");System.out.println("""res63: StringBuilder = """ + $show(res$63));$skip(24); val res$64 = 
	stringBuilder.mkString;System.out.println("""res64: String = """ + $show(res$64))}
		
		
		
}
