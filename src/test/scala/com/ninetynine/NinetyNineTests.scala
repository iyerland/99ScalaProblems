package com.ninetynine

import Solution._

class NinetyNineTests extends org.scalatest.funsuite.AnyFunSuite {

  test("P01: last(List(1, 1, 2, 3, 5, 8)) === 8") {
    val lst = last(List(1, 1, 2, 3, 5, 8))
    assert(lst === 8)
  }

  test("P01: last(List of one element) === same element") {
    val lst = last(List(1))
    assert(lst === 1)
  }

  test("P01: last(List.empty) === IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      last(List.empty[Int])
    }
  }

  test("P02: penultimate(List(1, 1, 2, 3, 5, 8)) === 5") {
    val pen = penultimate(List(1, 1, 2, 3, 5, 8))
    assert(pen === 5)
  }

  test("P02: penultimate(List of two elements) === first/head element") {
    val pen = penultimate(List(1, 5))
    assert(pen === 1)
  }

  test("P02: penultimate(List.empty) === IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      penultimate(List.empty[Int])
    }
  }

  test("P02: penultimate1(List(1, 1, 2, 3, 5, 8)) === 5") {
    val pen = penultimate1(List(1, 1, 2, 3, 5, 8))
    assert(pen === 5)
  }

  test("P02: penultimate1(List of two elements) === first/head element") {
    val pen = penultimate1(List(1, 5))
    assert(pen === 1)
  }

  test("P02: penultimate1(List.empty) === IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      penultimate1(List.empty[Int])
    }
  }

  test("P03: nth(2, List(1, 1, 2, 3, 5, 8)) === 2") {
    val n = nth(2, List(1, 1, 2, 3, 5, 8))
    assert(n === 2)
  }

  test("P04: length(2, List(1, 1, 2, 3, 5, 8)) === 6") {
    val len = length(List(1, 1, 2, 3, 5, 8))
    assert(len === 6)
  }

  test("P05: reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1)") {
    val rev = reverse(List(1, 1, 2, 3, 5, 8))
    assert(rev === List(8, 5, 3, 2, 1, 1))
  }

  test("P06: isPalindrome(List(1, 1, 2, 3, 5, 8)) = false") {
    val isPal = isPalindrome(List(1, 1, 2, 3, 5, 8))
    assert(isPal === false)
  }

  test("P06: isPalindrome(List(1, 1, 2, 3, 2, 1, 1)) = true") {
    val isPal = isPalindrome(List(1, 1, 2, 3, 2, 1, 1))
    assert(isPal === true)
  }
}
