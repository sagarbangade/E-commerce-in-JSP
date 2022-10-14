<%@page import="model.Purches"%>
<%@page import="model.PurchesDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="css/style.css">

    <title>Update</title>
  </head>
  <body>
 
  
  <%
      	int pId=Integer.parseInt(request.getParameter("pId"));

try
{
	
	  Purches p = new PurchesDao().updatePurches(pId);
      	
%>
  
  
  
  
  
  
  
  

  <div class="d-lg-flex half">
    <div class="bg order-1 order-md-2" style="background-image: url('images/bg_1.jpg');"></div>
    <div class="contents order-2 order-md-1">

      <div class="container">
        <div class="row align-items-center justify-content-center">
          <div class="col-md-7 py-5">
            <h3>Update</h3>
           
            <form action="UpdatePurchesData.jsp" method="post">
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group first">
                    <label for="fname">Title</label>
                    <input type="text" name = "pname" class="form-control" value="<%=p.getpName() %>" id="fname">
                  </div>    
                </div>
                <div class="col-md-6">
                  <div class="form-group first">
                    <label for="uname">User Name</label>
                    <input type="text" name  = "uname" class="form-control" value="<%=p.getuName() %>" id="lname">
                  </div>    
                </div>
              </div>
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group first">
                    <label for="status">Status</label>
                    <input type="text" name= "status" class="form-control" value="<%=p.getStatus() %>" id="email">
                  </div>    
                </div>
              </div>
              <div class="col-md-6">
                  <div class="form-group first">
                    <label for="uname">Product ID</label>
                    <input type="text" name  = "pId" class="form-control" value="<%=p.getpId() %>" id="lname">
                  </div>    
                </div>
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group first">
                    <label for="lname">Date</label>
                    <input type="text" name = "Date" class="form-control" value="<%=p.getDate() %>" id="lname">
                  </div>    
                </div>
                </div>
              
              <div class="d-flex mb-5 mt-4 align-items-center">
                <div class="d-flex align-items-center">
                <label class="control control--checkbox mb-0"><span class="caption">Updating an Data means you're okay with our <a href="#">Terms and Conditions</a> and our <a href="#">Privacy Policy</a>.</span>
                  <input type="checkbox" name="term" checked="checked"/>
                  <div class="control__indicator"></div>
                </label>
              </div>
              </div>

              <input type="submit" value="Register" class="btn px-5 btn-primary">

            </form>
          </div>
        </div>
      </div>
    </div>

    
  </div>
    
    <%
     }
    catch(Exception e)
    {
    	out.print("error : "+e);
    }
    %>

    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
  </body>
</html>