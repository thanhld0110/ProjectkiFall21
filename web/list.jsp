<%-- 
    Document   : list
    Created on : Nov 2, 2021, 5:42:04 AM
    Author     : win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/pagger.js" type="text/javascript"></script>
    </head>
    <body>
        <table border="0">


            <tr>
                <td>ID</td>
                <td>Name</td>
            </tr>
            <c:forEach items="${requestScope.apartmentss}" var="ap">
                <tr>
                    <td>${ap.apartId}</td>
                    <td>${ap.image}</td>
                </tr>
            </c:forEach>

             
        </table>
        <div id="paggerBottom"></div>
        <script>
            createPagger('paggerBottom',${requestScope.pageindex},2,${requestScope.totalpage})
        </script>
    </body>
</html>
