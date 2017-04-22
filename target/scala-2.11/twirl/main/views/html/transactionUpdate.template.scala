
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object transactionUpdate_Scope0 {
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

     object transactionUpdate_Scope1 {
import helper._

class transactionUpdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(UsersLibraryForm: play.data.Form[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.84*/("""

    """),format.raw/*6.106*/("""


    """),_display_(/*9.6*/main("Update Transaction", user)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""


        """),format.raw/*12.9*/("""<!-- Use the views.html.helpers package to create the form -->

        """),_display_(/*14.10*/form(action = routes.HomeController.addTransactionSubmit(), 'class -> "form-horizontal", 'role->"form")/*14.113*/ {_display_(Seq[Any](format.raw/*14.115*/("""


            """),format.raw/*17.13*/("""<div style="display: none">

                """),_display_(/*19.18*/inputText(UsersLibraryForm("Id"), '_label -> "Id",'class -> "form-control",'style -> "display: none")),format.raw/*19.119*/("""
                """),_display_(/*20.18*/inputText(UsersLibraryForm("User_product_id"), '_label -> "User_product_id",'class -> "form-control",'style -> "display: none")),format.raw/*20.145*/("""
                """),_display_(/*21.18*/inputText(UsersLibraryForm("User_email"), '_label -> "User_email",'class -> "form-control",'style -> "display: none")),format.raw/*21.135*/("""
                """),_display_(/*22.18*/inputDate(UsersLibraryForm("Date_transaction"), '_label -> "Date_transaction",'class -> "form-control",'style -> "display: none")),format.raw/*22.147*/("""
                """),_display_(/*23.18*/inputDate(UsersLibraryForm("Expiring_date"), '_label -> "Expiring_date",'class -> "form-control",'style -> "display: none")),format.raw/*23.141*/("""

            """),format.raw/*25.13*/("""</div>





                <!-- Add a submit button -->

                <!-- Two -->
            <section id="two" class="wrapper alt spotlight style2">
                <div class="inner">
                    <div class="content">
                        <div class="actions">
                            <h2>Item has been extended by 3 days.</h2>
                            <input type="submit" value="Continue" class="btn btn-primary">
                            <a href=""""),_display_(/*40.39*/routes/*40.45*/.HomeController.transactionUpdate()),format.raw/*40.80*/(""""></a>
                        </div>
                    </div>
                </div>
            </section>


        """)))}),format.raw/*47.10*/(""" """),format.raw/*47.11*/("""<!-- End Form definition -->
    """)))}),format.raw/*48.6*/("""
    """),format.raw/*49.5*/("""-- End of page content -->"""))
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
object transactionUpdate extends transactionUpdate_Scope0.transactionUpdate_Scope1.transactionUpdate
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 16:26:52 IST 2017
                  SOURCE: /home/ifeanyi/Documents/project-latest-version/app/views/transactionUpdate.scala.html
                  HASH: 04713eb257dced3f09638853dcb72b79f67fef1e
                  MATRIX: 874->109|1051->191|1085->298|1118->306|1158->338|1197->340|1235->351|1335->424|1448->527|1489->529|1532->544|1605->590|1728->691|1773->709|1922->836|1967->854|2106->971|2151->989|2302->1118|2347->1136|2492->1259|2534->1273|3040->1752|3055->1758|3111->1793|3264->1915|3293->1916|3357->1950|3389->1955
                  LINES: 30->4|35->4|37->6|40->9|40->9|40->9|43->12|45->14|45->14|45->14|48->17|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|56->25|71->40|71->40|71->40|78->47|78->47|79->48|80->49
                  -- GENERATED --
              */
          