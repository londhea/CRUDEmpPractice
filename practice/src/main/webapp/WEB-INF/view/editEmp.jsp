<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<title>Adding Employee</title>
</head>
<style>
table {
	padding: 5px;
}

td {
	padding: 10px;
}
</style>
<body style="align-content:"center">
	<div class="container" align="center">
		<h2>Updating Employee</h2>
		<hr>
		<div class="col"></div>
		<div align="center" class="col-8">
			<form action="/update" method="post">
				<table class="table table-borderless">
					<tr>
						<td>Id :</td>
						<td><input class="form-control" type="hidden" name="eid"
							value="${employee.eid}" readonly="readonly"></td>
					</tr>
					<tr>
						<td>Name :</td>
						<td><input class="form-control" type="text" name="ename"
							value="${employee.ename}"></td>
					</tr>
					<tr>
						<td>Age :</td>
						<td><input class="form-control" type="text" name="eage"
							value="${employee.eage}"></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><input type="radio" name="egender" value="${(employee.egender=='Male' ? 'Male' : 'Female')}" checked="checked"> Male &nbsp;&nbsp; 
						<input type="radio" name="egender" value="${(employee.egender=='Female' ? 'Female' : 'Male')}"> Female</td>
					</tr>
					<tr>
						<td>Designation :</td>
						<td><input class="form-control" type="text" name="edesgn"
							value="${employee.edesgn}"></td>
					</tr>
					<tr>
						<td>Salary :</td>
						<td><input class="form-control" type="text" name="esalary"
							value="${employee.esalary}"></td>
					</tr>
					<tr>
						<td>Mobile :</td>
						<td><input class="form-control" type="text" name="emobile"
							value="${employee.emobile}"></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><textarea class="form-control" type="text"
								name="eaddress" rows="3" value="eaddress">${employee.eaddress}</textarea></td>
					</tr>
					<tr>
						<td colspan="2"><input class="btn btn-warning" type="submit"
							value="Update"></td>
					</tr>
				</table>
			</form>
		</div>
		<div class="col"></div>
	</div>
</body>
</html>