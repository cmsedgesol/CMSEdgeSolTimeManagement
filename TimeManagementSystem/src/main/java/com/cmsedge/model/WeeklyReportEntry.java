package com.cmsedge.model;

import java.util.List;

public class WeeklyReportEntry {
	private int weekEntryId;
    protected List<String> userNames;
    protected List<TimeEntry> weekEntryList;
    
	public int getWeekEntryId() {
		return weekEntryId;
	}
	public List<TimeEntry> getWeekEntryList() {
		return weekEntryList;
	}
	public void setWeekEntryId(int weekEntryId) {
		this.weekEntryId = weekEntryId;
	}
	public void setWeekEntryList(List<TimeEntry> weekEntryList) {
		this.weekEntryList = weekEntryList;
	}
	public List<String> getUserNames() {
		return userNames;
	}
	public void setUserNames(List<String> userNames) {
		this.userNames = userNames;
	}
}