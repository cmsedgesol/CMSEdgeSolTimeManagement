package com.cmsedge.model;

import java.util.List;

public class WeeklyReportEntry {
	//private int weekEntryId;
   // protected String userName;
    protected List<TimeEntry> weekEntryList;
	/*public String getUserName() {
		return userName;
	}*/
	public List<TimeEntry> getWeekEntryList() {
		return weekEntryList;
	}
	/*public void setUserName(String userName) {
		this.userName = userName;
	}*/
	public void setWeekEntryList(List<TimeEntry> weekEntryList) {
		this.weekEntryList = weekEntryList;
	}
    
}