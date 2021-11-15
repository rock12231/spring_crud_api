package com.spring_crud.spring_crud_api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table(name="Employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	// first name
	@Column(name = "first_name", nullable = false)
	private String firstName;
	// last name
	@Column(name = "last_name")
	private String lastName;
	// email
	@Column(name = "email")
	private String email;
}
