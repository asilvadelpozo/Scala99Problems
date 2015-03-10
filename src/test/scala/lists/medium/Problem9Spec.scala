package lists.medium

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for problem 9.
 */
class Problem9Spec extends FlatSpec with Matchers {

  val p9 = Problem9

  "A list" should "be able to be packed" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    p9.pack(list) should be (List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

}
