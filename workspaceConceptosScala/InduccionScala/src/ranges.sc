object Ranges {
  
  //Creacion de un rango sencillo
  val someNumbers = Range(0, 10)                  //> someNumbers  : scala.collection.immutable.Range = Range 0 until 10
	val second = someNumbers(1)               //> second  : Int = 1
	val last = someNumbers.last               //> last  : Int = 9
	someNumbers.size                          //> res0: Int = 10
	
	//until excluye el numero a la derecha en este caso el 10 no se incluye en el rango
	val otherRange = 0 until 10               //> otherRange  : scala.collection.immutable.Range = Range 0 until 10
	(someNumbers == otherRange)               //> res1: Boolean = true
  
  
  //Rango con incremento y inclusive es para incluir el numero 10 en el rango
  val someNumbersIncremento = Range(2, 10, 2).inclusive
                                                  //> someNumbersIncremento  : scala.collection.immutable.Range = Range 2 to 10 by
                                                  //|  2
  val otherRangeIncremento = 0 to 10 by 2         //> otherRangeIncremento  : scala.collection.immutable.Range = Range 0 to 10 by 
                                                  //| 2
	val secondIncremento = someNumbersIncremento(1)
                                                  //> secondIncremento  : Int = 4
	val lastIncremento = someNumbersIncremento.last
                                                  //> lastIncremento  : Int = 10
	someNumbersIncremento.size                //> res2: Int = 5
	someNumbersIncremento.contains(5)         //> res3: Boolean = false
}