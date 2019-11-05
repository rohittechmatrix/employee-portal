package com.rbs.assignment.employee.portal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbs.assignment.employee.portal.exception.RecordNotFoundException;
import com.rbs.assignment.employee.portal.model.Employee;
import com.rbs.assignment.employee.portal.repository.EmployeeRepository;
 
@Service
public class EmployeeService {
     
    @Autowired
    EmployeeRepository repository;
     
    public List<Employee> getAllEmployees()
    {
        List<Employee> employeeList = repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<Employee>();
        }
    }
     
    public Employee getEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<Employee> employee = repository.findById(id);
         
        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
}