//Ejemplo sencillo del uso de class dentro de un objeto
object Clases {
   	def main(args: Array[String]) {
    	val pt = new Point(1, 2)
    	println(pt)
    	println(pt.suma(5, 10))
  	}
   	
   	class Point(x: Int, y: Int) {
      	override def toString(): String = "(" + x + ", " + y + ")"
      	def suma(a: Int, b: Int): Int = a + b
    }
}


//----------------------------------------------           --------------------------------------------------------


//Uso de clase class
abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class App(f: Term, v: Term) extends Term
object TermTest {
    def printTerm(term: Term) {
      term match {
        case Var(n) =>
          print(n)
        case Fun(x, b) =>
          print("^" + x + ".")
          printTerm(b)
        case App(f, v) =>
          print("(")
          printTerm(f)
          print(" ")
          printTerm(v)
          print(")")
      }
    }
    def isIdentityFun(term: Term): Boolean = term match {
      case Fun(x, Var(y)) if x == y => true
      case _ => false
    }
    
    def main(args: Array[String]) {
      println("------------------------------------------------------------")
      println("Case class")
      val id = Fun("x", Var("x"))
      val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
      printTerm(t)
      println
      println(isIdentityFun(id))
      println(isIdentityFun(t))
    }
}
