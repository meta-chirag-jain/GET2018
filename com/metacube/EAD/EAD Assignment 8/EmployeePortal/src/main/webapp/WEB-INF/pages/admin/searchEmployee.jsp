<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Employee</title>
</head>
<body>
    <form action="searchEmployee" method="post">
        <table>
            <tr>
                <td>Employee Name:</td>
                <td><input type="text" name="employeeName"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Search" /></td>
            </tr>
        </table>    
    </form>
</body>
</html>