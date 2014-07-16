// @SOURCE:/Users/jasonalexander/Dropbox/development/java/base-db-app/conf/routes
// @HASH:74c0510ae9968b74cb0da6c32bda21228cb58566
// @DATE:Tue Jul 15 21:29:08 PDT 2014

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:6
package controllers {

// @LINE:6
class ReverseBase {
    


 
// @LINE:6
def test() = {
   Call("GET", "/test")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseBase {
    


 
// @LINE:6
def test = JavascriptReverseRoute(
   "controllers.Base.test",
   """
      function() {
      return _wA({method:"GET", url:"/test"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseBase {
    


 
// @LINE:6
def test() = new play.api.mvc.HandlerRef(
   controllers.Base.test(), HandlerDef(this, "controllers.Base", "test", Seq())
)
                              

                      
    
}
                            
}
                    
                