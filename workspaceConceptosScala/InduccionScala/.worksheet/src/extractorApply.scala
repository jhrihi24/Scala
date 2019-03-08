import scala.util.Random

object extractorApply {
  
  //El metodo Apply funciona como un constructor
  //El metodo Unnaply funciona mas que todo para realizar comparaciones
  object CustomerID {

	  def apply(name: String) = s"$name--${Random.nextLong}"
	
	  def unapply(customerID: String): Option[String] = {
	    val stringArray: Array[String] = customerID.split("--")
	    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
	  }
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(518); 
	
	//Llamada al metodo apply
	val customer1ID = CustomerID("jhompe");System.out.println("""customer1ID  : String = """ + $show(customer1ID ));$skip(150); 
	//Llamada al metodo unnaply
	customer1ID match {
  	case CustomerID(name) => println(name)
  	case _ => println("Could not extract a CustomerID")
	}}
}
