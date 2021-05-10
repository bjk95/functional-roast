package example

import java.sql.Date
import scala.util.Try

object Parser {
    val hello = "hello"

    def parseDate(dateString: String): Option[Date] = {
        Try(Date.valueOf(dateString)).toOption
    }

    def ageGetter(date: Date, currentYear: Int): Option[Int] = {
        val dateYear = date.getYear() + 1900
        if (dateYear <= currentYear) Some(currentYear - dateYear) else None
    }
}