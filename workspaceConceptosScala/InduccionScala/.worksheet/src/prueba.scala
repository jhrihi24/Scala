object prueba {
	class Fruit(){
  	def sumaFrutas(a: Int, b:Int)={a + b}
  };
  class Orange() extends Fruit{
  	def sumaOrange()= { super.sumaFrutas(2, 4) }
  };
  class MyContainer[+A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(376); 

val fruitBasket: MyContainer[Fruit] = new MyContainer[Orange](new Orange());System.out.println("""fruitBasket  : prueba.MyContainer[prueba.Fruit] = """ + $show(fruitBasket ));$skip(21); val res$0 = 
fruitBasket.contents;System.out.println("""res0: String = """ + $show(res$0))}
class NavelOrange extends Orange
}
