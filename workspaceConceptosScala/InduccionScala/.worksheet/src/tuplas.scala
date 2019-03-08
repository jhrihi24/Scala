object tuplas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(46); 
  val tuple = ("apple", "dog");System.out.println("""tuple  : (String, String) = """ + $show(tuple ));$skip(22); 
	val fruit = tuple._1;System.out.println("""fruit  : String = """ + $show(fruit ));$skip(23); 
	val animal = tuple._2;System.out.println("""animal  : String = """ + $show(animal ));$skip(79); 
	
	//Multiples tipos
	val tuple5 = ("a", 1, 2.2, new java.util.Date(), "five");System.out.println("""tuple5  : (String, Int, Double, java.util.Date, String) = """ + $show(tuple5 ));$skip(11); val res$0 = 
	tuple5._2;System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
	tuple5._5;System.out.println("""res1: String = """ + $show(res$1));$skip(77); 
	
	//Asignacion multiple a variables
	val student = ("Sean Rogers", 21, 3.5);System.out.println("""student  : (String, Int, Double) = """ + $show(student ));$skip(32); 
	val (name, age, gpa) = student;System.out.println("""name  : String = """ + $show(name ));System.out.println("""age  : Int = """ + $show(age ));System.out.println("""gpa  : Double = """ + $show(gpa ));$skip(88); 
	
	
	//Swap para intercambiar elementos de una tupla
	val tupleSwap = ("apple", 3).swap;System.out.println("""tupleSwap  : (Int, String) = """ + $show(tupleSwap ));$skip(14); val res$2 = 
	tupleSwap._1;System.out.println("""res2: Int = """ + $show(res$2));$skip(14); val res$3 = 
	tupleSwap._2;System.out.println("""res3: String = """ + $show(res$3))}
}
