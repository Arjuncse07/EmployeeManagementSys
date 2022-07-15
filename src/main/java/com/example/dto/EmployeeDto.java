package com.example.dto;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDto {
	
	@NotNull(message = "Name can't be blank")
	@Size(min = 3,max = 30,message = "Name can't lessthan 3 and grater than 30")
	private String name;
	
	@NotNull(message = "Email can't be blank")
	@Size(max = 30,message = "Email can't grater than 30 char")
	private String email;
	
	@NotNull(message = "Password can't be blank")
	private String pass;
	
	@NotNull(message = "Job Role can't be blank")
	private String role;
	
	@NotNull(message = "Department name can't be blank")
	private String depName;
	
	@NotNull(message = "Date of Birth can't be blank")
	private Date dob;
	
	@NotNull(message = "Joining date can't be blank")
	private Date joinDate;
	
	public EmployeeDto(String name, String email, String pass, String role, String depName, Date dob,
			Date joinDate) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.role = role;
		this.depName = depName;
		this.dob = dob;
		this.joinDate = joinDate;
	}
	
	

}
