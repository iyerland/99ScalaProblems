import scala.annotation._

// Find the last element of a list.
// last(List(1, 1, 2, 3, 5, 8)) = 8

object P01 {
  @tailrec def last[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: t => last(t)
    case _ => throw new IllegalArgumentException
  }
}