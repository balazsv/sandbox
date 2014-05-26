package grex

import org.springframework.context.support.ClassPathXmlApplicationContext

object Main extends App {

  override def main(args: Array[String]) {
    println("hali")
    
    val ctx = new ClassPathXmlApplicationContext("beans.xml")
  }
}