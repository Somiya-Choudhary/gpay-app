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
@Table(name = "refunds")
public class Refund {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "transaction_id")
	private Transaction transaction;

	private double refundAmount;

	private String status; // PENDING / SUCCESS / FAILED
	private String reason; // e.g., "Payment failed", "User requested refund"

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}

