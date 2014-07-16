import sbt._
import Keys._
import PlayProject._
import de.johoop.jacoco4sbt.JacocoPlugin._

object ApplicationBuild extends Build {

    val appName         = "base-db-app"
    val appVersion      = "1.0-SNAPSHOT"

    lazy val s = Defaults.defaultSettings ++ Seq(jacoco.settings:_*)

    val appDependencies = Seq(
        "mysql"  % "mysql-connector-java" % "5.1.21",
        "com.madgag" % "util-diff" % "1.33",
        "commons-net" % "commons-net" % "3.3",
       "net.sf.opencsv" % "opencsv" % "2.3",
        "com.jcraft" % "jsch" % "0.1.50"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA, settings = s).settings(
        parallelExecution in jacoco.Config := false,
        jacoco.excludes in jacoco.Config := Seq(
          "controllers.javascript.*",
          "controllers.Reverse*",
          "controllers.ref.*",
          "controllers.rou*",
          "*Route*",
          "views.xml.authdotnet.*"
        )
    )

}
