<%@page import="java.util.concurrent.ExecutionException"%>
<%@page import="model.User"%>
<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SingUp</title>
</head>
<body>
<%
String email = request.getParameter("email");
UserDao db = new UserDao();
if(db.checkEmail(email))
{
	out.print("Email Id already exists");
}
else
{



String fname = request.getParameter("fname");
String lname = request.getParameter("lname");

String pnum = request.getParameter("pnum");
String pws = request.getParameter("pws");
String term = request.getParameter("term");


User u = new User(fname,lname,email,pnum,pws,term);

try{
	

int a = db.save(u);

if(a>0)
{
	out.print("Welcome user : "+email);
}
else
{
	out.print("user not registered");
}
}
catch(Exception e){
	e.printStackTrace();
	out.print("error sql");
	
}
}

%>
<%--<b> Form Data </b>
<%=fname %>
<%=lname %>
<%=email %>
<%=pnum %>
<%=pws %>
<%=term %>--%>
</body>
</html>