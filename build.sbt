name := "slick-testing"

mainClass in Compile := Some("SlickTest")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "org.slf4j" % "slf4j-nop" % "1.7.10",
  "com.h2database" % "h2" % "1.4.187",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.postgresql" % "postgresql" % "42.2.8"
)

fork in run := true
