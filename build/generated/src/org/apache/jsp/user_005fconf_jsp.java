package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fconf_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/parts/head.jsp");
    _jspx_dependants.add("/parts/cart.jsp");
    _jspx_dependants.add("/parts/menu.jsp");
    _jspx_dependants.add("/parts/footer.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Happy Chefs</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("<!-- Shortcut Icon -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/shortcut_icon.ico\">");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"register\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div id=\"main-content\">\n");
      out.write("                <div class=\"main-content top\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"main-content content\">\n");
      out.write("                    <h1 class=\"register\">Change user information</h1>\n");
      out.write("\n");
      out.write("                    <!--CHANGE USER INFORMATION CODE GOES HERE-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"sidebar\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.write("<!--COUNT THE AMOUNT OF ITEMS GOES HERE-->\n");
      out.write("\n");
      out.write("<div class=\"part\">\n");
      out.write("    <div class=\"sidebar top\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"side-content\">\n");
      out.write("        <h2 class=\"cart\">Items: </h2>\n");
      out.write("        <a class=\"btn reg\" href=\"cart.jsp\">All products</a>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"part\">\n");
      out.write("    <div class=\"sidebar top\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"side-content\"></div>\n");
      out.write("    <h2 class=\"menu\">Menu</h2>\n");
      out.write("\n");
      out.write("    <!--SQL QUERY GOES HERE-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<div class=\"footer-border-top\">\n");
      out.write("    <div id=\"footer\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"footer-box open-hours\">\n");
      out.write("                <h3>Opening hours</h3>\n");
      out.write("                <p>The store open in various different hours</p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Mon-Fri: 10am-8pm</li>\n");
      out.write("                    <li>Sat: 12pm-12am</li>\n");
      out.write("                    <li>Sun: 12pm-9pm</li>\n");
      out.write("                </ul>\n");
      out.write("                <p>Get a cake for yourself</p>\n");
      out.write("            </div> <!--end footer-box open-hours-->\n");
      out.write("\n");
      out.write("            <div class=\"float-wrapper\">\n");
      out.write("                <div class=\"footer-box new-pre\">\n");
      out.write("                    <h3>New articles</h3>\n");
      out.write("                    <h4><a href=\"#\">Pancake</a></h4>\n");
      out.write("                    <p>Detail of cake goes here</p>\n");
      out.write("                    <h4><a href=\"#\">Pancake</a></h4>\n");
      out.write("                    <p>Detail of cake goes here</p>\n");
      out.write("                </div>\n");
      out.write("            </div> <!--end footer-box new-pre-->\n");
      out.write("\n");
      out.write("            <div class=\"footer-box social\">\n");
      out.write("                <h3>Drop us a message</h3>\n");
      out.write("                <a class=\"facebook\" href=\"#facebook\">Facebook</a>\n");
      out.write("                <a class=\"twitter\" href=\"#twitter\">Twitter</a>\n");
      out.write("                <a>Drop us a message</a>\n");
      out.write("            </div> <!--footer-box social-->\n");
      out.write("\n");
      out.write("        </div> <!--end wrapper-->\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- JQuery -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.10.2.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Slide Show -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.slides.min.js\"></script>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
