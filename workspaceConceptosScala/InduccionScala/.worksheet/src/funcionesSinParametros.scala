object funcionesSinParametros {
  
  
  class Test1(val age: Int = 10)
	class Test2(_age: Int) {
	  def age: Int = _age
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); val res$0 = 
	new Test1(10).age;System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
	new Test2(11).age;System.out.println("""res1: Int = """ + $show(res$1))}
  
  
}
