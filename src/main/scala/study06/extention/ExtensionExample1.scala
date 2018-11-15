package study06.extention

object ExtensionExample1 extends App {

  object StringOps {
    implicit class Str(s: String) {
      def sparkle: String = {
        s"~*~ $s ~*~"
      }

      def print(): Unit = {
        println(s)
      }
    }
  }

  import StringOps._

  "1".sparkle.print()

  "I am a string!".print()

}
