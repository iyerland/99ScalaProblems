import scala.annotation._

// Find the nth element of a list.
// nth(2, List(1, 1, 2, 3, 5, 8)) = 2

object P03 {
  @tailrec def nth[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (n, _ :: t) => nth(n - 1, t)
    case _           => println(n) throw new IllegalArgumentException
  }
}