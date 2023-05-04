package com.AashwikIT.Service;

import com.AashwikIT.FormBinding.LoginForm;
import com.AashwikIT.FormBinding.RegistrationForm;

public interface UserService {

	public String register(RegistrationForm form);
	public String login(LoginForm form);
	
}
