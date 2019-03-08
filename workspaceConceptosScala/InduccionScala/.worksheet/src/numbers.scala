object numbers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(51); 

	//Numbers de 32 bits
  val a = 2;System.out.println("""a  : Int = """ + $show(a ));$skip(12); 
	val b = 31;System.out.println("""b  : Int = """ + $show(b ));$skip(15); 
	val c = 0x30F;System.out.println("""c  : Int = """ + $show(c ));$skip(11); 
	val e = 0;System.out.println("""e  : Int = """ + $show(e ));$skip(12); 
	val f = -2;System.out.println("""f  : Int = """ + $show(f ));$skip(13); 
	val g = -31;System.out.println("""g  : Int = """ + $show(g ));$skip(16); 
	val h = -0x30F;System.out.println("""h  : Int = """ + $show(h ));$skip(38); 
	
	
	//Numbers de 64 bits
	val i = 2L;System.out.println("""i  : Long = """ + $show(i ));$skip(13); 
	val j = 31L;System.out.println("""j  : Long = """ + $show(j ));$skip(16); 
	val k = 0x30FL;System.out.println("""k  : Long = """ + $show(k ));$skip(12); 
	val l = 0L;System.out.println("""l  : Long = """ + $show(l ));$skip(13); 
	val m = -2l;System.out.println("""m  : Long = """ + $show(m ));$skip(14); 
	val n = -31L;System.out.println("""n  : Long = """ + $show(n ));$skip(17); 
	val o = -0x30FL;System.out.println("""o  : Long = """ + $show(o ));$skip(50); 
	
	//Numbers Hexadecimales o doubles
	val p = 3.0;System.out.println("""p  : Double = """ + $show(p ));$skip(14); 
	val q = 3.00;System.out.println("""q  : Double = """ + $show(q ));$skip(14); 
	val r = 2.73;System.out.println("""r  : Double = """ + $show(r ));$skip(12); 
	val s = 3f;System.out.println("""s  : Float = """ + $show(s ));$skip(15); 
	val t = 3.22d;System.out.println("""t  : Double = """ + $show(t ));$skip(15); 
	val u = 93e-9;System.out.println("""u  : Double = """ + $show(u ));$skip(15); 
	val v = 93E-9;System.out.println("""v  : Double = """ + $show(v ));$skip(13); 
	val w = 0.0;System.out.println("""w  : Double = """ + $show(w ));$skip(18); 
	val x = 9.23E-9D;System.out.println("""x  : Double = """ + $show(x ))}
	
	 
}
