package com.gpay.user_service.controller;


import com.gpay.user_service.model.Business;
import com.gpay.user_service.service.Impl.BusinessServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/businesses")
public class BusinessController {

	@Autowired
	private BusinessServiceImpl businessServiceImpl;


	@GetMapping
	public ResponseEntity<?> getAllBusinesses() {
		List<Business> businesses = businessServiceImpl.getAllBusiness();

		if (businesses.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("No Business Found");
		}

		return ResponseEntity.ok(businesses);

	}
}
