package oop.platformer
import oop.platformer.states.{StandingState, State}

class Player {

  var state: State = new StandingState(this)

  def duck(): Unit = {
    this.state.duck()
  }

  def standStill(): Unit = {
    this.state.standStill()
  }

  def run(): Unit = {
    this.state.run()
  }

  def jumpHeight(): Int = {
    this.state.jumpHeight()
  }

  def movementSpeed(): Int = {
    this.state.movementSpeed()
  }
}
