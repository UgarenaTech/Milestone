package com.ugarena.milestone.authenticaton.service;

import org.springframework.stereotype.Service;

import com.ugarena.milestone.model.UserInfo;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Override
	public String loginService(UserInfo userInfo) {
		
		UserInfo databaseObject = getFromDb();
		
		if(userInfo.getUgarenaId().equals(databaseObject.getUgarenaId()) && userInfo.getPassword().equals(databaseObject.getPassword())) {
			return "login success";
		}
		
			return "login failure";
		
	}
	
	public static UserInfo getFromDb() {
		UserInfo mockUserInfo = new UserInfo();
		mockUserInfo.setUgarenaId("sonu123");
		mockUserInfo.setPassword("xxx");
		return mockUserInfo;
	}

}
