package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/parts/head.jsp");
    _jspx_dependants.add("/parts/header.jsp");
    _jspx_dependants.add("/parts/cart.jsp");
    _jspx_dependants.add("/parts/menu.jsp");
    _jspx_dependants.add("/parts/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_dataSource_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_dataSource_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_setDataSource_var_dataSource_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        ");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Happy Chefs</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("<!-- Shortcut Icon -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/shortcut_icon.ico\">");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"index\">\r\n");
      out.write("        <div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("    <div class=\"wrapper header\">\r\n");
      out.write("        <div class=\"roof\"></div>\r\n");
      out.write("\r\n");
      out.write("        <a class=\"logo\" href=\"index.jsp\">Logo</a>\r\n");
      out.write("        <ul class=\"main-nav\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div> <!--end wrapper-->\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div id=\"main-content\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"main-content top\"></div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"main-content content\">\r\n");
      out.write("                    <h1 class=\"new-prod\">New products</h1>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"slideshow-wrapper\">\r\n");
      out.write("                        <div class=\"pin-1\"></div>\r\n");
      out.write("                        <div id=\"ribbon\"></div>\r\n");
      out.write("                        <div id=\"slideshow\">\r\n");
      out.write("                            <!--add images to slideshow-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <h1 class=\"articles\">New articles</h1>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"sidebar\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("<!--COUNT THE AMOUNT OF ITEMS GOES HERE-->\n");
      out.write("\n");
      out.write("<div class=\"part\">\n");
      out.write("    <div class=\"sidebar top\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"side-content\">\n");
      out.write("        <h2 class=\"cart\">Items: </h2>\n");
      out.write("        <a class=\"btn reg\" href=\"cart.jsp\">Your products</a>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"part\">\r\n");
      out.write("    <div class=\"sidebar top\"></div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"side-content\">\r\n");
      out.write("        <h2 class=\"menu\">Cake by type</h2>\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> <!--end wrapper-->\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<div class=\"footer-border-top\"></div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-box open-hours\">\r\n");
      out.write("            <h3>Opening hours</h3>\r\n");
      out.write("            <p>The store open in various different hours. Welcome!</p>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>Mon-Fri: 10am-8pm</li>\r\n");
      out.write("                <li>Sat: 12pm-12am</li>\r\n");
      out.write("                <li>Sun: 12pm-9pm</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div> <!--end footer-box open-hours-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"float-wrapper\">\r\n");
      out.write("            <div class=\"footer-box new-pre\">\r\n");
      out.write("                <h3>New articles</h3>\r\n");
      out.write("                <h4><a href=\"#\">Matcha mousse cake</a></h4>\r\n");
      out.write("                <p>A popular ingredient in Asian desserts, matcha powder is made from finely ground green tea leaves.\r\n");
      out.write("                    This pretty cake with white chocolate glaze and cherries is a bit of a challenge but worth it.</p>\r\n");
      out.write("                <h4><a href=\"#\">Black tahini chocolate</a></h4>\r\n");
      out.write("                <p>Make your own tahini using black or white sesame seeds, this recipe shows you how. \r\n");
      out.write("                    Black ones have a nuttier, sweeter flavour, making them perfect for baking</p>\r\n");
      out.write("            </div> <!--end footer-box new-pre-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer-box social\">\r\n");
      out.write("                <h3>Drop us a message</h3>\r\n");
      out.write("                <a class=\"facebook\" href=\"#facebook\">Facebook</a>\r\n");
      out.write("                <a class=\"twitter\" href=\"#twitter\">Twitter</a>\r\n");
      out.write("            </div> <!--end footer-box social-->\r\n");
      out.write("\r\n");
      out.write("        </div> <!--end float-wrapper-->\r\n");
      out.write("    </div> <!--end wrapper-->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.10.2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Slide Show -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.slides.min.js\"></script>");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- SlidesJS Required: Initialize SlidesJS with a jQuery doc ready -->\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('#slideshow').slidesjs({\r\n");
      out.write("            width: 650,\r\n");
      out.write("            height: 320,\r\n");
      out.write("            play: {\r\n");
      out.write("                active: true,\r\n");
      out.write("                // [boolean] Generate the play and stop buttons.\r\n");
      out.write("                // You cannot use your own buttons. Sorry.\r\n");
      out.write("                effect: \"slide\",\r\n");
      out.write("                // [string] Can be either \"slide\" or \"fade\".\r\n");
      out.write("                interval: 7000,\r\n");
      out.write("                // [number] Time spent on each slide in milliseconds.\r\n");
      out.write("                auto: true,\r\n");
      out.write("                // [boolean] Start playing the slideshow on load.\r\n");
      out.write("                swap: true,\r\n");
      out.write("                // [boolean] show/hide stop and play buttons\r\n");
      out.write("                pauseOnHover: true,\r\n");
      out.write("                // [boolean] pause a playing slideshow on hover\r\n");
      out.write("                restartDelay: 2500\r\n");
      out.write("                        // [number] restart delay on inactive slideshow\r\n");
      out.write("            },\r\n");
      out.write("            slide: {\r\n");
      out.write("                // Slide effect settings.\r\n");
      out.write("                speed: 500\r\n");
      out.write("                        // [number] Speed in milliseconds of the slide animation.\r\n");
      out.write("            },\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- End SlidesJS Required -->\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pre == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <!--no login-->\r\n");
        out.write("                    <li><a class=\"nav-home\" href=\"index.jsp\">Homepage</a></li>\r\n");
        out.write("                    <li><a class=\"nav-shop\" href=\"shop.jsp\">Shop</a></li>\r\n");
        out.write("                    <li><a class=\"nav-articles\" href=\"articles.jsp\">Articles</a></li>\r\n");
        out.write("                    <li><a class=\"nav-about\" href=\"about.jsp\">About</a></li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pre == \"user\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <!--user logged-->\r\n");
        out.write("                    <li><a class=\"nav-home\" href=\"index.php\">Homepage</a></li>\r\n");
        out.write("                    <li><a class=\"nav-shop\" href=\"shop.jsp\">Shop</a></li>\r\n");
        out.write("                    <li><a class=\"nav-articles\" href=\"articles.jsp\">Articles</a></li>\r\n");
        out.write("                    <li><a class=\"nav-order\" href=\"order.jsp\">Order</a></li>\r\n");
        out.write("                    <li><a class=\"nav-about\" href=\"about.jsp\">About</a></li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pre == \"admin\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <!--admin logged-->\r\n");
        out.write("                    <li><a class=\"nav-home\" href=\"index.php\">Homepage</a></li>\r\n");
        out.write("                    <li><a class=\"nav-shop\" href=\"shop.jsp\">Shop</a></li>\r\n");
        out.write("                    <li><a class=\"nav-articles\" href=\"articles.jsp\">Articles</a></li>\r\n");
        out.write("                    <li><a class=\"nav-order\" href=\"order.jsp\">Order</a></li>\r\n");
        out.write("                    <li><a class=\"nav-admin\" href=\"admin.jsp\">Administrator</a></li>\r\n");
        out.write("                    <li><a class=\"nav-about\" href=\"about.jsp\">About</a></li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
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
    _jspx_th_c_forEach_0.setVar("id");
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(7);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/images/products/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("_slide.jpg\">\r\n");
          out.write("                            ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("i");
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(2);
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"articles-thumb\">\r\n");
          out.write("                            <img src=\"images/articles/article1_thumb.jpg\" width=\"100\" height=\"100\">\r\n");
          out.write("                            <h3><a href=\"article-detail.jsp\">Lorem ipsum</a></h3>\r\n");
          out.write("                            <br>\r\n");
          out.write("                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed posuere interdum sem. </p>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"articles-thumb\">\r\n");
          out.write("                            <img src=\"images/articles/article2_thumb.jpg\" width=\"100\" height=\"100\">\r\n");
          out.write("                            <h3><a href=\"article-detail.jsp\">Lorem ipsum</a></h3>\r\n");
          out.write("                            <br>\r\n");
          out.write("                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed posuere interdum sem. </p>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setDataSource(new String("jdbc/dbs"));
    _jspx_th_sql_setDataSource_0.setVar("ds");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_dataSource_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_dataSource_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("results");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ds}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setSql("SELECT DISTINCT type FROM products ORDER BY type");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("type");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${results.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <a class=\"menu\" href=\"shop.jsp?type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a><br>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
