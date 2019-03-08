object extractors {

	//Un extractor es un método en cualquier objectllamada unapply, y ese método se usa para desensamblar el objeto
	class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)
	object ChopShop {
	  def unapply(x: Car) = Some(x.make, x.model, x.year, x.topSpeed)
	}
	val ChopShop(a, b, c, d) = new Car("Chevy", "Camaro", 1978, 120)
                                                  //> a  : String = Chevy
                                                  //| b  : String = Camaro
                                                  //| c  : Short = 1978
                                                  //| d  : Short = 120
   //Usar extractores para realizar la coincidencia
	val x = new Car("Chevy", "Camaro", 1978, 120) match {
	  case ChopShop(s, t, u, v) ⇒ (s, t)
	  case _ ⇒ ("Ford", "Edsel")
	}                                         //> x  : (String, String) = (Chevy,Camaro)
	
	
	
	
	
	//Mientras las firmas del metodo no sean las mismas, puede tener tantos metodos unapply como desee
	class CarUnapply(val make: String, val model: String, val year: Short, val topSpeed: Short)
	class EmployeeUnapply(val firstName: String, val middleName: Option[String], val lastName: String)
	object Tokenizer {
	  def unapply(x: CarUnapply) = Some(x.make, x.model, x.year, x.topSpeed)
	  def unapply(x: EmployeeUnapply) = Some(x.firstName, x.lastName)
	}
	val resultUnapply = new EmployeeUnapply("Kurt", None, "Vonnegut") match {
	  case Tokenizer(c, d) ⇒ "c: %s, d: %s".format(c, d)
	  case _ ⇒ "Not found"
	}                                         //> resultUnapply  : String = c: Kurt, d: Vonnegut
	
	
	
	
	
	//Se ultiliza unapply para coincidencias
	class EmployeeCoincidencia(
	  val firstName: String,
	  val middleName: Option[String],
	  val lastName: String
	)
	object EmployeeCoincidencia {
	  //factory methods, extractors, apply
	  //Extractor: Create tokens that represent your object
	  def unapply(x: EmployeeCoincidencia) =
	    Some(x.lastName, x.middleName, x.firstName)
	}
	val singri = new EmployeeCoincidencia("Singri", None, "Keerthi")
                                                  //> singri  : extractors.EmployeeCoincidencia = extractors$EmployeeCoincidencia
                                                  //| $2@61dc03ce
	val resultConcidencia = singri match {
	  case EmployeeCoincidencia("Singri", None, x) ⇒
	    "Yay, Singri %s! with no middle name!".format(x)
	  case EmployeeCoincidencia("Singri", Some(x), _) ⇒
	    "Yay, Singri with a middle name of %s".format(x)
	  case _ ⇒ "I don't care, going on break"
	}                                         //> resultConcidencia  : String = I don't care, going on break
	
	
	
	
	
	
	//Realizar comparaciones con una clase tipo caso
	case class Employee(firstName: String, lastName: String)
	val rob = new Employee("Robin", "Williams")
                                                  //> rob  : extractors.Employee = Employee(Robin,Williams)
	val result = rob match {
	  case Employee("Robin", _) ⇒ "Where's Batman?"
	  case _ ⇒ "No Batman Joke For You"
	}                                         //> result  : String = Where's Batman?
	
		
}