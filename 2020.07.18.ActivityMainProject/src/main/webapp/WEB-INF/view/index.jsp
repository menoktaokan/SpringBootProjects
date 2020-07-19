<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Activity Planner</title>
<style type="text/css">
body {
	background-color: #ffe6e6;
}

#header {
	height: 100px;
}

#activity-list {
margin:20px;
	background-color: white;
	float: left;
}

#activity-details {

background-color: #F2F3F4;
margin:20px;
	float: left;
}

#table-activity-details {

}
</style>
</head>
<body>
	<div id="header">
		<h1 align="center" style="margin-top: 50px">Activity Planner</h1>

	</div>
	<hr>
	<div id="activity-list">
		<table border="1px">
			<thead>
				<tr>
					<th>Recently Activities</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><a href="#">Hiking</a></td>
				</tr>
				<tr>
					<td><a href="#">Beach Meeting</a></td>
				</tr>
				<tr>
					<td><a href="#">Coffee Day</a></td>

				</tr>
				<tr>
					<td><a href="#">Dance Party</a></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div id="activity-details">
		<table id="table-activity-details" border="1px">
			
			<tbody>
				<tr>
					<td>Something about the activity</td>
				</tr>
				
			</tbody>
		</table>
	</div>


</body>
</html>