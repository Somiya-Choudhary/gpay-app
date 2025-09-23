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
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "payment_methods")
public abstract class PaymentMethod {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long userId; // reference to User in User Service

	private String type; // "CREDIT_CARD", "DEBIT_CARD", "UPI"

	private boolean isDefault; // whether this is the default method

	private LocalDateTime createdAt;
}
