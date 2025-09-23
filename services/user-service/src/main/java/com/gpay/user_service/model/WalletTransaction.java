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
@Table(name = "wallet_transactions")
public class WalletTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private User user;

	private double amount;

	private LocalDateTime createdAt;

	private boolean success;

	private String type; // "DEBIT", "CREDIT", "CASHBACK", "REFUND"
	private String reason; // e.g., "Netflix subscription", "Referral Cashback", "Failed payment refund"

	private Long relatedPaymentId; // optional, link to original payment or subscription
}


