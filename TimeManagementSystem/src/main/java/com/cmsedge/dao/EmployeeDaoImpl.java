package com.cmsedge.dao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cmsedge.model.Employee;
import com.cmsedge.model.TimeEntry;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private  SessionFactory sessionFactory;
	protected  Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void saveEmployee() {
		Employee employee1 = new Employee();
		employee1.setEmployeeFirstName("Rohith1");
		employee1.setEmployeeId("cmsedge001");
		employee1.setPassword("test");
		getSession().save(employee1);
		System.out.println("data inserted successfully");
	}

	/*@Override
	public List<WeeklyReportEntry> getTimesheetData() {
		return null;
	}*/

	@Override
	public void saveTimeEntry() {
		TimeEntry entry=new TimeEntry();
		entry.setEmployeeId("emp001");
		entry.setWeekEntryId(1851);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		 Date date;
		try {
			 date = formatter.parse("31/03/2015"); 
			entry.setDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}   
		entry.setTimeEntryId(2);
		entry.setDay(DayOfWeek.MONDAY.toString());
		entry.setDescription("description1");
		entry.setProjectName("project2");
		entry.setTaskName("task1");
		entry.setMonTimeInHours(new BigDecimal("12.30").abs());
		entry.setTueTimeInHours(new BigDecimal("1.30").abs());
		entry.setWedTimeInHours(new BigDecimal("2.30").abs());
		entry.setFriTimeInHours(new BigDecimal("4.30").abs());
		entry.setSatTimeInHours(new BigDecimal("5.30").abs());
		entry.setSunTimeInHours(new BigDecimal("6.30").abs());
		entry.setUserName("userName3");
		//Transaction transaction = getSession().beginTransaction();
		getSession().saveOrUpdate(entry);
		//transaction.commit();
	}
	public List<TimeEntry> getTimeEntries(){
		List<TimeEntry> timeEntries=new ArrayList<TimeEntry>();
		for (int i = 1; i < 3; i++) {
			TimeEntry timeEntry = getSession().get(TimeEntry.class, i);
			timeEntries.add(timeEntry);	
			System.out.println(timeEntry.getDescription());	
		}
		return timeEntries;
		
	}
}
