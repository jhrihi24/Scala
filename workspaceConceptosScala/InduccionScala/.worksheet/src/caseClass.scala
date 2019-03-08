object caseClass {

  //Metodos de igualdas eq valida si es el mismo objeto no si es el mismo tipo de objeto
  case class Person(first: String, last: String);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(195); 
	val p1 = new Person("Fred", "Jones");System.out.println("""p1  : caseClass.Person = """ + $show(p1 ));$skip(41); 
	val p2 = new Person("Shaggy", "Rogers");System.out.println("""p2  : caseClass.Person = """ + $show(p2 ));$skip(38); 
	val p3 = new Person("Fred", "Jones");System.out.println("""p3  : caseClass.Person = """ + $show(p3 ));$skip(12); val res$0 = 
	(p1 == p2);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(12); val res$1 = 
	(p1 == p3);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(12); val res$2 = 
	(p1 eq p2);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(12); val res$3 = 
	(p1 eq p3);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(31); val res$4 = 
  (p1.hashCode == p2.hashCode);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(30); val res$5 = 
	(p1.hashCode == p3.hashCode)
  
  //Metodo to string de los case class
  case class Dog(name: String, breed: String);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(125); 
	val dog = Dog("Scooby", "Doberman");System.out.println("""dog  : caseClass.Dog = """ + $show(dog ));$skip(14); val res$6 = 
	dog.toString;System.out.println("""res6: String = """ + $show(res$6));$skip(105); 
  
  //Las clases caso tienen propiedades y estas se pueden llamar
	val dog2 = Dog("Scooby", "Doberman");System.out.println("""dog2  : caseClass.Dog = """ + $show(dog2 ));$skip(11); val res$7 = 
	dog2.name;System.out.println("""res7: String = """ + $show(res$7));$skip(12); val res$8 = 
	dog2.breed;System.out.println("""res8: String = """ + $show(res$8));$skip(74); 
	
	//Alterar case Class // Doberman
	val dog3 = Dog("Scooby", "Doberman");System.out.println("""dog3  : caseClass.Dog = """ + $show(dog3 ));$skip(43); 
	val dog4 = dog3.copy(name = "Scooby Doo")
  
  //Las clases casos pueden tener parametros predeterminados y con nombre
  case class PersonPredeterminate(first: String, last: String, age: Int = 0, ssn: String = "");System.out.println("""dog4  : caseClass.Dog = """ + $show(dog4 ));$skip(259); 
	val p1PersonPredeterminate = PersonPredeterminate("Fred", "Jones", 23, "111-22-3333");System.out.println("""p1PersonPredeterminate  : caseClass.PersonPredeterminate = """ + $show(p1PersonPredeterminate ));$skip(100); 
	val p2PersonPredeterminate = PersonPredeterminate("Samantha", "Jones");System.out.println("""p2PersonPredeterminate  : caseClass.PersonPredeterminate = """ + $show(p2PersonPredeterminate ));$skip(150);  // note missing age and ssn
	val p3PersonPredeterminate = PersonPredeterminate(last = "Jones", first = "Fred", ssn = "111-22-3333");System.out.println("""p3PersonPredeterminate  : caseClass.PersonPredeterminate = """ + $show(p3PersonPredeterminate ));$skip(68);  // note the order can change, and missing age
	val p4PersonPredeterminate = p3PersonPredeterminate.copy(age = 23);System.out.println("""p4PersonPredeterminate  : caseClass.PersonPredeterminate = """ + $show(p4PersonPredeterminate ));$skip(124); 
  
  //Las clases se pueden separar como una tupla
  val p1Tupla = PersonPredeterminate("Fred", "Jones", 23, "111-22-3333");System.out.println("""p1Tupla  : caseClass.PersonPredeterminate = """ + $show(p1Tupla ));$skip(121); 
	val parts = PersonPredeterminate.unapply(p1Tupla).get;System.out.println("""parts  : (String, String, Int, String) = """ + $show(parts ));$skip(10); val res$9 =  // this seems weird, but it's critical to other features of Scala
	parts._1;System.out.println("""res9: String = """ + $show(res$9));$skip(10); val res$10 = 
	parts._2
	
	
	//Los case Class son serializables
	case class PersonCC(firstName: String, lastName: String);System.out.println("""res10: String = """ + $show(res$10));$skip(139); 
	val indy = PersonCC("Indiana", "Jones");System.out.println("""indy  : caseClass.PersonCC = """ + $show(indy ));$skip(33); val res$11 = 
	indy.isInstanceOf[Serializable];System.out.println("""res11: Boolean = """ + $show(res$11))}
  
}
