package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/parts/head.jsp");
    _jspx_dependants.add("/parts/header.jsp");
    _jspx_dependants.add("/parts/login.jsp");
    _jspx_dependants.add("/parts/cart.jsp");
    _jspx_dependants.add("/parts/menu.jsp");
    _jspx_dependants.add("/parts/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("    <body id=\"index\">\n");
      out.write("        <div>");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("    <div class=\"wrapper header\">\n");
      out.write("        <div class=\"roof\"></div>\n");
      out.write("\n");
      out.write("        <a class=\"logo\" href=\"index.jsp\">Logo</a>\n");
      out.write("        <ul class=\"main-nav\">\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div> <!--end wrapper-->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div id=\"main-content\">\n");
      out.write("                <div class=\"main-content top\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"main-content content\">\n");
      out.write("                    <h1 class=\"new-prod\">New products</h1>\n");
      out.write("\n");
      out.write("                    <div class=\"slideshow-wrapper\">\n");
      out.write("                        <div class=\"pin-1\"></div>\n");
      out.write("                        <div id=\"ribbon\"></div>\n");
      out.write("                        <div id=\"slideshow\">\n");
      out.write("                            <!--ADD PRODUCT TO SLIDESHOW-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <h1 class=\"articles\">New</h1>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"sidebar\">\n");
      out.write("                ");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<div class=\"part\">\n");
      out.write("    <div class=\"sidebar top\">\n");
      out.write("        <div class=\"side-content\">\n");
      out.write("            <h2 class=\"login\">Login</h2>\n");
      out.write("            <br>\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login\" method=\"post\">\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"Username\"><br>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\"><br>\n");
      out.write("                <input class=\"btn\" type=\"submit\" value=\"Login\">\n");
      out.write("\n");
      out.write("                <p>Not a member?</p>\n");
      out.write("\n");
      out.write("                <a class=\"btn reg\" href=\"register.jsp\">Register</a>\n");
      out.write("            </form>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
      out.write("\n");
      out.write("<!-- SlidesJS Required: Initialize SlidesJS with a jQuery doc ready -->\n");
      out.write("<script>\n");
      out.write("    $(function () {\n");
      out.write("        $('#slideshow').slidesjs({\n");
      out.write("            width: 650,\n");
      out.write("            height: 320,\n");
      out.write("            play: {\n");
      out.write("                active: true,\n");
      out.write("                // [boolean] Generate the play and stop buttons.\n");
      out.write("                // You cannot use your own buttons. Sorry.\n");
      out.write("                effect: \"slide\",\n");
      out.write("                // [string] Can be either \"slide\" or \"fade\".\n");
      out.write("                interval: 7000,\n");
      out.write("                // [number] Time spent on each slide in milliseconds.\n");
      out.write("                auto: true,\n");
      out.write("                // [boolean] Start playing the slideshow on load.\n");
      out.write("                swap: true,\n");
      out.write("                // [boolean] show/hide stop and play buttons\n");
      out.write("                pauseOnHover: true,\n");
      out.write("                // [boolean] pause a playing slideshow on hover\n");
      out.write("                restartDelay: 2500\n");
      out.write("                        // [number] restart delay on inactive slideshow\n");
      out.write("            },\n");
      out.write("            slide: {\n");
      out.write("                // Slide effect settings.\n");
      out.write("                speed: 500\n");
      out.write("                        // [number] Speed in milliseconds of the slide animation.\n");
      out.write("            },\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<!-- End SlidesJS Required -->\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pre == \"no\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <!--no login-->\n");
        out.write("                <li><a class=\"nav-home\" href=\"index.php\">Homepage</a></li>\n");
        out.write("                <li><a class=\"nav-shop\" href=\"shop.jsp\">Shop</a></li>\n");
        out.write("                <li><a class=\"nav-articles\" href=\"articles.jsp\">Articles</a></li>\n");
        out.write("                <li><a class=\"nav-about\" href=\"about.jsp\">Information</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pre == \"user\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <!--user logged-->\n");
        out.write("                <li><a class=\"nav-home\" href=\"index.php\">Homepage</a></li>\n");
        out.write("                <li><a class=\"nav-shop\" href=\"shop.jsp\">Shop</a></li>\n");
        out.write("                <li><a class=\"nav-articles\" href=\"articles.jsp\">Articles</a></li>\n");
        out.write("                <li><a class=\"nav-order\" href=\"order.jsp\">Order</a></li>\n");
        out.write("                <li><a class=\"nav-about\" href=\"about.jsp\">Information</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pre == \"admin\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <!--admin logged-->\n");
        out.write("                <li><a class=\"nav-home\" href=\"index.php\">Homepage</a></li>\n");
        out.write("                <li><a class=\"nav-shop\" href=\"shop.jsp\">Shop</a></li>\n");
        out.write("                <li><a class=\"nav-articles\" href=\"articles.jsp\">Articles</a></li>\n");
        out.write("                <li><a class=\"nav-order\" href=\"order.jsp\">Order</a></li>\n");
        out.write("                <li><a class=\"nav-admin\" href=\"admin.jsp\">Administrator</a></li>\n");
        out.write("                <li><a class=\"nav-about\" href=\"about.jsp\">Information</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
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
    _jspx_th_c_forEach_0.setEnd(2);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"articles-thumb\">\n");
          out.write("                            <img src=\"images/articles/article1_thumb.jpg\" width=\"100\" height=\"100\">\n");
          out.write("                            <h3><a href=\"#\">Lorem ipsum</a></h3>\n");
          out.write("                            <br>\n");
          out.write("                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed posuere interdum sem. </p>\n");
          out.write("                        </div>\n");
          out.write("\n");
          out.write("                        <div class=\"articles-thumb\">\n");
          out.write("                            <img src=\"images/articles/article2_thumb.jpg\" width=\"100\" height=\"100\">\n");
          out.write("                            <h3><a href=\"#\">Lorem ipsum</a></h3>\n");
          out.write("                            <br>\n");
          out.write("                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed posuere interdum sem. </p>\n");
          out.write("                        </div>\n");
          out.write("                    ");
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
