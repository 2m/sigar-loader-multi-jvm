object Main extends App {
  kamon.sigar.SigarProvisioner.provision()
  val sigar = new org.hyperic.sigar.Sigar()

  while (true) {
    val cpu = sigar.getCpuPerc
    println(s"CPU: $cpu")
    Thread.sleep(1000)
  }
  scala.io.StdIn.readLine()
}
