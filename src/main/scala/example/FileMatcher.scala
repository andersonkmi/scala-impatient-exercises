package example

import java.io.File

object FileMatcher {
  private def filesHere: Array[File] = (new File(".")).listFiles

  private def filesMatching(matcher: String => Boolean): Array[File] =
    for (file <- filesHere; if matcher(file.getName))
      yield file

  def filesEnding(query: String): Array[File] =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String): Array[File] =
    filesMatching(_.contains(query))

  def filesRegex(query: String): Array[File] =
    filesMatching(_.matches(query))

  def main(args: Array[String]): Unit = {
    println("FileMatcher.filesEnding(\"scala\").toList [" +
      FileMatcher.filesEnding("scala").toList + "]")
    println("FileMatcher.filesContaining(\"Files1\").toList [" +
      FileMatcher.filesContaining("Files1").toList + "]")
    println("FileMatcher.filesRegex(\".*Re.ex.*\").toList [" +
      FileMatcher.filesRegex(".*Re.ex.*").toList + "]")
  }
}
