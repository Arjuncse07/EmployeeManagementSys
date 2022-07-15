package com.example.service;

import java.util.List;

import com.example.dto.EmployeeDto;

public interface EmpService {
	
	public String createEmployee(EmployeeDto dto);
	public String updateEmployee(EmployeeDto dto,int empId);
	public String deleteEmployee(int empId);
	public List<EmployeeDto> getAllEmployee();
	public EmployeeDto getEmployee(int empId);
	public String validEmployee(String email,String pass);
}
