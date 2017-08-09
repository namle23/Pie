package org.apache.jsp.admin.parts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <div class=\"wrap\">\n");
      out.write("\n");
      out.write("        <?php include('parts/header.php') ?> <!-- include phần header -->\n");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("\n");
      out.write("            <?php include('parts/sidebar.php') ?> <!-- include phần sidebar -->\n");
      out.write("\n");
      out.write("            <div id=\"main\"> <!-- MAIN-CONTENT -->\n");
      out.write("                <div class=\"full_w products\">\n");
      out.write("                    <div class=\"h_title\">Đơn hàng</div>\n");
      out.write("                    <h2>Khách hàng: Chiu Chan</h2>\n");
      out.write("                    <h2>Tổng số: <b>4</b> sản phẩm</h2>\n");
      out.write("                    <!-- <p>Đang hiển thị: <b>4 / 12</b> sản phẩm</p> -->\n");
      out.write("                    <div class=\"entry\">\n");
      out.write("                        <a class=\"button add\" href=\"\">Thêm sản phẩm</a> <!-- <a class=\"button\" href=\"\">Categories</a>  -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"entry\">\n");
      out.write("                        <div class=\"sep\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th class=\"ord-id\" scope=\"col\">ID</th>\n");
      out.write("                                <th class=\"ord-usrid\" scope=\"col\">Mã khách hàng</th>\n");
      out.write("                                <th class=\"ord-name\" scope=\"col\">Tên</th>\n");
      out.write("                                <th class=\"ord-adr\" scope=\"col\">Địa chỉ</th>\n");
      out.write("                                <th class=\"ord-phone\" scope=\"col\">SĐT</th>\n");
      out.write("                                <th class=\"ord-prdid\" scope=\"col\">Mã SP</th>\n");
      out.write("                                <th class=\"ord-prdname\" scope=\"col\">Tên SP</th>\n");
      out.write("                                <th class=\"ord-quan\" scope=\"col\">Số lượng</th>\n");
      out.write("                                <th class=\"ord-cost\" scope=\"col\">Thành tiền</th>\n");
      out.write("                                <th class=\"ord-stat\" scope=\"col\">Trạng thái</th>\n");
      out.write("                                <th scope=\"col\" style=\"width: 55px;\">Modify</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            <?php\n");
      out.write("                            for($i=1; $i<5; $i++){\n");
      out.write("                            echo '\n");
      out.write("                            <tr>\n");
      out.write("                            <td class=\"align-center ord-id\">'.$i.'</td>\n");
      out.write("                            <td class=\"align-center ord-usrid\">3</td>\n");
      out.write("                            <td class=\"align-center ord-name\">Chiu Chan</td>\n");
      out.write("                            <td class=\"align-center ord-adr\">Gia Lâm, Hà Nội</td>\n");
      out.write("                            <td class=\"align-center ord-phone\">01234567890</td>\n");
      out.write("                            <td class=\"align-center ord-prdid\">10</td>\n");
      out.write("                            <td class=\"align-center ord-prdname\">Bánh cup tháp Ep-phen</td>\n");
      out.write("                            <td class=\"align-center ord-quan\">3</a>\n");
      out.write("                            <td class=\"align-center ord-cost\">'.number_format(80000).'</td>\n");
      out.write("                            <td class=\"align-center ord-stat\">0</td>\n");
      out.write("                            <td>\n");
      out.write("                            <a href=\"#\" class=\"table-icon edit\" title=\"Edit\"></a>\n");
      out.write("                            <a href=\"#\" class=\"table-icon archive\" title=\"Archive\"></a>\n");
      out.write("                            <a href=\"#\" class=\"table-icon delete\" title=\"Delete\"></a>\n");
      out.write("                            </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ';\n");
      out.write("                            }\n");
      out.write("                            ?>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"entry\">\n");
      out.write("                        <div class=\"pagination\">\n");
      out.write("                            <span>« First</span>\n");
      out.write("                            <span class=\"active\">1</span>\n");
      out.write("                            <a href=\"\">2</a>\n");
      out.write("                            <a href=\"\">3</a>\n");
      out.write("                            <a href=\"\">4</a>\n");
      out.write("                            <span>...</span>\n");
      out.write("                            <a href=\"\">23</a>\n");
      out.write("                            <a href=\"\">24</a>\n");
      out.write("                            <a href=\"\">Last »</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sep\"></div>\t\t\n");
      out.write("                        <a class=\"button add\" href=\"\">Thêm sản phẩm</a> <!-- <a class=\"button\" href=\"\">Categories</a>  -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"half_w half_left\">\n");
      out.write("                    <div class=\"h_title\">Visits statistics</div>\n");
      out.write("                    <script src=\"js/highcharts_init.js\"></script>\n");
      out.write("                    <div id=\"container\" style=\"min-width: 300px; height: 180px; margin: 0 auto\"></div>\n");
      out.write("                    <script src=\"js/highcharts.js\"></script>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"half_w half_right\">\n");
      out.write("                    <div class=\"h_title\">Site statistics</div>\n");
      out.write("                    <div class=\"stats\">\n");
      out.write("                        <div class=\"today\">\n");
      out.write("                            <h3>Today</h3>\n");
      out.write("                            <p class=\"count\">2 349</p>\n");
      out.write("                            <p class=\"type\">Visits</p>\n");
      out.write("                            <p class=\"count\">96</p>\n");
      out.write("                            <p class=\"type\">Comments</p>\n");
      out.write("                            <p class=\"count\">9</p>\n");
      out.write("                            <p class=\"type\">Articles</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"week\">\n");
      out.write("                            <h3>Last week</h3>\n");
      out.write("                            <p class=\"count\">12 931</p>\n");
      out.write("                            <p class=\"type\">Visits</p>\n");
      out.write("                            <p class=\"count\">521</p>\n");
      out.write("                            <p class=\"type\">Comments</p>\n");
      out.write("                            <p class=\"count\">38</p>\n");
      out.write("                            <p class=\"type\">Articles</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"full_w\">\n");
      out.write("                    <div class=\"h_title\">Add new page - form elements</div>\n");
      out.write("                    <form action=\"\" method=\"post\">\n");
      out.write("                        <div class=\"element\">\n");
      out.write("                            <label for=\"name\">Page title <span class=\"red\">(required)</span></label>\n");
      out.write("                            <input id=\"name\" name=\"name\" class=\"text err\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"element\">\n");
      out.write("                            <label for=\"category\">Category <span class=\"red\">(required)</span></label>\n");
      out.write("                            <select name=\"category\" class=\"err\">\n");
      out.write("                                <option value=\"0\">select category</option>\n");
      out.write("                                <option value=\"1\">Category 1</option>\n");
      out.write("                                <option value=\"2\">Category 4</option>\n");
      out.write("                                <option value=\"3\">Category 3</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"element\">\n");
      out.write("                            <label for=\"comments\">Comments</label>\n");
      out.write("                            <input type=\"radio\" name=\"comments\" value=\"on\" checked=\"checked\" /> Enabled <input type=\"radio\" name=\"comments\" value=\"off\" /> Disabled\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"element\">\n");
      out.write("                            <label for=\"attach\">Attachments</label>\n");
      out.write("                            <input type=\"file\" name=\"attach\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"element\">\n");
      out.write("                            <label for=\"content\">Page content <span>(required)</span></label>\n");
      out.write("                            <textarea name=\"content\" class=\"textarea\" rows=\"10\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"entry\">\n");
      out.write("                            <button type=\"submit\">Preview</button> <button type=\"submit\" class=\"add\">Save page</button> <button class=\"cancel\">Cancel</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div><!-- END / MAIN-CONTENT -->\n");
      out.write("\n");
      out.write("        <?php include('parts/footer.php') ?> <!-- include phần footer -->\n");
      out.write("    </div>\n");
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
