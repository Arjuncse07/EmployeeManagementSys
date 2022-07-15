package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dto.DepartmentDto;
import com.example.service.DepService;

public class DepServiceImpl implements DepService {

	@Autowired
	DepService depService;
	
	@Override
	public String createDepartment(DepartmentDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateDepartment(DepartmentDto dto, int depId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDepartment(int depId) {
		// TODO Auto-generated method stub
		return null;
	}

}
