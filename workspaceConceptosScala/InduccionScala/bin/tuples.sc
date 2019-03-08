object tuplas {
  val tuple = ("apple", "dog")                    //> tuple  : (String, String) = (apple,dog)
	val fruit = tuple._1                      //> fruit  : String = apple
	val animal = tuple._2                     //> animal  : String = dog
	
	//Multiples tipos
	val tuple5 = ("a", 1, 2.2, new java.util.Date(), "five")
                                                  //> tuple5  : (String, Int, Double, java.util.Date, String) = (a,1,2.2,Thu Feb 2
                                                  //| 1 13:02:55 COT 2019,five)
	tuple5._2                                 //> res0: Int = 1
	tuple5._5                                 //> res1: String = five
	
	//Asignacion multiple a variables
	val student = ("Sean Rogers", 21, 3.5)    //> student  : (String, Int, Double) = (Sean Rogers,21,3.5)
	val (name, age, gpa) = student            //> name  : String = Sean Rogers
                                                  //| age  : Int = 21
                                                  //| gpa  : Double = 3.5
	
	
	//Swap para intercambiar elementos de una tupla
	val tupleSwap = ("apple", 3).swap         //> tupleSwap  : (Int, String) = (3,apple)
	tupleSwap._1                              //> res2: Int = 3
	tupleSwap._2                              //> res3: String = apple
}