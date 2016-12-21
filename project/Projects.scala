import sbt._

/**
  * Helper functions that create projects of specific "kinds"
  */
object Projects {

  def library(name: String, path: File): Project = Project(id = name, base = path).enablePlugins(Libraries)

  def library(name: String): Project = library(name, file(name))

  def job(name: String, path: File): Project = Project(id = name, base = path).enablePlugins(Jobs)

  def job(name: String): Project = job(name, file(name))
}