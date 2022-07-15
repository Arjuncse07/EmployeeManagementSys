package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	
	@RequestMapping("/ind")
	public String indexPage()
	{
		return "hellopage";
	}
	

}
