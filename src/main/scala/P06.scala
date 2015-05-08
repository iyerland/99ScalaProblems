import scala.annotation._

// Find out whether a list is palindrome.
// isPalindrome(List(1, 1, 2, 3, 2, 1, 1)

object P06 {
  def isPalindrome[A](ls: List[A]): Boolean = if (ls.size % 2 == 0) false else ls == ls.reverse
}