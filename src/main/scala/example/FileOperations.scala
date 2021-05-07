package example

import java.io.{BufferedWriter, File, FileWriter}
import scala.io.Source

object FileOperations {
  def findFiles(directory: String, filename: String): List[String] = {
    val files = new File(directory).listFiles.toList
    val buildFiles = files.filter(_.getName == filename).map(_.toString)
    buildFiles ++ files.filter(_.isDirectory).flatMap(file => findBuildFiles(file.toString))
  }
  def findBuildFiles(directory: String): List[String] =
    findFiles(directory, "build.gradle")
  def readFile(filename: String): List[String] = {
    val bufferedSource = Source.fromFile(filename)
    val content = bufferedSource.getLines().toList
    bufferedSource.close
    content
  }
  def writeFile(filename: String, content: String): Unit = {
    val file = new File(filename)
    val bufferedWriter = new BufferedWriter(new FileWriter(file))
    bufferedWriter.write(content)
    bufferedWriter.close()
  }
  def writeFile(filename: String, content: Seq[String]): Unit =
    writeFile(filename, content.mkString("", "\n", "\n"))
}