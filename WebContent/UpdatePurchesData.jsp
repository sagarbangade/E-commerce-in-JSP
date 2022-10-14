<%@page import="model.PurchesDao"%>
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
		int pId=Integer.parseInt(request.getParameter("pId"));
		String pName = request.getParameter("pname");
		String uName = request.getParameter("uname");
		String status = request.getParameter("status");
		String date = request.getParameter("Date");
		
		int a = new PurchesDao().updatePurchesData(pId, pName, uName, status, date);
		if(a>0)
		{
			response.sendRedirect("Dashboard.jsp");
		}
		else
		{
			out.print("Error Product Not Updated");
		}
%>
		
		
</body>
</html>