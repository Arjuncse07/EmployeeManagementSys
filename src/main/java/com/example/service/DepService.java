package com.example.service;

import com.example.dto.DepartmentDto;


public interface DepService {
	
	public String createDepartment(DepartmentDto dto);
	public String updateDepartment(DepartmentDto dto,int depId);
	public String deleteDepartment(int depId);
}
