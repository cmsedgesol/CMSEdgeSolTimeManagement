package com.cmsedge.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cmsedge.model.Employee;

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
}
