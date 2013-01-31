import com.github.retronym.SbtOneJar
import sbt._
import Keys._

object Build extends Build {
    override lazy val settings = super.settings ++ Seq(

        name := "democode",

        scalaVersion := "2.9.2",
        libraryDependencies ++= Seq(
            "com.lambdaworks" %% "jacks" % "2.1.0",
            "com.twitter" % "finagle-core" % "5.3.23",
            "com.twitter" % "finagle-http" % "5.3.23",
            "com.twitter" % "finagle-ostrich4" % "5.3.23",
            "com.twitter" % "ostrich" % "8.2.10",
            "com.typesafe" % "config" % "1.0.0",
            "ch.qos.logback" % "logback-classic" % "1.0.9" exclude("org.slf4j", "slf4j-log4j12"),
            "org.apache.thrift" % "libthrift" % "0.9.0",
            "org.jsoup" % "jsoup" % "1.7.1",
            "org.slf4j" % "slf4j-api" % "1.7.2",
            "org.slf4j" % "jul-to-slf4j" % "1.7.2",
            "org.specs2" %% "specs2" % "1.12.3" % "test",
            "org.mockito" % "mockito-all" % "1.9.0" % "test",
            "org.hamcrest" % "hamcrest-all" % "1.3",
            "junit" % "junit" % "4.9" % "test"
        ),
        exportJars := true,
        resolvers ++= Seq("Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
                        "Twitter repo" at "http://maven.twttr.com/"),

        testOptions in Test += Tests.Argument("junitxml", "console")
    )


    // the default project is the first alphabetically...
    lazy val root = Project("DemoCode", base = file(".")) settings(settings ++ SbtOneJar.oneJarSettings ++ Seq(mainClass in Compile in run := Some("com.prezi.scala.demo.Currying")): _*)

}

