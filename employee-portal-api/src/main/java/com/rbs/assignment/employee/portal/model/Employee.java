package com.rbs.assignment.employee.portal.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entity to represent Employee table.
 * 
 * @author rohit
 *
 */
@Entity
@Table(name = "EMPLOYEE_DETAILS")
@ApiModel(description = "Employee Model contains all attributes abouy employee.")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "The database generated employee ID")
	private Long id;

	@Column(name = "name", nullable = false)
	@ApiModelProperty(notes = "The name of employee")
	private String name;

	@Max(value = 999_999_999)
	@Column(name = "salary", nullable = false)
	@ApiModelProperty(notes = "The salary of employee")
	private Integer salary;

	@NotNull
	@Column(name = "hire_date", nullable = false)
	@ApiModelProperty(notes = "The hireDate of employee")
	private LocalDate hireDate;

	/**
	 * Non-parameterized constructor.
	 */
	public Employee() {
		super();
	}

	/**
	 * Parameterized constructor with all fields
	 * 
	 * @param id
	 * @param name
	 * @param salary
	 * @param hireDate
	 */
	public Employee(Long id, String name, @Max(999999999) Integer salary, @NotNull LocalDate hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getHireDate()=" + getHireDate() + "]";
	}
}