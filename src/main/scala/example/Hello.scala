package example

import example.FileOperations._

object Hello extends App {
  val data = readFile("src/resources/data.txt")
  data.foreach(println)

  /// 1. Parse to date, List[String] => List[Option[Date]]



  /// 2. Convert to age List[Option[Date]] => List[Option[Int]]



  /// 3. Get average age List[Option[Int]] => Int
}
