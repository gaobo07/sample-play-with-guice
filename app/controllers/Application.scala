package controllers;

import javax.inject._
import play.api._
import play.api.mvc._
import services.RealGreetingService

class Application @Inject() extends Controller {



    val greetingService = new RealGreetingService

    def index =  Action{
        Ok(views.html.index(greetingService.greeting()))
    }

}
