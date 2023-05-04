package com.AashwikIT.Service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AashwikIT.FormBinding.DashboardForm;
import com.AashwikIT.Repository.UserRepo;
import com.AashwikIT.Service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public DashboardForm getDashboardData(Integer userId) {
		
		System.out.println("Dashboard Page");
		
		DashboardForm response=new DashboardForm();
		//Optional<UserEntity> userOptional = userRepo.findById(userId);
		
		return response;
	}
	
}
