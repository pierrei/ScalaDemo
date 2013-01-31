package com.prezi.scala.demo.e

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object PatternMatching extends App {
  def matchTest(x: Int): String =
    x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }

  println(matchTest(3))
}
