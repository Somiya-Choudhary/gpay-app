package com.gpay.user_service.service;

import com.gpay.user_service.model.User;

import java.util.List;


public interface UserService {

	User createUser(User user);

	User getUserByEmail(User user);

	List<User> getAllUsers();
}
