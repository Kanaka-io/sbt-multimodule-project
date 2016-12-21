import sbt._

/**
  * Here we declare "bundles" of dependencies used across the project
  */
trait Dependencies {

  val scalatest = Seq(
    "org.scalatest" %% "scalatest"  % "3.0.0" % Test
  )

  val spark = Seq(
    "org.apache.spark" %% "spark-core"      % "2.0.1",
    "org.apache.spark" %% "spark-streaming" % "2.0.1",
    "org.apache.spark" %% "spark-mllib"     % "2.0.1"
  )

}