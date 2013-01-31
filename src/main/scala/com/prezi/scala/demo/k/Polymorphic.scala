package com.prezi.scala.demo.k

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object Polymorphic extends App {
  def dup[T](x: T, n: Int): List[T] =
    if (n == 0) Nil
    else x :: dup(x, n - 1)

  println(dup[Int](2, 4))
  println(dup("three", 3))
}