package com.prezi.scala.demo.a

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object AFirstExample {
  def mathFunction(num: Int): Int = {
    var numSquare: Int = num * num

    return (math.cbrt(numSquare) + math.log(numSquare)).asInstanceOf[Int]
  }

  def main(args: Array[String]) {
    Console.println(mathFunction(10))
  }
}
