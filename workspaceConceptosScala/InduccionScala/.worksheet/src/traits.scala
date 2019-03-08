object traits {
  
  //Definicion de un trait que es como una interfaz, pero tambien puede tener implementacion de algun metodo
  case class Event(name: String)
	trait EventListener {
	  def listen(event: Event): String
	}
	class MyListener extends EventListener {
	  def listen(event: Event): String = {
	    event match {
	      case Event("Moose Stampede") ⇒
	        "An unfortunate moose stampede occurred"
	      case _ ⇒ "Nothing of importance occurred"
	    }
	  }
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(510); 
	val evt = Event("Moose Stampede");System.out.println("""evt  : traits.Event = """ + $show(evt ));$skip(33); 
	val myListener = new MyListener;System.out.println("""myListener  : traits.MyListener = """ + $show(myListener ));$skip(24); val res$0 = 
	myListener.listen(evt)
	



	
	
	
	//Una clase solo puede extender de un train si quiere extender de otro tiene que usar "with"
	class OurListener
	class MyListenerConWith extends OurListener with EventListener {
	  def listen(event: Event): String = {
	    event match {
	      case Event("Woodchuck Stampede") ⇒
	        "An unfortunate woodchuck stampede occurred"
	      case _ ⇒ "Nothing of importance occurred"
	    }
	  }
  };System.out.println("""res0: String = """ + $show(res$0));$skip(457); 
  val evtConWith = Event("Woodchuck Stampede");System.out.println("""evtConWith  : traits.Event = """ + $show(evtConWith ));$skip(47); 
	val myListenerConWith = new MyListenerConWith;System.out.println("""myListenerConWith  : traits.MyListenerConWith = """ + $show(myListenerConWith ));$skip(38); val res$1 = 
	myListenerConWith.listen(evtConWith)
	
	
	
	
	
	
	
	//Los metodos del trait tambien puede contener logica no solo sirven para definicion de funciones
	trait B {
	  def bId = 2
	}
	trait A { self: B =>
	  def aId = 1
	};System.out.println("""res1: String = """ + $show(res$1));$skip(252); 
	//val a = new A  //***does not compile!!!***
	val obj = new A with B;System.out.println("""obj  : traits.A with traits.B = """ + $show(obj ));$skip(21); val res$2 = 
	(obj.aId + obj.bId);System.out.println("""res2: Int = """ + $show(res$2))}
}
