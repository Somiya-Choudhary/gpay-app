package com.gpay.user_service.service.Impl;

import com.gpay.user_service.model.Business;
import com.gpay.user_service.repository.BusinessRepository;
import com.gpay.user_service.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessRepository businessRepository;


	public List<Business> getAllBusiness(){

		List<Business> allBusiness = businessRepository.findAll();

		return allBusiness;

	}
}
