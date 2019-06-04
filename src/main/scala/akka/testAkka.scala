package akka

import akka.actor.{Actor, ActorSystem, Props}

class EchoServer extends Actor{
  override def receive: Receive = {
    case msg: String => println("Echo " + msg)
  }
}
object testAkka extends App{
  val system = ActorSystem("helloAkka")
  val echoServer = system.actorOf(Props[EchoServer])
  echoServer ! "Hello!"


}
