object typeStrings {
  
  val a = 'a'                                     //> a  : Char = a
	val b = 'B'                               //> b  : Char = B
	a.toString                                //> res0: String = a
  
  
  val d = '\141' //octal for a                    //> d  : Char = a
	d.toString                                //> res1: String = a
	
	
	val e = '\"'                              //> e  : Char = "
	val f = '\\'                              //> f  : Char = \
	e.toString                                //> res2: String = "
	f.toString                                //> res3: String = \
}