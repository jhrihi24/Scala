object booleans {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(35); 
  
  val a = true;System.out.println("""a  : Boolean = """ + $show(a ));$skip(15); 
	val b = false;System.out.println("""b  : Boolean = """ + $show(b ));$skip(15); 
	val c = 1 > 2;System.out.println("""c  : Boolean = """ + $show(c ));$skip(15); 
	val d = 1 < 2;System.out.println("""d  : Boolean = """ + $show(d ));$skip(16); 
	val e = a == c;System.out.println("""e  : Boolean = """ + $show(e ));$skip(16); 
	val f = b == d;System.out.println("""f  : Boolean = """ + $show(f ))}
  
  
}
