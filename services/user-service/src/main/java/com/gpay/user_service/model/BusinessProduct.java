package com.gpay.user_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "business_products")
public class BusinessProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "business_id")
	private Business business; // reference to the business offering this product

	private String productName;  // e.g., "Jio 2GB/day plan" or "Netflix Monthly Subscription"

	private String productType;  // PLAN / PRODUCT / SUBSCRIPTION

	private double price;        // price of the product or plan

	private Integer validityDays; // for subscriptions/plans, null for one-time products

	@Column(length = 1000)
	private String details;      // optional JSON/text with extra info

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
