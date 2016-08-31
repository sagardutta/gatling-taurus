##Project setup

* BasicTest uses Helper to run a simulation
* Helper can use multiple other scala scripts to setup test data and get ready for the test
* Under the resources folder we have a conf file which contains env configs and couple of json files which will be sent as requests
* I need help running this simple setup in blazemeter using taurus config

## How to run the test

* sbt test

## How to create a uber jar with all the scala files and the dependent jars

* sbt package
