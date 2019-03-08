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
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1130); 
	
	//llamadas de arqumento
	val me = new WithoutClassParameters();System.out.println("""me  : ParametrosEnClases.WithoutClassParameters = """ + $show(me ));$skip(99); val res$0 = 
	// Que pasa si cambiamos el orden de los parametros
	me.addColors(green = 0, red = 255, blue = 0);System.out.println("""res0: (Int, Int, Int) = """ + $show(res$0));$skip(96); val res$1 = 
	//si no se coloca alguno de los parametros por defecto
  me.addColorsWithDefaults(green = 255);System.out.println("""res1: (Int, Int, Int) = """ + $show(res$1));$skip(134); 
  //puede colocar los argumentos en cualquier orden, si coloca su nombre
  val meWithParametres = new WithClassParameters(40, 50, 60);System.out.println("""meWithParametres  : ParametrosEnClases.WithClassParameters = """ + $show(meWithParametres ));$skip(62); val res$2 = 
  meWithParametres.addColors(green = 50, red = 60, blue = 40);System.out.println("""res2: (Int, Int, Int) = """ + $show(res$2));$skip(112); val res$3 = 
  //Puede enviar un solo parametro si especifica el nombre
  meWithParametres.addColorsWithDefaults(green = 70);System.out.println("""res3: (Int, Int, Int) = """ + $show(res$3));$skip(76); 
  val meClassParametersInClass = new WithClassParametersInClassDefinition();System.out.println("""meClassParametersInClass  : ParametrosEnClases.WithClassParametersInClassDefinition = """ + $show(meClassParametersInClass ));$skip(61); val res$4 = 
  meClassParametersInClass.addColorsWithDefaults(green = 70);System.out.println("""res4: (Int, Int, Int) = """ + $show(res$4));$skip(126); 
  //Los parametros por defecto tambien puede ser funcionales
  def reduce(a: Int, f: (Int, Int) ⇒ Int = _ + _): Int = f(a, a);System.out.println("""reduce: (a: Int, f: (Int, Int) => Int)Int""");$skip(12); val res$5 = 
  reduce(5);System.out.println("""res5: Int = """ + $show(res$5));$skip(19); val res$6 = 
  reduce(5, _ * _);System.out.println("""res6: Int = """ + $show(res$6))}
}
