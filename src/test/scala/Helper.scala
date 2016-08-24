package tests.gatling
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Helper {
  val run = exec(http(session => "test run")
      .get(session => s"http://google.com")
      .check(status.is(200))  
    )
}