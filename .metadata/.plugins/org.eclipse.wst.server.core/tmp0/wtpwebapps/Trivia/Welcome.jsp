<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Admins</title>

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


<title>Insert title here</title>
</head>
<body>

	<center><h2>All Admins</h2></center>
	<table id="myTable" class="table table-striped">
	<thead>
		<tr>
			<th>ID</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Gender</th>
			<th>Contact</th>
			<th>DOB</th>
			<th>Address</th>
			<th>Area Residence</th>
			<th>City</th>
			<th>Postal Code</th>
			<th>Country</th>
			<th>Profession</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		
	<c:forEach items="${list}" var="admin">
		<tr>
			<td><c:out value="${admin.getId()}"></c:out></td>
			<td><c:out value="${admin.getFirstName()}"></c:out></td>
			<td><c:out value="${admin.getLastName()}"></c:out></td>
			<td><c:out value="${admin.getGender()}"></c:out></td>
			<td><c:out value="${admin.getContact()}"></c:out></td>
			<td><fmt:formatDate value="${admin.getDOB()}" pattern="yyyy-MMM-dd"/></td>
			<td><c:out value="${admin.getAddress()}"></c:out></td>
			<td><c:out value="${admin.getAreaResidence()}"></c:out></td>
			<td><c:out value="${admin.getCity()}"></c:out></td>
			<td><c:out value="${admin.getPostalCode()}"></c:out></td>
			<td><c:out value="${admin.getCountry()}"></c:out></td>
			<td><c:out value="${admin.getProfession()}"></c:out></td>
			<td><a href="AdminController?action=Edit&id=<c:out value="${admin.getId()}"/>">Edit |</a>
			<a href="AdminController?action=delete&id=<c:out value="${admin.getId()}"/>">Delete</a></td>
		 
		</tr>
		
	
	
	</c:forEach>
	
	

	</tbody>
	
	</table>

</body>
</html>