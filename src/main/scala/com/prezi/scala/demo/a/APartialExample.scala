package com.prezi.scala.demo.a

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object APartialExample extends App {
  def adder(m: Int, n: Int) = m + n

  val add = adder(_, _)
  val add2 = adder(2, _:Int)

  println(add(1, 2))
  println(add2(5))
}
