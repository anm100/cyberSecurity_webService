<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="design.css">
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1255">
	
<title>Events Table</title>
</head>
<h1>Events Table</h1>
<table id="myTable">
	<tr>
		<th>ID</th>
		<th>Location</th>
		<th>status</th>
		<th>Date time</th>
		<th>Log text</th>

	</tr>
	
	</table>
</body>
</html>
<script>
function makeTable() {
	var row,cell1,cell2,cell3,cell4,cell5;
    var table = document.getElementById("myTable");
    for(i=1;i<=10;i++){
     row = table.insertRow(i);
     cell1 = row.insertCell(0);
     cell2 = row.insertCell(1);
     cell3 = row.insertCell(2);
     cell4 = row.insertCell(3);
     cell5 = row.insertCell(4);
    cell1.innerHTML = "NEW CELL1";
    cell2.innerHTML = "NEW CELL2";
    cell3.innerHTML = "NEW CELL3";
    cell4.innerHTML = "NEW CELL4";
    cell5.innerHTML = "NEW CELL5";
    }
}
window.onload = makeTable;
</script>
