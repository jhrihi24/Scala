object typeStrings {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(37); 
  
  val a = 'a';System.out.println("""a  : Char = """ + $show(a ));$skip(13); 
	val b = 'B';System.out.println("""b  : Char = """ + $show(b ));$skip(12); val res$0 = 
	a.toString;System.out.println("""res0: String = """ + $show(res$0));$skip(37); 
  
  
  val d = '\141';System.out.println("""d  : Char = """ + $show(d ));$skip(12); val res$1 =  //octal for a
	d.toString;System.out.println("""res1: String = """ + $show(res$1));$skip(18); 
	
	
	val e = '\"';System.out.println("""e  : Char = """ + $show(e ));$skip(14); 
	val f = '\\';System.out.println("""f  : Char = """ + $show(f ));$skip(12); val res$2 = 
	e.toString;System.out.println("""res2: String = """ + $show(res$2));$skip(12); val res$3 = 
	f.toString;System.out.println("""res3: String = """ + $show(res$3))}
}
