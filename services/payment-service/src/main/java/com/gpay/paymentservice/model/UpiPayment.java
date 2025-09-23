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
@Table(name = "upi_payments")
@PrimaryKeyJoinColumn(name = "id") // inherits PK from PaymentMethod
public class UpiPayment extends PaymentMethod {

	private String upiId; // e.g., yourname@upi
}