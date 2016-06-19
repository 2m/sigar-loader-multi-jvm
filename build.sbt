scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
  "io.kamon" % "sigar-loader" % "1.6.6-rev002"
)

enablePlugins(JavaAppPackaging)
