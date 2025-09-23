package com.gpay.paymentservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credit_cards")
@PrimaryKeyJoinColumn(name = "id") // inherits PK from PaymentMethod
public class CreditCard extends PaymentMethod {

	private String cardNumber; // encrypted / masked
	private String cardHolderName;
	private String expiryDate; // MM/YY
	private String cvv;        // encrypted
}