name := """groda"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

val circeVersion = "0.6.0"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "com.softwaremill.macwire" %% "macros" % "2.2.5",
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-generic-extras" % circeVersion,
  "io.circe" %% "circe-java8" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "org.scalatest"          %% "scalatest"          % "3.0.0" % Test,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)



