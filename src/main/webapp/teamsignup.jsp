<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="special" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome To Team SignUp Page</h1>
<body>
<special:form action="teamsignup" modelAttribute="team">

Name: <special:input path="teamname"/>
<br>
<br>
Username: <special:input path="username"/>
<br>
<br>
Password: <special:input path="password"/>
<br>
<br>
Wallet: <special:input path="wallet"/>

<special:button>SignUp</special:button>        <special:button>Cancel</special:button>

</special:form>

</body>
</html>