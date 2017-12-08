<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="design.css">
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1255">

<title>Events Table</title>
</head>


<body>

	<!-- Sidebar -->
	<div class="sidenav">
		<a href="#Event Table">Events Table</a>
		 <a href="#Logs Table">Logs
			Table</a>
	</div>



	<div class="main">
		<h1>Events Table</h1>
		<br> <br>
		<table id="myTable" >
			<tr>
					<th>ID</th>
					<th>Location</th>
					<th>status</th>
					<th>Date time</th>
					<th>Log text</th>


				</tr>
				
	<c:forEach items="${posts}" var="post"><tr>
     <td>${post.id}</td>
     <td>${post.location}</td>
     <td>${post.ststus}</td>
     <td>${post.dateTime}</td>
     <td>${post.logText}</td>
   </tr>
  </c:forEach>
				
		</table>
	</div>
</body>
</html>

