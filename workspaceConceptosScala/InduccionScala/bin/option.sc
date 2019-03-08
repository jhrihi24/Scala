object Opciones {

	val someValue: Option[Double] = Some(20.0)//> someValue  : Option[Double] = Some(20.0)
	val value = someValue match {
	  case Some(v) ⇒ v
	  case None ⇒ 0.0
	}                                         //> value  : Double = 20.0

 	val noValue: Option[Double] = None        //> noValue  : Option[Double] = None
	val value1 = noValue match {
	  case Some(v) ⇒ v
	  case None ⇒ 0.0
	}                                         //> value1  : Double = 0.0
	
	
	//Uso de option con map
	val number: Option[Int] = Some(3)         //> number  : Option[Int] = Some(3)
	val noNumber: Option[Int] = None          //> noNumber  : Option[Int] = None
	val result1 = number.map(_ * 1.5)         //> result1  : Option[Double] = Some(4.5)
	val result2 = noNumber.map(_ * 1.5)       //> result2  : Option[Double] = None

	//Uso de fold con map
	val numberFold: Option[Int] = Some(3)     //> numberFold  : Option[Int] = Some(3)
	val noNumberFold: Option[Int] = None      //> noNumberFold  : Option[Int] = None
	val result1Fold = numberFold.fold(1)(_ * 3)
                                                  //> result1Fold  : Int = 9
	val result2Fold = noNumberFold.fold(1)(_ * 3)
                                                  //> result2Fold  : Int = 1
}