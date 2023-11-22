<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="special" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>managementsignup.jsp</title>
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

.form-container {
  width: 300px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  background-color: #fff;
  border-radius: 5px;
}

.form-label {
  display: block;
  margin-bottom: 5px;
  font-weight: bold;
}

.form-input {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 3px;
  margin-bottom: 10px;
}

.form-button {
  padding: 10px 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  cursor: pointer;
  background-color: #008CBA;
  color: #fff;
}

.form-button:hover {
  background-color: #007bff;
}

</style>
</head>
<body>
<h1>Welcome to Management Sign up</h1>

<special:form action="managementsignup" modelAttribute="management">

Username: <special:input path="username"/>
<br>
<br>

Password: <special:input path="password"/>
<br>
<br>

<special:button>Signup</special:button>  <special:button type="reset">Cancel</special:button>



</special:form>

</body>
</html>