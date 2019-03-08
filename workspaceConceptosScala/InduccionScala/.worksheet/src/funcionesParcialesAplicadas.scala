object funcionesParcialesAplicadas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(156); 
  
  //Una funcion parcial es a la que no le aplican todos los parametros
  def sum(a: Int, b: Int, c: Int) = a + b + c;System.out.println("""sum: (a: Int, b: Int, c: Int)Int""");$skip(18); 
	val sum3 = sum _;System.out.println("""sum3  : (Int, Int, Int) => Int = """ + $show(sum3 ));$skip(15); val res$0 = 
	sum3(1, 9, 7);System.out.println("""res0: Int = """ + $show(res$0));$skip(97); 
  
  //Las funciones aplicadas pueden remplazar cualquier numero
  val sumC = sum(1, 10, _: Int);System.out.println("""sumC  : Int => Int = """ + $show(sumC ));$skip(9); val res$1 = 
	sumC(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(14); val res$2 = 
	sum(4, 5, 6);System.out.println("""res2: Int = """ + $show(res$2));$skip(133); 
	
	
	//Uso de Curried para convertir una funcion con varios parametros en multiples funciones.
	def multiply(x: Int, y: Int) = x * y;System.out.println("""multiply: (x: Int, y: Int)Int""");$skip(47); val res$3 = 
	(multiply _).isInstanceOf[Function2[_, _, _]];System.out.println("""res3: Boolean = """ + $show(res$3));$skip(44); 
	val multiplyCurried = (multiply _).curried;System.out.println("""multiplyCurried  : Int => (Int => Int) = """ + $show(multiplyCurried ));$skip(16); val res$4 = 
	multiply(4, 5);System.out.println("""res4: Int = """ + $show(res$4));$skip(23); val res$5 = 
	multiplyCurried(3)(2);System.out.println("""res5: Int = """ + $show(res$5));$skip(172); 
	
	//Convierte la funcion anterior en una nueva funcion que multiplica siempre por 4 en espera a que llegue el otro parametro
	val multiplyCurriedFour = multiplyCurried(4);System.out.println("""multiplyCurriedFour  : Int => Int = """ + $show(multiplyCurriedFour ));$skip(24); val res$6 = 
	multiplyCurriedFour(2);System.out.println("""res6: Int = """ + $show(res$6));$skip(24); val res$7 = 
	multiplyCurriedFour(4);System.out.println("""res7: Int = """ + $show(res$7));$skip(148); 
		
		
	//Se llama una funcion para enviarla como parametro dentro de otra funcion
	def customFilter(f: Int ⇒ Boolean)(xs: List[Int]) =  xs filter f;System.out.println("""customFilter: (f: Int => Boolean)(xs: List[Int])List[Int]""");$skip(35); 
	def onlyEven(x: Int) = x % 2 == 0;System.out.println("""onlyEven: (x: Int)Boolean""");$skip(40); 
	val xs = List(12, 11, 5, 20, 3, 13, 2);System.out.println("""xs  : List[Int] = """ + $show(xs ));$skip(28); val res$8 = 
	customFilter(onlyEven)(xs);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(47); 
	val onlyEvenFilter = customFilter(onlyEven) _;System.out.println("""onlyEvenFilter  : List[Int] => List[Int] = """ + $show(onlyEvenFilter ));$skip(20); val res$9 = 
	onlyEvenFilter(xs);System.out.println("""res9: List[Int] = """ + $show(res$9))}
}
