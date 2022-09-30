<%-- 
    Document   : Update
    Created on : Aug 1, 2022, 10:51:42 PM
    Author     : tokyo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.SdorData"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>แก้ไข</title>
    </head>
    <body>
        <h1><div style="text-align: center;font-size:  50px" >แก้ไข</div></h1>
        <form Style='TEXT-align:CENTER' action="DetailS2" >
            <%
                SdorData sdorDatainfo = (SdorData) session.getAttribute("sdorData");
            %>

            ชื่อ-นามสกุล : 
            <input type="text" name="NameS" value="<%= sdorDatainfo.getNameS()%>"><br><br>

            รหัสนักศึกษา : 
            <input text="type" name="Sid" value="<%=sdorDatainfo.getSid()%>"><br><br>

            เพศ : 
            <input type="radio" id="ชาย" name="Sex" value='<%=sdorDatainfo.getSex()%>'>
            <label for='Male'>ชาย</label>
            <input type="radio" id="หญิง" name="Sex" value='<%=sdorDatainfo.getSex()%>'>
            <label for='Female'>หญิง</label> <br>
            <br>

            ชั้นปีที่ :
            <select name="Classyear" id="Classyear" value="<%=sdorDatainfo.getClassyear()%>">
                <option value="<%=sdorDatainfo.getClassyear()%>">1</option>
                <option value="<%=sdorDatainfo.getClassyear()%>">2</option>
                <option value="<%=sdorDatainfo.getClassyear()%>">3</option>
                <option value="<%=sdorDatainfo.getClassyear()%>">4</option>
                <option value="<%=sdorDatainfo.getClassyear()%>">5</option>
                <option value="<%=sdorDatainfo.getClassyear()%>">6</option>
            </select>
            <br>
            <br>
            เบอร์โทรติดต่อ : 
            <input text="text" name="Phone" value="<%=sdorDatainfo.getPhone()%>" ><br><br>

            เบอร์โทรติดต่อผู้ปกครอง : 
            <input text="text" name="PPhone" value="<%=sdorDatainfo.getPPhone()%>" ><br><br>

            ชื่อผู้ปกครองที่ติดต่อได้ :
            <input text="type" name="Pname" value="<%=sdorDatainfo.getPname()%>"><br><br>
            <input type="submit" value="แก้ไข">
            </body></form>
</html>
