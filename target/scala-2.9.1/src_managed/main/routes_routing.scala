// @SOURCE:/Users/jasonalexander/Dropbox/development/java/base-db-app/conf/routes
// @HASH:74c0510ae9968b74cb0da6c32bda21228cb58566
// @DATE:Tue Jul 15 21:29:08 PDT 2014

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Base_test0 = Route("GET", PathPattern(List(StaticPart("/test"))))
                    
def documentation = List(("""GET""","""/test""","""controllers.Base.test()"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Base_test0(params) => {
   call { 
        invokeHandler(_root_.controllers.Base.test(), HandlerDef(this, "controllers.Base", "test", Nil))
   }
}
                    
}
    
}
                