package controllers

import play.api.mvc.{Action, Controller}

class RaffleController extends Controller {

  def test = Action {
    Ok("Hello")
  }
}