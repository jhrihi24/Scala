//Ejemplo sencillo de implicits
object MyPredef {

  class KoanIntWrapper(val original: Int) {
    def isOdd = original % 2 != 0

    def isEven = !isOdd
  }

  implicit def thisMethodNameIsIrrelevant(value: Int) =
    new KoanIntWrapper(value)
}

import MyPredef._
object ejecutar{
   def main(args: Array[String]) {
      println(19.isOdd)
      println(20.isOdd)
   }
}




//----------------------------------------------           --------------------------------------------------------




//Ejemplo completo de implicits
abstract class SemiGroup[A] {
  def add(x: A, y: A): A
}
abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}
object ImplicitTest {
  implicit object StringMonoid extends Monoid[String] {
    def add(x: String, y: String): String = x concat y
    def unit: String = ""
  }
  implicit object IntMonoid extends Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }
  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))
    
  def main(args: Array[String]) {
    println(sum(List(1, 2, 3)))
    println(sum(List("a", "b", "c")))
  }
}



