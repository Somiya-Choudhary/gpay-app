package com.gpay.user_service.controller;


import com.gpay.user_service.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserController {


	@PostMapping("createUser")
	public ResponseEntity<User> createUser(@RequestBody User user){

		User newUser = new User(user.getName(), user.getEmail(), user.getContactNumber(), user.getPassword());

		System.out.println("In rest controller");
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("getuser/{userEmail}")
	public ResponseEntity<User> getUser(@PathVariable String userEmail){
		User newUser = new User("som","is","65","st");

		System.out.println("In rest controller2");
		return new ResponseEntity<>(newUser, HttpStatus.OK);
	}

	@PostMapping("addFriend/{userEmail}")
	public ResponseEntity<User> addFriend(@PathVariable String userEmail){
		User newUser = new User("som","is","65","st");

		System.out.println("In rest controller2");
		return new ResponseEntity<>(newUser, HttpStatus.OK);
	}

	@PostMapping("addBusiness/{userEmail}")
	public ResponseEntity<User> addBusiness(@PathVariable String userEmail){
		User newUser = new User("som","is","65","st");

		System.out.println("In rest controller2");
		return new ResponseEntity<>(newUser, HttpStatus.OK);
	}
}
