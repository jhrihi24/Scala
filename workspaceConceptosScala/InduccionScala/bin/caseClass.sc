object caseClass {

  //Metodos de igualdas eq valida si es el mismo objeto no si es el mismo tipo de objeto
  case class Person(first: String, last: String)
	val p1 = new Person("Fred", "Jones")      //> p1  : caseClass.Person = Person(Fred,Jones)
	val p2 = new Person("Shaggy", "Rogers")   //> p2  : caseClass.Person = Person(Shaggy,Rogers)
	val p3 = new Person("Fred", "Jones")      //> p3  : caseClass.Person = Person(Fred,Jones)
	(p1 == p2)                                //> res0: Boolean = false
	(p1 == p3)                                //> res1: Boolean = true
	(p1 eq p2)                                //> res2: Boolean = false
	(p1 eq p3)                                //> res3: Boolean = false
  (p1.hashCode == p2.hashCode)                    //> res4: Boolean = false
	(p1.hashCode == p3.hashCode)              //> res5: Boolean = true
  
  //Metodo to string de los case class
  case class Dog(name: String, breed: String)
	val dog = Dog("Scooby", "Doberman")       //> dog  : caseClass.Dog = Dog(Scooby,Doberman)
	dog.toString                              //> res6: String = Dog(Scooby,Doberman)
  
  //Las clases caso tienen propiedades y estas se pueden llamar
	val dog2 = Dog("Scooby", "Doberman")      //> dog2  : caseClass.Dog = Dog(Scooby,Doberman)
	dog2.name                                 //> res7: String = Scooby
	dog2.breed                                //> res8: String = Doberman
	
	//Alterar case Class // Doberman
	val dog3 = Dog("Scooby", "Doberman")      //> dog3  : caseClass.Dog = Dog(Scooby,Doberman)
	val dog4 = dog3.copy(name = "Scooby Doo") //> dog4  : caseClass.Dog = Dog(Scooby Doo,Doberman)
  
  //Las clases casos pueden tener parametros predeterminados y con nombre
  case class PersonPredeterminate(first: String, last: String, age: Int = 0, ssn: String = "")
	val p1PersonPredeterminate = PersonPredeterminate("Fred", "Jones", 23, "111-22-3333")
                                                  //> p1PersonPredeterminate  : caseClass.PersonPredeterminate = PersonPredetermi
                                                  //| nate(Fred,Jones,23,111-22-3333)
	val p2PersonPredeterminate = PersonPredeterminate("Samantha", "Jones") // note missing age and ssn
                                                  //> p2PersonPredeterminate  : caseClass.PersonPredeterminate = PersonPredetermi
                                                  //| nate(Samantha,Jones,0,)
	val p3PersonPredeterminate = PersonPredeterminate(last = "Jones", first = "Fred", ssn = "111-22-3333") // note the order can change, and missing age
                                                  //> p3PersonPredeterminate  : caseClass.PersonPredeterminate = PersonPredetermi
                                                  //| nate(Fred,Jones,0,111-22-3333)
	val p4PersonPredeterminate = p3PersonPredeterminate.copy(age = 23)
                                                  //> p4PersonPredeterminate  : caseClass.PersonPredeterminate = PersonPredetermi
                                                  //| nate(Fred,Jones,23,111-22-3333)
  
  //Las clases se pueden separar como una tupla
  val p1Tupla = PersonPredeterminate("Fred", "Jones", 23, "111-22-3333")
                                                  //> p1Tupla  : caseClass.PersonPredeterminate = PersonPredeterminate(Fred,Jones
                                                  //| ,23,111-22-3333)
	val parts = PersonPredeterminate.unapply(p1Tupla).get // this seems weird, but it's critical to other features of Scala
                                                  //> parts  : (String, String, Int, String) = (Fred,Jones,23,111-22-3333)
	parts._1                                  //> res9: String = Fred
	parts._2                                  //> res10: String = Jones
	
	
	//Los case Class son serializables
	case class PersonCC(firstName: String, lastName: String)
	val indy = PersonCC("Indiana", "Jones")   //> indy  : caseClass.PersonCC = PersonCC(Indiana,Jones)
	indy.isInstanceOf[Serializable]           //> res11: Boolean = true
  
}