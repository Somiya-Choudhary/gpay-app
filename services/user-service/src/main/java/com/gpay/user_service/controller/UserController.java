package com.gpay.user_service.controller;


import com.gpay.user_service.model.Business;
import com.gpay.user_service.model.User;
import com.gpay.user_service.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	UserServiceImpl userService;

	@PostMapping("createUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createdUser = userService.createUser(user);

		return ResponseEntity.ok(createdUser);
	}

	@PostMapping("loginUser")
	public ResponseEntity<User> getUser(@RequestBody User user){

		User loggedInUser = userService.getUserByEmail(user);

		if (loggedInUser == null) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
		}
	}

	@GetMapping
	public ResponseEntity<?> getAllUsers(){

		List<User> users = userService.getAllUsers();

		if(users.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("No Users Found");
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PostMapping("addFriend/{userEmail}")
	public ResponseEntity<User> addFriend(@PathVariable String userEmail){
		User newUser = new User("som","is","65","st");

		return new ResponseEntity<>(newUser, HttpStatus.OK);
	}

	@PostMapping("addBusiness/{userEmail}")
	public ResponseEntity<User> addBusiness(@PathVariable String userEmail){
		User newUser = new User("som","is","65","st");

		return new ResponseEntity<>(newUser, HttpStatus.OK);
	}
}
