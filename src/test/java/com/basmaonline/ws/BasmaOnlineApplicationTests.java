package com.basmaonline.ws;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.basmaonline.ws.Entity.UserEntity;
import com.basmaonline.ws.repository.UserRepository;
import com.basmaonline.ws.responses.UserResponse;
import com.basmaonline.ws.services.UserService;
import com.basmaonline.ws.shared.dto.UserDto;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

@SpringBootTest
class BasmaOnlineApplicationTests {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	void contextLoads() {
	}
	
/*	@Test
	public void testCreateUser() {
		
		UserDto userDto = new UserDto(); // creation nouveau obj
		userDto.setFirstName("Hamza"); 
		userDto.setLastName("Rh");
		userDto.setEmail("HamzaRh@eee.com");
		userDto.setPassword("123456");
		
		UserDto cu = userService.createUser(userDto);
		
		UserResponse ur = new UserResponse();
		BeanUtils.copyProperties(cu, ur);
		
		
		System.out.print(userDto.toString());
	}*/
	
	@Test
	public void testUpdateUser() {
		
		String userId = "g7jOXt62iKK81ZmCdplYavDDkLtRWHgK";
		
		UserDto userDto  = new UserDto();
		//userDto.setUserId("");
		
		userDto.setFirstName("Test");
		userDto.setLastName("Test");
		//userDto.setEmail("dd@dd.com");
		
		UserDto cu = userService.updateUser(userId, userDto);
		
		UserResponse ur = new UserResponse();
		
		BeanUtils.copyProperties(cu, ur);
		
		
		System.out.print(userDto.toString());
		
	}
	
	/* @Test
	public void testFindByEmail() {
		
		
		UserDto userDto  = new UserDto();
		
		userDto.setEmail("Hamza@gmail.com");
		
		UserDto cu = userService.getUser(userDto.getEmail());
		
		UserResponse ur = new UserResponse();
		
		BeanUtils.copyProperties(cu, ur);		
						
		System.out.print(userDto.toString());
		assertEquals(cu, userDto.getEmail());
		
		
	}*/


}
