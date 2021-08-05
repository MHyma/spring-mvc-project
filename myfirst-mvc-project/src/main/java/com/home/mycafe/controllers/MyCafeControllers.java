package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyCafeControllers {

	//return the welcome-page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		//sending data to view(.jsp page)
//		String name="ABCD";
//		String title="MOM'S CAFE";
//		model.addAttribute("myName", name);
//		model.addAttribute("websitetitle", title);
		return "welcome";
	}
	
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		//handle the data received  from the user
		
		//set the user  data with model object and send it to view
		String req=request.getParameter("foodtype");
		model.addAttribute("userInput", req);
		
		return "process-order";
	}
}
