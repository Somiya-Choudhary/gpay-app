package com.gpay.transactionservice.model;

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
@Table(name = "transaction_logs")
public class TransactionLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long transactionId; // reference to PaymentService Transaction ID

	private Long userId;        // optional, for easier querying
	private Long businessId;    // optional, for easier querying

	private String eventType;   // PAYMENT / REFUND / RETRY / INFO

	@Column(length = 2000)
	private String logMessage;  // detailed gateway or system log

	private String status;      // SUCCESS / FAILED / PENDING / INFO

	private LocalDateTime createdAt;
}