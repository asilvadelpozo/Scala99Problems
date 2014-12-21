package lists.easy

/**
 * This class try to solve Problem 6 from the 99 Scala Problems: Find out whether a list is a palindrome.
 *     Example:
 *     scala> isPalindrome(List(1, 2, 3, 2, 1))
 *     res0: Boolean = true
 */
object Problem6 {
  def isPalindrome[A](list: List[A]):Boolean = list == list.reverse
}
