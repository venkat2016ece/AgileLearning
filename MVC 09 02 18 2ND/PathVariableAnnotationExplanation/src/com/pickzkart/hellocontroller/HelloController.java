 package com.pickzkart.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	@RequestMapping("/welcome/countryName/{userName}")
	public ModelAndView helloWorld(@PathVariable("userName") String name){
		ModelAndView model=new ModelAndView("HelloPage");
		model.addObject("msg","Welocome to the Spring Mvc project with Anotated Controller "+name);
		return model;
		
	}
}
