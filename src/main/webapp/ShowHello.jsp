<%-- 
    Document   : ShowHello
    Created on : Feb 5, 2018, 9:00:46 PM
    Author     : nawatsomnuek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <style type="text/css">
        body {
            background-color: skyblue;
            text-align: center;
            color: white;
            font-size: 350px;
        }

    </style>
    <body>
        <%=request.getAttribute("wordd")%>
    </body>
</html>
