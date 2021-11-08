<%-- 
    Document   : addApartMent
    Created on : Nov 6, 2021, 5:47:01 AM
    Author     : win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/manage.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <form action="manager" method="GET">
            <h5><a href="insert">Insert</a></h5>
            <table border="1">
                <tr>
                    <td>ApartID</td>
                    <td>ApartName</td>
                    <td>HoseName</td>
                    <td>Phone</td>
                    <td>Price</td>
                    <td>Address</td>
                    <td>Description</td>
                    <td>Total</td>
                    <td>Area</td>
                    <td>Image</td>
                    <td>Image1</td>
                    <td>Image2</td>
                    <td>Image3</td>
                    <td>TotalNow</td>
                    <td>Update</td>
                    <td>Delete</td>
                </tr>
                <c:forEach items="${apartmentmanager}" var="ar">
                    <tr>
                        <td>${ar.apartID}</td>
                        <td>${ar.apartName}</td>
                        <td>${ar.hoseName}</td>
                        <td>${ar.phone}</td>
                        <td>${ar.price}</td>
                        <td>${ar.address}</td>
                        <td>${ar.description}</td>
                        <td>${ar.total}</td>
                        <td>${ar.area}</td>
                    
                        <td class="image"><img src="${ar.image}"/></td>
                        <td class="image"><img src="${ar.image1}"/></td>
                        <td class="image"><img src="${ar.image2}"/></td>
                        <td class="image"><img src="${ar.image3}"/></td>
                        <td>${ar.totalNow}</td>
                        <td><a href="update?ID=${ar.apartID}">Update</a></td>
                     <!--   <td><a href="delete?ID=${ar.apartID}">Delete</a></td> -->
                        <td><a href="#" onclick="showMess(${ar.apartID})">Delete</a></td>
                    </tr>

                </c:forEach>
            </table>

        </form>
    </body>
    <script>
            function showMess(apartID) {
                var option = confirm('Are you sure to delete');
                if (option === true) {
                    window.location.href = 'delete?ID=' + apartID;
                }
            }
        </script>
</html>
