<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
     
    
     
          
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="special" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>viewall.teams</title>
</head>
<body>
<h1>Welcome To View All Teams List Page</h1>

<table border="1" cellspacing="0" cellpadding="8">
<tr>

<th>id</th>
<th>Team Name</th>
<th>Username</th>
<th>Wallet</th>
<th>Status</th>
<th>Players</th>
<th>Change Status</th>
<th>Add Amount</th>

</tr>

<special:forEach var="team" items="${teams}">

<tr>
<td>${team.getTid()}</td>
<td>${team.getTeamname()}</td>
<td>${team.getUsername()}</td>
<td>${team.getWallet()}</td>
<td>${team.isStatus()}</td>
<td><a href="viewplayers?id=${team.getTid()}"><button>View Players</button></a></td>
<td><a href="changestatus?id=${team.getTid()}"><button>Change Status</button></a></td>
<td>Add Amount</td>

</tr>

</special:forEach>


</table>
</body>
</html>