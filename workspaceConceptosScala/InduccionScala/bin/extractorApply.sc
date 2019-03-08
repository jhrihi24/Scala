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
	}
	
	//Llamada al metodo apply
	val customer1ID = CustomerID("jhompe")    //> customer1ID  : String = jhompe--8141593079468874256
	//Llamada al metodo unnaply
	customer1ID match {
  	case CustomerID(name) => println(name)
  	case _ => println("Could not extract a CustomerID")
	}                                         //> jhompe
}