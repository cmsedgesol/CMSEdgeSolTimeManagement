
function dateFunction(){
  var loadDate=document.getElementById('dateData').valueAsDate;
  //alert(loadDate);
  var dayArr = getWeekDetails(loadDate);
  $("#date1").text(dayArr[0].getDate()+"-"+(dayArr[0].getMonth()+1)+"-"+dayArr[0].getFullYear());
  $("#date2").text(dayArr[1].getDate()+"-"+(dayArr[1].getMonth()+1)+"-"+dayArr[1].getFullYear());
  $("#date3").text(dayArr[2].getDate()+"-"+(dayArr[2].getMonth()+1)+"-"+dayArr[2].getFullYear());
  $("#date4").text(dayArr[3].getDate()+"-"+(dayArr[3].getMonth()+1)+"-"+dayArr[3].getFullYear());
  $("#date5").text(dayArr[4].getDate()+"-"+(dayArr[4].getMonth()+1)+"-"+dayArr[4].getFullYear());
  $("#date6").text(dayArr[5].getDate()+"-"+(dayArr[5].getMonth()+1)+"-"+dayArr[5].getFullYear());
  $("#date7").text(dayArr[6].getDate()+"-"+(dayArr[6].getMonth()+1)+"-"+dayArr[6].getFullYear());

  //renderDates(dayArray);
}

  //alert(dayArray[0]+" "+dayArray[1]+" "+dayArray[2]+" "+dayArray[3]+" "+dayArray[4]+" "+dayArray[5]+" "+ dayArray[6]);
  function renderDates(dayArr){
    var date1=dayArr[0].getDate();
    document.getElementById("test").textContent=dayArr[0].getDate()+"-"+(dayArr[0].getMonth()+1)+"-"+dayArr[0].getFullYear();
    document.getElementById("date2").textContent=dayArr[1].toString().substr(4,6);
    document.getElementById("date3").textContent=dayArr[2].toString().substr(4,6);
    document.getElementById("date4").textContent=dayArr[3].toString().substr(4,6);
    document.getElementById("date5").textContent=dayArr[4].toString().substr(4,6);
    document.getElementById("date6").textContent=dayArr[5].toString().substr(4,6);
    document.getElementById("date7").textContent=dayArr[6].toString().substr(4,6);
  }

function getWeekDetails (curr) {
  if(curr == null){
    curr = new Date();
  }
  var first = curr.getDate() - curr.getDay();
  var first = first + 1;
  var two = first+1;
  var three = first+2;
  var four = first+3;
  var five = first+4;
  var six = first+5;
  var last = first + 6;
  var daysOfWeek = new Array();
  daysOfWeek[0] = new Date(curr.setDate(first));
  daysOfWeek[1] = new Date(curr.setDate(two));
  daysOfWeek[2] = new Date(curr.setDate(three));
  daysOfWeek[3] = new Date(curr.setDate(four));
  daysOfWeek[4] = new Date(curr.setDate(five));
  daysOfWeek[5] = new Date(curr.setDate(six));
  daysOfWeek[6] = new Date(curr.setDate(last));
  //alert(daysOfWeek[0]+" "+daysOfWeek[1]+" "+daysOfWeek[2]+" "+daysOfWeek[3]+" "+daysOfWeek[4]+" "+daysOfWeek[5]+" "+ daysOfWeek[6]);
  return daysOfWeek;
}
function getTimeSheetSubmit(){
  var date=document.getTimeSheet.timesheetDate.valueAsDate;
  var emp=document.getTimeSheet.employyeeSel.value;
  //stEnWeek(date);
  var dayArray = getWeekDetails(date);
  renderDates(dayArray);

}
function stEnWeek(curr){
//var curr = new Date;
var first = curr.getDate() - curr.getDay();
var first = first + 1
var last = first + 6;

var monday = new Date(curr.setDate(first)).toString().substr(4,6);
var sunday = new Date(curr.setDate(last)).toUTCString();
alert(monday+" "+sunday);
}
