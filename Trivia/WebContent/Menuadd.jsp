<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" >
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.come/ajax/libs/jquery/3.3.1/jquery.min.css"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.css"></script>

<title>Insert title here</title>
</head>
<body>
<center>
	<div class="container">
	<h2>Vendor Register</h2>
		<form action="MenuController" method="post">
			<table class="table table-bordered" style="width:60%;">
				<thead>
					<tr>
					<th colspan="2"><center>Vendor Registration</center></th>
					</tr>
				</thead>
			<tbody>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Menu ID</td>
			<td><input type="text" name="MenuId" required="required" placeholder="MenuId" class="form-control"></td>
				</tr>
			
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">VendorID</td>
			<td><input type="text" name="mvendorID" required="required" placeholder="VendorID" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Menu Name</td>
			<td><input type="text" name="mmenuname" required="required" placeholder="Menu Name" class="form-control"></td>
				</tr>

				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Status</td>
			<td><input type="text" name="mstatus" required="required" placeholder="Status" class="form-control"></td>
				</tr>
				

			
				<tr>
					<td></td>
					<td>
			<input type="submit" name="submit" value="register" class="btn btn-primary">
			<input style="text-align: center;" type="reset" value="Reset" class="btn btn-info">
			
					
					</td>
				</tr>
			
			</tbody>
	</table>
		
		</form>
	</div>
</center>
</body>
</html>