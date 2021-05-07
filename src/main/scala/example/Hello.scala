package example

import example.FileOperations._

object Hello extends App {
  val data = readFile("src/resources/data.txt")
  data.foreach(println)
}
