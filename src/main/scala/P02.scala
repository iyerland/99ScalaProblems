import scala.annotation._

// Find the last but one element of a list.
// penultimate(List(1, 1, 2, 3, 5, 8)) = 5

object P02 {
  @tailrec def penultimate[A](ls: List[A]): A = ls.size match {
    case x if x > 2 => penultimate(ls.tail)
    case x if x == 2 => ls.head
    case _ => throw new IllegalArgumentException
  }

  @tailrec def penultimate1[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate1(tail)
    case _ => throw new IllegalArgumentException
  }
}