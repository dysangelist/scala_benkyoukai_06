package study06.extention

import scala.util.{Failure, Success, Try}

object ExtensionExample2 extends App {
  object TryOps {
    implicit class ImplicitTryOption[T](t: Try[Option[T]]) {
      def toTry: Try[T] = toTry(new Exception("Not found!"))

      def toTry(e: Exception): Try[T] = t.flatMap {
        case Some(x) => Success(x)
        case None    => Failure(e)
      }
    }
  }

  import TryOps._
  println(Try { Some("A") }.toTry)
  println(Try { None }.toTry)
}
