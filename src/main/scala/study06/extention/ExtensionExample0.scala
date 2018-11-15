package study06.extention

object ExtensionExample0 extends App {

  trait Sparkable {
    def sparkle(): String = s" ~*~ ${this.toString} ~*~"
  }

  case class Idol(name: String = "RM") extends Sparkable

  print(Idol().sparkle())
}
