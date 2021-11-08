<%-- 
    Document   : InsertApartment
    Created on : Nov 6, 2021, 6:30:10 AM
    Author     : win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="insert" method="POST">
            <table border="0">
                    <tr>
                        <td>ApartName: </td>
                        <td><input type="text" name="txtApartName" value="" /></td>
                    </tr>
                    <tr>
                        <td>HoseName</td>
                        <td><input type="text" name="txtHoseName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><input type="text" name="txtPhone" value="" /></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><input type="text" name="txtPrice" value="" /></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="txtAddress" value="" /></td>
                    </tr>
                    <tr>
                        <td>Description</td>
                        <td><textarea name="mlDescriptipn" rows="4" cols="20">
                            </textarea></td>
                    </tr>
                    <tr>
                        <td>Total</td>
                        <td><input type="text" name="txtTotal" value="" /></td>
                    </tr>
                    <tr>
                        <td>Area</td>
                        <td><input type="text" name="txtArea" value="" /></td>
                    </tr>
                    <tr>
                        <td>Image</td>
                        <td><input type="text" name="txtImage" value="" /></td>
                    </tr>
                    <tr>
                        <td>Image1</td>
                        <td><input type="text" name="txtImage1" value="" /></td>
                    </tr>
                    <tr>
                        <td>Image2</td>
                        <td><input type="text" name="txtImage2" value="" /></td>
                    </tr>
                    <tr>
                        <td>Image3</td>
                        <td><input type="text" name="txtImage3" value="" /></td>
                    </tr>
                    <tr>
                        <td>TotalNow</td>
                        <td><input type="text" name="txtTotalNow" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Insert" /></td>
                    </tr>
            </table>
    </body>
</html>
