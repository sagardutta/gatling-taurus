package tests.gatling
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Helper extends Configuration {
  val create_uri = getConfigValue("create_uri")

  val createUser = exec(http(session => "create user")
      .post(session => create_uri)
      .header("api-key",session => session("api-key").as[String])
      .body(ELFileBody("json/test.json")).asJSON
      .check(status.is(201))
    )

}
