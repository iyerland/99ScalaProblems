import sbt._

lazy val NinetyNineProblemsScala = (project in file(".")).settings(
  name := "99ProblemsScala",
  organization := "iyer.land",
  version := "1.0",
  scalaVersion := "2.13.1"
  // add other settings here
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-encoding",
  "UTF-8",
  "-Xlint",
  "-Xverify",
  "-feature",
  "-Xfatal-warnings",
  "-language:_"
)

val scalaTestVersion = "3.1.1"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % scalaTestVersion % "test")
