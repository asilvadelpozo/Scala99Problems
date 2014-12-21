package lists.easy

/**
 * This class try to solve Problem 3 from the 99 Scala Problems: Find the Nth element of a list.
 *     By convention, the first element in the list is element 0.
 *
 *     Example:
 *     scala> nth(2, List(1, 1, 2, 3, 5, 8))
 *     res0: Int = 2
 */

object Problem3 {
  def nth[A](list: List[A], nth: Int):A = list(nth)
}
