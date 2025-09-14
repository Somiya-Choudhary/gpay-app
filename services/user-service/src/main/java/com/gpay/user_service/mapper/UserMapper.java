package com.gpay.user_service.mapper;

import com.gpay.user_service.dto.UserDto;
import com.gpay.user_service.model.User;

public class UserMapper {

	public static UserDto mapToUserDto(User user){
		UserDto userDto = new UserDto(user.getName(), user.getEmail(), user.getContactNumber(), user.getConnectedUsers(),user.getConnectedBusinesses());

		return userDto;
	}

	//TODO: What constructor is needed
	public static User mapToUser(UserDto userDto){
		User user = new User();
		return user;
	}
}
