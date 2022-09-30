<%-- 
    Document   : SaveToFireBase
    Created on : Aug 22, 2022, 9:33:05 PM
    Author     : tokyo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.SdorData"%>
<%
    SdorData sdorDatainfo = (SdorData) session.getAttribute("sdorData");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SaveToFireBase</title>
    </head>
    <body>
        <h1>SaveToFireBase</h1>
        <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.6.3/firebase-database.js"></script>

        <script>
            // Your web app's Firebase configuration
            var firebaseConfig = {
                apiKey: "AIzaSyAfJcFkhPKgRzM8hD9z7B5-mKdqM7OZ6co",
                authDomain: "sdormitory-fc7ad.firebaseapp.com",
                databaseURL: "https://sdormitory-fc7ad-default-rtdb.firebaseio.com",
                projectId: "sdormitory-fc7ad",
                storageBucket: "sdormitory-fc7ad.appspot.com",
                messagingSenderId: "425575540509",
                appId: "1:425575540509:web:768b45e801b34f4fdb23f4"

            };
            // Initialize Firebase
            firebase.initializeApp(firebaseConfig);
        </script>

         <p>
            <input type="button" value="Save" onclick="save_sdor();">
        </p>
        
        <script>
            var databaseRef = firebase.database().ref('sdormitory/');

            function save_sdor() {
                var uid = firebase.database().ref().child('sdormitory').push().key;

                var data = {
                    sdor_id: uid,
                    sdor_name: '<%= sdorDatainfo.getNameS()%>',
                    sdor_sid: '<%=sdorDatainfo.getSid()%>',
                    sdor_sex: '<%=sdorDatainfo.getSex()%>',
                    sdor_classyear: '<%=sdorDatainfo.getClassyear()%>',
                    sdor_phone: '<%=sdorDatainfo.getPhone()%>',
                    sdor_pphone: '<%=sdorDatainfo.getPPhone()%>',
                    sdor_pname: '<%=sdorDatainfo.getPname()%>'
                };

                var updates = {};
                updates['/sdormitory/' + uid] = data;
                firebase.database().ref().update(updates);

                alert('StudentDomitoryData is created successfully!');
                reload_page();
            }

            function reload_page() {
                window.location.reload();
            }

        </script>
        
    </body>
</html>
