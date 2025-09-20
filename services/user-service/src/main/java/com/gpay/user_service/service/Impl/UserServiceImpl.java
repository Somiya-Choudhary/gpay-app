package com.gpay.user_service.service.Impl;

import com.gpay.user_service.model.User;
import com.gpay.user_service.repository.UserRepository;
import com.gpay.user_service.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	public User createUser(User user){
		System.out.println("User data: "
				+ user.getEmail() + ", "
				+ user.getName() + ", "
				+ user.getContactNumber() + ", "
				+ user.getPassword());
		User newUser = userRepository.save(user);
		return newUser;
	}

	public User getUserByEmail(User user){
		String userEmail = user.getEmail();
		String userPassword = user.getPassword();

		Optional<User> dbUser = userRepository.findByEmail(userEmail);

		if(dbUser.isPresent()){
			User foundUser = dbUser.get();
			if(foundUser.getPassword().equals(userPassword)){
				return foundUser;
			}
		}
		return null;
	}
}
