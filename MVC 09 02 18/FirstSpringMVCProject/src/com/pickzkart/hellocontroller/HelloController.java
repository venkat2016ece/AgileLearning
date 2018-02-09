 package com.pickzkart.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest requset, 
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welcomemessege","Hi,User Welcome to the first spring mvc application");
		return modelAndView;
	}

}
