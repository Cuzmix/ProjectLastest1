
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ifeanyi/Documents/project-latest-version/conf/routes
// @DATE:Thu Apr 20 23:01:03 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
