package oop.platformer.states
import oop.platformer.Player

class DuckingState(theplayer : Player) extends State(theplayer) {

  override def duck(): Unit = {
    theplayer.state = this
  }
  override def standStill(): Unit = {
    theplayer.state = new StandingState(theplayer)
  }

  override def jumpHeight(): Int = {
    4
  }
  override def movementSpeed(): Int = {
    1
  }

  override def run(): Unit = {
  }
}