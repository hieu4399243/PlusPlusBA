/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet("/RegisterSevlet")
public class RegisterSevlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // lấy đối tượng
        // chuyển hướng tới trang
        request.getRequestDispatcher("/views/register.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String married = request.getParameter("married");
        String nation = request.getParameter("nationality");
        String[] favorities = request.getParameterValues("favorities");
        String note = request.getParameter("note");

        request.setAttribute("username", username);
        request.setAttribute("password", password);
        
        // nối chuỗi
        StringBuilder sb = new StringBuilder();
        for (String item : favorities) {
            sb.append(item).append(", ");
        }

        request.setAttribute("favorities", sb.toString());
        

        request.getRequestDispatcher("/views/register.jsp").forward(request, response);

    }

}
