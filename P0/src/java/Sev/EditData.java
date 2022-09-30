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
public class EditData extends HttpServlet {

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
        SdorData sdorDatainfo = (SdorData) session.getAttribute("sdorData");
        PrintWriter out = response.getWriter();

        out.println("<head><div style=\"text-align: center;font-size:  50px\" >แก้ไขข้อมูลนักศึกษา</div></head>");
        out.println("<html><body>");
        out.println("<form action='DetailS'>");
        out.println("<html><body><br><br><div style=\"text-align: center;font-size:  18px\" >");
        out.println("ชื่อ - นามสกุล <input type='text' name='NameS' value=" + sdorDatainfo.getNameS() + "><br>");
        out.println("<br>");
        out.println("รหัสนักศึกษา <input type='text' name='Sid' value=" + sdorDatainfo.getSid() + "><br>");
        out.println("<br>");
        out.println("เพศ");
        if (sdorDatainfo.getSex().trim().equals("ชาย")) {
            out.println("<input type='radio' name='Sex' value='ชาย' Checked>ชาย ");
        } else {
            out.println("<input type='radio' name='Sex' value='ชาย'>ชาย ");
        }
        if (sdorDatainfo.getSex().trim().equals("หญิง")) {
            out.println("<input type='radio' name='Sex' value='หญิง' Checked>หญิง ");
        } else {
            out.println("<input type='radio' name='Sex' value='หญิง'>หญิง " + "<br>");
        }
        out.println("<br>");
        out.println("ชั้นปีที่  <select name='Classyear' id='Classyear'>\n"
//                + "<option value='1'>1</option>\n"
//                + "<option value='2'>2</option>\n"
//                + "<option value='3'>3</option>\n"
//                + "<option value='4'>4</option>\n"
//                + "<option value='5'>5</option>\n"
//                + "<option value='6'>6</option>\n"
                + "</select>" + "<br>");
        out.println("<br>");
//        out.println("ชั้นปีที่  <input type='text' name='Classyear' value=" + sdorDatainfo.getClassyear() + "><br>");
        out.println("เบอร์โทรติดต่อ <input type='text' name='Phone' value=" + sdorDatainfo.getPhone() + "><br>");
        out.println("<br>");
        out.println("เบอร์โทรติดต่อผู้ปกครอง <input type='text' name='PPhone' value=" + sdorDatainfo.getPPhone() + "><br>");
        out.println("<br>");
        out.println("ชื่อผู้ปกครองที่ติดต่อได้ <input type='text' name='Pname' value=" + sdorDatainfo.getPname() + "><br><br>");

        out.println("<form action='DetailS'>");
        out.println("<br><input type='submit' value='แก้ไข'>");
        out.println("<div align=\"left\"><a a href=\"index.html\"><input type='button' value='กลับหน้าหลัก'></a></div>");
//        out.println("<a a href=\"index.html\">ต่อไป</a>");
        out.println("</body></html></form>");
        session.removeAttribute("sdorData");
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
