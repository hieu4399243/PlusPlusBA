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
@WebServlet({"/TamGiacSevlet/chuvi","/TamGiacSevlet/dientich"})// truy cập sevlet
public class TamGiacSevlet extends HttpServlet {


    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // lấy đối tượng
        RequestDispatcher rd=request.getRequestDispatcher("/views/TamGiac.jsp");
        rd.forward(request, response);
        
        
    }

 
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uri=request.getRequestURI();// lựa chọn tính chu vi hay tính diện tích
        // lấy giá trị người dùng nhập vào
        RequestDispatcher rd=request.getRequestDispatcher("/views/TamGiac.jsp");
        String ast=request.getParameter("a");
        String bst=request.getParameter("b");
        String cst=request.getParameter("c");
        
        // khai báo biến
        float a=Float.parseFloat(ast);
        float b=Float.parseFloat(bst);
        float c=Float.parseFloat(cst);
        
        if((a+b > c) && (b+c>a) && (a+c>b)){
            if(uri.contains("chuvi")){
                float cv =tinhChuVi(a,b,c);
                request.setAttribute("message", "Chu vi cua tam giac la: "+cv);
                
            }else{
                float dt=tinhDienTich(a,b,c);
              
                request.setAttribute("message", "Dien tich cua tam giac la: "+dt);
            }
            
        }else{
            request.setAttribute("message", "Invalid");
            
        }
        rd.forward(request, response);
        
        
    }

    private float tinhChuVi(float a, float b, float c) {
       
        return a+b+c;
    }

    private float tinhDienTich(float a, float b, float c) {
        float s=(a+b+c)/2;
        float dt=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return dt;
    }

    


}
