package com.prezi.scala.demo.d

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object LazyEvaluation extends App {
  lazy val foo = { println("Evaluating foo now!") ; "bar" }

  println("foo variable accessible")
  println("Accessing value of foo: %s".format(foo))
}
