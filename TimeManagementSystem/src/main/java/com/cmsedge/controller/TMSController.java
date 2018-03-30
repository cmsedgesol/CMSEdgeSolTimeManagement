package com.cmsedge.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cmsedge.dao.EmployeeDao;
import com.cmsedge.model.TimeEntry;
import com.cmsedge.model.WeeklyReportEntry;
@Controller
public class TMSController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TMSController.class);

	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		LOGGER.info("index called");
		return "redirect:/week";
	}
	@RequestMapping("/week")
	public ModelAndView test() {
		
		List<TimeEntry> weekEntries = dao.getTimeEntries();
		return new ModelAndView("weeklyTimesheet","weekEntries",weekEntries);  
	}
	@RequestMapping(value="UpdateTimeSheet",method = RequestMethod.GET)  
    public void updateTimeSheet(@ModelAttribute("WeeklyTimesheet") TimeEntry weeklyReportEntry,BindingResult result, ModelMap model){ 
		System.out.println(model.values());
		System.out.println("time enry "+weeklyReportEntry.getProjectName());
		System.out.println("time enry "+weeklyReportEntry.getTaskName());
		System.out.println("time enry "+weeklyReportEntry.getUserName());
		System.out.println("time enry "+weeklyReportEntry.getFriTimeInHours());
		System.out.println("time enry "+weeklyReportEntry.getMonTimeInHours());
		System.out.println("time enry "+weeklyReportEntry.getFromDate());
		System.out.println("time enry "+weeklyReportEntry.getToDate());
		System.out.println("time enry "+weeklyReportEntry.getDay());
		System.out.println("time enry "+weeklyReportEntry.getEmployeeId());
		System.out.println("time enry "+weeklyReportEntry.getTimeEntryId());
		System.out.println("time enry "+weeklyReportEntry.getWeekEntryId());
		System.out.println("time enry "+weeklyReportEntry.getSatTimeInHours());
		System.out.println("time enry "+weeklyReportEntry.getSunTimeInHours());
		System.out.println("time enry "+weeklyReportEntry.getThuTimeInHours());
		System.out.println("time enry "+weeklyReportEntry.getTueTimeInHours());
		System.out.println("time enry "+weeklyReportEntry.getWedTimeInHours());
		
		
	}
	@RequestMapping("/save")
	public void SaveEMployee() {
		dao.saveEmployee();
	}
	@RequestMapping("/entry")
	public void timeEntry() {
		dao.saveTimeEntry();
	}
}
