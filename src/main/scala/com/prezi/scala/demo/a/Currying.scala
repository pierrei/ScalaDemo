package com.prezi.scala.demo.a

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object Currying extends App {
  def multiply(m: Int)(n: Int): Int = m * n

  println(multiply(2)(3))


  val timesTwo = multiply(2) _

  println(timesTwo(3))
}
