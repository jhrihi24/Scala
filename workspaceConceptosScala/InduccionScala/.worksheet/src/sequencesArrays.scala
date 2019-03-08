object sequencesArrays {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 

	//Convertir una Lista en Array
  val l = List(1, 2, 3);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(19); 
	val a = l.toArray;System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(3); val res$0 = 
	a;System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(80); 
	
	
	//Convertir un array en seq y la seq en una list
	val arr = Array(1, 2, 3);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(19); 
	val seq = a.toSeq;System.out.println("""seq  : Seq[Int] = """ + $show(seq ));$skip(22); 
	val lis = seq.toList;System.out.println("""lis  : List[Int] = """ + $show(lis ));$skip(5); val res$1 = 
	lis;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(99); 
	
	
	//Crear un vector a partir de un for y convertirlo en lista
	val s = for (v ← 1 to 4) yield v;System.out.println("""s  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(s ));$skip(10); val res$2 = 
	s.toList;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(51); 
	
	val t = for (v ← 1 to 10 if v % 3 == 0) yield v;System.out.println("""t  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(t ));$skip(10); val res$3 = 
	t.toList;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(72); 
	
	
	//Filtrar una sequencia
	val seqFilter = Seq("hello", "to", "you");System.out.println("""seqFilter  : Seq[String] = """ + $show(seqFilter ));$skip(47); 
	val filtered = seqFilter.filter(_.length > 2);System.out.println("""filtered  : Seq[String] = """ + $show(filtered ));$skip(10); val res$4 = 
	filtered;System.out.println("""res4: Seq[String] = """ + $show(res$4));$skip(113); 
	
	
	
	//Puedo cambiar los valores de una secuencia usando el operador map
	val sreverse = Seq("hello", "world");System.out.println("""sreverse  : Seq[String] = """ + $show(sreverse ));$skip(40); 
	val reve = sreverse map {
  	_.reverse
	};System.out.println("""reve  : Seq[String] = """ + $show(reve ));$skip(9); val res$5 = 
	reve;System.out.println("""res5: Seq[String] = """ + $show(res$5))}
}
