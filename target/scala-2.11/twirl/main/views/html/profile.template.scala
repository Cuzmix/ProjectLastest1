
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.users.Users],List[models.Product],List[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Users], products: List[models.Product], Transactions: List[models.Users_library],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.134*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
    """),_display_(/*4.6*/main("Users", user)/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
        """),format.raw/*5.9*/("""<!-- HTML content for the index view -->






        <div class="row">
            <div class="col-sm-12">

                    <!-- Wrapper -->
                <section id="wrapper">


                        <!-- Two -->
                    <section id="two" class="wrapper alt spotlight style2" style="margin-top: 20px;">
                        <div class="inner">


                        </div>
                        <h1 class="SubTitles" style="margin-left: 15px">"""),_display_(/*25.74*/user/*25.78*/.getName()),format.raw/*25.88*/(""" """),format.raw/*25.89*/("""'s Profile</h1>
                        <div class="panel-body">
                            """),_display_(/*27.30*/if(flash.containsKey("success"))/*27.62*/ {_display_(Seq[Any](format.raw/*27.64*/("""
                                """),format.raw/*28.33*/("""<div class="alert alert-success">
                                """),_display_(/*29.34*/flash/*29.39*/.get("success")),format.raw/*29.54*/("""
                                """),format.raw/*30.33*/("""</div>
                            """)))}),format.raw/*31.30*/("""
                            """),format.raw/*32.29*/("""<table style="margin-top: 2px; padding-top: 0px">
                                <thead>
                                        <!-- The header row-->
                                    <tr>
                                        <th style = "color: white">Email</th>
                                        <th style = "color: white">Name</th>
                                        <th style = "color: white">Address</th>
                                        <th style = "color: white">Number</th>
                                        <th style = "color: white">Password</th>
                                        <th style = "color: white">Points</th>
                                    </tr>
                                </thead>
                                <tbody>
                                        <!-- Product row(s) -->
                                        <!-- Start of For loop - For each p in products add a row -->

                                    <tr>
                                        <td>"""),_display_(/*49.46*/user/*49.50*/.getEmail),format.raw/*49.59*/("""</td>
                                        <td>"""),_display_(/*50.46*/user/*50.50*/.getName),format.raw/*50.58*/("""</td>
                                        <td>"""),_display_(/*51.46*/user/*51.50*/.getAddress),format.raw/*51.61*/("""</td>
                                        <td>"""),_display_(/*52.46*/user/*52.50*/.getNumber),format.raw/*52.60*/("""</td>
                                        <td>"""),_display_(/*53.46*/user/*53.50*/.getPassword),format.raw/*53.62*/("""</td>
                                        <td>"""),_display_(/*54.46*/user/*54.50*/.getPoints),format.raw/*54.60*/("""</td>

                                        <td>
                                            <a href=""""),_display_(/*57.55*/routes/*57.61*/.HomeController.updateProfile(user.getEmail)),format.raw/*57.105*/("""" class="btn-xs btn-danger">EDIT PROFILE
                                                <span class="glyphicon glyphicon-pencil"></span></a>
                                        </td>

                                    </tr>

                                </tbody>
                            </table>
                            <table >
                                <thead>
                                    <h1 style = "color: white;"> Items </h1>
                                        <!-- The header row-->

                                    <tr>
                                        <th style = "color: white">ID</th>
                                        <th style = "color: white">Product ID</th>
                                        <th style = "color: white">User Email</th>
                                        <th style = "color: white">Date Of transaction </th>
                                        <th style = "color: white">Expire Date</th>
                                        <th style = "color: white">Return</th>
                                        <th style = "color: white;">Extend</th>

                                    </tr>


                                    """),_display_(/*82.38*/for(p <- Transactions) yield /*82.60*/{_display_(Seq[Any](format.raw/*82.61*/("""
                                        """),_display_(/*83.42*/if(p.getUser_email.equalsIgnoreCase(user.getEmail))/*83.93*/{_display_(Seq[Any](format.raw/*83.94*/("""
                                            """),format.raw/*84.45*/("""<tr>
                                                <td>"""),_display_(/*85.54*/p/*85.55*/.getId),format.raw/*85.61*/("""</td>
                                                <td>"""),_display_(/*86.54*/p/*86.55*/.getUser_product_id),format.raw/*86.74*/("""</td>
                                                <td>"""),_display_(/*87.54*/p/*87.55*/.getUser_email),format.raw/*87.69*/("""</td>
                                                <td>"""),_display_(/*88.54*/p/*88.55*/.getDate_transaction),format.raw/*88.75*/("""</td>
                                                <td>"""),_display_(/*89.54*/p/*89.55*/.getExpiring_date),format.raw/*89.72*/("""</td>
                                                <td>"""),_display_(/*90.54*/p/*90.55*/.getReturned),format.raw/*90.67*/("""
                                                    """),_display_(/*91.54*/if(p.getReturned() == "false")/*91.84*/{_display_(Seq[Any](format.raw/*91.85*/("""
                                                        """),format.raw/*92.57*/("""<a href=""""),_display_(/*92.67*/routes/*92.73*/.HomeController.updateReturn(p.getId)),format.raw/*92.110*/("""" class="btn-xs btn-danger">
                                                            return <span class="glyphicon glyphicon-pencil"></span></a>
                                                    """)))}),format.raw/*94.54*/("""


                                                """),format.raw/*97.49*/("""</td>
                                                <td>"""),_display_(/*98.54*/p/*98.55*/.getextendable),format.raw/*98.69*/("""
                                                    """),_display_(/*99.54*/if(p.getextendable() == "true" )/*99.86*/{_display_(Seq[Any](format.raw/*99.87*/("""
                                                        """),_display_(/*100.58*/if(p.getReturned() != "true")/*100.87*/{_display_(Seq[Any](format.raw/*100.88*/("""
                                                            """),format.raw/*101.61*/("""<a href=""""),_display_(/*101.71*/routes/*101.77*/.HomeController.updateTransaction(p.getId)),format.raw/*101.119*/("""" class="btn-xs btn-danger">
                                                                Extend <span class="glyphicon glyphicon-pencil"></span></a>
                                                        """)))}),format.raw/*103.58*/("""

                                                    """)))}),format.raw/*105.54*/("""


                                                """),format.raw/*108.49*/("""</td>
                                            </tr>
                                        """)))}),format.raw/*110.42*/("""
                                    """)))}),format.raw/*111.38*/("""

                                """),format.raw/*113.33*/("""</thead>

                            </table>

                        </div>
                    </section>

                </section>
            </div>
        </div>









        <div class="col-sm-12" style="margin-top: 5%;">


        </div>

    """)))}),format.raw/*137.6*/("""
"""))
      }
    }
  }

  def render(users:List[models.users.Users],products:List[models.Product],Transactions:List[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(users,products,Transactions,user)

  def f:((List[models.users.Users],List[models.Product],List[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (users,products,Transactions,user) => apply(users,products,Transactions,user)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 16:26:52 IST 2017
                  SOURCE: /home/ifeanyi/Documents/project-latest-version/app/views/profile.scala.html
                  HASH: 77645c988ca0ffbdd427bdd491adcb2dc25d5b79
                  MATRIX: 834->1|1062->133|1090->135|1150->168|1178->169|1224->188|1252->189|1280->190|1331->216|1358->235|1397->237|1432->246|1936->723|1949->727|1980->737|2009->738|2130->832|2171->864|2211->866|2272->899|2366->966|2380->971|2416->986|2477->1019|2544->1055|2601->1084|3672->2128|3685->2132|3715->2141|3793->2192|3806->2196|3835->2204|3913->2255|3926->2259|3958->2270|4036->2321|4049->2325|4080->2335|4158->2386|4171->2390|4204->2402|4282->2453|4295->2457|4326->2467|4459->2573|4474->2579|4540->2623|5795->3851|5833->3873|5872->3874|5941->3916|6001->3967|6040->3968|6113->4013|6198->4071|6208->4072|6235->4078|6321->4137|6331->4138|6371->4157|6457->4216|6467->4217|6502->4231|6588->4290|6598->4291|6639->4311|6725->4370|6735->4371|6773->4388|6859->4447|6869->4448|6902->4460|6983->4514|7022->4544|7061->4545|7146->4602|7183->4612|7198->4618|7257->4655|7490->4857|7569->4908|7655->4967|7665->4968|7700->4982|7781->5036|7822->5068|7861->5069|7947->5127|7986->5156|8026->5157|8116->5218|8154->5228|8170->5234|8235->5276|8477->5486|8564->5541|8644->5592|8773->5689|8843->5727|8906->5761|9197->6021
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|56->25|56->25|56->25|56->25|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|62->31|63->32|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|88->57|88->57|88->57|113->82|113->82|113->82|114->83|114->83|114->83|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|123->92|125->94|128->97|129->98|129->98|129->98|130->99|130->99|130->99|131->100|131->100|131->100|132->101|132->101|132->101|132->101|134->103|136->105|139->108|141->110|142->111|144->113|168->137
                  -- GENERATED --
              */
          