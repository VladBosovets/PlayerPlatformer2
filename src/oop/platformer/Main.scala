package oop.platformer

object Main {

  def main(args: Array[String]): Unit = {
    val vlad : Player = new Player()

    println(vlad.state)
    println(vlad.movementSpeed())
    vlad.run()
    println(vlad.state)
    println(vlad.movementSpeed())

  }
}
