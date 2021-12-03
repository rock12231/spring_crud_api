package com.spring_crud.spring_crud_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_crud.spring_crud_api.model.Employee;
import com.spring_crud.spring_crud_api.service.EmployeeService;

@RestController
public class Controller {
	@Autowired  
	EmployeeService employeeService;
	@GetMapping("/{id}")
    public Employee getEmployee(@PathVariable long id) {
        //return 
		System.out.println("ID we are searching is =="+id);
		Employee emp = employeeService.getEmployeeById(id);
		return emp;
    }
	
	@PostMapping(
			  value = "/save", consumes = "application/json", produces = "application/json")
			public void createPerson(@RequestBody Employee person) {
			     employeeService.saveOrUpdate(person);
			}

}
