object funcionesParametrosRepetidos {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(167); 
  
  
  def repeatedParameterMethod(x: Int, y: String, z: Any*) = {
 		"%d %ss can give you %s".format(x, y, z.mkString(", "))
	};System.out.println("""repeatedParameterMethod: (x: Int, y: String, z: Any*)String""");$skip(162); val res$0 = 
	//Despues del tercer parametro podra recibir los parametros que quiera
	repeatedParameterMethod(3, "egg", "a delicious sandwich", "protein", "high cholesterol");System.out.println("""res0: String = """ + $show(res$0));$skip(142); val res$1 = 
  //Puede recibir una coleccion si se quiere
  repeatedParameterMethod(3, "egg", List("a delicious sandwich", "protein", "high cholesterol"));System.out.println("""res1: String = """ + $show(res$1));$skip(102); val res$2 = 
  repeatedParameterMethod(3,  "egg", List("a delicious sandwich", "protein", "high cholesterol"): _*);System.out.println("""res2: String = """ + $show(res$2))}
}
