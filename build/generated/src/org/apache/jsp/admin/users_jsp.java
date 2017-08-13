package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/admin/parts/head.jsp");
    _jspx_dependants.add("/admin/parts/header.jsp");
    _jspx_dependants.add("/admin/parts/sidebar.jsp");
    _jspx_dependants.add("/admin/parts/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_end_begin.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"pl\" xml:lang=\"pl\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Happy Chefs Admin</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/navi.css\" media=\"screen\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\".box .h_title\").not(this).next(\"ul\").hide(\"normal\");\r\n");
      out.write("        $(\".box .h_title\").not(this).next(\"#home\").show(\"normal\");\r\n");
      out.write("        $(\".box\").children(\".h_title\").click(function () {\r\n");
      out.write("            $(this).next(\"ul\").slideToggle();\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("    <div id=\"top\">\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("            <h1 style=\"color:#888888;\">Happy Chefs Admin</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"top\">\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("            <p>Hellooo, <strong>Nam</strong> [ <a href=\"\">Logout</a> ]</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"right\">\r\n");
      out.write("            <div class=\"align-right\">\r\n");
      out.write("                <p>Last login: <strong>23-04-2017 23:12</strong></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- <div id=\"nav\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                    <li class=\"upp\"><a href=\"#\">Main control</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Visit site</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Reports</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Add new page</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Site config</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"upp\"><a href=\"#\">Manage content</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Show all pages</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Add new page</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Add new gallery</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Categories</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"upp\"><a href=\"#\">Users</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Show all uses</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Add new user</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Lock users</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"upp\"><a href=\"#\">Settings</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Site configuration</a></li>\r\n");
      out.write("                                    <li>&#8250; <a href=\"\">Contact Form</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("    </div> -->\r\n");
      out.write("</div>");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"sidebar\"><!-- SIDE BAR -->\r\n");
      out.write("    <div class=\"box\">\r\n");
      out.write("        <div class=\"h_title\">&#8250; Products</div>\r\n");
      out.write("        <ul id=\"home\">\r\n");
      out.write("            <!-- <li class=\"b1\"><a class=\"icon view_page\" href=\"\">Visit site</a></li>\r\n");
      out.write("            <li class=\"b1\"><a class=\"icon add_page\" href=\"\">Add new page</a></li>\r\n");
      out.write("            <li class=\"b2\"><a class=\"icon config\" href=\"\">Site config</a></li> -->\r\n");
      out.write("            <li class=\"b2\"><a class=\"icon category\" href=\"products.jsp\">Products</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"box\">\r\n");
      out.write("        <div class=\"h_title\">&#8250; Orders</div>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <!-- <li class=\"b1\"><a class=\"icon page\" href=\"\">Show all pages</a></li>\r\n");
      out.write("            <li class=\"b2\"><a class=\"icon add_page\" href=\"\">Add new page</a></li>\r\n");
      out.write("            <li class=\"b1\"><a class=\"icon photo\" href=\"\">Add new gallery</a></li>\r\n");
      out.write("            <li class=\"b2\"><a class=\"icon category\" href=\"\">Categories</a></li> -->\r\n");
      out.write("            <li class=\"b1\"><a class=\"icon report\" href=\"order.jsp\">All</a></li>\r\n");
      out.write("            <li class=\"b2\"><a class=\"icon config\" href=\"order.jsp?status=pending\">Processing</a></li>\r\n");
      out.write("            <li class=\"b1\"><a class=\"icon block_users\" href=\"order.jsp?status=completed\">Processed</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"box\">\r\n");
      out.write("        <div class=\"h_title\">&#8250; Members</div>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <!-- <li class=\"b2\"><a class=\"icon add_user\" href=\"\">Add new user</a></li>\r\n");
      out.write("            <li class=\"b1\"><a class=\"icon block_users\" href=\"\">Lock users</a></li> -->\r\n");
      out.write("            <li class=\"b1\"><a class=\"icon users\" href=\"users.jsp\">Members</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- <div class=\"box\">\r\n");
      out.write("            <div class=\"h_title\">&#8250; Settings</div>\r\n");
      out.write("            <ul>\r\n");
      out.write("                    <li class=\"b1\"><a class=\"icon config\" href=\"\">Site configuration</a></li>\r\n");
      out.write("                    <li class=\"b2\"><a class=\"icon contact\" href=\"\">Contact Form</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("    </div> -->\r\n");
      out.write("</div><!-- END / SIDE BAR -->\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                <div id=\"main\"> <!-- MAIN-CONTENT -->\r\n");
      out.write("                    <div class=\"full_w products\">\r\n");
      out.write("                        <div class=\"h_title\">Products</div>\r\n");
      out.write("                        <h2>Total: <b>12</b> products</h2>\r\n");
      out.write("                        <p>Showing: <b>4 / 12</b> products</p>\r\n");
      out.write("                        <div class=\"entry\">\r\n");
      out.write("                            <a class=\"button add\" href=\"\">Add products</a> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"entry\">\r\n");
      out.write("                            <div class=\"sep\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th class=\"prd-id\" scope=\"col\">Product code</th>\r\n");
      out.write("                                    <th class=\"prd-name\"scope=\"col\">Name</th>\r\n");
      out.write("                                    <th class=\"prd-type\" scope=\"col\">Type</th>\r\n");
      out.write("                                    <th class=\"prd-brief\" scope=\"col\">Brief</th>\r\n");
      out.write("                                    <th class=\"prd-detail\" scope=\"col\">Detail</th>\r\n");
      out.write("                                    <th class=\"prd-ingre\" scope=\"col\">Ingredient</th>\r\n");
      out.write("                                    <th class=\"prd-price\" scope=\"col\">Price</th>\r\n");
      out.write("                                    <th class=\"prd-img\" scope=\"col\">Main photo</th>\r\n");
      out.write("                                    <th class=\"prd-img\" scope=\"col\">Slide photo</th>\r\n");
      out.write("                                    <th class=\"prd-img\" scope=\"col\">Thumb photo</th>\r\n");
      out.write("                                    <th scope=\"col\" style=\"width: 65px;\">Modify</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        <div class=\"entry\">\r\n");
      out.write("                            <div class=\"pagination\">\r\n");
      out.write("                                <span>« First</span>\r\n");
      out.write("                                <span class=\"active\">1</span>\r\n");
      out.write("                                <a href=\"\">2</a>\r\n");
      out.write("                                <a href=\"\">3</a>\r\n");
      out.write("                                <a href=\"\">4</a>\r\n");
      out.write("                                <span>...</span>\r\n");
      out.write("                                <a href=\"\">23</a>\r\n");
      out.write("                                <a href=\"\">24</a>\r\n");
      out.write("                                <a href=\"\">Last »</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"sep\"></div>\t\t\r\n");
      out.write("                            <a class=\"button add\" href=\"\">Add</a> <!-- <a class=\"button\" href=\"\">Categories</a>  -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- <div class=\"half_w half_left\">\r\n");
      out.write("                            <div class=\"h_title\">Visits statistics</div>\r\n");
      out.write("                                    <script src=\"js/highcharts_init.js\"></script>\r\n");
      out.write("                                    <div id=\"container\" style=\"min-width: 300px; height: 180px; margin: 0 auto\"></div>\r\n");
      out.write("                                    <script src=\"js/highcharts.js\"></script>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"half_w half_right\">\r\n");
      out.write("                            <div class=\"h_title\">Site statistics</div>\r\n");
      out.write("                            <div class=\"stats\">\r\n");
      out.write("                                    <div class=\"today\">\r\n");
      out.write("                                            <h3>Today</h3>\r\n");
      out.write("                                            <p class=\"count\">2 349</p>\r\n");
      out.write("                                            <p class=\"type\">Visits</p>\r\n");
      out.write("                                            <p class=\"count\">96</p>\r\n");
      out.write("                                            <p class=\"type\">Comments</p>\r\n");
      out.write("                                            <p class=\"count\">9</p>\r\n");
      out.write("                                            <p class=\"type\">Articles</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"week\">\r\n");
      out.write("                                            <h3>Last week</h3>\r\n");
      out.write("                                            <p class=\"count\">12 931</p>\r\n");
      out.write("                                            <p class=\"type\">Visits</p>\r\n");
      out.write("                                            <p class=\"count\">521</p>\r\n");
      out.write("                                            <p class=\"type\">Comments</p>\r\n");
      out.write("                                            <p class=\"count\">38</p>\r\n");
      out.write("                                            <p class=\"type\">Articles</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"full_w\">\r\n");
      out.write("                            <div class=\"h_title\">Add new page - form elements</div>\r\n");
      out.write("                            <form action=\"\" method=\"post\">\r\n");
      out.write("                                    <div class=\"element\">\r\n");
      out.write("                                            <label for=\"name\">Page title <span class=\"red\">(required)</span></label>\r\n");
      out.write("                                            <input id=\"name\" name=\"name\" class=\"text err\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"element\">\r\n");
      out.write("                                            <label for=\"category\">Category <span class=\"red\">(required)</span></label>\r\n");
      out.write("                                            <select name=\"category\" class=\"err\">\r\n");
      out.write("                                                    <option value=\"0\">select category</option>\r\n");
      out.write("                                                    <option value=\"1\">Category 1</option>\r\n");
      out.write("                                                    <option value=\"2\">Category 4</option>\r\n");
      out.write("                                                    <option value=\"3\">Category 3</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"element\">\r\n");
      out.write("                                            <label for=\"comments\">Comments</label>\r\n");
      out.write("                                            <input type=\"radio\" name=\"comments\" value=\"on\" checked=\"checked\" /> Enabled <input type=\"radio\" name=\"comments\" value=\"off\" /> Disabled\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"element\">\r\n");
      out.write("                                            <label for=\"attach\">Attachments</label>\r\n");
      out.write("                                            <input type=\"file\" name=\"attach\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"element\">\r\n");
      out.write("                                            <label for=\"content\">Page content <span>(required)</span></label>\r\n");
      out.write("                                            <textarea name=\"content\" class=\"textarea\" rows=\"10\"></textarea>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"entry\">\r\n");
      out.write("                                            <button type=\"submit\">Preview</button> <button type=\"submit\" class=\"add\">Save page</button> <button class=\"cancel\">Cancel</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                    </div> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div><!-- END / MAIN-CONTENT -->\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <div class=\"left\">\r\n");
      out.write("        <p><a href=\"../index.php\">Happy Chefs</a> | Admin Panel: <a href=\"../index.jsp\">happychefs.com</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"right\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(5);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td class=\"align-center prd-id\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"prd-name\">Batik</td>\r\n");
          out.write("                                        <td class=\"prd-type\">Cake</td>\r\n");
          out.write("                                        <td class=\"prd-brief\">Corn flour, butter, sugar, and vanilla</td>\r\n");
          out.write("                                        <td class=\"prd-detail content\"> Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added.</td>\r\n");
          out.write("                                        <td class=\"prd-ingre\">Sponge cake, cream</td>\r\n");
          out.write("                                        <td class=\"prd-price\">10€</td>\r\n");
          out.write("                                        <td class=\"prd-img\"><a href=\"#\">[main]</a></td>\r\n");
          out.write("                                        <td class=\"prd-img\"><a href=\"#\">[slide]</a></td>\r\n");
          out.write("                                        <td class=\"prd-img\"><a href=\"#\">[thumb]</a></td>\r\n");
          out.write("                                        <td>\r\n");
          out.write("                                            <a href=\"#\" class=\"table-icon edit\" title=\"Edit\"></a>\r\n");
          out.write("                                            <a href=\"#\" class=\"table-icon archive\" title=\"Archive\"></a>\r\n");
          out.write("                                            <a href=\"#\" class=\"table-icon delete\" title=\"Delete\"></a>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
