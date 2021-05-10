package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import example.Parser._
import java.sql.Date

class HelloSpec extends AnyFlatSpec with Matchers  {
  "Date parser" should "convert date correctly" in {
   assert(parseDate("2010-01-01").isDefined)
  }

  it should "return None when provided an invalid date" in {
    parseDate("01-01-2010") shouldEqual None
  }

  "Age getter" should "correctly be found for past dates" in {
    val date = Date.valueOf("2010-01-01")

    // val yearsAgo 
    ageGetter(date, 2021) shouldEqual Some(11)
  }

  it should "return None if negative (not born)" in {
    val date = Date.valueOf("2031-01-01")

    // val yearsAgo 
    ageGetter(date, 2021) shouldEqual None
  }


}
