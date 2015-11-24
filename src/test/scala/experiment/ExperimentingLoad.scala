/**
 * User: skapil
 * Date: 11/30/14
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
//package name
package experiment

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SearchGoogleLoad extends Simulation {

  val httpProtocol = http
    .baseURL("http://rc.live.test.cheggnet.com")
    .inferHtmlResources()
    .acceptHeader("""text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""")
    .acceptEncodingHeader("""gzip, deflate""")
    .acceptLanguageHeader("""en-US,en;q=0.5""")
    .connection("""keep-alive""")
    .contentTypeHeader("""application/x-www-form-urlencoded""")
    .userAgentHeader("""Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:35.0) Gecko/20100101 Firfox/35.0""")

  val header_tbs = Map("""Accept""" -> """image/png,image/*;q=0.8,*/*;q=0.5""")
  val url = """http://www.google.com"""

  val scn = scenario("Gatling_Search")
    .exec(http("request_gatling_search")
      .get(url + """/search?q=gatling"""))
    .pause(5)    //Real time pause

  setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)

}
