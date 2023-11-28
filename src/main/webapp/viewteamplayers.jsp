<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="special" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view.team</title>
</head>

<body>

<h1>Welcome To View Team Players Names</h1>

<h1>${msg}</h1>

<%

String msg =(String)request.getAttribute("msg");

if(msg!=null)
{%>
	${msg}
<%}

else
{%>

<table border="1">

<tr>

<th>Name</th>
<th>Role</th>

</tr>

<special:forEach var="player" items="${players}">

<th>${player.getName()}</th>
<th>${player.getRole()}</th>

</special:forEach>


</table>
	
<%}


%>


</body>
</html>