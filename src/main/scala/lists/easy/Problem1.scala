package lists.easy

/**
 * This class try to solve Problem 1 from the 99 Scala Problems: Find the last element of a list.
 *     Example:
 *     scala> last(List(1, 1, 2, 3, 5, 8))
 *     res0: Int = 8
 */

object Problem1 {
  def lastElement[A](list: List[A]): A = list.last
}
