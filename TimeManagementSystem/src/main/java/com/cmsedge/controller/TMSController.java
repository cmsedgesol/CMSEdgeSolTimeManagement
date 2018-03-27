package com.cmsedge.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cmsedge.dao.EmployeeDao;
import com.cmsedge.model.TimeEntry;
import com.cmsedge.model.WeeklyReportEntry;
@Controller
public class TMSController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TMSController.class);

	@Autowired
	private EmployeeDao dao;

	@RequestMapping("/week")
	public ModelAndView test() {
		LOGGER.info("index called");
		List<TimeEntry> weekEntries = dao.getTimeEntries();
		return new ModelAndView("weeklyTimesheet","weekEntries",weekEntries);  
	}
	@RequestMapping(value="UpdateTimeSheet",method = RequestMethod.GET)  
    public void updateTimeSheet(@ModelAttribute("WeeklyTimesheet") WeeklyReportEntry weeklyReportEntry,BindingResult result, ModelMap model){ 
		LOGGER.info("time sheet called");
	//System.out.println(result);	
		
	System.out.println(model.get("WeeklyTimesheet"));
	//System.out.println(weeklyReportEntry.getWeekEntryList().size());
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
