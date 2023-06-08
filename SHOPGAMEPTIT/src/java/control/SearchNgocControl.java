/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.SEARCH;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VXH
 */
@WebServlet(name = "SearchNgocControl", urlPatterns = {"/searchng"})
public class SearchNgocControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         String ngoc = request.getParameter("ngoc");
        SEARCH search = new SEARCH();
        if (ngoc.equals("co")) {
                String indexP = request.getParameter("indexs");
                int index = Integer.parseInt(indexP);
                List<Product> list = search.searchProductNgoc("CÓ", index, 8);
                request.setAttribute("List", list);
                int count = search.countSearchNgoc("CÓ");
                int endPage = count / 8;
                if (count % 8 != 0) {
                    endPage++;
                }
                request.setAttribute("endPage", endPage);
                request.setAttribute("cnt", index);
                request.setAttribute("ngoc", ngoc);

                request.getRequestDispatcher("SearchNgoc.jsp").forward(request, response);
            } else {
                String indexP = request.getParameter("indexs");
                int index = Integer.parseInt(indexP);
                List<Product> list = search.searchProductNgoc("KHÔNG", index, 8);
                request.setAttribute("List", list);
                int count = search.countSearchNgoc("KHÔNG");
                int endPage = count / 8;
                if (count % 8 != 0) {
                    endPage++;
                }
                request.setAttribute("endPage", endPage);
                request.setAttribute("cnt", index);
                request.setAttribute("ngoc", ngoc);

                request.getRequestDispatcher("SearchNgoc.jsp").forward(request, response);
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
