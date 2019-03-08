object variacionTipo {
  class Fruit(){
  	def sumaFrutas(a: Int, b:Int)={a + b}
  };
  class Orange() extends Fruit {
  	def sumaOrange()= { super.sumaFrutas(2, 4) }
  };
  class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
	  def contents = manifest.runtimeClass.getSimpleName
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(358); 
	val fruitBasket = new MyContainer(new Orange());System.out.println("""fruitBasket  : variacionTipo.MyContainer[variacionTipo.Orange] = """ + $show(fruitBasket ));$skip(22); val res$0 = 
	fruitBasket.contents;System.out.println("""res0: String = """ + $show(res$0));$skip(75); 
	val fruitBasketParent: MyContainer[Fruit] = new MyContainer(new Orange());System.out.println("""fruitBasketParent  : variacionTipo.MyContainer[variacionTipo.Fruit] = """ + $show(fruitBasketParent ));$skip(28); val res$1 = 
	fruitBasketParent.contents
	
	
	
	
	/* Declarar "-" indica varianza de contravarianza. Usando "-" usted puede aplicar cualquier contenedor con un
	** cierto tipo a un contenedor con una superclase de ese tipo.
	*/
	class MyContainerVarianza[-A](a: A)(implicit manifest: scala.reflect.Manifest[A]) { //Can't receive a val because it would be in a covariant position
	  def contents = manifest.runtimeClass.getSimpleName
	};System.out.println("""res1: String = """ + $show(res$1));$skip(488); 
	
	val citrusBasket: MyContainerVarianza[Fruit] = new MyContainerVarianza[Fruit](new Orange);System.out.println("""citrusBasket  : variacionTipo.MyContainerVarianza[variacionTipo.Fruit] = """ + $show(citrusBasket ));$skip(23); val res$2 = 
	citrusBasket.contents;System.out.println("""res2: String = """ + $show(res$2))}
	
	
}
