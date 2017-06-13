## Context

* This project helps with onboarding to a simple performance test suite built on top of Gatling DSL
* It explains the concept of scenarios, simulations, configuration and various aspects of Gatling at a very high level.
* The idea is to provide a playground which can be explored to get comfortable with Gatling.

## Project setup

* Gatling scripts are run using SBT (Scala Build Tool)
* BasicSimulation uses Helper to run a simulation
* Helper can use multiple other scala scripts to setup test data and get ready for the test
* Under the resources folder we have a conf file which contains env configs and couple of json files which can be used as payload for requests

## How to run the test

* sbt test (just to run everything with default values)
* sbt test -Dhold-for=10 -Dconcurrency=2 (to run the test for 10 sec and with a concurrency of 2)
