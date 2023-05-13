package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Lap Trinh Web</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- HEADER -->\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <a class=\"logo\" href=\"./index.html\">SHOPGAMEPTIT</a>\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">TRANG CHỦ</a>\n");
      out.write("                </li>\n");
      out.write("                <li>NẠP TIỀN</li>\n");
      out.write("                <li>LỊCH SỬ</li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"./login.html\">ĐĂNG NHẬP</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"./register.html\">ĐĂNG KÝ</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Register</h1>\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <div class=\"form-control\">\n");
      out.write("                        <input type=\"text\" id=\"username\" placeholder=\"Username\" />\n");
      out.write("                        <span></span>\n");
      out.write("                        <small></small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-control\">\n");
      out.write("                        <input type=\"email\" id=\"email\" placeholder=\"Email\" />\n");
      out.write("                        <span></span>\n");
      out.write("                        <small></small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-control\">\n");
      out.write("                        <input type=\"password\" id=\"password\" placeholder=\"Password\" />\n");
      out.write("                        <span></span>\n");
      out.write("                        <small></small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-control\">\n");
      out.write("                        <input type=\"password\" id=\"password2\" placeholder=\"Confirm password\" />\n");
      out.write("                        <span></span>\n");
      out.write("                        <small></small>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" value=\"Sign Up\" />\n");
      out.write("                    <div class=\"signup_link\">Already have an account? <a href=\"#\">Login</a></div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <p>Copyright &copy; by SHOPGAMEPTIT.COM</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"./app.js\"></script>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
