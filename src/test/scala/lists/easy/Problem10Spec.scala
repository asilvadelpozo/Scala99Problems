package lists.easy

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for Problem 10.
 */
class Problem10Spec extends FlatSpec with Matchers {

  val p10 = Problem10

  "A list" should "be able to be run-length encoded" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    p10.encode(list) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}
