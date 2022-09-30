<%-- 
    Document   : AddS
    Created on : Aug 1, 2022, 10:23:15 PM
    Author     : tokyo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.SdorData"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ลงทะเบียนสำเร็จ</title>
    </head>
    <body>
        <form Style='TEXT-align:CENTER' ​>
        <h1>ลงทะเบียนสำเร็จ</h1>
        <%
            SdorData sdorDatainfo = (SdorData) session.getAttribute("sdorData");
        %>
             
        ชื่อ-นามสกุล : <%= sdorDatainfo.getNameS()%><br><br>
        
        รหัสนักศึกษา : <%=sdorDatainfo.getSid()%><br><br>
        
        เพศ : <%=sdorDatainfo.getSex()%><br><br>
        
        ชั้นปีที่ :<%=sdorDatainfo.getClassyear()%><br><br>
        
        เบอร์โทรติดต่อ : <%=sdorDatainfo.getPhone()%><br><br>
        
        เบอร์โทรติดต่อผู้ปกครอง : <%=sdorDatainfo.getPPhone()%><br><br>
        
        ชื่อผู้ปกครองที่ติดต่อได้ :<%=sdorDatainfo.getPname()%><br><br>
        
        <a href="Update.jsp">แก้ไขข้อมูล</a>
        
        <a href="index.html">หน้าหลัก</a>
        
        <a href="SaveToFireBase.jsp">Save To Database</a>
        
        </form>
    </body>
</html>
