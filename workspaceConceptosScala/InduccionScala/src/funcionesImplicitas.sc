object implicits {

	/*Creacion de una funcion que no sea necesario llamar si no que se de por sentado que se esta llamando como es el
	** de la funcion 'thisMethodNameIsIrrelevant' se llama el metodo de la clase que extendio
	*/
  class KoanIntWrapper(val original: Int) {
	  def isOdd = original % 2 != 0
	}
	implicit def thisMethodNameIsIrrelevant(value: Int) = new KoanIntWrapper(value)
                                                  //> thisMethodNameIsIrrelevant: (value: Int)implicits.KoanIntWrapper
	19.isOdd                                  //> res0: Boolean = true
	20.isOdd                                  //> res1: Boolean = false
	
	
	
	
	//Se pueden utilizar implicitos para convertir el tipo de un valor en otro
	import java.math.BigInteger
	implicit def Int2BigIntegerConvert(value: Int): BigInteger = new BigInteger(value.toString)
                                                  //> Int2BigIntegerConvert: (value: Int)java.math.BigInteger
	def add(a: BigInteger, b: BigInteger) = a.add(b)
                                                  //> add: (a: java.math.BigInteger, b: java.math.BigInteger)java.math.BigInteger
                                                  //| 
	add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9)
                                                  //> res2: Boolean = true
	add(3, 6) == 9                            //> res3: Boolean = false
	add(3, 6) == Int2BigIntegerConvert(9)     //> res4: Boolean = true
	add(3, 6) == (9: BigInteger)              //> res5: Boolean = true
	add(3, 6).intValue == 9                   //> res6: Boolean = true
	
	
	
	
	//Se puede recibir en un parametro una funcion implicita
	def howMuchCanIMake_?(hours: Int)(implicit dollarsPerHour: BigDecimal) = dollarsPerHour * hours
                                                  //> howMuchCanIMake_? : (hours: Int)(implicit dollarsPerHour: BigDecimal)scala.
                                                  //| math.BigDecimal
	implicit val hourlyRate = BigDecimal(34)  //> hourlyRate  : scala.math.BigDecimal = 34
	howMuchCanIMake_?(30)                     //> res7: scala.math.BigDecimal = 1020
	
	
	
}