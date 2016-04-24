package com.jnvr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/test")
	public ModelAndView testSpring() {
		ModelAndView mv = new ModelAndView("index");
		System.out.println("AVERAGE>>>>!!!!!!!!>>>>>>");
		return mv;
	}

}
