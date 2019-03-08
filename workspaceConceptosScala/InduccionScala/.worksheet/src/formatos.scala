object formatos {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(42); 
	
	val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(36); 
  val x= "Application %s".format(s);System.out.println("""x  : String = """ + $show(x ));$skip(49); 
  
  //Pueden ser un solo caracter
  val a = 'a';System.out.println("""a  : Char = """ + $show(a ));$skip(13); 
	val b = 'B';System.out.println("""b  : Char = """ + $show(b ));$skip(16); val res$0 = 
	"%c".format(a);System.out.println("""res0: String = """ + $show(res$0));$skip(16); val res$1 = 
	"%c".format(b);System.out.println("""res1: String = """ + $show(res$1));$skip(58); 

	//Utilizar octal o decimal
	val c = 'a';System.out.println("""c  : Char = """ + $show(c ));$skip(30);  //unicode for a
	val d = '\141';System.out.println("""d  : Char = """ + $show(d ));$skip(14);  //octal for a
	val e = '\"';System.out.println("""e  : Char = """ + $show(e ));$skip(14); 
	val f = '\\';System.out.println("""f  : Char = """ + $show(f ));$skip(18); val res$2 = 
	
	"%c".format(c);System.out.println("""res2: String = """ + $show(res$2));$skip(16); val res$3 = 
	"%c".format(d);System.out.println("""res3: String = """ + $show(res$3));$skip(16); val res$4 = 
	"%c".format(e);System.out.println("""res4: String = """ + $show(res$4));$skip(16); val res$5 = 
	"%c".format(f);System.out.println("""res5: String = """ + $show(res$5));$skip(51); 
	
	//El formato puede incluir numeros
	val j = 190;System.out.println("""j  : Int = """ + $show(j ));$skip(49); val res$6 = 
	"%d bottles of beer on the wall" format j - 100;System.out.println("""res6: String = """ + $show(res$6));$skip(59); 
	
	//Formato de cualquier numero de elementos
	val h = 190;System.out.println("""h  : Int = """ + $show(h ));$skip(17); 
	val k = "vodka";System.out.println("""k  : String = """ + $show(k ));$skip(53); val res$7 = 
	
	"%d bottles of %s on the wall".format(h - 100, k);System.out.println("""res7: String = """ + $show(res$7))}
	
}
