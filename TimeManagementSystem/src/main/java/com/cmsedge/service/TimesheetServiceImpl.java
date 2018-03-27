package com.cmsedge.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cmsedge.dao.EmployeeDao;

public class TimesheetServiceImpl implements TimesheetService {
	@Autowired
	public EmployeeDao empDao;

	@Override
	public void getTimsheet() {
		//List<WeeklyReportEntry> = empDao.getTimesheetData();
	}
	
	   
	

	   

	
	
	   /* public void addTimeEntry(TimeEntry timeEntry) {
	        int dayNumber = DateUtils.toCalendar(timeEntry.getDate()).get(Calendar.DAY_OF_WEEK);
	        DayOfWeek day = DayOfWeek.fromCalendarDay(dayNumber);
	        List<TimeEntry> timeEntries = getDayOfWeekTimeEntries(day);
	        if (timeEntries == null) {
	            List<TimeEntry> list = new ArrayList<>();
	            list.add(timeEntry);
	            changeDayOfWeekTimeEntries(day, list);
	        } else {
	            timeEntries.add(timeEntry);
	        }
	    }*/
	
	 /*   public boolean hasTimeEntries() {
	        for (DayOfWeek day : DayOfWeek.values()) {
	            List<TimeEntry> timeEntries = getDayOfWeekTimeEntries(day);
	            if (CollectionUtils.isEmpty(timeEntries)) {
	                for (TimeEntry timeEntry : timeEntries) {
	                    if (PersistenceHelper.isNew(timeEntry)) {
	                        return false;
	                    }
	                }

	                return true;
	            }
	        }
	        return false;
	    }*/
	/*public WeeklyReportEntry convertFromTimeEntries(List<TimeEntry> timeEntries) {
         Map<String, List<TimeEntry>> groupedTimeEntries = new LinkedHashMap<>();
            groupedTimeEntries.put("TimeEntryGroupKey", timeEntries);

        for (Map.Entry<String, List<TimeEntry>> entry : groupedTimeEntries.entrySet()) {
            WeeklyReportEntry reportEntry = new WeeklyReportEntry();
            String entryKey = entry.getKey();
            reportEntry.setProject(entryKey.project);
            reportEntry.setTask(entryKey.task);
            reportEntry.setActivityType(entryKey.activityType);
            for (TimeEntry timeEntry : entry.getValue()) {
                reportEntry.addTimeEntry(timeEntry);
            }
        }

        return reportEntries;
    }*/

}
