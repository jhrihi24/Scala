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
	}
	val evt = Event("Moose Stampede")         //> evt  : traits.Event = Event(Moose Stampede)
	val myListener = new MyListener           //> myListener  : traits.MyListener = traits$MyListener@5594a1b5
	myListener.listen(evt)                    //> res0: String = An unfortunate moose stampede occurred
	



	
	
	
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
  }
  val evtConWith = Event("Woodchuck Stampede")    //> evtConWith  : traits.Event = Event(Woodchuck Stampede)
	val myListenerConWith = new MyListenerConWith
                                                  //> myListenerConWith  : traits.MyListenerConWith = traits$MyListenerConWith$1@
                                                  //| b684286
	myListenerConWith.listen(evtConWith)      //> res1: String = An unfortunate woodchuck stampede occurred
	
	
	
	
	
	
	
	//Los metodos del trait tambien puede contener logica no solo sirven para definicion de funciones
	trait B {
	  def bId = 2
	}
	trait A { self: B =>
	  def aId = 1
	}
	//val a = new A  //***does not compile!!!***
	val obj = new A with B                    //> obj  : traits.A with traits.B = traits$$anon$1@880ec60
	(obj.aId + obj.bId)                       //> res2: Int = 3
}