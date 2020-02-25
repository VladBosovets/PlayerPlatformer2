package oop.platformer.states
import oop.platformer._

class RunningState(theplayer : Player) extends State(theplayer) {

  override def standStill(): Unit = {
    theplayer.state = new StandingState(theplayer)
  }
  override def duck(): Unit = {
  }

  override def run(): Unit = {
    theplayer.state = this
  }
  override def jumpHeight(): Int = {
    6
  }

  override def movementSpeed(): Int = {
    12
  }
}
