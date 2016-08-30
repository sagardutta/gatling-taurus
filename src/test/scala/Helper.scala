package tests.gatling
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Helper extends Configuration {
  val uri = getConfigValue("uri")
  val run = exec(http(session => "test run")
      .post(session => uri)
      .body(ELFileBody("json/test.json")).asJSON
      .check(status.is(200))
    )
}
