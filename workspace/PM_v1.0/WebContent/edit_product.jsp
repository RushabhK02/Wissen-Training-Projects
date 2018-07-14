<!DOCTYPE html>
<%@page import="com.shop.model.Product"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<br />
	<div class="col-sm-8 col-md-8">
		<div class="card">
			<div class="card-header">Product Form</div>
			<div class="card-body">
				<form action="update" method="post">
					<div class="row">
						<div class="col">
							<input type="text" name="id" class="form-control"
								value="${product.id}" readonly="readonly" placeholder="Name" />
						</div>
					</div>
					<div class="row">
						<div class="col">
							<input type="text" name="name" class="form-control"
								value="${product.name}" placeholder="Name" />
						</div>
						<div class="col">
							<input type="number" name="price" class="form-control"
								value="${product.price}" placeholder="Price" />
						</div>
						<div class="col">
							<input type="date" name="date" class="form-control"
								value="${product.date}" placeholder="make-Date" />
						</div>
					</div>
					<hr />
					<div class="row">
						<div class="col">
							<textarea rows="" cols="" name="description" class="form-control"
								placeholder="Description">
								${product.description}
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