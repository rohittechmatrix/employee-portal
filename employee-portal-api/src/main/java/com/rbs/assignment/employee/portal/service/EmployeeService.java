package com.rbs.assignment.employee.portal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbs.assignment.employee.portal.exception.RecordNotFoundException;
import com.rbs.assignment.employee.portal.model.Employee;
import com.rbs.assignment.employee.portal.repository.EmployeeRepository;

/**
 * Service class to serve all operations about employee.
 * 
 * @author rohit
 *
 */
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	/**
	 * This method fetch all employees from DB
	 * 
	 * @return
	 */
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = repository.findAll();

		if (employeeList.size() > 0) {
			return employeeList;
		} else {
			return new ArrayList<Employee>();
		}
	}

	/**
	 * This method details of a employee for given employee id
	 * 
	 * @TODO Currently this method is not being consumed as we are having less
	 *       details about employee that is available in list data already , once we
	 *       have more data we can use this to get details.
	 * 
	 * @param id
	 * @return
	 * @throws RecordNotFoundException
	 */
	public Employee getEmployeeById(Long id) throws RecordNotFoundException {
		Optional<Employee> employee = repository.findById(id);

		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}
}