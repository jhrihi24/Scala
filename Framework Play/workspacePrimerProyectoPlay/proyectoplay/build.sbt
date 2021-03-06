name := """proyectoPlay"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)


scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test
libraryDependencies += "com.typesafe" % "config" % "1.3.2"

//Habilitacion de Play WS
libraryDependencies += ws

//Habilitacion de la cache
libraryDependencies += ehcache


