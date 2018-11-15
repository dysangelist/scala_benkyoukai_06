package study06.resolution

import study06.SekaiKan._

//implicitly
object ResolutionExample4 extends App {
  import LastNames._

  object LastNames {
    trait LastName[A <: Character] {
      def lastName: String
    }

    implicit object DashaLastName extends LastName[Dasha] {
      val lastName = "Tee"
    }

    implicit object TokageLastName extends LastName[Tokage] {
      val lastName = "LizardMan"
    }

    implicit object KatatsumuriLastName extends LastName[Katatsumuri] {
      val lastName = "Snaily"
    }
  }

  def printNameAndLastName[A <: Character](character: A)(
      implicit lastName: LastName[A]): Unit = {
    println(
      s"The character's name is ${character.name} and it's last name is ${lastName.lastName}")
  }

  def printNameAndGetLength[A <: Character: LastName](character: A): Int = {
    printNameAndLastName(character)
    val lastName = implicitly[LastName[A]]
    println(lastName) // object hash
    println(lastName.lastName) // last name

    character.name.length
  }

  println(printNameAndGetLength(Dasha()))
  println(printNameAndGetLength(Tokage()))
  println(printNameAndGetLength(Katatsumuri()))

}
