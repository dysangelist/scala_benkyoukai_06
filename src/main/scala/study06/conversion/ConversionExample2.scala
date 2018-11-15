package study06.conversion

object ConversionExample2 extends App {
  implicit def intToString(number: Int): String = number.toString

  def printString(f: String): Unit = {
    println(f)
  }

  val number: Int = 1

  printString(1)
}
