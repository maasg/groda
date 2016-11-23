package controllers

import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}


class RaffleController extends Controller {

  def test = Action {
    Ok("{Hello")
  }

  def createRaffle(name : String) = Action { request =>
    Ok(Json.toJson(Map("result"->"ok")))
  }

  def addParticipant(id:String, username:String) = Action { request =>
    Ok(Json.toJson(Map("result"->s"added participant $username to raffle $id")))
  }

  def listParticipants(id:String) = Action {request =>
    Ok(Json.toJson(Map("result"->s"listing users for raffle $id")))
  }

}