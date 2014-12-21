package lists.easy

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for problem 5.
 */
class Problem5Spec extends FlatSpec with Matchers {

  val p5 = Problem5

  "A list" should "be able to be reversed to matter its type" in {
    val notEmptyListInt = List(1, 2, 3, 4, 5)
    p5.reverse(notEmptyListInt) should be (List(5, 4, 3, 2, 1))

    val notEmptyListString = List("This", "is", "a", "test", "String")
    p5.reverse(notEmptyListString) should be (List("String", "test", "a", "is", "This"))
  }

  it should "return Nil if list is empty and we call reverse" in {
    val emptyList = Nil
    p5.reverse(emptyList) should be (Nil)
  }

}
