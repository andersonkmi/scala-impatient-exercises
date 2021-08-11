package example

class LineElement (s: String) extends Element {
  val contents: Array[String] = Array(s)
  override def width: Int = s.length
  override def height: Int = 1

  override def demo(): Unit = {
    println("LineElement demo()")
  }
}
