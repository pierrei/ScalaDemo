package com.prezi.scala.demo.a.extra

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object ClassVsObject {
  class Point(val x: Double, val y: Double,
              addToGrid: Boolean = false
             ) {
    import Point._

    if (addToGrid)
      grid.add(this)

    def this() {
      this(0.0, 0.0)
    }

    def distanceToPoint(other: Point) =
      distanceBetweenPoints(x, y, other.x, other.y)
  }

  object Point {
    private val grid = new Grid()

    def distanceBetweenPoints(x1: Double, y1: Double,
                              x2: Double, y2: Double) = {
      val xDist = x1 - x2
      val yDist = y1 - y2
      math.sqrt(xDist*xDist + yDist*yDist)
    }
  }

  class Grid {
    var points: List = List()
    def add(p: Point) {
      points ::= p
    }
  }
}
