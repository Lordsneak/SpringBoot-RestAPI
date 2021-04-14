package com.basmaonline.ws.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.basmaonline.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{
	
	UserDto createUser(UserDto userDto);
	List<UserDto> getUsers(int page, int limit);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	UserDto updateUser(String id, UserDto userDto);
	void deleteUser(String userId);
	
}
