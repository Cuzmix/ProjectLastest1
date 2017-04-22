
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.Users,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String, user: models.users.Users)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.58*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link href="https://afeld.github.io/emoji-css/emoji.css" rel="stylesheet">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*25.50*/routes/*25.56*/.Assets.versioned("assets/css/main.css")),format.raw/*25.96*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*26.55*/routes/*26.61*/.Assets.versioned("images/favicon.png")),format.raw/*26.100*/("""">
    </head>
    <body>
            <!-- Page Wrapper -->
        <div id="page-wrapper">

                <!-- Page Wrapper -->
            <div id="page-wrapper">

                """),_display_(/*35.18*/if(title == "Home")/*35.37*/{_display_(Seq[Any](format.raw/*35.38*/("""
                        """),format.raw/*36.25*/("""<!--HOMEPAGE-->
                        <!-- Header -->
                    <header id="header" class="alt">
                        <h1><a href=""""),_display_(/*39.39*/routes/*39.45*/.HomeController.index()),format.raw/*39.68*/(""""><span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
                    </header>
                """)))}),format.raw/*44.18*/("""
                """),_display_(/*45.18*/if(title != "Home")/*45.37*/{_display_(Seq[Any](format.raw/*45.38*/("""
                        """),format.raw/*46.25*/("""<!--OTHER PAGE-->
                        <!-- Header -->
                    <header id="header">
                        <h1><a href=""""),_display_(/*49.39*/routes/*49.45*/.HomeController.index()),format.raw/*49.68*/(""""><span class="glyphicon glyphicon-book"></span>DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
                    </header>

                """)))}),format.raw/*55.18*/("""


                """),format.raw/*58.17*/("""<!-- Menu -->
            <nav id="menu">
                <div class="inner">
                    <h2>Menu</h2>
                    <ul class="links">
                        <li """),_display_(/*63.30*/if(title == "Home")/*63.49*/{_display_(Seq[Any](format.raw/*63.50*/("""class="active"""")))}),format.raw/*63.65*/("""><a href=""""),_display_(/*63.76*/routes/*63.82*/.HomeController.index()),format.raw/*63.105*/("""">Home</a></li>
                        <li """),_display_(/*64.30*/if(title == "About")/*64.50*/{_display_(Seq[Any](format.raw/*64.51*/("""class="active"""")))}),format.raw/*64.66*/("""><a href=""""),_display_(/*64.77*/routes/*64.83*/.HomeController.about()),format.raw/*64.106*/("""">About Us</a></li>
                        <li """),_display_(/*65.30*/if(title == "Products")/*65.53*/{_display_(Seq[Any](format.raw/*65.54*/("""class="active"""")))}),format.raw/*65.69*/(""">
                        """),_display_(/*66.26*/if(user != null)/*66.42*/ {_display_(Seq[Any](format.raw/*66.44*/("""
                            """),format.raw/*67.29*/("""<a href=""""),_display_(/*67.39*/routes/*67.45*/.HomeController.rent()),format.raw/*67.67*/("""">Products</a>
                        """)))}/*68.27*/else/*68.32*/{_display_(Seq[Any](format.raw/*68.33*/("""
                            """),format.raw/*69.29*/("""<a href=""""),_display_(/*69.39*/routes/*69.45*/.HomeController.products()),format.raw/*69.71*/("""">Products</a>
                        """)))}),format.raw/*70.26*/("""
                        """),format.raw/*71.25*/("""</li>
                        <li """),_display_(/*72.30*/if(title == "Sign Up")/*72.52*/{_display_(Seq[Any](format.raw/*72.53*/("""class="active"""")))}),format.raw/*72.68*/(""">
                        """),_display_(/*73.26*/if(user == null)/*73.42*/ {_display_(Seq[Any](format.raw/*73.44*/("""
                            """),format.raw/*74.29*/("""<a href=""""),_display_(/*74.39*/routes/*74.45*/.HomeController.signup()),format.raw/*74.69*/("""">Sign Up</a>
                        """)))}),format.raw/*75.26*/("""
                        """),format.raw/*76.25*/("""</li>
                        <li """),_display_(/*77.30*/if(title == "Login")/*77.50*/{_display_(Seq[Any](format.raw/*77.51*/("""class="active"""")))}),format.raw/*77.66*/(""">
                        """),_display_(/*78.26*/if(user != null)/*78.42*/{_display_(Seq[Any](format.raw/*78.43*/("""
                            """),format.raw/*79.29*/("""<li ><a href=""""),_display_(/*79.44*/routes/*79.50*/.HomeController.profile()),format.raw/*79.75*/("""">Profile</a></li>
                            <li><a href=""><p class="Navbar-FontStyle">Balance: """),_display_(/*80.82*/user/*80.86*/.getPoints()),format.raw/*80.98*/(""" """),format.raw/*80.99*/("""<span class="glyphicon glyphicon-bitcoin"></span></p></a></li>
                            <li ><a href=""""),_display_(/*81.44*/controllers/*81.55*/.security.routes.LoginController.logout()),format.raw/*81.96*/(""""><p class="Navbar-FontStyle">Logout """),_display_(/*81.134*/user/*81.138*/.getName()),format.raw/*81.148*/(""" """),format.raw/*81.149*/("""<span class="glyphicon glyphicon-log-in"></span></p></a></li>
                        """)))}/*82.27*/else/*82.32*/{_display_(Seq[Any](format.raw/*82.33*/("""
                            """),format.raw/*83.29*/("""<a href=""""),_display_(/*83.39*/controllers/*83.50*/.security.routes.LoginController.login()),format.raw/*83.90*/("""">Login</a>
                        """)))}),format.raw/*84.26*/("""
                    """),format.raw/*85.21*/("""</ul>
                    <a href="#" class="close">Close</a>
                </div>
            </nav>

            <div class="container-fluid">
                """),format.raw/*92.39*/("""
                """),_display_(/*93.18*/content),format.raw/*93.25*/("""
            """),format.raw/*94.13*/("""</div>
            <footer class="container-fluid">
                <section id="footer">
                    <div class="inner">
                        <h2 class="major">Get in touch</h2>
                        <p>Wish to become a student at Dublin's university of techology and gain access to sports events, college etc. Contact us below and we'll guide you on your way to success!! <i class="em em-ok_hand"></i> </p>


                        <table width="100%" border="1" cellspacing="5" cellpadding="1">
                            <tr>
                                <td width="70%" rowspan="5"><ul class="contact">
                                    <li class="fa-home">
                        Untitled Inc<br />
                                        1234 Somewhere Road Suite #2894
                                        <br />
                                        Nashville, TN 00000-0000
                    </li>
                                    <li class="fa-phone">(000) 000-0000
                                    </li>
                                </ul></td>
                                <td width="30%"><a href=""""),_display_(/*114.59*/routes/*114.65*/.HomeController.index()),format.raw/*114.88*/("""" style = "float: right;"> Home </a></td>
                            </tr>
                            <tr>
                                <td><a href=""""),_display_(/*117.47*/routes/*117.53*/.HomeController.about()),format.raw/*117.76*/("""" style = "float: right; padding-right: 10px">About Us</a></td>
                            </tr>
                            <tr>
                                <td><a href=""""),_display_(/*120.47*/routes/*120.53*/.HomeController.products()),format.raw/*120.79*/("""" style = "float: right;"> Products</a></td>
                            </tr>
                            <tr>
                                <td><a href=""""),_display_(/*123.47*/routes/*123.53*/.HomeController.signup()),format.raw/*123.77*/("""" style = "float: right;"> Sign up </a></td>
                            </tr>
                            <tr>
                                <td><a href=""""),_display_(/*126.47*/controllers/*126.58*/.security.routes.LoginController.login()),format.raw/*126.98*/("""" style = "float: right;"> Login </a></td>
                            </tr>
                        </table>

                        <ul class="copyright">
                            <li>&copy; Second Year Project</li>
                        </ul>
                    </div>
                </section>
            </footer>

            </div>
        </div>

    </body>

        <!-- Load JavaScript libs last -->
    <script src=""""),_display_(/*143.19*/routes/*143.25*/.Assets.versioned("assets/js/skel.min.js")),format.raw/*143.67*/(""""></script>
    <script src=""""),_display_(/*144.19*/routes/*144.25*/.Assets.versioned("assets/js/jquery.min.js")),format.raw/*144.69*/(""""></script>
    <script src=""""),_display_(/*145.19*/routes/*145.25*/.Assets.versioned("assets/js/jquery.scrollex.min.js")),format.raw/*145.78*/(""""></script>
    <script src=""""),_display_(/*146.19*/routes/*146.25*/.Assets.versioned("assets/js/util.js")),format.raw/*146.63*/(""""></script>
    <script src=""""),_display_(/*147.19*/routes/*147.25*/.Assets.versioned("assets/js/ie/respond.min.js")),format.raw/*147.73*/(""""></script>
    <script src=""""),_display_(/*148.19*/routes/*148.25*/.Assets.versioned("assets/js/main.js")),format.raw/*148.63*/(""""></script>
    <script src=""""),_display_(/*149.19*/routes/*149.25*/.Assets.versioned("https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js")),format.raw/*149.110*/(""""></script>
    <script src=""""),_display_(/*150.19*/routes/*150.25*/.Assets.versioned("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js")),format.raw/*150.113*/(""""></script>
    <script src=""""),_display_(/*151.19*/routes/*151.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*151.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.Users,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.Users) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 16:26:52 IST 2017
                  SOURCE: /home/ifeanyi/Documents/project-latest-version/app/views/main.scala.html
                  HASH: 2bfc49bd9d8527e7fb099a7d5861480fa5ade88c
                  MATRIX: 1016->255|1167->311|1195->313|1275->418|1307->423|1342->431|1368->436|2411->1452|2426->1458|2487->1498|2571->1555|2586->1561|2647->1600|2859->1785|2887->1804|2926->1805|2979->1830|3153->1977|3168->1983|3212->2006|3474->2237|3519->2255|3547->2274|3586->2275|3639->2300|3803->2437|3818->2443|3862->2466|4124->2697|4171->2716|4378->2896|4406->2915|4445->2916|4491->2931|4529->2942|4544->2948|4589->2971|4661->3016|4690->3036|4729->3037|4775->3052|4813->3063|4828->3069|4873->3092|4949->3141|4981->3164|5020->3165|5066->3180|5120->3207|5145->3223|5185->3225|5242->3254|5279->3264|5294->3270|5337->3292|5396->3333|5409->3338|5448->3339|5505->3368|5542->3378|5557->3384|5604->3410|5675->3450|5728->3475|5790->3510|5821->3532|5860->3533|5906->3548|5960->3575|5985->3591|6025->3593|6082->3622|6119->3632|6134->3638|6179->3662|6249->3701|6302->3726|6364->3761|6393->3781|6432->3782|6478->3797|6532->3824|6557->3840|6596->3841|6653->3870|6695->3885|6710->3891|6756->3916|6883->4016|6896->4020|6929->4032|6958->4033|7091->4139|7111->4150|7173->4191|7239->4229|7253->4233|7285->4243|7315->4244|7421->4332|7434->4337|7473->4338|7530->4367|7567->4377|7587->4388|7648->4428|7716->4465|7765->4486|7956->4746|8001->4764|8029->4771|8070->4784|9249->5935|9265->5941|9310->5964|9493->6119|9509->6125|9554->6148|9759->6325|9775->6331|9823->6357|10009->6515|10025->6521|10071->6545|10257->6703|10278->6714|10340->6754|10806->7192|10822->7198|10886->7240|10944->7270|10960->7276|11026->7320|11084->7350|11100->7356|11175->7409|11233->7439|11249->7445|11309->7483|11367->7513|11383->7519|11453->7567|11511->7597|11527->7603|11587->7641|11645->7671|11661->7677|11769->7762|11827->7792|11843->7798|11954->7886|12012->7916|12028->7922|12091->7963
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|55->25|55->25|55->25|56->26|56->26|56->26|65->35|65->35|65->35|66->36|69->39|69->39|69->39|74->44|75->45|75->45|75->45|76->46|79->49|79->49|79->49|85->55|88->58|93->63|93->63|93->63|93->63|93->63|93->63|93->63|94->64|94->64|94->64|94->64|94->64|94->64|94->64|95->65|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|99->69|100->70|101->71|102->72|102->72|102->72|102->72|103->73|103->73|103->73|104->74|104->74|104->74|104->74|105->75|106->76|107->77|107->77|107->77|107->77|108->78|108->78|108->78|109->79|109->79|109->79|109->79|110->80|110->80|110->80|110->80|111->81|111->81|111->81|111->81|111->81|111->81|111->81|112->82|112->82|112->82|113->83|113->83|113->83|113->83|114->84|115->85|121->92|122->93|122->93|123->94|143->114|143->114|143->114|146->117|146->117|146->117|149->120|149->120|149->120|152->123|152->123|152->123|155->126|155->126|155->126|172->143|172->143|172->143|173->144|173->144|173->144|174->145|174->145|174->145|175->146|175->146|175->146|176->147|176->147|176->147|177->148|177->148|177->148|178->149|178->149|178->149|179->150|179->150|179->150|180->151|180->151|180->151
                  -- GENERATED --
              */
          