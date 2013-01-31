package com.prezi.scala.demo.a

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object AnonymousFunction extends App {
  val list = List(1, 2, 3, 4)

  val result1 = list.reduceLeft( (x, y) => x + y )

  val result2 = list.reduceLeft( _ + _ )

  println("First result: %s".format(result1))
  println("Second result: %s".format(result2))
}
