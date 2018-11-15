package study06

object SekaiKan {

  trait Character {
    def name: String
  }

  case class Tokage(name: String = "Tokage") extends Character
  case class Katatsumuri(name: String = "Katatsumuri") extends Character
  case class Dasha(name: String = "Dasha") extends Character

}
