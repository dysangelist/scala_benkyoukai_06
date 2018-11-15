package study06.parameters

object ParametersExample3 extends App {
  def printAnImplicit()(implicit str: String) = {
    println(str)
  }

  def defineAnImplicitAndPrint() = {
    implicit val str: String = "I am a hidden string!!"
    printAnImplicit()
  }

//  implicit val str2: String = "I am a hidden string 2!"
  defineAnImplicitAndPrint()
}
