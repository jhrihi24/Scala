object ParametrosEnClases {

  class WithoutClassParameters() {
		  def addColors(red: Int, green: Int, blue: Int) = {
		    (red, green, blue)
		  }
		
		  def addColorsWithDefaults(red: Int = 0, green: Int = 0, blue: Int = 0) = {
		    (red, green, blue)
		  }
	}
	
	class WithClassParameters(val defaultRed: Int, val defaultGreen: Int, val defaultBlue: Int) {
		  def addColors(red: Int, green: Int, blue: Int) = {
		    (red + defaultRed, green + defaultGreen, blue + defaultBlue)
		  }
		
		  def addColorsWithDefaults(red: Int = 0, green: Int = 0, blue: Int = 0) = {
		    (red + defaultRed, green + defaultGreen, blue + defaultBlue)
		  }
	}
	
	class WithClassParametersInClassDefinition(val defaultRed: Int = 0, val defaultGreen: Int = 255, val defaultBlue: Int = 100) {
		  def addColors(red: Int, green: Int, blue: Int) = {
		    (red + defaultRed, green + defaultGreen, blue + defaultBlue)
		  }
		
		  def addColorsWithDefaults(red: Int = 0, green: Int = 0, blue: Int = 0) = {
		    (red + defaultRed, green + defaultGreen, blue + defaultBlue)
		  }
	}
	
	//llamadas de arqumento
	val me = new WithoutClassParameters()     //> me  : ParametrosEnClases.WithoutClassParameters = ParametrosEnClases$Withou
                                                  //| tClassParameters@1a86f2f1
	// Que pasa si cambiamos el orden de los parametros
	me.addColors(green = 0, red = 255, blue = 0)
                                                  //> res0: (Int, Int, Int) = (255,0,0)
	//si no se coloca alguno de los parametros por defecto
  me.addColorsWithDefaults(green = 255)           //> res1: (Int, Int, Int) = (0,255,0)
  //puede colocar los argumentos en cualquier orden, si coloca su nombre
  val meWithParametres = new WithClassParameters(40, 50, 60)
                                                  //> meWithParametres  : ParametrosEnClases.WithClassParameters = ParametrosEnCl
                                                  //| ases$WithClassParameters@17f6480
  meWithParametres.addColors(green = 50, red = 60, blue = 40)
                                                  //> res2: (Int, Int, Int) = (100,100,100)
  //Puede enviar un solo parametro si especifica el nombre
  meWithParametres.addColorsWithDefaults(green = 70)
                                                  //> res3: (Int, Int, Int) = (40,120,60)
  val meClassParametersInClass = new WithClassParametersInClassDefinition()
                                                  //> meClassParametersInClass  : ParametrosEnClases.WithClassParametersInClassDe
                                                  //| finition = ParametrosEnClases$WithClassParametersInClassDefinition@2d6e8792
                                                  //| 
  meClassParametersInClass.addColorsWithDefaults(green = 70)
                                                  //> res4: (Int, Int, Int) = (0,325,100)
  //Los parametros por defecto tambien puede ser funcionales
  def reduce(a: Int, f: (Int, Int) ⇒ Int = _ + _): Int = f(a, a)
                                                  //> reduce: (a: Int, f: (Int, Int) => Int)Int
  reduce(5)                                       //> res5: Int = 10
  reduce(5, _ * _)                                //> res6: Int = 25
}