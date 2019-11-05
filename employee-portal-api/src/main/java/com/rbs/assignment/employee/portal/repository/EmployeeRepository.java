package com.rbs.assignment.employee.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbs.assignment.employee.portal.model.Employee;

/**
 * 
 * @author rohit
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
