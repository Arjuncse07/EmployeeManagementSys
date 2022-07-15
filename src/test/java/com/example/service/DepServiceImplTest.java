package com.example.service;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.entity.Department;
import com.example.repository.DepRepository;

@RunWith(MockitoJUnitRunner.class)
public class DepServiceImplTest {
	
	
	@InjectMocks
	private DepService depService;
	
	@Mock
	private DepRepository depRepository;
	
    /*@Test
	public String createDepartmentTest() {
    	Department department= new Department();
    	department.setDepName("CSE");
    	department.setDepRole("Engineering");
    	//.department..setCreateDate(LocalDate.now());
          
    	when(depRepository.save(department)).thenReturn(department);
    	
    
    	
	}*/
    

}
