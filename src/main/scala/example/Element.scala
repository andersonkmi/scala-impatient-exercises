package example

object Element {
  def elem(contents: Array[String]): Element = {
    new ArrayElement(contents)
  }

  def elem(s: String): Element = {
    new LineElement(s)
  }

  abstract class Element {
    def contents: Array[String]
    def height: Int = contents.length
    def width: Int = if (height == 0) 0 else contents(0).length

    def demo(): Unit = {
      println("Element demo()")
    }

    def above(that: Element): Element = {
      new ArrayElement(this.contents ++ that.contents)
    }

    def beside(that: Element): Element = {
      new ArrayElement(
        for (
          (line1, line2) <- this.contents.zip(that.contents)
        ) yield line1 + line2
      )
    }

    override def toString: String = contents mkString "\n"
  }

  private class ArrayElement(conts: Array[String]) extends Element {
    def contents: Array[String] = conts

    override def demo(): Unit = {
      println("ArrayElement demo()")
    }
  }

  private class LineElement (s: String) extends Element {
    val contents: Array[String] = Array(s)
    override def width: Int = s.length
    override def height: Int = 1

    override def demo(): Unit = {
      println("LineElement demo()")
    }
  }
}

