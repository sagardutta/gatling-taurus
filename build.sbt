lazy val root = (project in file("."))
  .enablePlugins(GatlingPlugin)
  .settings(
    name := "OsimSvcGatlingSuite",
    version := "1.0",
    scalaVersion := "2.11.5"
  )

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7",
  "io.gatling" % "gatling-test-framework" % "2.1.7",
  "com.fasterxml.jackson.module" % "jackson-module-scala" % "2.1.2",
  "net.liftweb" % "lift-json_2.11" % "2.6",
  "junit" % "junit" % "4.11" % "test",
  "org.json" % "json" % "20141113"	
  
)