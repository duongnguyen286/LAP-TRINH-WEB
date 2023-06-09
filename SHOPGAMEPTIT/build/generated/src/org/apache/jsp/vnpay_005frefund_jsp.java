package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vnpay_005frefund_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>Refund</title>\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"./assets/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("        <!-- Custom styles for this template -->   \r\n");
      out.write("        <script src=\"./assets/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"header clearfix\">\r\n");
      out.write("\r\n");
      out.write("                <h3 class=\"text-muted\">VNPAY DEMO</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h3>Refund</h3>\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <form action=\"/vnpay_jsp/vnpayrefund\" id=\"frmrefund\" method=\"Post\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"order_id\">Mã hóa đơn</label>\r\n");
      out.write("                        <input class=\"form-control\" id=\"order_id\"\r\n");
      out.write("                               name=\"order_id\" type=\"text\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"amount\">Số tiền hoàn</label>\r\n");
      out.write("                        <input class=\"form-control\" data-val=\"true\" data-val-number=\"The field Amount must be a number.\" data-val-required=\"The Amount field is required.\" id=\"amount\" max=\"100000000\" min=\"1\" name=\"amount\" type=\"number\" value=\"10000\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"trantype\">Kiểu hoàn tiền</label>\r\n");
      out.write("                        <select name=\"trantype\" id=\"trantype\" class=\"form-control\">\r\n");
      out.write("                            <option value=\"02\">Hoàn tiền toàn phần</option>\r\n");
      out.write("                            <option value=\"03\">Hoàn tiền một phần</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"trans_date\">Thời gian thanh toán</label>\r\n");
      out.write("                        <input class=\"form-control\" id=\"trans_date\"\r\n");
      out.write("                               name=\"trans_date\" type=\"text\" placeholder=\"yyyyMMddHHmmss\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"user\">User khởi tạo hoàn</label>\r\n");
      out.write("                        <input class=\"form-control\" id=\"user\"\r\n");
      out.write("                               name=\"user\" type=\"text\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Refund</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>   \r\n");
      out.write("                <p>\r\n");
      out.write("                    &nbsp;\r\n");
      out.write("                </p>\r\n");
      out.write("                <footer class=\"footer\">\r\n");
      out.write("                    <p>&copy; VNPAY 2020</p>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
