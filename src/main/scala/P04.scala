import scala.annotation._

// Find the number of elements of a list.
// length(List(1, 1, 2, 3, 5, 8)) = 6

object P04 {
  def length[A](ls: List[A]): Int = {
    @tailrec def loop[A](xs: List[A], acc: Int): Int = xs match {
      case Nil => acc
      case h :: t => loop(t, acc + 1)
    }
    loop(ls, 0)
  }
}