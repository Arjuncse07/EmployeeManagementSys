package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dto.EmployeeDto;
import com.example.service.EmpService;

public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpService empService;
	
	
	@Override
	public String createEmployee(EmployeeDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(EmployeeDto dto, int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDto getEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validEmployee(String email, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

}
