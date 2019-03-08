object Clases {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(132); 
   	def main(args: Array[String]) {
    	val pt = new Point(1, 2)
    	println(pt)
    	println(pt.suma(5, 10))
  	};System.out.println("""main: (args: Array[String])Unit""")}
}

class Point(x: Int, y: Int) {
  	override def toString(): String = "(" + x + ", " + y + ")"
  	def suma(a: Int, b: Int): Int = a + b
}
