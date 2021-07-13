package example

import scala.io.StdIn

object ScalaIO {
  def main(args: Array[String]) : Unit = {
    val name = StdIn.readLine("Your name: ")
    print("Your age: ")
    val age = StdIn.readInt()
    println(s"Hello, ${name}! Next year you will be ${age + 1}.")
  }
}
