import Dependencies._

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.edsonpatricio"
ThisBuild / organizationName := "orderage"

lazy val slickVersion = "3.3.3"

lazy val root = (project in file("."))
  .settings(
    name := "order-age",
    libraryDependencies += scalaTest % Test,

    // General Dependencies
    libraryDependencies ++= Seq(
      "com.typesafe.slick" %% "slick" % slickVersion,
      "com.typesafe.slick" %% "slick-hikaricp" % slickVersion,
      "org.slf4j" % "slf4j-nop" % "1.6.4",
    ),

    // Test Dependencies
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.12",
      "org.scalatest" %% "scalatest" % "3.2.12" % "test",
      "org.scalatestplus" %% "mockito-4-5" % "3.2.12.0" % "test",
    ),
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
