
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
       
        """),_display_(/*15.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.85*/("""
        """),_display_(/*16.10*/for((value, name) <- Category.options) yield /*16.48*/ {_display_(Seq[Any](format.raw/*16.50*/("""
            """),format.raw/*17.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*17.63*/value),format.raw/*17.68*/(""""/>"""),_display_(/*17.72*/name),format.raw/*17.76*/("""<br>
        """)))}),format.raw/*18.10*/("""

        """),_display_(/*20.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*20.99*/("""
        """),_display_(/*21.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*21.87*/("""
        """),_display_(/*22.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*22.87*/("""

        """),_display_(/*24.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.74*/("""
        
        """),format.raw/*26.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*31.23*/routes/*31.29*/.HomeController.index(0)),format.raw/*31.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*35.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 11:07:59 GMT 2018
                  SOURCE: /home/wdd/webapps/play/lab2/app/views/addProduct.scala.html
                  HASH: a51dade9f2971642d2f7cf7aeec933e84f2234e5
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1543->303|1582->305|1619->342|1656->352|1669->356|1700->366|1738->377|1834->452|1879->470|1975->545|2012->555|2066->593|2106->595|2147->608|2224->658|2250->663|2281->667|2306->671|2351->685|2389->696|2499->785|2536->795|2634->872|2671->882|2769->959|2807->970|2892->1034|2937->1052|3208->1296|3223->1302|3268->1326|3416->1444
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|50->18|52->20|52->20|53->21|53->21|54->22|54->22|56->24|56->24|58->26|63->31|63->31|63->31|67->35
                  -- GENERATED --
              */
          