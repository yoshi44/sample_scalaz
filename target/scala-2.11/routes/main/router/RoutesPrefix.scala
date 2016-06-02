
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yoshinihon/IdeaProjects/sample_scalaz/conf/routes
// @DATE:Fri Jun 03 06:10:36 JST 2016


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
