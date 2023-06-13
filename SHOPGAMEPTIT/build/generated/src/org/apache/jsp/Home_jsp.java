package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Lap Trinh Web</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("        <style>\n");
      out.write("            .center {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .pagination {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .pagination a {\n");
      out.write("                color: black;\n");
      out.write("                float: left;\n");
      out.write("                padding: 8px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                transition: background-color .3s;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                margin: 0 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .pagination a.active {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                border: 1px solid #4CAF50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .pagination a:hover:not(.active) {background-color: #ddd;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"main-content\">\n");
      out.write("                    <form action=\"search?indexs=1\" method=\"post\" class=\"search-form\">\n");
      out.write("                        <div class=\"a\">\n");
      out.write("                            <label for=\"keyword\">Tìm kiếm</label>\n");
      out.write("                            <input type=\"text\" id=\"keyword\" name=\"txt\" placeholder=\"Nhập từ khóa...\">\n");
      out.write("                            <label for=\"maso\" style=\"padding-left: 24px\">Mã Số</label>\n");
      out.write("                            <input type=\"text\" id=\"maso\" name=\"maso\" placeholder=\"Nhập id...\">\n");
      out.write("                            <label for=\"giatien\">Giá tiền</label>\n");
      out.write("                            <select id=\"giatien\" name=\"giatien\">\n");
      out.write("                                <option value=\"#\">Chọn giá tiền</option>\n");
      out.write("                                <option value=\"duoi50\">Dưới 50K</option>\n");
      out.write("                                <option value=\"tu50den200\">Từ 50K - 200K</option>\n");
      out.write("                                <option value=\"tu200den500\">Từ 200K - 500K</option>\n");
      out.write("                                <option value=\"tu500den1tr\">Từ 500K - 1TR</option>\n");
      out.write("                                <option value=\"tren1tr\">Trên 1TR</option>\n");
      out.write("                                <option value=\"tren5tr\">Trên 5TR</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"b\">\n");
      out.write("                            <label for=\"ngoc\" style=\"padding-left: 8px\">Ngọc 90</label>\n");
      out.write("                            <select id=\"ngoc\" name=\"ngoc\">\n");
      out.write("                                <option value=\"#\">-- Không chọn --</option>\n");
      out.write("                                <option value=\"co\">Có</option>\n");
      out.write("                                <option value=\"khong\">Không</option>\n");
      out.write("                            </select>\n");
      out.write("                            <label for=\"trangthai\"> Trạng thái</label>\n");
      out.write("                            <select id=\"trangthai\" name=\"trangthai\">\n");
      out.write("                                <option value=\"#\">-- Không chọn --</option>\n");
      out.write("                                <option value=\"nicktrangthongtin\">Nick trắng thông tin</option>\n");
      out.write("                                <option value=\"nickcodt\">Nick có SĐT</option>\n");
      out.write("                            </select>\n");
      out.write("\n");
      out.write("                            <button type=\"submit\" style=\"margin-left: 10px\">Tìm kiếm</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"product_list\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <div class=\"pagination\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("            <div id=\"abc\">\n");
      out.write("                <div id=\"abd\">\n");
      out.write("                    <div id=\"hoa1\">\n");
      out.write("                        <h3> Xác nhận mua tài khoản</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"hoa2\">\n");
      out.write("                        <h4> Thông tin nick #");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.pro.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Nhà cung cấp</td>\n");
      out.write("                                <th >SHOPGAMEPTIT</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Tên game</td>\n");
      out.write("                                <th style=\"color:black ;\">Liên Quân Mobile</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Giá Tiền</td>\n");
      out.write("                                <th style=\"color:#28b8cf ;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.pro.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"hoa3\">\n");
      out.write("                        <!--                        <form action=\"buy1\" method=\"post\">\n");
      out.write("                                                    <button style=\"float: right;\" type=\"button\" onclick=\"closeForm()\">Đóng</button>\n");
      out.write("                                                    <input type=\"hidden\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.pro.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                    <input type=\"hidden\" name=\"sodu\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.sodu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                    <div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                    <button style=\"float: right; background-color: aliceblue;\">Xác nhận mua</button>\n");
      out.write("                                                </form>-->\n");
      out.write("                        <button style=\"float: right;\" type=\"button\" onclick=\"closeForm()\">Đóng</button>\n");
      out.write("                        <!-- <button style=\"float: right; background-color: aliceblue;\" type=\"submit\">Xác nhận mua</button> -->\n");
      out.write("                        <button style=\"float: right; background-color: aliceblue;\"><a style=\"text-decoration: none;color: black;\" href=\"buy1?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Xác nhận mua</a> </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"js/xacnhan.js\"></script>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
          out.write("                        <div class=\"product_item\">\n");
          out.write("                            <div class=\"image\">\n");
          out.write("                                <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <span class=\"ID\">ID: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                </a>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"description\">\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.descripsion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"attribute_info\">\n");
          out.write("                                <div class=\"infor_nick\">\n");
          out.write("                                    Rank: <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.rank}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"infor_nick\">\n");
          out.write("                                    Ngọc 90: <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ngoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"infor_nick\">\n");
          out.write("                                    Tướng: <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tuong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"infor_nick\">\n");
          out.write("                                    Trang Phục: <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.trang_phuc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"infor_nick\">\n");
          out.write("                                    Loại Nick: <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.loai_nick}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"a-more\" style=\"padding-top: 8px;\">\n");
          out.write("                                <div class=\"price_item\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("đ\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"view\">\n");
          out.write("                                    <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">CHI TIẾT</a>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
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
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endP}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cnt==i?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"home?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
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
}
