package tests.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

  // parse load profile from Taurus

  val concurrency =  System.getProperty("concurrency","1").toDouble
  val holdFor = Integer.getInteger("hold-for",1).toInt


 val test = scenario("Create User")
  .exec(AuthHelper.authenticate)
  .exec(Helper.createUser)

  setUp(test.inject(constantUsersPerSec(concurrency) during (holdFor seconds)))

}
