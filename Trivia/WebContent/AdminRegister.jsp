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
	<h2>Admin Register</h2>
		<form action="AdminController" method="post">
			<table class="table table-bordered" style="width:60%;">
				<thead>
					<tr>
					<th colspan="2"><center>Admin Registration</center></th>
					</tr>
				</thead>
			<tbody>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">ID</td>
			<td><input type="text" name="AdminId" required="required" placeholder="AdminId" class="form-control"></td>
				</tr>
			
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">First Name</td>
			<td><input type="text" name="AFirstName" required="required" placeholder="FirstName" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Last Name</td>
			<td><input type="text" name="ALastName" required="required" placeholder="LastName" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Gender</td>
			<td><input type="text" name="AGender" required="required" placeholder="Gender" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Contact</td>
			<td><input type="text" name="AContact" required="required" placeholder="Contact" class="form-control"></td>
				</tr>
				
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Address</td>
			<td><input type="text" name="Aaddress" required="required" placeholder="Address" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Area Residence</td>
			<td><input type="text" name="Aarea" required="required" placeholder="Area Residence" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">City</td>
			<td><input type="text" name="Acity" required="required" placeholder="City" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">PostalCode</td>
			<td><input type="text" name="Apostal" required="required" placeholder="PostalCode" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Country</td>
			<td><input type="text" name="Acountry" required="required" placeholder="Country" class="form-control"></td>
				</tr>
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Profession</td>
			<td><input type="text" name="Aprofession" required="required" placeholder="Profession" class="form-control"></td>
				</tr>
				
				
				<tr>
			<td style="text-align: center; padding-top: 15px; font-weight: bold;">Password</td>
			<td><input type="password" name="APassword" required="required" placeholder="*******" class="form-control"></td>
				
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
		<a href="Login.jsp" style="text-align: center;">Login</a>
		
		</form>
	</div>
</center>
	
</body>
</html>