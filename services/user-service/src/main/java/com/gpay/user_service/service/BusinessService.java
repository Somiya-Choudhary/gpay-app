package com.gpay.user_service.service;

import com.gpay.user_service.model.Business;

import java.util.List;
import java.util.Optional;

public interface BusinessService {

	Optional<List<Business>> getAllBusiness();
}
