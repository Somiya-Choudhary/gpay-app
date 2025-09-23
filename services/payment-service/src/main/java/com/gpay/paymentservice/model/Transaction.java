package com.gpay.paymentservice.model;

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
@Table(name = "transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long userId;         // reference to User Service
	private Long businessId;     // reference to Business Service
	private Long paymentMethodId; // optional, reference to Payment Service

	private double amount;
	private String status;       // SUCCESS / FAILED / PENDING / REFUNDED
	private String type;         // WALLET / UPI / CREDIT_CARD / DEBIT_CARD

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	private String transactionId; // unique id for idempotency
}

