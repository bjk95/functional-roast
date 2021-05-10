package example

import example.FileOperations._
import example.Parser._
import java.sql.Date

object Hello extends App {
  val data: List[String] = readFile("src/resources/data.txt")

  /// 1. Parse to date, List[String] => List[Option[Date]]
  val dates = data.map(parseDate)

  /// 2. Convert to age List[Option[Date]] => List[Option[Int]]
  val currentYear = new Date(System.currentTimeMillis()).getYear() + 1900

  val ages = dates.map(d => d.flatMap(ageGetter(_, currentYear)))
  // ages.foreach(println)

  /// 3. Get average age List[Option[Int]] => Int
  val length = ages.flatten.length
  val averageAge = ages.flatten.foldLeft(0)((x, y) => x + y) / length

  println(averageAge)

}
