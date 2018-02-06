package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.service.EmployeeManager;


@Controller
@RequestMapping("/")
public class EmployeeController 
{
	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listOfEmployees(Model model)
	{
		model.addAttribute("employees", manager.listOfEmployeeVO());
		return "employeesListDisplay";
	}
}