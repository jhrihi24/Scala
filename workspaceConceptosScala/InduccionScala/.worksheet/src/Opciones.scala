object Opciones {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 

	val someValue: Option[Double] = Some(20.0);System.out.println("""someValue  : Option[Double] = """ + $show(someValue ));$skip(73); 
	val value = someValue match {
	  case Some(v) ⇒ v
	  case None ⇒ 0.0
	};System.out.println("""value  : Double = """ + $show(value ));$skip(38); 

 	val noValue: Option[Double] = None;System.out.println("""noValue  : Option[Double] = """ + $show(noValue ));$skip(72); 
	val value1 = noValue match {
	  case Some(v) ⇒ v
	  case None ⇒ 0.0
	};System.out.println("""value1  : Double = """ + $show(value1 ));$skip(64); 
	
	
	//Uso de option con map
	val number: Option[Int] = Some(3);System.out.println("""number  : Option[Int] = """ + $show(number ));$skip(34); 
	val noNumber: Option[Int] = None;System.out.println("""noNumber  : Option[Int] = """ + $show(noNumber ));$skip(35); 
	val result1 = number.map(_ * 1.5);System.out.println("""result1  : Option[Double] = """ + $show(result1 ));$skip(37); 
	val result2 = noNumber.map(_ * 1.5);System.out.println("""result2  : Option[Double] = """ + $show(result2 ));$skip(63); 

	//Uso de fold con map
	val numberFold: Option[Int] = Some(3);System.out.println("""numberFold  : Option[Int] = """ + $show(numberFold ));$skip(38); 
	val noNumberFold: Option[Int] = None;System.out.println("""noNumberFold  : Option[Int] = """ + $show(noNumberFold ));$skip(45); 
	val result1Fold = numberFold.fold(1)(_ * 3);System.out.println("""result1Fold  : Int = """ + $show(result1Fold ));$skip(47); 
	val result2Fold = noNumberFold.fold(1)(_ * 3);System.out.println("""result2Fold  : Int = """ + $show(result2Fold ))}
}
