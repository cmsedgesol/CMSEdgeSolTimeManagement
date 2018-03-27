package com.cmsedge.dao;

import java.util.List;

import com.cmsedge.model.TimeEntry;

public interface EmployeeDao {
	public void saveEmployee();

//	public List<WeeklyReportEntry> getTimesheetData();

	public void saveTimeEntry();
	public List<TimeEntry> getTimeEntries();
}
