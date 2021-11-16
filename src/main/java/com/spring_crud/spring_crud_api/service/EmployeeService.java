package com.spring_crud.spring_crud_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_crud.spring_crud_api.model.Employee;
import com.spring_crud.spring_crud_api.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired  
	EmployeeRepository employeeRepository;  
	
	//retrieving data
	public List<Employee> getAllEmployee()   
	{  
	List<Employee> employee = new ArrayList<Employee>();  
	employee = employeeRepository.findAll();  
	return employee;  
	}  
	
	//getting a specific record by using the method findById() of CrudRepository  
	public Employee getEmployeeById(int id)   
	{  
	return employeeRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Employee books)   
	{  
		employeeRepository.save(books);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		employeeRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Employee emp, int empid)   
	{  
		employeeRepository.save(emp);  
	}  
}
