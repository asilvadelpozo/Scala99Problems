package lists.easy

import java.util.NoSuchElementException

/**
 * This class try to solve Problem 2 from the 99 Scala Problems: Find the last but one element of a list.
 *     Example:
 *     scala> penultimate(List(1, 1, 2, 3, 5, 8))
 *     res0: Int = 5
 */

object Problem2 {
  def penultimate[A](list: List[A]):A =
    if(list.isEmpty) throw new NoSuchElementException
    else list.init.last
}
