package com.prezi.scala.demo.c

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object ListComprehension extends App {
  def even(from: Int, to: Int): List[Int] =
    for (i <- List.range(from, to) if i % 2 == 0) yield i

  println(even(0, 20))
}
