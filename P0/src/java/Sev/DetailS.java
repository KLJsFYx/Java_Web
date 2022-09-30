/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Sev;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.SdorData;

/**
 *
 * @author tokyo
 */
public class DetailS extends HttpServlet {

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

        String NameS = request.getParameter("NameS");
        String Sid = request.getParameter("Sid");
        String Sex = request.getParameter("Sex");
        String Classyear = request.getParameter("Classyear");
        int Phone = Integer.parseInt(request.getParameter("Phone"));
        int PPhone = Integer.parseInt(request.getParameter("PPhone"));
        String Pname = request.getParameter("Pname");

        SdorData sdorData = new SdorData();
        sdorData.setNameS(NameS);
        sdorData.setSid(Sid);
        sdorData.setSex(Sex);
        sdorData.setClassyear(Classyear);
        sdorData.setPhone(Phone);
        sdorData.setPPhone(PPhone);
        sdorData.setPname(Pname);

        session.setAttribute("sdorData", sdorData);

        PrintWriter out = response.getWriter();
        out.println("<head><div style=\"text-align: center;font-size:  50px\" >ข้อมูลนักศึกษา</div></head>");
        out.println("<html><body>");
        out.println("<html><body><br><br><div style=\"text-align: center;font-size:  18px\" >"
                + " ชื่อ-นาสกุล : " + NameS
                + "</br><br> รหัสนักศึกษา : " + Sid
                + "</br><br> เพศ : " + Sex
                + "</br><br> ชั้นปี : " + Classyear
                + "</br><br> เบอร์โทีศัพท์ที่ติดต่อได้ : 0" + Phone
                + "</br><br> เบอร์โทรศัพท์ผู้ปกครอง : 0" + PPhone
                + "</br><br> ชื่อผู้ปกครองที่ติดต่อได้ : " + Pname + "<br><br>");
        out.println("<form action='EditData'>");
        out.println("<input type='submit' value='แก้ไข'>");
        out.println("<div align=\"left\"><a a href=\"index.html\"><input type='button' value='กลับหน้าหลัก'></a></div>");
        out.println("<div align=\"right\"><a href=\"SaveToFireBase.jsp\">Save To Database</a></div>");
        out.println("</body></html></form>");

        out.close();
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
