object infixPrefixPosfix {
  
  //inFix operaton
  val g: Int = 3                                  //> g  : Int = 3
	(g + 4)                                   //> res0: Int = 7
	g.+(4)                                    //> res1: Int = 7
	
	
	
	//Los operadores infix no funcionan con objetos con un metodo de dos parametros
	val e: String = "Check out the big brains on Brad!"
                                                  //> e  : String = Check out the big brains on Brad!
	e indexOf 'o'                             //> res2: Int = 6
	e.indexOf('o', 7)                         //> res3: Int = 25
  
  
  
  //PreFix operator
  val p: Int = 31                                 //> p  : Int = 31
	(-p)                                      //> res4: Int = -31
  
  
  
  
  //PostFix operator
  val s: Int = 31                                 //> s  : Int = 31
	(s toHexString)                           //> res5: String = 1f
	
	
	
	//Metodos de prefijo para una clase
	class Stereo {
	  def unary_+ = "on"
	
	  def unary_- = "off"
	}
	val stereo = new Stereo                   //> stereo  : infixPrefixPosfix.Stereo = infixPrefixPosfix$Stereo$1@e580929
	(+stereo)                                 //> res6: String = on
	(-stereo)                                 //> res7: String = off
	
}