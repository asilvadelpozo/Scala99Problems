package lists.medium

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for problem 8.
 */
class Problem8Spec extends FlatSpec with Matchers {

  val p8 = Problem8

  "A list" should "be able to be compressed" in {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      p8.compress(list) should be (List('a, 'b, 'c, 'a, 'd, 'e))
  }

}
