object funcionesParcialesAplicadas {
  
  //Una funcion parcial es a la que no le aplican todos los parametros
  def sum(a: Int, b: Int, c: Int) = a + b + c     //> sum: (a: Int, b: Int, c: Int)Int
	val sum3 = sum _                          //> sum3  : (Int, Int, Int) => Int = funcionesParcialesAplicadas$$$Lambda$8/1018
                                                  //| 547642@e580929
	sum3(1, 9, 7)                             //> res0: Int = 17
  
  //Las funciones aplicadas pueden remplazar cualquier numero
  val sumC = sum(1, 10, _: Int)                   //> sumC  : Int => Int = funcionesParcialesAplicadas$$$Lambda$9/488970385@481405
                                                  //| 64
	sumC(4)                                   //> res1: Int = 15
	sum(4, 5, 6)                              //> res2: Int = 15
	
	
	//Uso de Curried para convertir una funcion con varios parametros en multiples funciones.
	def multiply(x: Int, y: Int) = x * y      //> multiply: (x: Int, y: Int)Int
	(multiply _).isInstanceOf[Function2[_, _, _]]
                                                  //> res3: Boolean = true
	val multiplyCurried = (multiply _).curried//> multiplyCurried  : Int => (Int => Int) = scala.Function2$$Lambda$12/17846620
                                                  //| 07@3b6eb2ec
	multiply(4, 5)                            //> res4: Int = 20
	multiplyCurried(3)(2)                     //> res5: Int = 6
	
	//Convierte la funcion anterior en una nueva funcion que multiplica siempre por 4 en espera a que llegue el otro parametro
	val multiplyCurriedFour = multiplyCurried(4)
                                                  //> multiplyCurriedFour  : Int => Int = scala.Function2$$Lambda$13/509886383@6e8
                                                  //| dacdf
	multiplyCurriedFour(2)                    //> res6: Int = 8
	multiplyCurriedFour(4)                    //> res7: Int = 16
		
		
	//Se llama una funcion para enviarla como parametro dentro de otra funcion
	def customFilter(f: Int ⇒ Boolean)(xs: List[Int]) =  xs filter f
                                                  //> customFilter: (f: Int => Boolean)(xs: List[Int])List[Int]
	def onlyEven(x: Int) = x % 2 == 0         //> onlyEven: (x: Int)Boolean
	val xs = List(12, 11, 5, 20, 3, 13, 2)    //> xs  : List[Int] = List(12, 11, 5, 20, 3, 13, 2)
	customFilter(onlyEven)(xs)                //> res8: List[Int] = List(12, 20, 2)
	val onlyEvenFilter = customFilter(onlyEven) _
                                                  //> onlyEvenFilter  : List[Int] => List[Int] = funcionesParcialesAplicadas$$$La
                                                  //| mbda$20/2017354584@17550481
	onlyEvenFilter(xs)                        //> res9: List[Int] = List(12, 20, 2)
}