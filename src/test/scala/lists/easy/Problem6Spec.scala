package lists.easy

import org.scalatest.{Matchers, FlatSpec}

/**
 * Test class for Problem 6.
 */
class Problem6Spec extends FlatSpec with Matchers {

  val p6 = Problem6

  "A list" should "return true if it is itself a palindrome (even or odd), no matter the type of the list" in {
    val palindromeEvenListInt = List(1, 2, 3, 3, 2, 1)
    p6.isPalindrome(palindromeEvenListInt) should be (true)

    val palindromeOddListInt = List(1, 2, 3, 2, 1)
    p6.isPalindrome(palindromeOddListInt) should be (true)

    val palindromeEvenListString = List("This", "is", "palindrome", "palindrome", "is", "This")
    p6.isPalindrome(palindromeEvenListString) should be (true)

    val palindromeOddListString = List("This", "is", "palindrome", "is", "This")
    p6.isPalindrome(palindromeOddListString) should be (true)
  }

  it should "return false if it is not itself a palindrome (even or odd), no matter the type of the list" in {
    val notPalindromeListInt = List(1, 2, 3, 4, 5)
    p6.isPalindrome(notPalindromeListInt) should be (false)

    val notPalindromeListString = List("This", "is", "not", "a", "palindrome")
    p6.isPalindrome(notPalindromeListString) should be (false)
  }

  it should "return true palindrome if list is empty" in {
    val emptyList = Nil
    p6.isPalindrome(emptyList) should be (true)
  }

}
