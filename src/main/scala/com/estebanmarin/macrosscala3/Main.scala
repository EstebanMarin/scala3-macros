package com.estebanmarin
package macrosscala3

@main def Main(args: String*): Unit =
  println("─" * 100)
  println("hello world")
  inline val pi = 3.1415
  class Logger:
    def log(x: Any): Unit = println(x)
  class RefinedLogger extends Logger:
    override def log(x: Any): Unit = println("Any: " + x)
    def log(x: String): Unit = println("String: " + x)
  inline def logged[T](logger: Logger, x: T): Unit =
    logger.log(x)

  logged(new RefinedLogger, "✔️")
  println("─" * 100)
