package com.prezi.scala.demo.g

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object Apply extends App {
  class Foo {
    override def toString: String = "A Foo instace; %s".format(this.hashCode())
  }

  object FooMaker {
     def apply() = new Foo
  }

  val foo = FooMaker()

  println(foo)
}
