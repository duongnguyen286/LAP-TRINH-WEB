package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Chỉnh sửa sản phẩm</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                margin: 8px 0;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #overlay {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #form-container {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            tr {\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                height: 60px;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Chỉnh sửa sản phẩm ID = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <a href=\"home\"> <button>HOME</button> </a>\n");
      out.write("        <form action=\"editproduct\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th><input style=\"background-color: #ccc; border: none\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"id\" readonly required ></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Image</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"image\" required></th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <th>Nổi bật</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.descripsion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"descripsion\" required></input></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Rank</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.rank}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"rank\" required></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Ngọc 90</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.ngoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"ngoc\" required></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Tướng</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.tuong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"tuong\" required></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Trang phục</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.trang_phuc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"trang_phuc\" required></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Trạng thái</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.loai_nick}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"loai_nick\" required></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Giá bán</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"price\" required></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Tài khoản</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.taikhoan}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"taikhoan\" required></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Mật khẩu</th>\n");
      out.write("                    <th><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.matkhau}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"matkhau\" required></th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <button type='submit'>SAVE</button>\n");
      out.write("        </form>\n");
      out.write("        <a href=\"qlsp\"> <button>CANCEL</button> </a>\n");
      out.write("\n");
      out.write("    </body>\n");
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
