<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add.amount</title>
</head>
<body>

<h1>Welcome To Add Amount Page</h1>

<%  int id = (Integer.parseInt(request.getParameter("id"))); %>

<h1>Add Amount</h1>

<form action="addamount">

Add Amount: <input type="text" name="amount" placeholder="Enter The Amount To Be Added">

<input type="text" name="id" value="<%=id%>" hidden="hidden">
<br>
<br>
<button>Add Amount</button>   <button type="reset">Cancel</button>


</form>

</body>
</html>