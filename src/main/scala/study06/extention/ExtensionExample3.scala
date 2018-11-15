package study06.extention

object DataStructureOps {
  implicit class DataStructureSyntax[A](l: A) {
    def |+|(r: A)(implicit S: DataStructure[A]): A = S.append(l, r)
  }
}

trait DataStructure[A] {
  def append(l: A, r: A): A
}

object DataStructure {
  def apply[A](implicit S: DataStructure[A]): DataStructure[A] = S

  implicit val StringDataStructure: DataStructure[String] =
    new DataStructure[String] {
      def append(l: String, r: String): String = l + r
    }

  implicit def ListDataStructure[A] = new DataStructure[List[A]] {
    def append(l: List[A], r: List[A]): List[A] = l ++ r
  }
}

object ExtensionExample3 extends App {
  import DataStructureOps._

  println(List(1, 2, 3) |+| List(1, 2))
  println("a, b, c," |+| "d, f, g")
}
