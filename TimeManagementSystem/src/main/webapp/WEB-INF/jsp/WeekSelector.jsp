<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
<link href="webjars/bootstrap/3.2.0/css/bootstrap.min.css"	rel="stylesheet">
<script src="webjars/jquery/3.3.1/dist/jquery.min.js"></script>
<script src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body onload="">
<div style="text-align: center;">
  <h2>Weekly TimeSheet</h2>
</div>
<div class="container">
  <form class="form-group" method="get" name="getTimeSheet" action="currentWeek" >
  <div class="col-sm-offset-3 col-sm-2">
  
   <select class="form-control" id="employyeeSel" name="employeeId">
     <c:forEach var="emp" items="${empMap}">
        <option value="${emp.key}">${emp.value}</option>
    </c:forEach> 
</select>
  </div>
  <div class="col-sm-2">
    <input type="date" class="form-control" id="timesheetDate" name="timesheetDate" onchange="dateFunction();">
  </div>
  <input type="date" name="startDate" id="startDate" value="" hidden>
  <input type="date" name="endDate" id="endDate" value="" hidden>
  <div class="col-sm-1">
    <button type="submit" btn btn-default" id="timeSheetGet" onclick="">Go</button>
  </div>
</form>
</div>
</body>
<script>
function dateFunction(){
  var reqDate=document.getElementById('timesheetDate').valueAsDate;
  var dates=getWeekDetails(reqDate);
  document.getElementById('startDate').valueAsDate=dates[0];
  document.getElementById('endDate').valueAsDate=dates[1];

}

function getWeekDetails (curr) {
  if(curr == null){
    curr = new Date();
  }
  var lastDate=new Date(curr.getFullYear(),curr.getMonth()+1,0);
  var numDays=lastDate.getDate();
  var first = curr.getDate() - curr.getDay();
  var first = first + 1;
  var two = verifyDate(numDays,first+1);
  var three = verifyDate(numDays,two+1);
  var four = verifyDate(numDays,three+1);
  var five = verifyDate(numDays,four+1);
  var six = verifyDate(numDays,five+1);
  var last = verifyDate(numDays,six + 1);
  var daysOfWeek = new Array();
  daysOfWeek[0] = new Date(curr.setDate(first));
  daysOfWeek[1] = new Date(curr.setDate(last));
  return daysOfWeek;
}
function verifyDate(numDays,vDate){
  if(vDate>(numDays+1)){
  vDate=2;
  }
  return vDate;
}
</script>
</html>
