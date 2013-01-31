package com.prezi.scala.demo.f

/**
 * @author Pierre Ingmansson (pierre.ingmansson@prezi.com)
 */
object LogCaseClassExample extends App {

  abstract class LogMessage

  case class StringMessage(message:String) extends LogMessage
  case class ExceptionMessage(ex:Throwable) extends LogMessage
  case class BothMessage(message:String, ex:Throwable) extends LogMessage

  class Logger {
    def debug(l:LogMessage) = log(10,l)
    def info(l:LogMessage) = log(5,l)
    def error(l:LogMessage) = log(1,l)

    def log(level:Int, l:LogMessage) {
      l match {
        case StringMessage(msg) => println(msg)
        case ExceptionMessage(ex: Error) => ex.printStackTrace()
        case ExceptionMessage(ex) if level < 5 => ex.printStackTrace()
        case ExceptionMessage(ex) => println(ex.toString)
        case BothMessage(msg, ex) => {
          log(level, StringMessage(msg + "with exception:"))
          log(level, ExceptionMessage(ex))
        }
      }
    }
  }

}
