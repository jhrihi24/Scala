object objetos {
  	def academyAwardBestMoviesForYear(x: Short) = {
	    //This is a match statement, more powerful than a Java switch statement!
	    x match {
	      case 1930 ⇒ Some(new Movie("All Quiet On the Western Front", 1930))
	      case 1931 ⇒ Some(new Movie("Cimarron", 1931))
	      case 1932 ⇒ Some(new Movie("Grand Hotel", 1932))
	      case _ ⇒ None
    }
  }                                               //> academyAwardBestMoviesForYear: (x: Short)Option[Movie]
  
  academyAwardBestMoviesForYear(1932).get.name    //> res0: String = Grand Hotel
}

class Movie(val name: String, val year: Short)