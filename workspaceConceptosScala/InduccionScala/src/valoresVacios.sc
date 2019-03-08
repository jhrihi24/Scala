object valoresVacios {
  
	
  None.toString                                   //> res0: String = None
  None.toList                                     //> res1: List[Nothing] = List()
  None.isEmpty                                    //> res2: Boolean = true
  None.asInstanceOf[Any]                          //> res3: Any = None
	None.asInstanceOf[AnyRef]                 //> res4: AnyRef = None
	None.asInstanceOf[AnyVal]                 //> res5: AnyVal = None
	
	val optional: Option[String] = None       //> optional  : Option[String] = None
	optional.isEmpty                          //> res6: Boolean = true
	optional                                  //> res7: Option[String] = None
  
  
  //Usar getOrElse en los valores vacios
  val optional1: Option[String] = Some("Some Value")
                                                  //> optional1  : Option[String] = Some(Some Value)
	val optional2: Option[String] = None      //> optional2  : Option[String] = None
	optional1.getOrElse("No Value")           //> res8: String = Some Value
	optional2.getOrElse("No Value")           //> res9: String = No Value
}