object valoresVacios {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(43); val res$0 = 
  
	
  None.toString;System.out.println("""res0: String = """ + $show(res$0));$skip(14); val res$1 = 
  None.toList;System.out.println("""res1: List[Nothing] = """ + $show(res$1));$skip(15); val res$2 = 
  None.isEmpty;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(25); val res$3 = 
  None.asInstanceOf[Any];System.out.println("""res3: Any = """ + $show(res$3));$skip(27); val res$4 = 
	None.asInstanceOf[AnyRef];System.out.println("""res4: AnyRef = """ + $show(res$4));$skip(27); val res$5 = 
	None.asInstanceOf[AnyVal];System.out.println("""res5: AnyVal = """ + $show(res$5));$skip(39); 
	
	val optional: Option[String] = None;System.out.println("""optional  : Option[String] = """ + $show(optional ));$skip(18); val res$6 = 
	optional.isEmpty;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(10); val res$7 = 
	optional;System.out.println("""res7: Option[String] = """ + $show(res$7));$skip(100); 
  
  
  //Usar getOrElse en los valores vacios
  val optional1: Option[String] = Some("Some Value");System.out.println("""optional1  : Option[String] = """ + $show(optional1 ));$skip(38); 
	val optional2: Option[String] = None;System.out.println("""optional2  : Option[String] = """ + $show(optional2 ));$skip(33); val res$8 = 
	optional1.getOrElse("No Value");System.out.println("""res8: String = """ + $show(res$8));$skip(33); val res$9 = 
	optional2.getOrElse("No Value");System.out.println("""res9: String = """ + $show(res$9))}
}
