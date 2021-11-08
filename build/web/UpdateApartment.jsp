<%-- 
    Document   : UpdateController
    Created on : Nov 7, 2021, 11:44:47 AM
    Author     : win
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach items="${list}" var="p">
            <form action="update" method="POST">
            <table border="0">
                <input type="hidden" name="apartID" value="${p.apartID}" />
                <tr>
                    <td>ApartName: </td>
                    <td><input type="text" name="txtApartName" value="${p.apartName}" /></td>
                </tr>
                <tr>
                    <td>HoseName</td>
                    <td><input type="text" name="txtHoseName" value="${p.hoseName}" /></td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td><input type="text" name="txtPhone" value="${p.phone}" /></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><input type="text" name="txtPrice" value="${p.price}" /></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="txtAddress" value="${p.address}" /></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><textarea name="mlDescriptipn" rows="4" cols="20" >
                        ${p.description}</textarea></td>
                </tr>
                <tr>
                    <td>Total</td>
                    <td><input type="text" name="txtTotal" value="${p.total}" /></td>
                </tr>
                <tr>
                    <td>Area</td>
                    <td><input type="text" name="txtArea" value="${p.area}" /></td>
                </tr>
                <tr>
                    <td>Image</td>
                    <td><input type="text" name="txtImage" value="${p.image}" /></td>
                </tr>
                <tr>
                    <td>Image1</td>
                    <td><input type="text" name="txtImage1" value="${p.image1}" /></td>
                </tr>
                <tr>
                    <td>Image2</td>
                    <td><input type="text" name="txtImage2" value="${p.image2}" /></td>
                </tr>
                <tr>
                    <td>Image3</td>
                    <td><input type="text" name="txtImage3" value="${p.image3}" /></td>
                </tr>
                <tr>
                    <td>TotalNow</td>
                    <td><input type="text" name="txtTotalNow" value="${p.totalNow}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update" /></td>
                </tr>
            </table>
        </form>
        </c:forEach>
        
    </body>
</html>
