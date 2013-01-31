package com.prezi.scala.demo.j

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object MixinWithTraits extends App {

  abstract class AbsIterator {
    type T
    def hasNext: Boolean
    def next: T
  }

  trait RichIterator extends AbsIterator {
    def foreach(f: T => Unit) { while (hasNext) f(next) }
  }

  class StringIterator(s: String) extends AbsIterator {
    type T = Char
    private var i = 0
    def hasNext = i < s.length()
    def next = { val ch = s charAt i; i += 1; ch }
  }

  class Iter extends StringIterator("Test string") with RichIterator
  val iter = new Iter
  iter foreach println
}
