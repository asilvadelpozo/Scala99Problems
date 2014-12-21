package lists.easy

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for problem 3.
 */
class Problem3Spec extends FlatSpec with Matchers {

  val p3 = Problem3
  val nth = 3

  "A List" should "return the nth element if it has more than or n elements no matter the type of the List" in {

    val bigEnoughListInt = List(1, 2, 3, 4, 5)
    p3.nth(bigEnoughListInt, nth) should be (4)

    val bigEnoughListString = List("This", "is", "a", "test", "String")
    p3.nth(bigEnoughListString, nth) should be ("test")
  }

  it should "throw exception if it has not enough elements no matter the type of the list" in {
    val notBigEnoughListInt = List(1, 2)
    a [IndexOutOfBoundsException] should be thrownBy {
      p3.nth(notBigEnoughListInt, nth)
    }

    val notBigEnoughListString = List("Too", "short")
    a [IndexOutOfBoundsException] should be thrownBy {
      p3.nth(notBigEnoughListString, nth)
    }
  }

  it should "throw an exception if the List is empty" in {
    val emptyList = Nil
    a [IndexOutOfBoundsException] should be thrownBy {
      p3.nth(emptyList, nth)
    }
  }

  it should "throw an exception if nth is negative" in {
    val anyListInt = List(1, 2, 3, 4, 5)
    a [IndexOutOfBoundsException] should be thrownBy {
      p3.nth(anyListInt, -1)
    }
  }

}
