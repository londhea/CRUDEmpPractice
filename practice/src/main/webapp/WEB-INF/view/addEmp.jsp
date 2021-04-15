<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Adding User</title>
</head>

<body>
	<div class="container" align="center">
		<h2>Adding a Employee</h2>
		<hr>
		<div class="col"></div>
		<div align="center" class="col-8">
			<form action="/employee" method="post">
				<table class="table table-borderless">
					<tr>
						<td>Name :</td>
						<td><input class="form-control" type="text" name="ename"></td>
					</tr>
					<tr>
						<td>Age :</td>
						<td><input class="form-control" type="text" name="eage"></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><input type="radio" name="egender" value="Male"> Male
							&nbsp;&nbsp; <input type="radio" name="egender" value="Female"> Female</td>
					</tr>
					<tr>
						<td>Designation :</td>
						<td><input class="form-control" type="text" name="edesgn"></td>
					</tr>
					<tr>
						<td>Salary :</td>
						<td><input class="form-control" type="text" name="esalary"></td>
					</tr>
					<tr>
						<td>Mobile :</td>
						<td><input class="form-control" type="text" name="emobile"></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><textarea class="form-control" type="text"
								name="eaddress" rows="3"></textarea></td>
					</tr>
					<tr>
						<td colspan="2"><input class="btn btn-primary" type="submit"
							value="Save"></td>
						<td colspan="2"><input class="btn btn-danger" type="reset"
							value="Clear"></td>
					</tr>
				</table>
			</form>

		</div>
		<div class="col"></div>
	</div>
</body>
</html>