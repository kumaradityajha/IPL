<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup.jsp</title>
<style type="text/css">

body {
  font-family: sans-serif;
  background-color: #f2f2f2;
}

h1 {
  text-align: center;
}

form {
  width: 300px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
}

input[type="radio"] {
  margin-right: 10px;
}

button {
  padding: 5px 10px;
  border: 1px solid #ccc;
  cursor: pointer;
}

button:hover {
  background-color: #eee;
}


</style>
</head>
<body>
<h1>Welcome to Signup Page</h1>


<form action="signup">

<h1>Choose your role</h1>

<input type="radio" name="role" value="Management"> Management <br><br>
<input type="radio" name="role" value="Team"> Team <br><br>
<input type="radio" name="role" value="Player"> Player <br><br>


<button type="submit">Submit</button> <button type="reset">Cancel</button> 







</form>




</body>
</html>