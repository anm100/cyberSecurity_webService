<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css1.css">
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1255">

<title>Events Table</title>
</head>


<body>

	
	 <br>
		<table id="myTable" >
			<tr>
					<th>ID</th>
					<th>HostID</th>
					<th>Location</th>
					<th>Status</th>
					<th>name</th>
					<th>client</th>
				</tr>
				
	<c:forEach items="${posts}" var="post"><tr>
     <td>${post.id}</td>
     <td>${post.hostID}</td>
     <td>${post.location}</td>
     <td>${post.status}</td>
     <td>${post.name}</td>
     <td>${post.client}</td>
   </tr>
  </c:forEach>
				
		</table>
	
</body>
</html>