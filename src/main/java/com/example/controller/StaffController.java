package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StaffModel;
import com.example.service.StaffService;

@RestController
public class StaffController {
		
			@Autowired
			StaffModel staffModel;
			
			@Autowired
			StaffService staffService;
		    @GetMapping("/addStaff")
		    public String hello(){

		    	staffModel.setPassword("1234");
		    	staffModel.setEmail("email@email.com");
		    	staffModel.setPhone("22334455");
		    	staffModel.setPosition("Manager");
		    	staffService.addStaff(staffModel);
		        return "New Staff added";
		    }
		   
}
