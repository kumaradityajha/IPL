<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="special" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>viewall.players</title>
</head>
<body>
<h1>Welcome To View All Players </h1>
<h1>${msg}</h1>
<table border="1">

<tr>

<th>Player Name</th>
<th>Role</th>
<th>Country</th>
<th>Base Price</th>
<th>Status</th>
<th>Change Status</th>

</tr>

<special:forEach var="player" items="${players}">

<tr>
<th>${player.getName()}</th>
<th>${player.getRole()}</th>
<th>${player.getCountry()}</th>
<th>${player.getPrice()}</th>
<th>${player.getStatus()}</th>
<th><a href="changeplayerstatus?id=${player.getId()}"><button>Change Status</button></a></th>

</tr>


</special:forEach>



</table>

</body>
</html>