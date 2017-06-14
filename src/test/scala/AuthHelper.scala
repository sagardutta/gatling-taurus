package tests.gatling
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object AuthHelper extends Configuration {
  val authenticate_uri = getConfigValue("authenticate_uri")
  val authenticate = exec(http(session => "authenticate")
    .post(session => authenticate_uri)
    .header("api-key","api-secret")
    .check(status.is(200))
  )
}
