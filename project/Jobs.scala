import sbt._, Keys._

/**
  * Configurations for projects of "kind" job
  */
object Jobs extends AutoPlugin with Dependencies {

  override def trigger: PluginTrigger = noTrigger

  override def projectSettings: Seq[Def.Setting[_]] = Seq(
    libraryDependencies ++= scalatest ++ spark
    // other fancy stuff here
    // basically everything that will be used in every project of the same kind
  )
}