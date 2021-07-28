package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RationalSpec extends AnyFlatSpec with Matchers {
  "The first rational" should "be like that" in {
    val firstRational = new Rational(1, 2)
    firstRational.numer shouldEqual 1
    firstRational.denom shouldEqual 2
  }
}
