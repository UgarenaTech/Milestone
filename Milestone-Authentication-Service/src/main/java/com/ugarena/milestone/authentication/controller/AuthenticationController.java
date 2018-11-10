package com.ugarena.milestone.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ugarena.milestone.authenticaton.service.AuthenticationService;
import com.ugarena.milestone.model.UserInfo;

@RestController
public class AuthenticationController {

	@Autowired
	AuthenticationService authenticationService;
	
	@PostMapping("/login")
	public String login(@RequestBody UserInfo userInfo) {
		return authenticationService.loginService(userInfo);
	
	}
	
}
