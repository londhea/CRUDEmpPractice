<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>List Employee</title>
</head>

<style>

table {
	padding: 5px;
}

td {
	padding: 10px;
}

th {
	padding: 10px;
	color: red;
}
</style>
<body>
<br/>
<div align="center">
	<h2>Employee Management</h2>
	<hr>
	<br/>
	<form action="search">
		<input type="text" name="keyword" /> &nbsp;&nbsp;&nbsp; <input
			type="submit" value="Search" />
	</form>
	<br />
	<p>New Employee to add  <strong><a href="/add"> Click here</a></strong></p>
	<br />
	<table border="1" class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Age</th>
				<th scope="col">Gender</th>
				<th scope="col">Designation</th>
				<th scope="col">Mobile</th>
				<th scope="col">Salary</th>
				<th scope="col">Address</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<c:forEach items="${employees}" var="employee">
		<tbody>
			<tr>
				<td>${employee.eid}</td>
				<td>${employee.ename}</td>
				<td>${employee.eage}</td>
				<td>${employee.egender}</td>
				<td>${employee.edesgn}</td>
				<td>${employee.emobile}</td>
				<td>${employee.esalary}</td>
				<td>${employee.eaddress}</td>
				<td>
					<a href="/edit/${employee.eid}">Edit</a>&nbsp;&nbsp;
					<a href="/delete/${employee.eid}">Delete</a>
				</td>
			</tr>
		</tbody>
		</c:forEach>

	</table>
</div>
</body>
</html>