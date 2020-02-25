package oop.platformer.states
import oop.platformer.Player

class StandingState(theplayer : Player) extends State(theplayer) {

  def standStill(): Unit = {
    theplayer.state = new StandingState(theplayer)
  }

  def duck(): Unit = {
    theplayer.state = new DuckingState(theplayer)
  }
  def run(): Unit = {
    //player.state = new RunningState(player)
    theplayer.state = new RunningState(theplayer)
  }
  def jumpHeight(): Int = {
    3
  }
  def movementSpeed(): Int = {
    5
  }
}
