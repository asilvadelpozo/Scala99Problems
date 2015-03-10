package lists.medium

/**
 * This class try to solve Problem 8 from the 99 Scala Problems: Eliminate consecutive duplicates of list elements.
 * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
 *    Example:
 *    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 *    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */
object Problem8 {

  def compress[A](ls: List[A]):List[A] = ls.foldLeft(List[A]()) { (partialResult, next) =>
    if (partialResult.isEmpty || partialResult.last != next) partialResult :+ next
    else partialResult
  }

}
