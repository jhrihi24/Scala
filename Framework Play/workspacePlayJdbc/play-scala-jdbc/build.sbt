name := """play-scala-jdbc"""
organization := "com.ceiba.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)


scalaVersion := "2.11.0"

libraryDependencies += guice
libraryDependencies += evolutions
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test

//JDBC
libraryDependencies += jdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

//CACHE
libraryDependencies ++= Seq(
  ehcache
)
libraryDependencies ++= Seq(
  cacheApi
)
libraryDependencies += jcache
libraryDependencies += "org.jsr107.ri" % "cache-annotations-ri-guice" % "1.0.0"
