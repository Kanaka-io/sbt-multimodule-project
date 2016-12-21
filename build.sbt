import Projects._

// Global stuff

organization := "foo.bar"

version := "0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.8"


// Projects declarations
// Having them in a single file is handy to manage internal dependencies between modules

lazy val lib1 = library("lib1", file("libraries") / "lib1")

lazy val lib2 = library("lib2", file("libraries") / "lib2")

lazy val job1 = job("job1").dependsOn(lib1, lib2)