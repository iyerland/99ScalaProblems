name := "99ProblemsScala"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.scalatest"  %  "scalatest_2.10"  %  "2.2.4"
)

fork := true

javaOptions += "-Xmx4G"

scalariformSettings