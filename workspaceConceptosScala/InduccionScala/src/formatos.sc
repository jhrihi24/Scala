object formatos {
	
	val s = "Hello World"                     //> s  : String = Hello World
  val x= "Application %s".format(s)               //> x  : String = Application Hello World
  
  //Pueden ser un solo caracter
  val a = 'a'                                     //> a  : Char = a
	val b = 'B'                               //> b  : Char = B
	"%c".format(a)                            //> res0: String = a
	"%c".format(b)                            //> res1: String = B

	//Utilizar octal o decimal
	val c = 'a' //unicode for a               //> c  : Char = a
	val d = '\141' //octal for a              //> d  : Char = a
	val e = '\"'                              //> e  : Char = "
	val f = '\\'                              //> f  : Char = \
	
	"%c".format(c)                            //> res2: String = a
	"%c".format(d)                            //> res3: String = a
	"%c".format(e)                            //> res4: String = "
	"%c".format(f)                            //> res5: String = \
	
	//El formato puede incluir numeros
	val j = 190                               //> j  : Int = 190
	"%d bottles of beer on the wall" format j - 100
                                                  //> res6: String = 90 bottles of beer on the wall
	
	//Formato de cualquier numero de elementos
	val h = 190                               //> h  : Int = 190
	val k = "vodka"                           //> k  : String = vodka
	
	"%d bottles of %s on the wall".format(h - 100, k)
                                                  //> res7: String = 90 bottles of vodka on the wall
	
}