package lists.medium

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for problem 7.
 */
class Problem7Spec extends FlatSpec with Matchers {

  val p7 = Problem7

  "A nested list" should "be able to be flatten with multi level nesting no matter its type" in {
    val multiLevelNestedListInt = List(List(1, 1), 2, List(3, List(5, 8)))
    p7.flatten(multiLevelNestedListInt) should be (List(1, 1, 2, 3, 5, 8))

    val multiLevelNestedListString = List(List("This", "is"), "a", List("Multilevel", List("nested", "list")))
    p7.flatten(multiLevelNestedListString) should be (List("This", "is", "a", "Multilevel", "nested", "list"))
  }

  it should "be able to be flatten with one level nesting no matter its type" in {
    val oneLevelNestedListInt = List(List(1, 2), List(3, 4), List(5))
    p7.flatten(oneLevelNestedListInt) should be (List(1, 2, 3, 4, 5))

    val oneLevelNestedListString = List(List("This", "is"), List("a", "test"), List("String"))
    p7.flatten(oneLevelNestedListString) should be (List("This", "is", "a", "test", "String"))

  }

  it should "be able to be flatten even if there is some empty list" in {
    val notEmptyListOfListsWithEmptyElementInt = List(List(1, 2), List(3, 4), List(5), Nil)
    p7.flatten(notEmptyListOfListsWithEmptyElementInt) should be (List(1, 2, 3, 4, 5))

    val notEmptyListOfListsWithEmptyElementString = List(List("This", "is"), List("a", "test"), List("String"), Nil)
    p7.flatten(notEmptyListOfListsWithEmptyElementString) should be (List("This", "is", "a", "test", "String"))
  }

  it should "return empty list if we try to flatten an empty list" in {
    val emptyList = Nil
    p7.flatten(emptyList) should be (Nil)
  }

}
