package model

import play.api.libs.json.Json


trait Raffle {
  def name:String

}

case class RaffleInstance(name: String) extends Raffle
object RaffleInstance{
  implicit val raffleInstanceJson = Json.format[RaffleInstance]
}
