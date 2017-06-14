package tests.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

val httpProtocol = http
   .baseURL("http://")

  // parse load profile from Taurus

  val concurrency = Integer.getInteger("concurrency", 1).toInt

  val holdFor = Integer.getInteger("hold-for", 20).toInt


 val test = scenario("test taurus")
  .exec(AuthHelper.authenticate)
  .exec(Helper.createUser)

  setUp(test.inject(constantUsersPerSec(concurrency) during (holdFor seconds))).protocols(httpProtocol)

}
