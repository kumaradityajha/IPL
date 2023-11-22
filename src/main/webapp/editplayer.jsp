<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="special" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>player.edit</title>
</head>
<h1>Welcome to Player Edit Page</h1>
<body>
<special:form action="playerupdate" modelAttribute="player">

Id: <special:input path="id" hidden="true"/>
<br>
<br>

Name: <special:input path="name"/>
<br>
<br>
Username: <special:input path="username"/>
<br>
<br>
Password: <special:input path="password"/>
<br>
<br>

Role:

<special:select path="role">
<special:option value=" ">Select</special:option>
<br>
<br>
<special:option value="Batsman">Batsman</special:option>
<br>
<br>
<special:option value="Bowler">Bowler</special:option>
<br>
<br>
<special:option value="Allrounder">Allrounder</special:option>
<br>
<br>
<special:option value="WicketKeeper">WicketKeeper</special:option>
<br>
<br>





</special:select>






Country: <special:input path="country" hidden="true"/>
<br>
<br>
Status: <special:input path="status" hidden="true"/>
<br>
<br>
Base Price: <special:input path="price"/>
<br>
<br>

<special:button>Update</special:button>        <special:button>Cancel</special:button>





</special:form>

</body>
</html>