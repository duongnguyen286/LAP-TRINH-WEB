package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import com.vnpay.common.Config;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.HashMap;

public final class vnpay_005fipn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("application/json; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    //Begin process return from VNPAY
     /* Payment Notify
     * IPN URL: Ghi nhận kết quả thanh toán từ VNPAY
     * Các bước thực hiện:
     * Kiểm tra checksum 
     * Tìm giao dịch trong database
     * Kiểm tra số tiền giữa hai hệ thống
     * Kiểm tra tình trạng của giao dịch trước khi cập nhật
     * Cập nhật kết quả vào Database
     * Trả kết quả ghi nhận lại cho VNPAY
     */
    
    Map fields = new HashMap();
             for (Enumeration params = request.getParameterNames(); params.hasMoreElements();) {
                String fieldName = URLEncoder.encode((String) params.nextElement(), StandardCharsets.US_ASCII.toString());
                String fieldValue = URLEncoder.encode(request.getParameter(fieldName), StandardCharsets.US_ASCII.toString());
                if ((fieldValue != null) && (fieldValue.length() > 0)) {
                    fields.put(fieldName, fieldValue);
                }
            }
    String vnp_SecureHash = request.getParameter("vnp_SecureHash");
    if (fields.containsKey("vnp_SecureHashType")) {
        fields.remove("vnp_SecureHashType");
    }
    if (fields.containsKey("vnp_SecureHash")) {
        fields.remove("vnp_SecureHash");
    }
    String signValue = Config.hashAllFields(fields);
    if (signValue.equals(vnp_SecureHash)) {
        boolean checkOrderId = true; // Giá trị của vnp_TxnRef tồn tại trong CSDL của merchant
        boolean checkAmount = true; //Kiểm tra số tiền thanh toán do VNPAY phản hồi(vnp_Amount/100) với số tiền của đơn hàng merchant tạo thanh toán: giả sử số tiền kiểm tra là đúng.
        boolean checkOrderStatus = true; // Giả sử PaymnentStatus = 0 (pending) là trạng thái thanh toán của giao dịch khởi tạo chưa có IPN.
        if (checkOrderId) {
            if (checkAmount) {
                if (checkOrderStatus) {
                    if ("00".equals(request.getParameter("vnp_ResponseCode"))) {
                        //Xử lý/Cập nhật tình trạng giao dịch thanh toán "Thành công"
                         out.print("GD Thanh cong");
                    } else {
                        //Xử lý/Cập nhật tình trạng giao dịch thanh toán "Không thành công"
                        //  out.print("GD Khong thanh cong");
                    }
                    out.print("{\"RspCode\":\"00\",\"Message\":\"Confirm Success\"}");
                } else {
                    //Trạng thái giao dịch đã được cập nhật trước đó
                    out.print("{\"RspCode\":\"02\",\"Message\":\"Order already confirmed\"}");
                }
            } else {
                //Số tiền không trùng khớp
                out.print("{\"RspCode\":\"04\",\"Message\":\"Invalid Amount\"}");
            }
        } else {
            //Mã giao dịch không tồn tại
            out.print("{\"RspCode\":\"01\",\"Message\":\"Order not Found\"}");
        }

    } else {
        // Sai checksum
        out.print("{\"RspCode\":\"97\",\"Message\":\"Invalid Checksum\"}");
    }

      out.write('\r');
      out.write('\n');
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
