<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>management.login</title>
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

form {
  width: 300px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  background-color: #fff;
  border-radius: 5px;
}

input[type="text"], input[type="password"] {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 3px;
  margin-bottom: 10px;
}

button {
  padding: 10px 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  cursor: pointer;
  background-color: #008CBA;
  color: #fff;
}

button:hover {
  background-color: #007bff;
}

</style>
</head>

<h1>${msg}</h1>
<body>

<h1>Welcome To Management Login</h1>

<form action="managementlogin">

Username: <input type="text" name="username" placeholder="Emter Your Username">
<br>
<br>
Password: <input type="password" name="password" placeholder="Emter Your Password">
<br>
<br>
<button>Submit</button>   <button type="reset">Cancel</button>




</form>

</body>
</html>