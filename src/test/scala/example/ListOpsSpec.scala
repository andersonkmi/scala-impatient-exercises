package example

import example.ListOps.{append, isort}
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

  "List(2, 4) append List(22, 20)" should "return List(2, 4, 22, 20)" in {
    val list1 = List(2, 4)
    val list2 = List(22, 20)

    val expected = List(2, 4, 22, 20)
    val result: List[Int] = append[Int](list1, list2)

    result shouldEqual expected
  }
}
