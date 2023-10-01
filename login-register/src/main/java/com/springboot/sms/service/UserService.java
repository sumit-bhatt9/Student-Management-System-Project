package com.springboot.sms.service;

import com.springboot.sms.dto.UserDto;
import com.springboot.sms.model.User;

public interface UserService 
 {
	User findByUsername(String username);
	User save(UserDto userDto);
	
}
 