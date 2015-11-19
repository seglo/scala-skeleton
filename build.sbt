lazy val `scala-skeleton` = (project in file(".")).
  settings(
    name := "scala-skeleton",
    version := "1.0",
    scalaVersion := "2.11.7",
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-core" % "3.6" % "test"
    )
  )
