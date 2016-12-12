
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""
"""),format.raw/*2.1*/("""<!-- Pass page title and content """),format.raw/*2.34*/("""{"""),format.raw/*2.35*/("""html between braces"""),format.raw/*2.54*/("""}"""),format.raw/*2.55*/(""" """),format.raw/*2.56*/("""to the main view -->
"""),_display_(/*3.2*/main("Products", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  """),format.raw/*4.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*10.27*/routes/*10.33*/.HomeController.products(0)),format.raw/*10.60*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*14.18*/for(c <- categories) yield /*14.38*/ {_display_(Seq[Any](format.raw/*14.40*/("""
                    """),format.raw/*15.21*/("""<a href=""""),_display_(/*15.31*/routes/*15.37*/.HomeController.products(c.getId)),format.raw/*15.70*/("""" class="list-group-item">"""),_display_(/*15.97*/c/*15.98*/.getName),format.raw/*15.106*/("""
                      """),format.raw/*16.23*/("""<span class="badge">"""),_display_(/*16.44*/c/*16.45*/.getProducts.size()),format.raw/*16.64*/("""</span>
                    </a>
                """)))}),format.raw/*18.18*/("""
            """),format.raw/*19.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*23.12*/if(flash.containsKey("success"))/*23.44*/ {_display_(Seq[Any](format.raw/*23.46*/("""
              """),format.raw/*24.15*/("""<div class="alert alert-success">
              """),_display_(/*25.16*/flash/*25.21*/.get("success")),format.raw/*25.36*/("""
              """),format.raw/*26.15*/("""</div>
          """)))}),format.raw/*27.12*/("""
          """),format.raw/*28.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*43.12*/for(p <- products) yield /*43.30*/ {_display_(Seq[Any](format.raw/*43.32*/("""
			        """),format.raw/*44.12*/("""<tr>
                  <td>"""),_display_(/*45.24*/p/*45.25*/.getId),format.raw/*45.31*/("""</td>
                  <td>"""),_display_(/*46.24*/p/*46.25*/.getName),format.raw/*46.33*/("""</td>
                  <td>"""),_display_(/*47.24*/p/*47.25*/.getCategory.getName),format.raw/*47.45*/("""</td>
                  <td>"""),_display_(/*48.24*/p/*48.25*/.getDescription),format.raw/*48.40*/("""</td>
                  <td>"""),_display_(/*49.24*/p/*49.25*/.getStock),format.raw/*49.34*/("""</td>
                  <td>&euro; """),_display_(/*50.31*/("%.2f".format(p.getPrice))),format.raw/*50.58*/("""</td>

                  <!-- Edit product button -->
                   """),_display_(/*53.21*/if(user != null)/*53.37*/ {_display_(Seq[Any](format.raw/*53.39*/("""
                       """),format.raw/*54.24*/("""<td>
                           <a href=""""),_display_(/*55.38*/routes/*55.44*/.HomeController.updateProduct(p.getId)),format.raw/*55.82*/("""" class="btn-xs btn-danger">
                               <span class="glyphicon glyphicon-pencil"></span></a>
                       </td>
                           <!-- Delete product button -->
                       <td>
                           <a href=""""),_display_(/*60.38*/routes/*60.44*/.HomeController.deleteProduct(p.getId)),format.raw/*60.82*/("""" class="btn-xs btn-danger"
                           onclick="return confirmDel();">
                               <span class="glyphicon glyphicon-trash"></span>
                           </a>
                       </td>
                   """)))}),format.raw/*65.21*/("""
				    """),format.raw/*66.9*/("""</tr>

					""")))}),format.raw/*68.7*/(""" """),format.raw/*68.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
          """),_display_(/*71.12*/if(user != null)/*71.28*/ {_display_(Seq[Any](format.raw/*71.30*/("""
              """),format.raw/*72.15*/("""<p>
                  <a href=""""),_display_(/*73.29*/routes/*73.35*/.HomeController.addProduct()),format.raw/*73.63*/("""">
                      <button class="btn btn-primary">Add a Product</button>
                  </a>
              </p>
          """)))}),format.raw/*77.12*/("""
      """),format.raw/*78.7*/("""</div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*83.27*/("""{"""),format.raw/*83.28*/("""
        """),format.raw/*84.9*/("""return confirm('Are you sure?');
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""
  """),format.raw/*86.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 10:49:28 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/playlab_crud-part4/app/views/products.scala.html
                  HASH: 332ffb14910792fac546758c048175165169ae9c
                  MATRIX: 805->1|992->93|1020->95|1080->128|1108->129|1154->148|1182->149|1210->150|1258->173|1288->195|1327->197|1357->201|1629->446|1644->452|1692->479|1947->707|1983->727|2023->729|2073->751|2110->761|2125->767|2179->800|2233->827|2243->828|2273->836|2325->860|2373->881|2383->882|2423->901|2506->953|2548->967|2641->1033|2682->1065|2722->1067|2766->1083|2843->1133|2857->1138|2893->1153|2937->1169|2987->1188|3027->1200|3534->1680|3568->1698|3608->1700|3649->1713|3705->1742|3715->1743|3742->1749|3799->1779|3809->1780|3838->1788|3895->1818|3905->1819|3946->1839|4003->1869|4013->1870|4049->1885|4106->1915|4116->1916|4146->1925|4210->1962|4258->1989|4362->2066|4387->2082|4427->2084|4480->2109|4550->2152|4565->2158|4624->2196|4921->2466|4936->2472|4995->2510|5278->2762|5315->2772|5360->2787|5388->2788|5490->2863|5515->2879|5555->2881|5599->2897|5659->2930|5674->2936|5723->2964|5891->3101|5926->3109|6090->3245|6119->3246|6156->3256|6221->3294|6249->3295|6280->3299
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|33->2|33->2|34->3|34->3|34->3|35->4|41->10|41->10|41->10|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|49->18|50->19|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|58->27|59->28|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|84->53|84->53|84->53|85->54|86->55|86->55|86->55|91->60|91->60|91->60|96->65|97->66|99->68|99->68|102->71|102->71|102->71|103->72|104->73|104->73|104->73|108->77|109->78|114->83|114->83|115->84|116->85|116->85|117->86
                  -- GENERATED --
              */
          