package study06.parameters

object ParametersExample1 extends App {
  def printAnImplicit()(implicit str: String) = {
    println(str)
  }

  def run(): Unit = {
    implicit val string: String = "I am a hidden string!!"

    printAnImplicit()
  }

  run()

}
