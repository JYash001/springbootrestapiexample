package com.springboot.springbootrestapiexample.repository;

import com.springboot.springbootrestapiexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}