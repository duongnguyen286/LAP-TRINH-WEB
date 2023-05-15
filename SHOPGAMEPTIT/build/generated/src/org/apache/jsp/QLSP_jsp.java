package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class QLSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>Quản lí sản phẩm</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/qlsp.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Quản lí sản phẩm</h1>\n");
      out.write("        <button id=\"addsp\">Thêm sản phẩm mới</button>\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Image</th>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Nổi bật</th>\n");
      out.write("                <th>Rank</th>\n");
      out.write("                <th>Ngọc</th>\n");
      out.write("                <th>Tướng</th>\n");
      out.write("                <th>Trang phục</th>\n");
      out.write("                <th>Trạng thái</th>\n");
      out.write("                <th>Giá bán</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Add more rows here -->\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"overlay\">\n");
      out.write("            <div id=\"form-container\">\n");
      out.write("                <h2>Thêm sản phẩm mới</h2>\n");
      out.write("                <form action=\"addproduct\" method=\"post\">\n");
      out.write("                    <label for=\"image\">Image URL:</label>\n");
      out.write("                    <input type=\"text\" name=\"image\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"id\">ID:</label>\n");
      out.write("                    <input type=\"text\" name=\"id\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"description\">Description:</label>\n");
      out.write("                    <textarea name=\"description\" required></textarea>\n");
      out.write("\n");
      out.write("                    <label for=\"rank\">Rank:</label>\n");
      out.write("                    <input type=\"text\" name=\"rank\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"ngoc\">Ngọc:</label>\n");
      out.write("                    <input type=\"text\" name=\"ngoc\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"tuong\">Tướng:</label>\n");
      out.write("                    <input type=\"text\" name=\"tuong\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"trang-phuc\">Trang phục:</label>\n");
      out.write("                    <input type=\"text\" name=\"trang_phuc\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"loai-nick\">Loại nick:</label>\n");
      out.write("                    <input type=\"text\" name=\"loai_nick\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"price\">Price:</label>\n");
      out.write("                    <input type=\"text\" name=\"price\" required>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\">Add</button>\n");
      out.write("                    <button type=\"button\" onclick=\"closeForm()\">Cancel</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/qlsp.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td><img style=\"height: 100px\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"></td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.descripsion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.rank}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ngoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tuong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.trang_phuc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.loai_nick}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>\n");
          out.write("                        <button>Edit</button>\n");
          out.write("                        <a href=\"deleteproduct?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <button>Delete</button>\n");
          out.write("                        </a>\n");
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("            ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
