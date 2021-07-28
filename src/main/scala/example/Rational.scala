package example

class Rational (numerator: Int, denominator: Int) {
  require(denominator != 0)
  val numer: Int = numerator
  val denom: Int = denominator

  override def toString: String = numer + "/" + denom

  def add (that: Rational): Rational = {
    new Rational (numer * that.denom + denom * that.numer,
                  denom * that.denom)
  }

  def lessThan(that: Rational): Boolean = {
    false
  }
}
