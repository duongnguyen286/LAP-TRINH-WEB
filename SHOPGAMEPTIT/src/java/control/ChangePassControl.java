/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import util.MaHoa;

/**
 *
 * @author Duong Nguyen
 */
@WebServlet(name = "ChangePassControl", urlPatterns = {"/changepass"})
public class ChangePassControl extends HttpServlet {

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
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        String pass = request.getParameter("pass");        
        String newpass = request.getParameter("newpass");
        String newpassword = request.getParameter("newpassword");
        String pass1 = MaHoa.md5(request.getParameter("pass"));
        if(!account.getPass().equals(pass1)){
            request.setAttribute("mess", "Nhập lại mật khẩu hiện tại");
            request.getRequestDispatcher("ChangePass.jsp").forward(request, response);
        }
        else if(!newpass.equals(newpassword)){
            request.setAttribute("mess", "Nhập lại mật khẩu mới");
            request.getRequestDispatcher("ChangePass.jsp").forward(request, response);
        }
        else{
            String pass2 = MaHoa.md5(request.getParameter("newpass"));
            DAO dao=new DAO();
            dao.changePass(account.getUsername(), pass2);
            request.getRequestDispatcher("Login.jsp").forward(request, response);
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
