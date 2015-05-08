import org.scalatest.{ BeforeAndAfter, FunSuite }

class NinetyNineTests extends FunSuite {

  test("P01: last(List(1, 1, 2, 3, 5, 8)) === 8") {
    val lst = P01.last(List(1, 1, 2, 3, 5, 8))
    assert(lst === 8)
  }

  test("P01: last(List of one element) === same element") {
    val lst = P01.last(List(1))
    assert(lst === 1)
  }

  test("P01: last(List.empty) === IllegalArgumentException") {
    val thrown = intercept[IllegalArgumentException] {
      P01.last(List.empty[Int])
    }
  }

  test("P02: penultimate(List(1, 1, 2, 3, 5, 8)) === 5") {
    val pen = P02.penultimate(List(1, 1, 2, 3, 5, 8))
    assert(pen === 5)
  }

  test("P02: penultimate(List of two elements) === first/head element") {
    val pen = P02.penultimate(List(1, 5))
    assert(pen === 1)
  }

  test("P02: penultimate(List.empty) === IllegalArgumentException") {
    val thrown = intercept[IllegalArgumentException] {
      P02.penultimate(List.empty[Int])
    }
  }

  test("P02: penultimate1(List(1, 1, 2, 3, 5, 8)) === 5") {
    val pen = P02.penultimate1(List(1, 1, 2, 3, 5, 8))
    assert(pen === 5)
  }

  test("P02: penultimate1(List of two elements) === first/head element") {
    val pen = P02.penultimate1(List(1, 5))
    assert(pen === 1)
  }

  test("P02: penultimate1(List.empty) === IllegalArgumentException") {
    val thrown = intercept[IllegalArgumentException] {
      P02.penultimate1(List.empty[Int])
    }
  }

  test("P03: nth(2, List(1, 1, 2, 3, 5, 8)) === 2") {
    val n = P03.nth(2, List(1, 1, 2, 3, 5, 8))
    assert(n === 2)
  }

  test("P04: length(2, List(1, 1, 2, 3, 5, 8)) === 6") {
    val len = P04.length(List(1, 1, 2, 3, 5, 8))
    assert(len === 6)
  }

  test("P05: reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1)") {
    val rev = P05.reverse(List(1, 1, 2, 3, 5, 8))
    assert(rev === List(8, 5, 3, 2, 1, 1))
  }

  test("P06: isPalindrome(List(1, 1, 2, 3, 5, 8)) = false") {
    val isPal = P06.isPalindrome(List(1, 1, 2, 3, 5, 8))
    assert(isPal === false)
  }

  test("P06: isPalindrome(List(1, 1, 2, 3, 2, 1, 1)) = true") {
    val isPal = P06.isPalindrome(List(1, 1, 2, 3, 2, 1, 1))
    assert(isPal === true)
  }
}