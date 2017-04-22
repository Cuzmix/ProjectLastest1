
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
    """),_display_(/*4.6*/main("Home", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
        """),format.raw/*5.9*/("""<!-- HTML content for the index view -->
        <div class="row">
            <div class="col-sm-12">
                    <!-- Header -->
                <header id="header" class="alt">
                    <h1><a href=""""),_display_(/*10.35*/routes/*10.41*/.HomeController.index()),format.raw/*10.64*/(""""<span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
                    <nav>
                        <a href="#menu">Menu</a>
                    </nav>
                </header>

                    <!-- Banner -->
                <section id="banner">
                    <div class="inner">
                        <h2><span class="glyphicon glyphicon-book"></span> DUT Library</h2>
                        <p> A service to all our students</p>
                    </div>
                </section>

                    <!-- Wrapper -->
                <section id="wrapper">

                        <!-- One -->
                    <section id="one" class="wrapper spotlight style1">
                        <div class="inner">
                            <a href="#" class="image"><img src=""""),_display_(/*30.66*/routes/*30.72*/.Assets.versioned("images/pic01.jpg")),format.raw/*30.109*/("""" alt="" /></a>
                            <div class="content">
                                <h2 class="major">Loan products</h2>
                                <p>Our services provides our student's with a service to download exam papers and books.</p>
                                """),_display_(/*34.34*/if(user != null)/*34.50*/ {_display_(Seq[Any](format.raw/*34.52*/("""
                                    """),format.raw/*35.37*/("""<a href=""""),_display_(/*35.47*/routes/*35.53*/.HomeController.rent()),format.raw/*35.75*/("""" class="special">Have a look</a>
                                """)))}/*36.34*/else/*36.39*/{_display_(Seq[Any](format.raw/*36.40*/("""
                                    """),format.raw/*37.37*/("""<a href=""""),_display_(/*37.47*/routes/*37.53*/.HomeController.products()),format.raw/*37.79*/("""" class="special">Have a look</a>
                                """)))}),format.raw/*38.34*/("""
                            """),format.raw/*39.29*/("""</div>
                        </div>
                    </section>

                        <!-- Two -->
                    <section id="two" class="wrapper alt spotlight style2">
                        <div class="inner">
                            <a href="#" class="image"><img src=""""),_display_(/*46.66*/routes/*46.72*/.Assets.versioned("images/pic02.jpg")),format.raw/*46.109*/("""" alt="" /></a>
                            <div class="content">
                                <h2 class="major">Open for all students</h2>
                                <p>Sign up now and gain an advantage on your exams!</p>
                                <a href=""""),_display_(/*50.43*/routes/*50.49*/.HomeController.signup()),format.raw/*50.73*/("""" class="special">Learn more</a>
                            </div>
                        </div>
                    </section>

                        <!-- Three -->
                    <section id="three" class="wrapper spotlight style3">
                        <div class="inner">
                            <a href="#" class="image"><img src=""""),_display_(/*58.66*/routes/*58.72*/.Assets.versioned("images/pic03.jpg")),format.raw/*58.109*/("""" alt="" /></a>
                            <div class="content">
                                <h2 class="major">Products ranging from hardware to software</h2>
                                <p>Example of our products are gud..</p>
                                <a href="#" class="special">Learn more</a>
                            </div>
                        </div>
                    </section>

                </section>
            </div>
        </div>
            <!-- End of content for main -->
    """)))}),format.raw/*71.6*/("""

"""))
      }
    }
  }

  def render(user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 16:26:52 IST 2017
                  SOURCE: /home/ifeanyi/Documents/project-latest-version/app/views/index.scala.html
                  HASH: 71540346e11a62c6099fac13e1f695426d692204
                  MATRIX: 757->1|878->27|906->29|966->62|994->63|1040->82|1068->83|1096->84|1147->110|1173->128|1212->130|1247->139|1496->361|1511->367|1555->390|2398->1206|2413->1212|2472->1249|2792->1542|2817->1558|2857->1560|2922->1597|2959->1607|2974->1613|3017->1635|3103->1702|3116->1707|3155->1708|3220->1745|3257->1755|3272->1761|3319->1787|3417->1854|3474->1883|3793->2175|3808->2181|3867->2218|4167->2491|4182->2497|4227->2521|4607->2874|4622->2880|4681->2917|5232->3438
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|41->10|41->10|41->10|61->30|61->30|61->30|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|70->39|77->46|77->46|77->46|81->50|81->50|81->50|89->58|89->58|89->58|102->71
                  -- GENERATED --
              */
          