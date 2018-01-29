package com.test.forJava

object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def timeFlies() {
    println("time flies like an arrow...")
  }
  
  def main(args: Array[String]) {
//    oncePerSecond { () => println("time flies like an arrow...") }
//    oncePerSecond(timeFlies)
    oncePerSecond( () =>
      println("time flies like an arrow..."))
  }
    
}