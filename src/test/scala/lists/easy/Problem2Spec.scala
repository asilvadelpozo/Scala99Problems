package lists.easy

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for problem 2.
 */
class Problem2Spec extends FlatSpec with Matchers {

  val p2 = Problem2

  "A list" should "return the penultimate element if it is not empty no matter the type of the List" in {
    val notEmptyListInt = List(1, 2, 3, 4, 5)
    p2.penultimate(notEmptyListInt) should be (4)

    val notEmptyListString = List("This", "is", "a", "test", "String")
    p2.penultimate(notEmptyListString) should be ("test")
  }

  it should "throw an exception if list has just one element no matter the type of the list" in {
    val justOneElementListInt = List(1)
    a [NoSuchElementException] should be thrownBy {
      p2.penultimate(justOneElementListInt)
    }

    val justOneElementListString = List("String")
    a [NoSuchElementException] should be thrownBy {
      p2.penultimate(justOneElementListString)
    }
  }

  it should "throw an exception if the List is empty" in {
    val emptyList = Nil
    a [NoSuchElementException] should be thrownBy {
      p2.penultimate(emptyList)
    }
  }

}
