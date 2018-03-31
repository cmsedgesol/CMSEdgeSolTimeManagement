<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script src="/js/weeklyTrackJS.js"></script>
<link href="webjars/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/3.3.1/dist/jquery.min.js"></script>
<script src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<style>
th {
	text-align: center;
	width: 25%;
}

.task {
	width: 55%;
}

.desc {
	width: 80%;
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

.thours {
	width: 15%;
	text-align: center;
}
</style>
</head>
<body onload="dateFunction()">
	<div class="">
		<div style="text-align: center;">
			<h2>Employee Weekly Track</h2>
		</div>
		<form:form class="form-group" method="get" name="getTimeSheet"
			action="UpdateTimeSheet" modelAttribute="WeeklyReportEntry">
			<div class="container col-sm-2">
				<a href="#" class="btn btn-default"><span
					class="glyphicon glyphicon-arrow-left"></span> Back to Weekly
					Report </a>
			</div>
			<div>
				<br>
			</div>
			<div>
				<div class="">
					<input type="date" name="date" id="dateData" value="2018-03-29"
						hidden></input>
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th class="task">Tasks</th>
								<th class="desc">Description</th>
								<th class="dateCell"><span id="dayOne">Mon</span><br>
									<span id="date1"></span></th>
								<th class="dateCell"><span id="dayTwo">Tue</span><br>
									<span id="date2"></span></th>
								<th class="dateCell"><span id="dayThree">Wed</span><br>
									<span id="date3"></span></th>
								<th class="dateCell"><span id="dayFour">Thu</span><br>
									<span id="date4"></span></th>
								<th class="dateCell"><span id="dayFive">Fri</span><br>
									<span id="date5"></span></th>
								<th class="dateCell"><span id="daySix">Sat</span><br>
									<span id="date6"></span></th>
								<th class="dateCell"><span id="daySeven">Sun</span><br>
									<span id="date7"></span></th>
								<th class="thours">Total</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="timeEntry" items="${weekEntries}"
								varStatus="status">
								<tr>
									<td><input type="text" class="form-control"
										id="taskInput1" name="weekEntries[${status.index}].taskName"
										value="${timeEntry.taskName}" readonly /></td>
									<td class="desc"><input type="text" class="form-control"
										id="descInput1"
										name="weekEntries[${status.index}].description"
										value="${timeEntry.description}" /></td>
									<td><input type="time" class="form-control" step="2"
										id="taskDuration1"
										name="weekEntries[${status.index}].monTimeInHours" size="2"
										value="${timeEntry.monTimeInHours}" /></td>
									<td><input type="time" class="form-control" step="2"
										id="taskDuration1"
										name="weekEntries[${status.index}].tueTimeInHours" size="2"
										value="${timeEntry.tueTimeInHours}" /></td>
									<td><input type="time" class="form-control" step="2"
										id="taskDuration1"
										name="weekEntries[${status.index}].wedTimeInHours" size="2"
										value="${timeEntry.wedTimeInHours}" /></td>
									<td><input type="time" class="form-control" step="2"
										id="taskDuration1"
										name="weekEntries[${status.index}].thuTimeInHours" size="2"
										value="${timeEntry.thuTimeInHours}" /></td>
									<td><input type="time" class="form-control" step="2"
										id="taskDuration1"
										name="weekEntries[${status.index}].friTimeInHours" size="2"
										value="${timeEntry.friTimeInHours}" /></td>
									<td><input type="time" class="form-control" step="2"
										id="taskDuration1"
										name="weekEntries[${status.index}].satTimeInHours" size="2"
										value="${timeEntry.satTimeInHours}" /></td>
									<td><input type="time" class="form-control" step="2"
										id="taskDuration1"
										name="weekEntries[${status.index}].sunTimeInHours" size="2"
										value="${timeEntry.sunTimeInHours}" /></td>
									<td class="thours"><span id="totalHours"></span></td>
									<td><input type="hidden" class="form-control"
										id="taskInput1"
										name="weekEntries[${status.index}].timeEntryId"
										value="${timeEntry.timeEntryId}" /></td>
									<td><input type="hidden" class="form-control"
										id="taskInput1"
										name="weekEntries[${status.index}].weekEntryId"
										value="${timeEntry.weekEntryId}" /></td>
									<td><input type="hidden" class="form-control"
										id="taskInput1" name="weekEntries[${status.index}].employeeId"
										value="${timeEntry.employeeId}" /></td>
									<td><input type="text" class="form-control"
										id="taskInput1"
										name="weekEntries[${status.index}].projectName"
										value="${timeEntry.projectName}" hidden /></td>
									<td><input type="text" class="form-control"
										id="taskInput1" name="weekEntries[${status.index}].userName"
										value="${timeEntry.userName}" hidden /></td>
									<td><input type="date" class="form-control"
										id="taskInput1" name="weekEntries[${status.index}].fromDate"
										value="${timeEntry.fromDate}" hidden /></td>
									<td><input type="date" class="form-control"
										id="taskInput1" name="weekEntries[${status.index}].toDate"
										value="${timeEntry.toDate}" hidden /></td>
									<td><input type="text" class="form-control"
										id="taskInput1" name="weekEntries[${status.index}].day"
										value="${timeEntry.day}" hidden /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="col-sm-offset-11">
						<button type="submit" class="btn btn-success">Update</button>
					</div>
		</form:form>
	</div>
	</div>
</body>
</html>
