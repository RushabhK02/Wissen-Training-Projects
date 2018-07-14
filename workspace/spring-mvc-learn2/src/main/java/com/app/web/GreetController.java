package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

	@RequestMapping(value = "/greet")
	public ModelAndView sayHello(@RequestParam(name="userName") String userName) {
		System.out.println("greet req....");
		String model = "Hello " + userName + " ! welcome to spring MVC world";
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", model); // request.setAttribute()
		mav.setViewName("greeting"); // request.getRequestDispatcher()
		return mav;
	}

}
