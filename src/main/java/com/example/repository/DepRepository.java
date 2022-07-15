package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Department;

public interface DepRepository extends JpaRepository<Department, Integer>{

	public Department findByDepName();
}
