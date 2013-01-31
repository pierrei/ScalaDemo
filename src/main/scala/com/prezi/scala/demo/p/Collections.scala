package com.prezi.scala.demo.p

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object Collections extends App {
  val shots = Map(
    "id1" -> "palinka",
    "id2" -> "unicum"
  )

  val beer = List("soproni", "dreher")

  beer map (x => x.capitalize) foreach (x => println("I like %s".format(x)))

  beer zip shots.values foreach((x => println("Please combine %s with %s!".format(x._1, x._2))))
}
