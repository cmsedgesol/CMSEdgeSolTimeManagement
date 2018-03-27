<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- <script type="text/javascript" src="weeklyTrackJS.js"> -->

</script>
<style>
th {
	text-align: center;
	width: 25%;
}

.task {
	width: 55%;
}

.desc {
	width: 90%;
}

.dateCell {
	width: 20%;
}

td {
	height: : 15%;
	text-align: center;
}

table {
	table-layout: fixed;
}
</style>
</head>
<body onload="">
	<div class="">
		<div style="text-align: center;">
			<h2>Employee Weekly Track</h2>
		</div>
		<div class="container">
			<form class="form-group" method="get" name="getTimeSheet"
				action="UpdateTimeSheet" modelAttribute="WeeklyTimesheet">
				<div class="col-sm-offset-3 col-sm-2">
					<select class="form-control" id="employyeeSel" name="employyeeSel">
						<option value="" selected>Employee</option>
						<option value="1">Employee1</option>
						<option value="2">Employee2</option>
						<option value="3">Employee3</option>
						<option value="4">Employee4</option>
					</select>
				</div>
				<div class="col-sm-2">
					<input type="date" class="form-control" id="timesheetDate"
						name="timesheetDate" onchange="dateFunction()">
				</div>
				<div class="col-sm-1">
					<button class="btn btn-default" id="timeSheetGet">Go</button>
				</div>
				<!--  </form> -->
		</div>
		<div>
			<br>
		</div>
		<div>
			<div class="">
				<!--  <form method="post" name="timeSheetPost" class="form-group"> -->
				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th class="task">
								<!--<button type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-plus"></span> Tasks
          </button>--> Tasks
							</th>
							<th class="desc">Description</th>
							<th class="dateCell"><span id="dayOne">Mon</span><br> <span
								id="date1">26-03-2018</span></th>
							<th class="dateCell"><span id="dayTwo">Tue</span><br> <span
								id="date2">27-03-2018</span></th>
							<th class="dateCell"><span id="dayThree">Wed</span><br>
								<span id="date3">28-03-2018</span></th>
							<th class="dateCell"><span id="dayFour">Thu</span><br>
								<span id="date4">29-03-2018</span></th>
							<th class="dateCell"><span id="dayFive">Fri</span><br>
								<span id="date5">30-03-2018</span></th>
							<th class="dateCell"><span id="daySix">Sat</span><br> <span
								id="date6">31-03-2018</span></th>
							<th class="dateCell"><span id="daySeven">Sun</span><br>
								<span id="date7">01-04-2018</span></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="timeEntry" items="${weekEntries}">
							<tr>
								<td><input type="text" class="form-control" id="taskInput1"
									name="taskInput1" value=${timeEntry.taskName} disabled></td>
								<td class="desc"><input type="text" class="form-control"
									id="descInput1" name="descInput" value=${timeEntry.description}></td>
								<td><input type="number" class="form-control"
									id="taskDuration1" name="MonTimeHrs" size="
									2" value=${timeEntry.monTimeInHours}></td>
								<td><input type="number" class="form-control"
									id="taskDuration1" name="TueTimeHrs" size="2"
									value=${timeEntry.tueTimeInHours}></td>
								<td><input type="number" class="form-control"
									id="taskDuration1" name="WedTimeHrs" size="2"
									value=${timeEntry.wedTimeInHours}></td>
								<td><input type="number" class="form-control"
									id="taskDuration1" name="ThuTimeHrs" size="2"
									value=${timeEntry.thuTimeInHours}></td>
								<td><input type="number" class="form-control"
									id="taskDuration1" name="FriTimeHrs" size="2"
									value=${timeEntry.friTimeInHours}></td>
								<td><input type="number" class="form-control"
									id="taskDuration1" name="SatTimeHrs" size="2"
									value=${timeEntry.satTimeInHours}></td>
								<td><input type="number" class="form-control"
									id="taskDuration1" name="SunTimeHrs" size="2"
									value=${timeEntry.sunTimeInHours}></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="col-sm-offset-11">
					<button type="submit" class="btn btn-success">Update</button>
				</div>
				</form>
			</div>
		</div>
</body>
</html>
