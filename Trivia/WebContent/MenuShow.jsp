<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Menu</title>

<meta name="viewport" content="width=device-width, initial-scale=1" >
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.css"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script>
	$(document).ready(function() {
		$('#myTable').dataTable();
	});
</script>


<title>Menu Show</title>
</head>
<body>

<a href="Menuadd.jsp">Add Menu Items</a>

	<center><h2>All menu</h2></center>
	<table id="myTable" class="table table-striped">
	<thead>
		<tr>
			<th>ID</th>
			<th>vendor id</th>
			<th>name</th>
			<th>creation date</th>
			
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		
	<c:forEach items="${lister}" var="admin">
		<tr>
			<td><c:out value="${admin.getMenuID()}"></c:out></td>
			<td><c:out value="${admin.getVendorID()}"></c:out></td>
			<td><c:out value="${admin.getMEnuName()}"></c:out></td>
			<td><c:out value="${admin.getCreationDate()}"></c:out></td>
			<td><a href="MenuController?action=Edit&id=<c:out value="${admin.getMenuID()}"/>">Edit |</a>
			<a href="MenuController?action=delete&id=<c:out value="${admin.getMenuID()}"/>">Delete</a></td>
		 
		</tr>
		
	
	
	</c:forEach>
	
	

	</tbody>
	
	</table>

</body>
</html>