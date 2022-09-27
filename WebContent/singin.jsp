<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String email=request.getParameter("email");
String pass=request.getParameter("pass");

if(new UserDao().checkUser(email, pass))
{
	out.print("welcome to Profile");
}
else
{
%>
	<script>
	   alert("Wrong username and password");
	   window.location= "singin.html";
	</script>
<%
}

%>
</body>
</html>