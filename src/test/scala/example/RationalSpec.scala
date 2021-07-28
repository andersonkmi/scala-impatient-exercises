package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RationalSpec extends AnyFlatSpec with Matchers {
  "The first rational" should "be like that" in {
    val firstRational = new Rational(1, 2)
    firstRational.numer shouldEqual 1
    firstRational.denom shouldEqual 2
  }

  "When 1/2 lessThan 2/3" should "be true" in {
    val firstRational = new Rational(1, 2)
    val secondRational = new Rational(2, 3)

    firstRational lessThan secondRational shouldBe true
  }
}
