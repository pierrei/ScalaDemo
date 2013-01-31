package com.prezi.scala.demo.l

import scala.actors
import actors.Futures._

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object FutureExample extends App {

  val f = future {
    println("Start: inside block")
    val s = System.currentTimeMillis
    while(System.currentTimeMillis < (s + 1000)) {
      // Simulate computation
    }
    println("Start: end of block")
    42
  }

  println("After future")
  println(f())
  println("The end")
}
