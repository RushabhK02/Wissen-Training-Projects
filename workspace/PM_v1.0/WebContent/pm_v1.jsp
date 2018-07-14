<!DOCTYPE html>
<%@page import="com.shop.model.Product"%>
<%@page import="java.util.List" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PM</title>
<link href="css/bootstrap.css" rel="stylesheet" />
</head>
<body class="container">
	<hr />
	<h1>PM</h1>
	<hr />
	
	<%
	List<Product> products=(List<Product>)request.getAttribute("products");
	%>
	<div class="card">
		<div class="card-header">Products List</div>
		<div class="card-body">
			<table class="table table-sm table-bordered">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Price</th>
						<th>Date</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<% for(Product product:products){
				%>
				<tbody>
					<tr>
						<td><%=product.getId() %></td>
						<td><%=product.getName() %></td>
						<td><%=product.getPrice() %></td>
						<td><%=product.getDate() %></td>
						<td><a class="btn btn-success" href>edit</a></td>
						<td><a class="btn btn-danger" href>delete</a></td>
					</tr>
				</tbody>
				<% } %>
			</table>
		</div>
	</div>
	<br />
	<hr />
	<br />
	<div class="col-sm-8 col-md-8">
		<div class="card">
			<div class="card-header">Product Form</div>
			<div class="card-body">
				<form action="save" method="post">
					<div class="row">
						<div class="col">
							<input type="text" name ="name" class="form-control" placeholder="Name" />
						</div>
						<div class="col">
							<input type="number" name="price" class="form-control" placeholder="Price" />
						</div>
						<div class="col">
							<input type="date" name="date" class="form-control" placeholder="make-Date" />
						</div>
					</div>
					<hr />
					<div class="row">
						<div class="col">
							<textarea rows="" cols="" name="description" class="form-control"
								placeholder="Description">
							</textarea>
						</div>
					</div>
					<hr />
					<div class="row">
						<button class="btn btn-primary">Save</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>