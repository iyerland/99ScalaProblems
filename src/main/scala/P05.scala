import scala.annotation._

// Reverse a list.
// reverse(List(1, 1, 2, 3, 5, 8)) = List(8, 5, 3, 2, 1, 1)

object P05 {
  def reverse[A](ls: List[A]): List[A] = {
    @tailrec def loop[A](xs: List[A], acc: List[A]): List[A] = xs match {
      case Nil => acc
      case h :: t => loop(t, h :: acc)
    }
    loop(ls, Nil)
  }
}