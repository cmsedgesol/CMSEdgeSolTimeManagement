package com.cmsedge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cmsedge.dao.EmployeeDaoImpl;
@Controller
public class TMSController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TMSController.class);

	@Autowired
	private EmployeeDaoImpl dao;

	@RequestMapping("/index")
	public String test() {
		LOGGER.info("index called");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		//return modelAndView;
		return "index";
	}
	/*@RequestMapping("/")
	public void test() {
		LOGGER.info("controller called");
	
		//dao.saveEmployee();
	}*/
}
