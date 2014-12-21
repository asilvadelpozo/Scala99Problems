package lists.easy

import org.scalatest.{Matchers, FlatSpec}

/**
 * Tests Class for Problem 1.
 */
class Problem1Spec extends FlatSpec with Matchers {

  val p1 = Problem1

  "A list" should "return the last element if it is not empty no matter the type of the List" in {

    val notEmptyListInt = List(1, 2, 3, 4, 5)
    p1.lastElement(notEmptyListInt) should be(5)

    val notEmptyListString = List("This", "is", "a", "test", "String")
    p1.lastElement(notEmptyListString) should be("String")
  }

  it should "throw an exception if the List is empty" in {
    val emptyList = Nil
    a [NoSuchElementException] should be thrownBy {
      p1.lastElement(emptyList)
    }
  }

}
