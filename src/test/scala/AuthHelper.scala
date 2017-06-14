package tests.gatling
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object AuthHelper extends Configuration {
  val authenticate_uri = getConfigValue("authenticate_uri")
  val authenticate = exec(http(session => "authenticate")
    .get(session => authenticate_uri)
    .check(status.is(200))
    .check(jsonPath("$.api-key").saveAs("api-key"))
  )
}
