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
@WebServlet(name = "SearchPriceControl", urlPatterns = {"/searchpr"})
public class SearchPriceControl extends HttpServlet {

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
        String giatien = request.getParameter("giatien");
        SEARCH search = new SEARCH();
        if (!giatien.equals("#")) {

            if (giatien.equals("duoi50") ) {
                String indexP = request.getParameter("indexs");
                int index = Integer.parseInt(indexP);
                List<Product> list = search.searchProductPrice1("50000", index, 8);
                request.setAttribute("List", list);
                int count = search.countSearchPrice1("50000");
                int endPage = count / 8;
                if (count % 8 != 0) {
                    endPage++;
                }
                request.setAttribute("endPage", endPage);
                request.setAttribute("cnt", index);
                request.setAttribute("giatien", giatien);

                request.getRequestDispatcher("SearchPrice.jsp").forward(request, response);
            } else if (giatien.equals("tu50den200")) {
                String indexP = request.getParameter("indexs");
                int index = Integer.parseInt(indexP);
                List<Product> list = search.searchProductPrice2("50000", "200000", index, 8);
                request.setAttribute("List", list);
                int count = search.countSearchPrice2("50000", "200000");
                int endPage = count / 8;
                if (count % 8 != 0) {
                    endPage++;
                }
                request.setAttribute("endPage", endPage);
                request.setAttribute("cnt", index);
                request.setAttribute("giatien", giatien);

                request.getRequestDispatcher("SearchPrice.jsp").forward(request, response);
            } else if (giatien.equals("tu200den500")) {
                String indexP = request.getParameter("indexs");
                int index = Integer.parseInt(indexP);
                List<Product> list = search.searchProductPrice2("200000", "500000", index, 8);
                request.setAttribute("List", list);
                int count = search.countSearchPrice2("50000", "200000");
                int endPage = count / 8;
                if (count % 8 != 0) {
                    endPage++;
                }
                request.setAttribute("endPage", endPage);
                request.setAttribute("cnt", index);
                request.setAttribute("giatien", giatien);

                request.getRequestDispatcher("SearchPrice.jsp").forward(request, response);
            } else if (giatien.equals("tu500den1tr")) {
                String indexP = request.getParameter("indexs");
                int index = Integer.parseInt(indexP);
                List<Product> list = search.searchProductPrice2("500000", "1000000", index, 8);
                request.setAttribute("List", list);
                int count = search.countSearchPrice2("50000", "200000");
                int endPage = count / 8;
                if (count % 8 != 0) {
                    endPage++;
                }
                request.setAttribute("endPage", endPage);
                request.setAttribute("cnt", index);
                request.setAttribute("giatien", giatien);

                request.getRequestDispatcher("SearchPrice.jsp").forward(request, response);
            } else if (giatien.equals("tren1tr")) {
                String tien = "1000000";
                String indexP = request.getParameter("indexs");
                int index = Integer.parseInt(indexP);
                List<Product> list = search.searchProductPrice3(tien, index, 8);
                request.setAttribute("List", list);
                int count = search.countSearchPrice3(tien);
                int endPage = count / 8;
                if (count % 8 != 0) {
                    endPage++;
                }
                request.setAttribute("endPage", endPage);
                request.setAttribute("cnt", index);
                request.setAttribute("giatien", giatien);
                request.getRequestDispatcher("SearchPrice.jsp").forward(request, response);
            } else {
                String indexP = request.getParameter("indexs");
                int index = Integer.parseInt(indexP);
                List<Product> list = search.searchProductPrice3("5000000", index, 8);
                request.setAttribute("List", list);
                int count = search.countSearchPrice3("5000000");
                int endPage = count / 8;
                if (count % 8 != 0) {
                    endPage++;
                }
                request.setAttribute("endPage", endPage);
                request.setAttribute("cnt", index);
                request.setAttribute("giatien", giatien);

                request.getRequestDispatcher("SearchPrice.jsp").forward(request, response);
            }
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
