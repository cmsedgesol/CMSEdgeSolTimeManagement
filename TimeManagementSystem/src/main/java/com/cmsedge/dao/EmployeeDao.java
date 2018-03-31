package com.cmsedge.dao;

import java.util.List;
import java.util.Map;

import com.cmsedge.model.TimeEntry;

public interface EmployeeDao {
	public Map<String,String> getEmplyees();
	public void saveTimeEntry(TimeEntry timeEntry);
	public List<TimeEntry> getTimeEntries();
}
