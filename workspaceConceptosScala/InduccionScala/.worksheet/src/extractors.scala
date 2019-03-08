object extractors {

	//Un extractor es un método en cualquier objectllamada unapply, y ese método se usa para desensamblar el objeto
	class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)
	object ChopShop {
	  def unapply(x: Car) = Some(x.make, x.model, x.year, x.topSpeed)
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(375); 
	val ChopShop(a, b, c, d) = new Car("Chevy", "Camaro", 1978, 120);System.out.println("""a  : String = """ + $show(a ));System.out.println("""b  : String = """ + $show(b ));System.out.println("""c  : Short = """ + $show(c ));System.out.println("""d  : Short = """ + $show(d ));$skip(178); 
   //Usar extractores para realizar la coincidencia
	val x = new Car("Chevy", "Camaro", 1978, 120) match {
	  case ChopShop(s, t, u, v) ⇒ (s, t)
	  case _ ⇒ ("Ford", "Edsel")
	}
	
	
	
	
	
	//Mientras las firmas del metodo no sean las mismas, puede tener tantos metodos unapply como desee
	class CarUnapply(val make: String, val model: String, val year: Short, val topSpeed: Short)
	class EmployeeUnapply(val firstName: String, val middleName: Option[String], val lastName: String)
	object Tokenizer {
	  def unapply(x: CarUnapply) = Some(x.make, x.model, x.year, x.topSpeed)
	  def unapply(x: EmployeeUnapply) = Some(x.firstName, x.lastName)
	};System.out.println("""x  : (String, String) = """ + $show(x ));$skip(625); 
	val resultUnapply = new EmployeeUnapply("Kurt", None, "Vonnegut") match {
	  case Tokenizer(c, d) ⇒ "c: %s, d: %s".format(c, d)
	  case _ ⇒ "Not found"
	}
	
	
	
	
	
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
	};System.out.println("""resultUnapply  : String = """ + $show(resultUnapply ));$skip(457); 
	val singri = new EmployeeCoincidencia("Singri", None, "Keerthi");System.out.println("""singri  : extractors.EmployeeCoincidencia = """ + $show(singri ));$skip(297); 
	val resultConcidencia = singri match {
	  case EmployeeCoincidencia("Singri", None, x) ⇒
	    "Yay, Singri %s! with no middle name!".format(x)
	  case EmployeeCoincidencia("Singri", Some(x), _) ⇒
	    "Yay, Singri with a middle name of %s".format(x)
	  case _ ⇒ "I don't care, going on break"
	}
	
	
	
	
	
	
	//Realizar comparaciones con una clase tipo caso
	case class Employee(firstName: String, lastName: String);System.out.println("""resultConcidencia  : String = """ + $show(resultConcidencia ));$skip(165); 
	val rob = new Employee("Robin", "Williams");System.out.println("""rob  : extractors.Employee = """ + $show(rob ));$skip(115); 
	val result = rob match {
	  case Employee("Robin", _) ⇒ "Where's Batman?"
	  case _ ⇒ "No Batman Joke For You"
	};System.out.println("""result  : String = """ + $show(result ))}
	
		
}
