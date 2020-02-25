package oop.platformer.states
import oop.platformer.Player

abstract class State(theplayer : Player) {

  def duck()

  def standStill()

  def run()

  def jumpHeight() : Int

  def movementSpeed() : Int

}
