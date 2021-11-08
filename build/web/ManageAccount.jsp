<%-- 
    Document   : ManageAccount
    Created on : Nov 8, 2021, 6:31:14 AM
    Author     : win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="manageAdmin" method="GET">
            <h5><a href="insertAdmin">Insert</a></h5>
            <table border="1">
                    <tr>
                        <td>Id</td>
                        <td>Username</td>
                        <td>Password</td>
                        <td>Host</td>
                        <td>Update</td>
                        <td>Delete</td>
                    </tr>
                    <c:forEach items="${listacc}" var="l">
                        <tr>
                        <td>${l.id}</td>
                        <td>${l.username}</td>
                        <td>${l.password}</td>
                        <td>${l.host}</td>
                        <td><a href="update?ID=${l.id}">Update</a></td>
                        <td><a href="#" onclick="showMess(${l.id})">Delete</a></td>
                    </tr>
                    </c:forEach>
                    
            </table>

        </form>
    </body>
</html>
