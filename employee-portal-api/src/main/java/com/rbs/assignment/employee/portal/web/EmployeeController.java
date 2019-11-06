package com.rbs.assignment.employee.portal.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.assignment.employee.portal.exception.RecordNotFoundException;
import com.rbs.assignment.employee.portal.model.Employee;
import com.rbs.assignment.employee.portal.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employees")
@Api(value = "Employee Portal api use to fetch employee list and details")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping
	@ApiOperation(value = "View a list of employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> list = service.getAllEmployees();

		return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "View details of a employee")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
		Employee entity = service.getEmployeeById(id);

		return new ResponseEntity<Employee>(entity, new HttpHeaders(), HttpStatus.OK);
	}
}