function dateFunction(){
  var loadDate=document.getElementById('dateData').valueAsDate;
  var dayArray = getWeekDetails(loadDate);
  renderDates(dayArray);
  //renderDates(dayArray);
}

  //alert(dayArray[0]+" "+dayArray[1]+" "+dayArray[2]+" "+dayArray[3]+" "+dayArray[4]+" "+dayArray[5]+" "+ dayArray[6]);
  function renderDates(dayArr){
    $("#date1").text(dayArr[0].getDate()+"-"+(dayArr[0].getMonth()+1)+"-"+dayArr[0].getFullYear());
    $("#date2").text(dayArr[1].getDate()+"-"+(dayArr[1].getMonth()+1)+"-"+dayArr[1].getFullYear());
    $("#date3").text(dayArr[2].getDate()+"-"+(dayArr[2].getMonth()+1)+"-"+dayArr[2].getFullYear());
    $("#date4").text(dayArr[3].getDate()+"-"+(dayArr[3].getMonth()+1)+"-"+dayArr[3].getFullYear());
    $("#date5").text(dayArr[4].getDate()+"-"+(dayArr[4].getMonth()+1)+"-"+dayArr[4].getFullYear());
    $("#date6").text(dayArr[5].getDate()+"-"+(dayArr[5].getMonth()+1)+"-"+dayArr[5].getFullYear());
    $("#date7").text(dayArr[6].getDate()+"-"+(dayArr[6].getMonth()+1)+"-"+dayArr[6].getFullYear());
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
    daysOfWeek[1] = new Date(curr.setDate(two));
    daysOfWeek[2] = new Date(curr.setDate(three));
    daysOfWeek[3] = new Date(curr.setDate(four));
    daysOfWeek[4] = new Date(curr.setDate(five));
    daysOfWeek[5] = new Date(curr.setDate(six));
    daysOfWeek[6] = new Date(curr.setDate(last));
    //alert(daysOfWeek[0]+" "+daysOfWeek[1]+" "+daysOfWeek[2]+" "+daysOfWeek[3]+" "+daysOfWeek[4]+" "+daysOfWeek[5]+" "+ daysOfWeek[6]);
    return daysOfWeek;
  }
  function verifyDate(numDays,vDate){
    if(vDate>(numDays+1)){
    vDate=2;
    }
    return vDate;
  }
