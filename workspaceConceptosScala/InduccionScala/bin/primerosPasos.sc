import scala.collection.mutable
import scala.collection.immutable
import scala.collection.generic.Sorted

object worksheet {
  2+2                                             //> res0: Int(4) = 4
  print("Hola a todos");                          //> Hola a todos
  
  import java.util.ArrayList
  var list = new ArrayList();                     //> list  : java.util.ArrayList[Nothing] = []
  
  
  //Condicionales
  val n = 5                                       //> n  : Int = 5
  
  if(n == 5){
  	println("Si, n vale 5")
  }else if(n == 6) {
  	println("Si, n vale 6")
  }else {
  	println("No, n no vale ni 5 ni 6")
  }                                               //> Si, n vale 5
  
  
  //Condicionales en cualquier parte
  val k = 10                                      //> k  : Int = 10
  println(if(k==10) "k vale 10" else "k no vale 10")
                                                  //> k vale 10
  
  
  //definicion de una funcion con condicion
  def void(): Unit ={ println("Hola mundo") }     //> void: ()Unit
  def kVale10(): String= if(k==10) "k vale 10" else "k no vale 10"
                                                  //> kVale10: ()String
  kVale10()                                       //> res1: String = k vale 10
  
  
  //Condicional Match
  val mes = 6                                     //> mes  : Int = 6
  
  println(mes match {
  	case 1 => "Enero"
  	case 2 => "Febrero"
  	case 3 => "Marzo"
  	case _ => "Ninguno"
  })                                              //> Ninguno
  
  
  //Bucles while y doWhile
  var cont = 0                                    //> cont  : Int = 0
  while(cont<20){
  	println(s"k vale ${cont} el siguiente es ${cont + 1}")
  	cont = cont + 1
  }                                               //> k vale 0 el siguiente es 1
                                                  //| k vale 1 el siguiente es 2
                                                  //| k vale 2 el siguiente es 3
                                                  //| k vale 3 el siguiente es 4
                                                  //| k vale 4 el siguiente es 5
                                                  //| k vale 5 el siguiente es 6
                                                  //| k vale 6 el siguiente es 7
                                                  //| k vale 7 el siguiente es 8
                                                  //| k vale 8 el siguiente es 9
                                                  //| k vale 9 el siguiente es 10
                                                  //| k vale 10 el siguiente es 11
                                                  //| k vale 11 el siguiente es 12
                                                  //| k vale 12 el siguiente es 13
                                                  //| k vale 13 el siguiente es 14
                                                  //| k vale 14 el siguiente es 15
                                                  //| k vale 15 el siguiente es 16
                                                  //| k vale 16 el siguiente es 17
                                                  //| k vale 17 el siguiente es 18
                                                  //| k vale 18 el siguiente es 19
                                                  //| k vale 19 el siguiente es 20
  
  cont= 0
  do{
  	println(s"k vale ${cont}")
  	cont = cont + 1
  }while(cont < 20)                               //> k vale 0
                                                  //| k vale 1
                                                  //| k vale 2
                                                  //| k vale 3
                                                  //| k vale 4
                                                  //| k vale 5
                                                  //| k vale 6
                                                  //| k vale 7
                                                  //| k vale 8
                                                  //| k vale 9
                                                  //| k vale 10
                                                  //| k vale 11
                                                  //| k vale 12
                                                  //| k vale 13
                                                  //| k vale 14
                                                  //| k vale 15
                                                  //| k vale 16
                                                  //| k vale 17
                                                  //| k vale 18
                                                  //| k vale 19
  
  
  //Arrays
  val frutas = Array("Pera", "Manzana", "Naranja", 5)
                                                  //> frutas  : Array[Any] = Array(Pera, Manzana, Naranja, 5)
  frutas(3)                                       //> res2: Any = 5
  frutas.length                                   //> res3: Int = 4
  frutas.isEmpty                                  //> res4: Boolean = false
  frutas.nonEmpty                                 //> res5: Boolean = true
  frutas.indexOf(5)                               //> res6: Int = 3
  
  //Lists
  val numeros = List(4, 8, 15, 16, 23, 42)        //> numeros  : List[Int] = List(4, 8, 15, 16, 23, 42)
  numeros.map{x => 2  * x}                        //> res7: List[Int] = List(8, 16, 30, 32, 46, 84)
  numeros.map{ _ * 2 }                            //> res8: List[Int] = List(8, 16, 30, 32, 46, 84)
  
  val lista= List(List(1, 2, 6), List(4, 5, 6), List(8,9,7))
                                                  //> lista  : List[List[Int]] = List(List(1, 2, 6), List(4, 5, 6), List(8, 9, 7)
                                                  //| )
  lista.flatten                                   //> res9: List[Int] = List(1, 2, 6, 4, 5, 6, 8, 9, 7)
  lista.flatMap{ x: List[Int] => x.map{n => n * 2} }
                                                  //> res10: List[Int] = List(2, 4, 12, 8, 10, 12, 16, 18, 14)
  
  var letras= List("BMW", "Mercedes", "Renault", "Toyota")
                                                  //> letras  : List[String] = List(BMW, Mercedes, Renault, Toyota)
  letras.flatMap{c => c.toUpperCase()}            //> res11: List[Char] = List(B, M, W, M, E, R, C, E, D, E, S, R, E, N, A, U, L,
                                                  //|  T, T, O, Y, O, T, A)
  letras.flatMap{c => c.toUpperCase()}.distinct   //> res12: List[Char] = List(B, M, W, E, R, C, D, S, N, A, U, L, T, O, Y)
  
  
  //Sets
  val mset = mutable.Set(1, 2, 3)                 //> mset  : scala.collection.mutable.Set[Int] = Set(1, 2, 3)
  mset+= 4                                        //> res13: worksheet.mset.type = Set(1, 2, 3, 4)
  mset++= Set(5, 6, 7)                            //> res14: worksheet.mset.type = Set(1, 5, 2, 6, 3, 7, 4)
  mset-= 4                                        //> res15: worksheet.mset.type = Set(1, 5, 2, 6, 3, 7)
  mset.filter{x => x == 5 }                       //> res16: scala.collection.mutable.Set[Int] = Set(5)
  
  
  val immSet = immutable.SortedSet(1, 3, 5, 8, 7) //> immSet  : scala.collection.immutable.SortedSet[Int] = TreeSet(1, 3, 5, 7, 8
                                                  //| )
  val mayorAmenor = Ordering.fromLessThan[Int](_ > _)
                                                  //> mayorAmenor  : scala.math.Ordering[Int] = scala.math.Ordering$$anon$9@482f8
                                                  //| f11
  val sortedSetInverso = immutable.SortedSet.empty(mayorAmenor) ++ immSet
                                                  //> sortedSetInverso  : scala.collection.immutable.SortedSet[Int] = TreeSet(8, 
                                                  //| 7, 5, 3, 1)
                                                  
  //Maps
  val mapa = Map(1-> "Pepito", 2 -> "Maria", 3-> "Luis")
                                                  //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Pepito, 2 -> 
                                                  //| Maria, 3 -> Luis)
  mapa.keySet                                     //> res17: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  mapa.values                                     //> res18: Iterable[String] = MapLike.DefaultValuesIterable(Pepito, Maria, Luis
                                                  //| )
  mapa.get(3)                                     //> res19: Option[String] = Some(Luis)
  mapa.getOrElse(9, "No existe")                  //> res20: String = No existe
  mapa.contains(9)                                //> res21: Boolean = false
  mapa + (4 -> "Raul")                            //> res22: scala.collection.immutable.Map[Int,String] = Map(1 -> Pepito, 2 -> M
                                                  //| aria, 3 -> Luis, 4 -> Raul)
  mapa - 3                                        //> res23: scala.collection.immutable.Map[Int,String] = Map(1 -> Pepito, 2 -> M
                                                  //| aria)
  var mapaNro2 = Map(3->"Toyota", 4->"Renault")   //> mapaNro2  : scala.collection.immutable.Map[Int,String] = Map(3 -> Toyota, 4
                                                  //|  -> Renault)
  mapa ++ mapaNro2                                //> res24: scala.collection.immutable.Map[Int,String] = Map(1 -> Pepito, 2 -> M
                                                  //| aria, 3 -> Toyota, 4 -> Renault)
  
  var mapaMutable = mutable.Map(1 -> "Renault", 2 -> "BMW")
                                                  //> mapaMutable  : scala.collection.mutable.Map[Int,String] = Map(2 -> BMW, 1 -
                                                  //| > Renault)
  mapaMutable ++=Map(3-> "Mazda", 4-> "Ferrari")  //> res25: scala.collection.mutable.Map[Int,String] = Map(2 -> BMW, 4 -> Ferrar
                                                  //| i, 1 -> Renault, 3 -> Mazda)
  
  //For y Foreach
  val lenguajes = Seq("Java", "Scala", "Kotlin", "Clojure")
                                                  //> lenguajes  : Seq[String] = List(Java, Scala, Kotlin, Clojure)
  val opiniones= Seq("Conciso", "bueno", "malo", "regular")
                                                  //> opiniones  : Seq[String] = List(Conciso, bueno, malo, regular)
  lenguajes.foreach(l => println(s"me parece un muy buen lenguaje ${l}"))
                                                  //> me parece un muy buen lenguaje Java
                                                  //| me parece un muy buen lenguaje Scala
                                                  //| me parece un muy buen lenguaje Kotlin
                                                  //| me parece un muy buen lenguaje Clojure
  for(l <- lenguajes if l.endsWith("a"); o <- opiniones) {
  	println(s"me parece un muy buen lenguaje ${l} de la opinion de ${o}")
                                                  //> me parece un muy buen lenguaje Java de la opinion de Conciso
                                                  //| me parece un muy buen lenguaje Java de la opinion de bueno
                                                  //| me parece un muy buen lenguaje Java de la opinion de malo
                                                  //| me parece un muy buen lenguaje Java de la opinion de regular
                                                  //| me parece un muy buen lenguaje Scala de la opinion de Conciso
                                                  //| me parece un muy buen lenguaje Scala de la opinion de bueno
                                                  //| me parece un muy buen lenguaje Scala de la opinion de malo
                                                  //| me parece un muy buen lenguaje Scala de la opinion de regular
  }
  
  
}