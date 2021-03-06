package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.language.implicitConversions

class RationalSpec extends AnyFlatSpec with Matchers {

  implicit def intToRational(number: Int): Rational = new Rational(number)

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

  "When 1/2 lessThan 1/2" should "be false" in {
    val firstRational = new Rational(1, 2)
    val secondRational = new Rational(1, 2)

    firstRational lessThan secondRational shouldBe false
  }

  "When 1/3 lessThan 1/2" should "be false" in {
    val firstRational = new Rational(1, 3)
    val secondRational = new Rational(1, 2)

    firstRational lessThan secondRational shouldBe true
  }

  "The second rational" should "be like that" in {
    val firstRational = new Rational(2)
    firstRational.numer shouldEqual 2
    firstRational.denom shouldEqual 1
  }

  "The third rational 2/4" should "be like that 1/2" in {
    val firstRational = new Rational(2, 4)
    firstRational.numer shouldEqual 1
    firstRational.denom shouldEqual 2
  }

  "1/2 + 1/2" should "be 1/1" in {
    val r1 = new Rational(1, 2)
    val r2 = new Rational(1, 2)
    val r3 = r1 + r2

    r3.numer shouldEqual 1
    r3.denom shouldEqual 1
  }

  "1/2 + 1" should "be 3/2" in {
    val r1 = new Rational(1, 2)
    val r3 = r1 + 1

    r3.numer shouldEqual 3
    r3.denom shouldEqual 2
  }

  "1 + 1/2" should "be 3/2" in {
    val r1 = new Rational(1, 2)
    val r3 = 1 + r1

    r3.numer shouldEqual 3
    r3.denom shouldEqual 2
  }
}
