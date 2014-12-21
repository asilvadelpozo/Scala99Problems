package lists.easy

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for problem 4.
 */
class Problem4Spec extends FlatSpec with Matchers {

  val p4 = Problem4

  "A List" should "be able to retrieve its size no matter the type of the list" in {
    val notEmptyListInt = List(1, 2, 3, 4, 5)
    p4.size(notEmptyListInt) should be(5)

    val notEmptyListString = List("This", "is", "a", "test", "String")
    p4.size(notEmptyListString) should be(5)
  }

  it should "return 0 if list is empty" in {
    val emptyList = Nil
    p4.size(emptyList) should be (0)
  }

}
