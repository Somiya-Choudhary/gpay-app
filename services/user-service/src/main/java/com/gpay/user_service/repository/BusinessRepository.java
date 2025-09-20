package com.gpay.user_service.repository;

import com.gpay.user_service.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<Business,Long> {
}
