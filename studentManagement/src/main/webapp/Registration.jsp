<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form page</title>
<center>
	<style>
.container {
	width: 40%;
	border: 4px solid black;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Student Mangement Form</h1>
		<form action="StudentController" method="post">
			<table>
			<tr>
					<td>enter your Id </td>
					<td><input type="text" name="id"
						placeholder="enter_here"></td>
				</tr>
			
				<tr>
					<td>enter your name</td>
					<td><input type="text" name="name"
						placeholder="enter_here"></td>
				</tr>

				<tr>
					<td>enter your email</td>
					<td><input type="text" name="email"
						placeholder="enter_here"></td>
				</tr>

				<tr>
					<td>enter your password</td>
					<td><input type="password" name="password"
						placeholder="enter_here"></td>
				</tr>
				<tr>
					<td>enter your rollNo</td>
					<td><input type="text" name="rollNo"
						placeholder="enter_here rollNo"></td>
				</tr>
				<tr>
					<td>enter your address</td>
					<td><input type="text" name="address"
						placeholder="enter_here Address"></td>
				</tr>


				<td>
					<button type="submit">Register</button>

				</td>
					<td>
					<a href="viewsController">Show List</a>
					

				</td>


			</table>
		</form>
	</div>
	</center>
</body>
</html>