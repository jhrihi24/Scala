object funcionesParametrosRepetidos {
  
  
  def repeatedParameterMethod(x: Int, y: String, z: Any*) = {
 		"%d %ss can give you %s".format(x, y, z.mkString(", "))
	}                                         //> repeatedParameterMethod: (x: Int, y: String, z: Any*)String
	//Despues del tercer parametro podra recibir los parametros que quiera
	repeatedParameterMethod(3, "egg", "a delicious sandwich", "protein", "high cholesterol")
                                                  //> res0: String = 3 eggs can give you a delicious sandwich, protein, high chole
                                                  //| sterol
  //Puede recibir una coleccion si se quiere
  repeatedParameterMethod(3, "egg", List("a delicious sandwich", "protein", "high cholesterol"))
                                                  //> res1: String = 3 eggs can give you List(a delicious sandwich, protein, high 
                                                  //| cholesterol)
  repeatedParameterMethod(3,  "egg", List("a delicious sandwich", "protein", "high cholesterol"): _*)
                                                  //> res2: String = 3 eggs can give you a delicious sandwich, protein, high chole
                                                  //| sterol
}