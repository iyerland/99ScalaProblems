package com.ninetynine

import scala.annotation.tailrec

object Solution {

  /**
    *  Find the last element of a list.
    *  last(List(1, 1, 2, 3, 5, 8)) = 8
    */
  @tailrec def last[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: t   => last(t)
    case _        => throw new IllegalArgumentException
  }

  /**
    *  Find the last but one element of a list.
    *  penultimate(List(1, 1, 2, 3, 5, 8)) = 5
    */
  @tailrec def penultimate[A](ls: List[A]): A = ls.size match {
    case x if x > 2  => penultimate(ls.tail)
    case x if x == 2 => ls.head
    case _           => throw new IllegalArgumentException
  }

  @tailrec def penultimate1[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimate1(tail)
    case _             => throw new IllegalArgumentException
  }

  /**
    *  Find the nth element of a list.
    *  nth(2, List(1, 1, 2, 3, 5, 8)) = 2
    */
  @tailrec def nth[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (n, _ :: t) => nth(n - 1, t)
    case _           => println(n); throw new IllegalArgumentException
  }

  /**
    *  Find the number of elements of a list.
    *  length(List(1, 1, 2, 3, 5, 8)) = 6
    */
  def length[A](ls: List[A]): Int = {
    @tailrec def loop(xs: List[A], acc: Int): Int = xs match {
      case Nil    => acc
      case h :: t => loop(t, acc + 1)
    }
    loop(ls, 0)
  }

  /**
    *  Reverse a list.
    *  reverse(List(1, 1, 2, 3, 5, 8)) = List(8, 5, 3, 2, 1, 1)
    */
  def reverse[A](ls: List[A]): List[A] = {
    @tailrec def loop(xs: List[A], acc: List[A]): List[A] = xs match {
      case Nil    => acc
      case h :: t => loop(t, h :: acc)
    }
    loop(ls, Nil)
  }

  /**
    *  Find out whether a list is palindrome.
    *  isPalindrome(List(1, 1, 2, 3, 2, 1, 1)
    */
  def isPalindrome[A](ls: List[A]): Boolean =
    if (ls.size % 2 == 0) false else ls == ls.reverse

}
