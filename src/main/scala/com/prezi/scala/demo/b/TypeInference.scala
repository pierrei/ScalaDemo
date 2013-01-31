package com.prezi.scala.demo.b

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object TypeInference extends App {
  val x = 1 + 2 * 3
  val y = x.toString
  def successor(x: Int) = x + 1

  println(x.getClass)
  println(y.getClass)
  println(successor(3).getClass)
}
