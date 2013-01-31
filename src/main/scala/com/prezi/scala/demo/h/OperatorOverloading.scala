package com.prezi.scala.demo.h

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object OperatorOverloading extends App {
  class Complex(val real : Double, val imaginary : Double) {

    def +(that: Complex) =
      new Complex(this.real + that.real, this.imaginary + that.imaginary)

    def -(that: Complex) =
      new Complex(this.real - that.real, this.imaginary - that.imaginary)

    def unary_~ = math.sqrt(real * real + imaginary * imaginary)

    override def toString = real + " + " + imaginary + "i"
  }

  var a = new Complex(4.0,5.0)
  var b = new Complex(2.0,3.0)

  println(a)  // 4.0 + 5.0i
  println(a + b)  // 6.0 + 8.0i
  println(a - b)  // 2.0 + 2.0i

  println(~a)
}
