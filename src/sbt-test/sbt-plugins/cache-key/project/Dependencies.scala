import org.allenai.plugins.CoreDependencies

import sbt._
import sbt.Keys._

/** Project-specific dependencies which extend CoreDependencies
  * so you can construct a single `Dependencies` object that can
  * be imported in other build files (such as build.sbt)
  */
object Dependencies extends CoreDependencies {
  val jodaTime = "joda-time" % "joda-time" % "2.4"
  val derby = "org.apache.derby" % "derby" % "10.4.1.3"
}
