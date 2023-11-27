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
<th>${team.getTid()}</th>
<th>${team.getTeamname()}</th>
<th>${team.getUsername()}</th>
<th>${team.getWallet()}</th>
<th>${team.isStatus()}</th>
<th><a href="viewplayers?id=${getTid()}"><button>View Players</button></a></th>
<th>Change Status</th>
<th>Add Amount</th>

</tr>

</special:forEach>


</table>
</body>
</html>