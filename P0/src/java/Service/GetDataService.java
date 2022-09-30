/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SData;
import model.SdorData2;
import org.json.JSONObject;

/**
 *
 * @author tokyo
 */
public class GetDataService extends HttpServlet {

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
        String requestUrl = request.getRequestURI();
        String NameS = requestUrl.substring("/P0/GetDataService/".length());
        SdorData2 sdorData2 = SData.getInstance().getSdorData(NameS);
        if (sdorData2 != null) {
            String json = "{\n";
            json += "\"Name\": " + JSONObject.quote(sdorData2.getNameS()) + ",\n";
            json += "\"StudentID\": " + JSONObject.quote(sdorData2.getSid()) + ",\n";
            json += "\"Sex\": " + JSONObject.quote(sdorData2.getSex()) + "\n";
            json += "\"Classyear\": " + JSONObject.quote(sdorData2.getClassyear()) + "\n";
            json += "}";
            response.getOutputStream().println(json);
        } else {
            response.getOutputStream().println("{}");
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
