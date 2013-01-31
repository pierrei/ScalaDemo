package com.prezi.scala.demo.m

import actors.Actor

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object ActorExample extends App {

  abstract class PingMessage
  case object Start extends PingMessage
  case object SendPing extends PingMessage
  case object Pong extends PingMessage

  abstract class PongMessage
  case object Ping extends PongMessage
  case object Stop extends PongMessage

  val server = new Server
  val client = new Client(100000, server)
  client.start()
  server.start()
  client ! Start

  class Client(count: Int, pong: Actor) extends Actor {
    def act() {
      println("Ping: Initializing with count %s: %s".format(count, pong))
      var pingsLeft = count
      loop {
        react {
          case Start =>
            println("Ping: starting.")
            pong ! Ping
            pingsLeft = pingsLeft - 1
          case SendPing =>
            pong ! Ping
            pingsLeft = pingsLeft - 1
          case Pong =>
            if (pingsLeft % 1000 == 0)
              println("Ping: pong from: %s".format(sender))
            if (pingsLeft > 0)
              this ! SendPing
            else {
              println("Ping: Stop.")
              pong ! Stop
              exit('stop)
            }
        }
      }
    }
  }

  class Server extends Actor {
    def act() {
      var pongCount = 0
      loop {
        react {
          case Ping =>
            if (pongCount % 1000 == 0)
              println("Pong: ping %s from %s".format(pongCount, sender))
            sender ! Pong
            pongCount = pongCount + 1
          case Stop =>
            println("Pong: Stop.")
            exit('stop)
        }
      }
    }
  }
}
