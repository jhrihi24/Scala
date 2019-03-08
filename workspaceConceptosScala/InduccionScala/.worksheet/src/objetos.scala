object objetos {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(375); 
  	def academyAwardBestMoviesForYear(x: Short) = {
	    //This is a match statement, more powerful than a Java switch statement!
	    x match {
	      case 1930 ⇒ Some(new Movie("All Quiet On the Western Front", 1930))
	      case 1931 ⇒ Some(new Movie("Cimarron", 1931))
	      case 1932 ⇒ Some(new Movie("Grand Hotel", 1932))
	      case _ ⇒ None
    }
  };System.out.println("""academyAwardBestMoviesForYear: (x: Short)Option[Movie]""");$skip(50); val res$0 = 
  
  academyAwardBestMoviesForYear(1932).get.name;System.out.println("""res0: String = """ + $show(res$0))}
}

class Movie(val name: String, val year: Short)
