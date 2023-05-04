package com.AashwikIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.AashwikIT.FormBinding.LoginForm;
import com.AashwikIT.FormBinding.RegistrationForm;
import com.AashwikIT.Service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userServ;

	@GetMapping("/register")
	public String registrationPage(Model model) {
		model.addAttribute("user", new RegistrationForm());
		return "register";
	}

	@PostMapping("/register")
	public String handelSignUp(@ModelAttribute("user") RegistrationForm form, Model model) {

		String status = userServ.register(form);

		if (status=="success") {
			model.addAttribute("succMsg", "Account Created");
		}else {
			model.addAttribute("errMsg", "Choose unique email");
		}

		return "register";
	}
	
	
	@GetMapping("/login")
	public String loginPage(Model model) {

		model.addAttribute("loginForm", new LoginForm());
		return "login";
	}
	
		
	@PostMapping("/login")
	public String login(@ModelAttribute("loginForm") LoginForm loginForm ,Model model) {

		System.out.println(loginForm);
		
		String status = userServ.login(loginForm);
		
		if (status.contains("Success")) {
			return "redirect:/dashboard";
		}else {
			
			model.addAttribute("errMsg", status);
			return "login";
		}
		
		
	}

}
