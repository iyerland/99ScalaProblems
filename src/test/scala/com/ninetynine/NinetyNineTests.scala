package com.ninetynine

import Solution._

class NinetyNineTests extends org.scalatest.funsuite.AnyFunSuite {

  test("P01: Find the last element of a list.") {
    val lst = last(List(1, 1, 2, 3, 5, 8))
    assert(lst === 8)
  }

  test("P01: Find the last element of a list(of one element).") {
    val lst = last(List(1))
    assert(lst === 1)
  }

  test("P01: Find the last element of an empty list.") {
    intercept[IllegalArgumentException] {
      last(List.empty[Int])
    }
  }

  test("Find the last but one element of a list.") {
    val pen = penultimate(List(1, 1, 2, 3, 5, 8))
    assert(pen === 5)
  }

  test("P02: Find the last but one element of a list.") {
    intercept[IllegalArgumentException] {
      penultimate(List.empty[Int])
    }
  }

  test("P03: Find the Kth element of a list.") {
    val n = nth(2, List(1, 1, 2, 3, 5, 8))
    assert(n === 2)
  }

  test("P04: Find the number of elements of a list.") {
    val len = length(List(1, 1, 2, 3, 5, 8))
    assert(len === 6)
  }

  test("P05: Reverse a list.") {
    val rev = reverse(List(1, 1, 2, 3, 5, 8))
    assert(rev === List(8, 5, 3, 2, 1, 1))
  }

  test("P06: Find out whether a list is a palindrome.") {
    val isPal = isPalindrome(List(1, 1, 2, 3, 5, 8))
    assert(isPal === false)
  }

  test("P07: Flatten a nested list structure.") {
    val flattened = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    assert(flattened === List(1, 1, 2, 3, 5, 8))
  }
}
