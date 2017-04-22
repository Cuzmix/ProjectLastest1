
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object returnUpdate_Scope0 {
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

     object returnUpdate_Scope1 {
import helper._

class returnUpdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(UsersLibraryForm: play.data.Form[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.84*/("""

	"""),format.raw/*6.103*/("""


	"""),_display_(/*9.3*/main("Return Books/Exam Paper", user)/*9.40*/ {_display_(Seq[Any](format.raw/*9.42*/("""
		"""),format.raw/*10.3*/("""<h3>Add a new Product</h3>


			<!-- Use the views.html.helpers package to create the form -->
		"""),_display_(/*14.4*/form(action = routes.HomeController.addReturnSubmit(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*14.115*/ {_display_(Seq[Any](format.raw/*14.117*/("""
			"""),format.raw/*15.4*/("""<div style="display: none">
				"""),_display_(/*16.6*/inputText(UsersLibraryForm("id"), '_label -> "", 'hidden -> "hidden", 'style -> "display: none")),format.raw/*16.102*/("""
				"""),_display_(/*17.6*/inputText(UsersLibraryForm("user_product_id"), '_label -> "user_product_id",'class -> "form-control", 'style -> "display: none")),format.raw/*17.134*/("""
				"""),_display_(/*18.6*/inputText(UsersLibraryForm("user_email"), '_label -> "user_email",'class -> "form-control", 'style -> "display: none")),format.raw/*18.124*/("""
				"""),_display_(/*19.6*/inputText(UsersLibraryForm("date_transaction"), '_label -> "date_transaction",'class -> "form-control", 'style -> "display: none")),format.raw/*19.136*/("""
				"""),_display_(/*20.6*/inputText(UsersLibraryForm("expiring_date"), '_label -> "expiring_date",'class -> "form-control", 'style -> "display: none")),format.raw/*20.130*/("""
				"""),_display_(/*21.6*/inputText(UsersLibraryForm("extendable"), '_label -> "extendable",'class -> "form-control", 'style -> "display: none")),format.raw/*21.124*/("""
				"""),_display_(/*22.6*/inputText(UsersLibraryForm("returned"), '_label -> "returned",'class -> "form-control", 'style -> "display: none")),format.raw/*22.120*/("""
				"""),_display_(/*23.6*/inputText(UsersLibraryForm("tempo"), '_label -> "", 'style -> "display: none")),format.raw/*23.84*/("""
				"""),_display_(/*24.6*/inputText(UsersLibraryForm("tempo2"), '_label -> "", 'style -> "display: none")),format.raw/*24.85*/("""
				"""),_display_(/*25.6*/inputText(UsersLibraryForm("tempo3"), '_label -> "", 'style -> "display: none")),format.raw/*25.85*/("""
			"""),format.raw/*26.4*/("""</div>



				<!-- Add a submit button -->

				<!-- Two -->
			<section id="two" class="wrapper alt spotlight style2">
				<div class="inner">
					<div class="content">

						<div class="actions">
							<h2>Item has been returned. Points has been retrieved.</h2>
							<input type="submit" value="Continue" class="btn btn-primary">
							<a href=""""),_display_(/*40.18*/routes/*40.24*/.HomeController.returnUpdate()),format.raw/*40.54*/(""""></a>

						</div>
					</div>
				</div>
			</section>
		""")))}),format.raw/*46.4*/(""" """),format.raw/*46.5*/("""<!-- End Form definition -->
	""")))}),format.raw/*47.3*/("""
	"""),format.raw/*48.2*/("""-- End of page content -->"""))
      }
    }
  }

  def render(UsersLibraryForm:play.data.Form[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(UsersLibraryForm,user)

  def f:((play.data.Form[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (UsersLibraryForm,user) => apply(UsersLibraryForm,user)

  def ref: this.type = this

}


}
}

/**/
object returnUpdate extends returnUpdate_Scope0.returnUpdate_Scope1.returnUpdate
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 16:26:52 IST 2017
                  SOURCE: /home/ifeanyi/Documents/project-latest-version/app/views/returnUpdate.scala.html
                  HASH: 4ea13cd215c7eb9215471a89604e733270e2ebd8
                  MATRIX: 859->109|1036->191|1067->295|1097->300|1142->337|1181->339|1211->342|1335->440|1456->551|1497->553|1528->557|1587->590|1705->686|1737->692|1887->820|1919->826|2059->944|2091->950|2243->1080|2275->1086|2421->1210|2453->1216|2593->1334|2625->1340|2761->1454|2793->1460|2892->1538|2924->1544|3024->1623|3056->1629|3156->1708|3187->1712|3568->2066|3583->2072|3634->2102|3725->2163|3753->2164|3814->2195|3843->2197
                  LINES: 30->4|35->4|37->6|40->9|40->9|40->9|41->10|45->14|45->14|45->14|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|57->26|71->40|71->40|71->40|77->46|77->46|78->47|79->48
                  -- GENERATED --
              */
          