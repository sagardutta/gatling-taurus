package tests.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

val httpProtocol = http
   .baseURL("http://")

  // parse load profile from Taurus
  val iterations = Integer.getInteger("iterations", 100).toInt
  val concurrency = Integer.getInteger("concurrency", 1).toInt
  val rampUp = Integer.getInteger("ramp-up", 1).toInt
  val holdFor = Integer.getInteger("hold-for", 60).toInt
  val httpConf = http.baseURL("http://blazedemo.com/")




 val test = scenario("test taurus")
  .exec(Helper.run)

  setUp(test.inject(constantUsersPerSec(concurrency) during (holdFor seconds))).protocols(httpProtocol)

}
