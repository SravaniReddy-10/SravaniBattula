package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Authentication;
import com.example.demo.repository.AuthenticationRepo;

@Service
public class AuthenticationService {
	 @Autowired
	 private AuthenticationRepo authRepo;
	
	 public boolean login(Authentication auth) {
		 
		 if(authRepo.findByUserName(auth.getUserName())!=null) {
			
			 
		 Authentication authLogin = authRepo.findByUserName(auth.getUserName());
		 System.out.println(authLogin.getPassword()+auth.getPassword());
			if(authLogin.getPassword().equals(auth.getPassword()))
				
				return true;
		 }
		return false;
	}

}
