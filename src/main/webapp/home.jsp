<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Add Alien's Data</h1>
<form action="addAlien">
<table border="1">
<tr>
<td>Alien Id</td><td><input type="text" name="aid"/>
</tr>
<tr>
<td>Alien Name</td><td><input type="text" name="aname"/>
</tr>
<tr>
<td></td><td><input type="submit" value="Submit"/>
</tr>
</table>
</form>

<h1>Get Single Alien's Data</h1>
<form action="getAlien">
<table border="1">
<tr>
<td>Alien Id</td><td><input type="text" name="aid"/>
</tr>
<tr>
<td></td><td><input type="submit" value="Submit"/>
</tr>
</table>
</form>


</div>
</body>
</html>