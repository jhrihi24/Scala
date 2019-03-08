object implicits {

	/*Creacion de una funcion que no sea necesario llamar si no que se de por sentado que se esta llamando como es el
	** de la funcion 'thisMethodNameIsIrrelevant' se llama el metodo de la clase que extendio
	*/
  class KoanIntWrapper(val original: Int) {
	  def isOdd = original % 2 != 0
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(390); 
	implicit def thisMethodNameIsIrrelevant(value: Int) = new KoanIntWrapper(value);System.out.println("""thisMethodNameIsIrrelevant: (value: Int)implicits.KoanIntWrapper""");$skip(10); val res$0 = 
	19.isOdd;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(10); val res$1 = 
	20.isOdd
	
	
	
	
	//Se pueden utilizar implicitos para convertir el tipo de un valor en otro
	import java.math.BigInteger;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(206); 
	implicit def Int2BigIntegerConvert(value: Int): BigInteger = new BigInteger(value.toString);System.out.println("""Int2BigIntegerConvert: (value: Int)java.math.BigInteger""");$skip(50); 
	def add(a: BigInteger, b: BigInteger) = a.add(b);System.out.println("""add: (a: java.math.BigInteger, b: java.math.BigInteger)java.math.BigInteger""");$skip(85); val res$2 = 
	add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(16); val res$3 = 
	add(3, 6) == 9;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(39); val res$4 = 
	add(3, 6) == Int2BigIntegerConvert(9);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(30); val res$5 = 
	add(3, 6) == (9: BigInteger);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(25); val res$6 = 
	add(3, 6).intValue == 9;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(163); 
	
	
	
	
	//Se puede recibir en un parametro una funcion implicita
	def howMuchCanIMake_?(hours: Int)(implicit dollarsPerHour: BigDecimal) = dollarsPerHour * hours;System.out.println("""howMuchCanIMake_? : (hours: Int)(implicit dollarsPerHour: BigDecimal)scala.math.BigDecimal""");$skip(42); 
	implicit val hourlyRate = BigDecimal(34);System.out.println("""hourlyRate  : scala.math.BigDecimal = """ + $show(hourlyRate ));$skip(23); val res$7 = 
	howMuchCanIMake_?(30);System.out.println("""res7: scala.math.BigDecimal = """ + $show(res$7))}
	
	
	
}
