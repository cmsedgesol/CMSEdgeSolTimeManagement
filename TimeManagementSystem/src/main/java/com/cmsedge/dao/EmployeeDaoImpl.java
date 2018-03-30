package com.cmsedge.dao;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cmsedge.model.Employee;
import com.cmsedge.model.TimeEntry;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
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

	/*
	 * @Override public List<WeeklyReportEntry> getTimesheetData() { return null; }
	 */

	@Override
	public void saveTimeEntry() {
		TimeEntry entry = new TimeEntry();
		entry.setEmployeeId("emp001");
		entry.setWeekEntryId(1851);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
			date = new Date(2018,03,26);
			entry.setFromDate(date);
			date = new Date(2018,04,1);
			entry.setToDate(date);
		entry.setTimeEntryId(3);
		entry.setDay(DayOfWeek.MONDAY.toString());
		entry.setDescription("description3");
		entry.setProjectName("project3");
		entry.setTaskName("task3");
		entry.setMonTimeInHours(new Time(12,30,00));
		entry.setTueTimeInHours(new Time(1,30,00));
		entry.setWedTimeInHours(new Time(13,30,00));
		entry.setFriTimeInHours(new Time(14,30,00));
		entry.setSatTimeInHours(new Time(15,30,00));
		entry.setSunTimeInHours(new Time(16,30,00));
		entry.setUserName("userName1");
		// Transaction transaction = getSession().beginTransaction();
		getSession().saveOrUpdate(entry);
		// transaction.commit();
	}
	public List<TimeEntry> getTimeEntries() {
		String hqlQuery = "from TimeEntry as entry";
		Query query = getSession().createQuery(hqlQuery);
		List<TimeEntry> timeEntries =(List<TimeEntry>)query.list();
		return timeEntries;
	}
}
