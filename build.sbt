name := "calculator-service"

version := "0.1"

scalaVersion := "2.9.1"

resolvers ++= Seq(
  "Sonatype" at "http://oss.sonatype.org/content/repositories/public",
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "com.github.jdegoes" %% "blueeyes-core"  % "0.6.0",
  "com.github.jdegoes" %% "blueeyes-mongo" % "0.6.0",
  "com.github.jdegoes" %% "blueeyes-json"  % "0.6.0",
  "org.specs2"         %% "specs2"         % "1.8" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime"
)
