object funcionesSinParametros {
  
  
  class Test1(val age: Int = 10)
	class Test2(_age: Int) {
	  def age: Int = _age
	}
	new Test1(10).age                         //> res0: Int = 10
	new Test2(11).age                         //> res1: Int = 11
  
  
}