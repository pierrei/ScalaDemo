package com.prezi.scala.demo.i

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object NamedParameters extends App {
  def printName(first:String = "John", last:String = "Smith")  {
    println(first + " " + last)
  }

  printName("John", "Smith")
  printName(first = "John",last = "Smith")
  printName(last = "Smith",first = "John")
  printName(last = "Ingmansson")
}
