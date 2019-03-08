object infixPrefixPosfix {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  
  //inFix operaton
  val g: Int = 3;System.out.println("""g  : Int = """ + $show(g ));$skip(9); val res$0 = 
	(g + 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
	g.+(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(140); 
	
	
	
	//Los operadores infix no funcionan con objetos con un metodo de dos parametros
	val e: String = "Check out the big brains on Brad!";System.out.println("""e  : String = """ + $show(e ));$skip(15); val res$2 = 
	e indexOf 'o';System.out.println("""res2: Int = """ + $show(res$2));$skip(19); val res$3 = 
	e.indexOf('o', 7);System.out.println("""res3: Int = """ + $show(res$3));$skip(47); 
  
  
  
  //PreFix operator
  val p: Int = 31;System.out.println("""p  : Int = """ + $show(p ));$skip(6); val res$4 = 
	(-p);System.out.println("""res4: Int = """ + $show(res$4));$skip(51); 
  
  
  
  
  //PostFix operator
  val s: Int = 31;System.out.println("""s  : Int = """ + $show(s ));$skip(17); val res$5 = 
	(s toHexString)
	
	
	
	//Metodos de prefijo para una clase
	class Stereo {
	  def unary_+ = "on"
	
	  def unary_- = "off"
	};System.out.println("""res5: String = """ + $show(res$5));$skip(134); 
	val stereo = new Stereo;System.out.println("""stereo  : infixPrefixPosfix.Stereo = """ + $show(stereo ));$skip(11); val res$6 = 
	(+stereo);System.out.println("""res6: String = """ + $show(res$6));$skip(11); val res$7 = 
	(-stereo);System.out.println("""res7: String = """ + $show(res$7))}
	
}
