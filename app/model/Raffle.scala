package model

import model.Raffle.Outcome

/**
  * Created by Rutger Claes <rutger.claes@cegeka.be> on 23/11/16.
  */

sealed trait Raffle {

  def name:String

}

object Raffle {
  type Outcome = (String,String)
}

case class DraftRaffle( name:String, prizes:List[String] ) extends Raffle

case class ReadyToRunRaffle( name:String, prizes:List[String], people:List[String] ) extends Raffle {

  def run:(Outcome,Raffle) = ???

  def finish:FinishedRaffle = ???

}

case class FinishedRaffle( name:String, outcome:List[Outcome] ) extends Raffle