package com.cmsedge.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

	@Override
	public void saveTimeEntry(TimeEntry entry) {
		getSession().saveOrUpdate(entry);
	}
	public List<TimeEntry> getTimeEntries() {
		String hqlQuery = "from TimeEntry as entry";
		Query query = getSession().createQuery(hqlQuery);
		List<TimeEntry> timeEntries =(List<TimeEntry>)query.list();
		return timeEntries;
	}

	@Override
	public Map<String, String> getEmplyees() {
		Map<String, String> emp=new HashMap<>();
		String hqlQuery = "select new Map(e.employeeId as eId, e.employeeFirstName as eName) from Employee e";
		List list =getSession().createQuery(hqlQuery).list();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Map employeeMap = (Map) iterator.next();
			emp.put(String.valueOf(employeeMap.get("eId")), String.valueOf(employeeMap.get("eName")));
		}
		return emp;
	}
}
