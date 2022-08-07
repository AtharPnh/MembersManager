package com.jrp.mms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jrp.mms.entity.Employee;
import com.jrp.mms.repository.EmployeesRepository;
import com.jrp.mms.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	private EmployeesRepository employeesRepository;
	
	
	public EmployeeServiceImpl(EmployeesRepository employeesRepository) {
		super();
		this.employeesRepository = employeesRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeesRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeesRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		
		return employeesRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeesRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		
		employeesRepository.deleteById(id);
		
	}

		
}
