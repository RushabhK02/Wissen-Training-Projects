package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
	@RequestMapping(value="/greet")
	public ModelAndView sayHello(@RequestParam String userName) {
		System.out.println("greeting user..");
		String model = "Hello "+userName+"! Welcome to Spring MVC!!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", model);
		mav.setViewName("greeting");
		return mav;
	}
}
