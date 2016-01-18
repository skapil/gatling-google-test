This project is simple example to do the load testing on google.com

it's using following Tehchnology:
gatling
maven
scala

Scenario which is being tested:
Go to google.com
Search for gatling
Load: 100 users will be performing above scenario.

To run the test use below command:
mvn clean test -Pexperimentload

If you need more information about the project and overview of gatling test,
please follow below link:
https://softwareautotest.wordpress.com/2015/11/05/gatling-for-performance-testing/

How to Setup the System: (I setup for mac and use brew to install everything)
 => Install Java(any latest version)
 => Install Scala (any latest Version)
 => Install maven(prefer version 3.0)
 => git clone https://github.com/skapil/gatling-google-test
 => cd experimenting
 => mvn clean test -Pexperimentload




[![Join the chat at https://gitter.im/skapil/gatling-google-test](https://badges.gitter.im/skapil/gatling-google-test.svg)](https://gitter.im/skapil/gatling-google-test?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)