package com.prezi.scala.demo.t

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object Xml extends App {
  def page(name: String) =
    <html>
      <head>
        <title>Hello XHTML world</title>
      </head>
      <body>
        <h1>Hello world</h1>
        <p>Hello, { name }! <a href="scala-lang.org">Scala</a> talks XHTML</p>
      </body>
    </html>
  println(page("Pierre"))
}
