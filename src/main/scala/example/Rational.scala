package example

import scala.annotation.tailrec
import scala.language.implicitConversions

class Rational (numerator: Int, denominator: Int) {
  require(denominator != 0)

  private val commonDenominator: Int = gcd(numerator.abs, denominator.abs)

  val numer: Int = numerator / commonDenominator
  val denom: Int = denominator / commonDenominator

  def this(numerator: Int) = this(numerator, 1)

  override def toString: String = numer + "/" + denom

  def + (that: Rational): Rational = {
    new Rational (numer * that.denom + denom * that.numer,
                  denom * that.denom)
  }

  def + (that: Int): Rational = {
    new Rational (numer + denom * that, denom)
  }

  def * (that: Rational): Rational = {
    new Rational( numer * that.numer, denom * that.denom)
  }

  def lessThan(that: Rational): Boolean = this.numer * that.denom < this.denom * that.numer

  def max(that: Rational): Rational = if (lessThan(that)) that else this

  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}
