object funcionesOrdenSuperior {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 
	//Llamada de funciones
  def lambda = { x: Int ⇒
	  x + 1
	};System.out.println("""lambda: => Int => Int""");$skip(32); 
	def lambda2 = (x: Int) ⇒ x + 2;System.out.println("""lambda2: => Int => Int""");$skip(32); 
	val lambda3 = (x: Int) ⇒ x + 3;System.out.println("""lambda3  : Int => Int = """ + $show(lambda3 ));$skip(82); 
	
	val lambda4 = new Function1[Int, Int] {
	  def apply(v1: Int): Int = v1 - 1
	};System.out.println("""lambda4  : Int => Int = """ + $show(lambda4 ));$skip(31); 
	
	def lambda5(x: Int) = x + 1;System.out.println("""lambda5: (x: Int)Int""");$skip(26); 
	
	val result = lambda(3);System.out.println("""result  : Int = """ + $show(result ));$skip(40); 
	val `result1andhalf` = lambda.apply(3);System.out.println("""result1andhalf  : Int = """ + $show(result1andhalf ));$skip(28); 
	
	val result2 = lambda2(3);System.out.println("""result2  : Int = """ + $show(result2 ));$skip(26); 
	val result3 = lambda3(3);System.out.println("""result3  : Int = """ + $show(result3 ));$skip(26); 
	val result4 = lambda4(3);System.out.println("""result4  : Int = """ + $show(result4 ));$skip(26); 
	val result5 = lambda5(3);System.out.println("""result5  : Int = """ + $show(result5 ));$skip(47); 
	
	
	//Variables externas
	var incrementer = 1;System.out.println("""incrementer  : Int = """ + $show(incrementer ));$skip(48); 
	def closure = { x: Int ⇒
	  x + incrementer
	};System.out.println("""closure: => Int => Int""");$skip(36); 
	val resultVarExterna = closure(10);System.out.println("""resultVarExterna  : Int = """ + $show(resultVarExterna ));$skip(19); 
	
	incrementer = 2;$skip(37); 
	val result2VarExterna = closure(10);System.out.println("""result2VarExterna  : Int = """ + $show(result2VarExterna ));$skip(136); 
	
	
	//Funciones de orden superior: SOn funciones que toman otras funciones como argumentos
	def summation(x: Int, y: Int ⇒ Int) = y(x);System.out.println("""summation: (x: Int, y: Int => Int)Int""");$skip(35); 

	var incrementerOrdenSuperior = 3;System.out.println("""incrementerOrdenSuperior  : Int = """ + $show(incrementerOrdenSuperior ));$skip(68); 
	def closureOrdenSuperior = (x: Int) ⇒ x + incrementerOrdenSuperior;System.out.println("""closureOrdenSuperior: => Int => Int""");$skip(65); 
	
	val resultOrdenSuperior = summation(10, closureOrdenSuperior);System.out.println("""resultOrdenSuperior  : Int = """ + $show(resultOrdenSuperior ));$skip(32); 
	
	incrementerOrdenSuperior = 4;$skip(64); 
	val result2OrdenSuperior = summation(10, closureOrdenSuperior);System.out.println("""result2OrdenSuperior  : Int = """ + $show(result2OrdenSuperior ));$skip(281); 
                                                  
                                                  
  //Funcion devolviendo de otra funcion
  def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
		  new Function1[Int, Int]() {
		    def apply(y: Int): Int = x + y
		  }
	};System.out.println("""addWithoutSyntaxSugar: (x: Int)Int => Int""");$skip(60); val res$0 = 
	addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]];System.out.println("""res0: Boolean = """ + $show(res$0));$skip(31); val res$1 = 
	
	addWithoutSyntaxSugar(2)(3);System.out.println("""res1: Int = """ + $show(res$1));$skip(65); 
	
	def fiveAdder: Function1[Int, Int] = addWithoutSyntaxSugar(5);System.out.println("""fiveAdder: => Int => Int""");$skip(14); val res$2 = 
	fiveAdder(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(98); 
	
	
	
	//Composicion de funciones
	def makeUpper(xs: List[String]) = xs map {
	  _.toUpperCase
	};System.out.println("""makeUpper: (xs: List[String])List[String]""");$skip(95); 
	def makeWhatEverYouLike(xs: List[String], sideEffect: String ⇒ String) =
	  xs map sideEffect;System.out.println("""makeWhatEverYouLike: (xs: List[String], sideEffect: String => String)List[String]""");$skip(38); val res$3 = 
	makeUpper(List("abc", "xyz", "123"));System.out.println("""res3: List[String] = """ + $show(res$3));$skip(75); val res$4 = 
	makeWhatEverYouLike(List("ABC", "XYZ", "123"), { x ⇒
	  x.toLowerCase
	});System.out.println("""res4: List[String] = """ + $show(res$4));$skip(52); 
	val myName = (name: String) => s"My name is $name";System.out.println("""myName  : String => String = """ + $show(myName ));$skip(51); val res$5 = 
	makeWhatEverYouLike(List("John", "Mark"), myName);System.out.println("""res5: List[String] = """ + $show(res$5));$skip(67); 

	
	//Funciones void
	def pintar(x: String) { println("pintar") };System.out.println("""pintar: (x: String)Unit""")}
}
