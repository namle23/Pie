package org.apache.jsp.admin.parts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"sidebar\"><!-- SIDE BAR -->\n");
      out.write("    <div class=\"box\">\n");
      out.write("        <div class=\"h_title\">&#8250; Products</div>\n");
      out.write("        <ul id=\"home\">\n");
      out.write("            <!-- <li class=\"b1\"><a class=\"icon view_page\" href=\"\">Visit site</a></li>\n");
      out.write("            <li class=\"b1\"><a class=\"icon add_page\" href=\"\">Add new page</a></li>\n");
      out.write("            <li class=\"b2\"><a class=\"icon config\" href=\"\">Site config</a></li> -->\n");
      out.write("            <li class=\"b2\"><a class=\"icon category\" href=\"products.php\">Products</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"box\">\n");
      out.write("        <div class=\"h_title\">&#8250; Orders</div>\n");
      out.write("        <ul>\n");
      out.write("            <!-- <li class=\"b1\"><a class=\"icon page\" href=\"\">Show all pages</a></li>\n");
      out.write("            <li class=\"b2\"><a class=\"icon add_page\" href=\"\">Add new page</a></li>\n");
      out.write("            <li class=\"b1\"><a class=\"icon photo\" href=\"\">Add new gallery</a></li>\n");
      out.write("            <li class=\"b2\"><a class=\"icon category\" href=\"\">Categories</a></li> -->\n");
      out.write("            <li class=\"b1\"><a class=\"icon report\" href=\"order.php\">All</a></li>\n");
      out.write("            <li class=\"b2\"><a class=\"icon config\" href=\"order.php?status=pending\">Processing</a></li>\n");
      out.write("            <li class=\"b1\"><a class=\"icon block_users\" href=\"order.php?status=completed\">Processed</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"box\">\n");
      out.write("        <div class=\"h_title\">&#8250; Members</div>\n");
      out.write("        <ul>\n");
      out.write("            <!-- <li class=\"b2\"><a class=\"icon add_user\" href=\"\">Add new user</a></li>\n");
      out.write("            <li class=\"b1\"><a class=\"icon block_users\" href=\"\">Lock users</a></li> -->\n");
      out.write("            <li class=\"b1\"><a class=\"icon users\" href=\"users.jsp\">Members</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- <div class=\"box\">\n");
      out.write("            <div class=\"h_title\">&#8250; Settings</div>\n");
      out.write("            <ul>\n");
      out.write("                    <li class=\"b1\"><a class=\"icon config\" href=\"\">Site configuration</a></li>\n");
      out.write("                    <li class=\"b2\"><a class=\"icon contact\" href=\"\">Contact Form</a></li>\n");
      out.write("            </ul>\n");
      out.write("    </div> -->\n");
      out.write("</div><!-- END / SIDE BAR -->\n");
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
}
