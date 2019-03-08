object Ranges {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  
  //Creacion de un rango sencillo
  val someNumbers = Range(0, 10);System.out.println("""someNumbers  : scala.collection.immutable.Range = """ + $show(someNumbers ));$skip(29); 
	val second = someNumbers(1);System.out.println("""second  : Int = """ + $show(second ));$skip(29); 
	val last = someNumbers.last;System.out.println("""last  : Int = """ + $show(last ));$skip(18); val res$0 = 
	someNumbers.size;System.out.println("""res0: Int = """ + $show(res$0));$skip(116); 
	
	//until excluye el numero a la derecha en este caso el 10 no se incluye en el rango
	val otherRange = 0 until 10;System.out.println("""otherRange  : scala.collection.immutable.Range = """ + $show(otherRange ));$skip(29); val res$1 = 
	(someNumbers == otherRange);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(140); 
  
  
  //Rango con incremento y inclusive es para incluir el numero 10 en el rango
  val someNumbersIncremento = Range(2, 10, 2).inclusive;System.out.println("""someNumbersIncremento  : scala.collection.immutable.Range = """ + $show(someNumbersIncremento ));$skip(42); 
  val otherRangeIncremento = 0 to 10 by 2;System.out.println("""otherRangeIncremento  : scala.collection.immutable.Range = """ + $show(otherRangeIncremento ));$skip(49); 
	val secondIncremento = someNumbersIncremento(1);System.out.println("""secondIncremento  : Int = """ + $show(secondIncremento ));$skip(49); 
	val lastIncremento = someNumbersIncremento.last;System.out.println("""lastIncremento  : Int = """ + $show(lastIncremento ));$skip(28); val res$2 = 
	someNumbersIncremento.size;System.out.println("""res2: Int = """ + $show(res$2));$skip(35); val res$3 = 
	someNumbersIncremento.contains(5);System.out.println("""res3: Boolean = """ + $show(res$3))}
}
