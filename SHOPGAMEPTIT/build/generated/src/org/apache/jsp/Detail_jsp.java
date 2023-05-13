package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <style>\n");
      out.write("        img {\n");
      out.write("            width: 80%;\n");
      out.write("            height: auto;\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 8px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            font-size: 36px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("            font-size: 18px;\n");
      out.write("            line-height: 1.5;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 80%;\n");
      out.write("            margin-top: 48px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th,\n");
      out.write("        td {\n");
      out.write("            text-align: left;\n");
      out.write("            padding: 8px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            width: 20%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .badge {\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 3px 6px;\n");
      out.write("            font-size: 14px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            line-height: 1;\n");
      out.write("            text-align: center;\n");
      out.write("            white-space: nowrap;\n");
      out.write("            vertical-align: baseline;\n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .badge-success {\n");
      out.write("            background-color: #28a745;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .badge-danger {\n");
      out.write("            background-color: #dc3545;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        button {\n");
      out.write("            width: 80%;\n");
      out.write("            height: 48px;\n");
      out.write("            background-color: #32c5d2;\n");
      out.write("            color: white;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID:</th>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Mô tả:</th>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.descripsion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Rank:</th>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"badge badge-success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.rank}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Ngọc:</th>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.ngoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Tướng:</th>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.tuong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Trang Phục:</th>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.trang_phuc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Loại Nick:</th>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.loai_nick}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Giá:</th>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <button>MUA</button>\n");
      out.write("            <img src=\"https://via.placeholder.com/600x400.png\" alt=\"Ảnh sản phẩm\">\n");
      out.write("            <img src=\"https://via.placeholder.com/600x400.png\" alt=\"Ảnh sản phẩm\">\n");
      out.write("            <img src=\"https://via.placeholder.com/600x400.png\" alt=\"Ảnh sản phẩm\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
