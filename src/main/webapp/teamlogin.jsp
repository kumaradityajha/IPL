<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome To Team Login</h1>
<body>

<h1>${msg}</h1>

<form action="teamlogin">

Username: <input type="text" name="username" placeholder="Emter Your Username">
<br>
<br>
Password: <input type="password" name="password" placeholder="Emter Your Password">
<br>
<br>
<button>Submit</button>   <button type="reset">Cancel</button>
</body>
</html>