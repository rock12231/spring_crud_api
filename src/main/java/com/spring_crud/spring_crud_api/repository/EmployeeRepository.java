package com.spring_crud.spring_crud_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_crud.spring_crud_api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findById(int id);

	void deleteById(int id);

}
