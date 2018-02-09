 package com.pickzkart.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.tracing.dtrace.ProviderAttributes;

@Controller
public class HelloController{
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView model=new ModelAndView("HelloPage");
		model.addObject("msg","Welocome to the Spring Mvc project with Anotated Controller");
		
		return model;
		
	}
	 
}
