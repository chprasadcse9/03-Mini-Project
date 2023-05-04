package com.AashwikIT.Service.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AashwikIT.Entity.UserEntity;
import com.AashwikIT.FormBinding.LoginForm;
import com.AashwikIT.FormBinding.RegistrationForm;
import com.AashwikIT.Repository.UserRepo;
import com.AashwikIT.Service.UserService;
import com.AashwikIT.Utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private EmailUtils emailUtils;

	@Override
	public String register(RegistrationForm form) {

		UserEntity userDtlsEntity = userRepo.findByEmail(form.getEmail());

		if (userDtlsEntity != null) {

			return "failed";
		}
		// copy data from binding object to entity object
		UserEntity user = new UserEntity();
		BeanUtils.copyProperties(form, user);
		
		//save user details
		userRepo.save(user);
		
		String to = form.getEmail();
		String subject ="Registration Details";
		StringBuffer body = new StringBuffer("");
		body.append("User Name: "+user.getEmail());
		body.append("<br/>");
		body.append("Password : "+user.getPassword());
		body.append("<br/>");
		body.append("<a href=\"http://localhost:8081/login?email=" + to + "\"> Click Here To Login </a>");

		emailUtils.sendEmail(to,subject, body.toString());
		
		return "success";
	}

	@Override
	public String login(LoginForm form) {
		UserEntity entity = userRepo.findByEmail(form.getEmail());
		
		if (entity==null) {
			return "Invalid Credentials";
			
		}
		
		return "Success";
	}
	
}
