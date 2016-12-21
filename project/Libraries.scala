import sbt._, Keys._

/**
  * Configurations for projects of "kind" library
  */
object Libraries extends AutoPlugin with Dependencies {

  override def trigger: PluginTrigger = noTrigger

  override def projectSettings: Seq[Def.Setting[_]] = Seq(
    libraryDependencies ++= scalatest
  )
}