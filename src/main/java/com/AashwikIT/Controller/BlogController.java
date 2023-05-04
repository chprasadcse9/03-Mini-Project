package com.AashwikIT.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.AashwikIT.Service.BlogService;


@Controller
public class BlogController {

		
	@Autowired
	private BlogService blogServ;
	
	@GetMapping("/logout")
	public String logout() {
		return "index";
	}
	
	@GetMapping("/dashboard")
	public String dashboardPage(Model model) {
		
		/*
		Integer userId =(Integer) session.getAttribute("userId");
		
		DashboardForm dashboardData = blogServ.getDashboardData(userId);
		
		model.addAttribute("dashboardData", dashboardData);
		*/
		return "dashboard";
	}
	
}
