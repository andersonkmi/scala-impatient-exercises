package example

import example.ListOps.isort
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ListOpsSpec  extends AnyFlatSpec with Matchers {
  "This List(1)" should "return List(1)" in {
    val numbers = List(1)
    val result = isort(numbers)
    val expected = List(1)
    result shouldEqual expected
  }

  "This List(20, 11, 12, 4)" should "return List(4, 11, 12, 20)" in {
    val numbers = List(20, 11, 12, 4)
    val result = isort(numbers)
    val expected = List(4, 11, 12, 20)
    result shouldEqual expected
  }
}
