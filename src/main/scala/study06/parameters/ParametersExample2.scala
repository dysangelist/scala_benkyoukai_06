package study06.parameters

object ParametersExample2 extends App {
  def printAnImplicit()(implicit str: String) = {
    println(str)
  }

  def run(): Unit = {
    implicit val string: String = "I am a hidden string!!"
//    implicit val string2: String = "I am a hidden string too!!"

    printAnImplicit()
  }

  run()

}
