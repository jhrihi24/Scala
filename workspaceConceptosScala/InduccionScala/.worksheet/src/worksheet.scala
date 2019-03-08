import scala.collection.mutable
import scala.collection.immutable
import scala.collection.generic.Sorted

object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(130); val res$0 = 
  2+2;System.out.println("""res0: Int(4) = """ + $show(res$0));$skip(25); 
  print("Hola a todos");
  
  import java.util.ArrayList;$skip(62); 
  var list = new ArrayList();System.out.println("""list  : java.util.ArrayList[Nothing] = """ + $show(list ));$skip(36); ;
  
  
  //Condicionales
  val n = 5;System.out.println("""n  : Int = """ + $show(n ));$skip(144); 
  
  if(n == 5){
  	println("Si, n vale 5")
  }else if(n == 6) {
  	println("Si, n vale 6")
  }else {
  	println("No, n no vale ni 5 ni 6")
  };$skip(56); 
  
  
  //Condicionales en cualquier parte
  val k = 10;System.out.println("""k  : Int = """ + $show(k ));$skip(53); 
  println(if(k==10) "k vale 10" else "k no vale 10");$skip(96); 
  
  
  //definicion de una funcion con condicion
  def void(): Unit ={ println("Hola mundo") };System.out.println("""void: ()Unit""");$skip(67); 
  def kVale10(): String= if(k==10) "k vale 10" else "k no vale 10";System.out.println("""kVale10: ()String""");$skip(12); val res$1 = 
  kVale10();System.out.println("""res1: String = """ + $show(res$1));$skip(42); 
  
  
  //Condicional Match
  val mes = 6;System.out.println("""mes  : Int = """ + $show(mes ));$skip(118); 
  
  println(mes match {
  	case 1 => "Enero"
  	case 2 => "Febrero"
  	case 3 => "Marzo"
  	case _ => "Ninguno"
  });$skip(48); 
  
  
  //Bucles while y doWhile
  var cont = 0;System.out.println("""cont  : Int = """ + $show(cont ));$skip(99); 
  while(cont<20){
  	println(s"k vale ${cont} el siguiente es ${cont + 1}")
  	cont = cont + 1
  };$skip(13); 
  
  cont= 0;$skip(75); 
  do{
  	println(s"k vale ${cont}")
  	cont = cont + 1
  }while(cont < 20);$skip(71); 
  
  
  //Arrays
  val frutas = Array("Pera", "Manzana", "Naranja", 5);System.out.println("""frutas  : Array[Any] = """ + $show(frutas ));$skip(12); val res$2 = 
  frutas(3);System.out.println("""res2: Any = """ + $show(res$2));$skip(16); val res$3 = 
  frutas.length;System.out.println("""res3: Int = """ + $show(res$3));$skip(17); val res$4 = 
  frutas.isEmpty;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(18); val res$5 = 
  frutas.nonEmpty;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(20); val res$6 = 
  frutas.indexOf(5);System.out.println("""res6: Int = """ + $show(res$6));$skip(56); 
  
  //Lists
  val numeros = List(4, 8, 15, 16, 23, 42);System.out.println("""numeros  : List[Int] = """ + $show(numeros ));$skip(27); val res$7 = 
  numeros.map{x => 2  * x};System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(23); val res$8 = 
  numeros.map{ _ * 2 };System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(64); 
  
  val lista= List(List(1, 2, 6), List(4, 5, 6), List(8,9,7));System.out.println("""lista  : List[List[Int]] = """ + $show(lista ));$skip(16); val res$9 = 
  lista.flatten;System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(53); val res$10 = 
  lista.flatMap{ x: List[Int] => x.map{n => n * 2} };System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(62); 
  
  var letras= List("BMW", "Mercedes", "Renault", "Toyota");System.out.println("""letras  : List[String] = """ + $show(letras ));$skip(39); val res$11 = 
  letras.flatMap{c => c.toUpperCase()};System.out.println("""res11: List[Char] = """ + $show(res$11));$skip(48); val res$12 = 
  letras.flatMap{c => c.toUpperCase()}.distinct;System.out.println("""res12: List[Char] = """ + $show(res$12));$skip(49); 
  
  
  //Sets
  val mset = mutable.Set(1, 2, 3);System.out.println("""mset  : scala.collection.mutable.Set[Int] = """ + $show(mset ));$skip(11); val res$13 = 
  mset+= 4;System.out.println("""res13: worksheet.mset.type = """ + $show(res$13));$skip(23); val res$14 = 
  mset++= Set(5, 6, 7);System.out.println("""res14: worksheet.mset.type = """ + $show(res$14));$skip(11); val res$15 = 
  mset-= 4;System.out.println("""res15: worksheet.mset.type = """ + $show(res$15));$skip(28); val res$16 = 
  mset.filter{x => x == 5 };System.out.println("""res16: scala.collection.mutable.Set[Int] = """ + $show(res$16));$skip(56); 
  
  
  val immSet = immutable.SortedSet(1, 3, 5, 8, 7);System.out.println("""immSet  : scala.collection.immutable.SortedSet[Int] = """ + $show(immSet ));$skip(54); 
  val mayorAmenor = Ordering.fromLessThan[Int](_ > _);System.out.println("""mayorAmenor  : scala.math.Ordering[Int] = """ + $show(mayorAmenor ));$skip(74); 
  val sortedSetInverso = immutable.SortedSet.empty(mayorAmenor) ++ immSet;System.out.println("""sortedSetInverso  : scala.collection.immutable.SortedSet[Int] = """ + $show(sortedSetInverso ));$skip(117); 
                                                  
  //Maps
  val mapa = Map(1-> "Pepito", 2 -> "Maria", 3-> "Luis");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(14); val res$17 = 
  mapa.keySet;System.out.println("""res17: scala.collection.immutable.Set[Int] = """ + $show(res$17));$skip(14); val res$18 = 
  mapa.values;System.out.println("""res18: Iterable[String] = """ + $show(res$18));$skip(14); val res$19 = 
  mapa.get(3);System.out.println("""res19: Option[String] = """ + $show(res$19));$skip(33); val res$20 = 
  mapa.getOrElse(9, "No existe");System.out.println("""res20: String = """ + $show(res$20));$skip(19); val res$21 = 
  mapa.contains(9);System.out.println("""res21: Boolean = """ + $show(res$21));$skip(23); val res$22 = 
  mapa + (4 -> "Raul");System.out.println("""res22: scala.collection.immutable.Map[Int,String] = """ + $show(res$22));$skip(11); val res$23 = 
  mapa - 3;System.out.println("""res23: scala.collection.immutable.Map[Int,String] = """ + $show(res$23));$skip(48); 
  var mapaNro2 = Map(3->"Toyota", 4->"Renault");System.out.println("""mapaNro2  : scala.collection.immutable.Map[Int,String] = """ + $show(mapaNro2 ));$skip(19); val res$24 = 
  mapa ++ mapaNro2;System.out.println("""res24: scala.collection.immutable.Map[Int,String] = """ + $show(res$24));$skip(63); 
  
  var mapaMutable = mutable.Map(1 -> "Renault", 2 -> "BMW");System.out.println("""mapaMutable  : scala.collection.mutable.Map[Int,String] = """ + $show(mapaMutable ));$skip(49); val res$25 = 
  mapaMutable ++=Map(3-> "Mazda", 4-> "Ferrari");System.out.println("""res25: scala.collection.mutable.Map[Int,String] = """ + $show(res$25));$skip(82); 
  
  //For y Foreach
  val lenguajes = Seq("Java", "Scala", "Kotlin", "Clojure");System.out.println("""lenguajes  : Seq[String] = """ + $show(lenguajes ));$skip(60); 
  val opiniones= Seq("Conciso", "bueno", "malo", "regular");System.out.println("""opiniones  : Seq[String] = """ + $show(opiniones ));$skip(74); 
  lenguajes.foreach(l => println(s"me parece un muy buen lenguaje ${l}"));$skip(132); 
  for(l <- lenguajes if l.endsWith("a"); o <- opiniones) {
  	println(s"me parece un muy buen lenguaje ${l} de la opinion de ${o}")}
  }
  
  
}
