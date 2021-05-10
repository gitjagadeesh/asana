<%@ page import="com.asana.command.Student" %>
<%!
  Student std1;
%>
<%
 std1=(Student)request.getAttribute("std1");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<style type="text/css">
#sega
{
  background-color:black;
}
   .navbar
   {
      background-color:green;
     
      margin:0px;
   }
   #table td
   {
     padding-left:10px;
     padding-right:10px;
     padding-top:5px;
     padding-bottom:5px;
   }
   .navbar a:hover
   {
     color:white;
   }
   #welcome
   {
     background-image:url("https://images.unsplash.com/photo-1528459584353-5297db1a9c01?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
     background-size:100% 100%;
     width:100%;
     height:700px;
     padding-top:100px;
     margin:0px;
     background-repeat:no-repeat;
   }
   
</style>
</head>
<body>
<nav class="navbar navbar-default navbar-inverse" id="sega" >
   <div class="navbar-header" >
     <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#demo">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
     </button>
   </div>
   <div class="collapse navbar-collapse" id="demo">
     <ul class="nav navbar-nav navbar-right">
       <li style="color:red;"><a href="home.html">Logout&nbsp;<span class="glyphicon glyphicon-log-out"></span></a></li>
     </ul>
   </div>
</nav>
<div class="container" id="welcome">
 <h1 style="text-align:center; color:green;">User Login Success</h1>
<h1 style="text-align:center;color:red;">welcome to our world</h1>
</div>
</body>
</html>