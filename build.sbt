scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
  "org.fusesource" % "sigar" % "1.6.4",
  "org.fusesource" % "libsigar-amd64-linux" % "1.6.4" from "http://repo1.maven.org/maven2/org/fusesource/sigar/1.6.4/libsigar-amd64-linux-1.6.4.so"
)
classpathTypes += "so"

mappings in Universal := {
    (mappings in Universal).value.map {
      case (file, name) if file.getName contains "libsigar" => (file, "native/libsigar-amd64-linux.so")
      case other => other
    }
}

bashScriptExtraDefines += """addJava "-Djava.library.path=${app_home}/../native""""

enablePlugins(JavaAppPackaging)
