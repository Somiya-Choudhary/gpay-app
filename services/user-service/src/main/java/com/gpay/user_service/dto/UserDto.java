package com.gpay.user_service.dto;

import com.gpay.user_service.model.Business;
import com.gpay.user_service.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private String name;
	private String email;
	private String contactNumber;
	private List<User> connectedUsers;
	private List<Business> connectedBusinesses;
}
