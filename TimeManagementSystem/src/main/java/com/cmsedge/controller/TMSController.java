package com.cmsedge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cmsedge.dao.EmployeeDao;
@Controller
public class TMSController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TMSController.class);

	@Autowired
	private EmployeeDao dao;

	@RequestMapping("/hello")
	
	public String test() {
		LOGGER.info("index called");
		return "index";
	}
	@RequestMapping("/save")
	public void SaveEMployee() {
		dao.saveEmployee();
	}
}
