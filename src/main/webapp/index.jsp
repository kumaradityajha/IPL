<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<style type="text/css">
body {
  font-family: sans-serif;
  background-color: #f2f2f2;
  margin: 0;
  padding: 0;
  height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
}

h1 {
  text-align: center;
  font-size: 36px;
  color: #333;
  margin-bottom: 20px;
}

a {
  text-decoration: none;
  color: #007bff;
  font-weight: bold;
  padding: 10px 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  background-color: #fff;
  cursor: pointer;
}

a:hover {
  background-color: #eee;
}

</style>
</head>
<h1>${msg}</h1>
<a href="Managementlogin.jsp">Login as Manangement</a>
<a href="playerlogin.jsp">Login as Player</a>
<a href="teamlogin.jsp">Login as Team</a>
<body>

</body>
</html>