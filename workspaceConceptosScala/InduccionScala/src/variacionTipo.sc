object variacionTipo {
  class Fruit(){
  	def sumaFrutas(a: Int, b:Int)={a + b}
  };
  class Orange() extends Fruit {
  	def sumaOrange()= { super.sumaFrutas(2, 4) }
  };
  class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
	  def contents = manifest.runtimeClass.getSimpleName
	}
	val fruitBasket = new MyContainer(new Orange())
                                                  //> fruitBasket  : variacionTipo.MyContainer[variacionTipo.Orange] = variacionTi
                                                  //| po$MyContainer@5577140b
	fruitBasket.contents                      //> res0: String = Orange
	val fruitBasketParent: MyContainer[Fruit] = new MyContainer(new Orange())
                                                  //> fruitBasketParent  : variacionTipo.MyContainer[variacionTipo.Fruit] = variac
                                                  //| ionTipo$MyContainer@1cd072a9
	fruitBasketParent.contents                //> res1: String = Fruit
	
	
	
	
	/* Declarar "-" indica varianza de contravarianza. Usando "-" usted puede aplicar cualquier contenedor con un
	** cierto tipo a un contenedor con una superclase de ese tipo.
	*/
	class MyContainerVarianza[-A](a: A)(implicit manifest: scala.reflect.Manifest[A]) { //Can't receive a val because it would be in a covariant position
	  def contents = manifest.runtimeClass.getSimpleName
	}
	
	val citrusBasket: MyContainerVarianza[Fruit] = new MyContainerVarianza[Fruit](new Orange)
                                                  //> citrusBasket  : variacionTipo.MyContainerVarianza[variacionTipo.Fruit] = var
                                                  //| iacionTipo$MyContainerVarianza$1@7c75222b
	citrusBasket.contents                     //> res2: String = Fruit
	
	
}