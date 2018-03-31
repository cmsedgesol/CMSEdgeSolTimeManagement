package com.cmsedge.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cmsedge.dao.EmployeeDao;
import com.cmsedge.model.TimeEntry;
import com.cmsedge.model.WeeklyReportEntry;
import com.cmsedge.util.DateTimeUtils;

@Controller
public class TMSController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TMSController.class);

	@Autowired
	private EmployeeDao dao;

	@RequestMapping(value = "/selectWeek", method = RequestMethod.GET)
	public ModelAndView index() {
		Map<String, String> empMap = dao.getEmplyees();
		return new ModelAndView("WeekSelector", "empMap", empMap);
	}

	@RequestMapping(value="/currentWeek", method = RequestMethod.GET)
	public ModelAndView test(@RequestParam(value="employeeId") String empId,@RequestParam(value="startDate") String strtDate,@RequestParam(value="endDate") String endDate,@RequestParam(value="timesheetDate") String timesheetDate) {
		List<TimeEntry> weekEntries = dao.getTimeEntries();
		return new ModelAndView("weeklyTimesheet", "weekEntries", weekEntries);
	}

	@RequestMapping(value = "UpdateTimeSheet", method = RequestMethod.GET)
	public void updateTimeSheet(@ModelAttribute("WeeklyReportEntry") WeeklyReportEntry weeklyReportEntry,BindingResult result, ModelMap model,HttpServletRequest request) {
		Map<String, String[]> requestMap = request.getParameterMap();
		List<TimeEntry> timeEntries=DateTimeUtils.getTimeEntryList(requestMap);
		for (TimeEntry timeEntry : timeEntries) {
			dao.saveTimeEntry(timeEntry);
		}
	}

}
