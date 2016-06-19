object Main extends App {
  val sigar = new org.hyperic.sigar.Sigar()

  while (true) {
    val cpu = sigar.getCpuPerc
    println(s"CPU: $cpu")
    Thread.sleep(1000)
  }
  scala.io.StdIn.readLine()
}
