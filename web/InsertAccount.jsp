<%-- 
    Document   : InsertAccount
    Created on : Nov 8, 2021, 6:42:01 AM
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
        <form action="insertAdmin" method="POST">
            <table border="0">
                
                
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="txtAddUser" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="txtAddPass" value="" /></td>
                    </tr>
                    <tr>
                        <td>Host</td>
                        <td><input type="radio" name="host" value="" /> admin
                            <input type="radio" name="host" value="" /> user
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Insert" /></td>
                    </tr>
                
            </table>

        </form>
    </body>
</html>
