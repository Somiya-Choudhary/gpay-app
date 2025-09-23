package com.gpay.user_service.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")  // "user" is a reserved keyword in SQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String contactNumber;
    private String password;

    private double walletAmount; // double instead of String for calculations
    private String defaultPaymentType; // wallet, credit card, debit card, UPI
    private String kycStatus;

    // Wallet transactions (debits, credits, cashback, refunds)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WalletTransaction> walletTransactions;

    // Self-join for friends / connected users
    @ManyToMany
    @JoinTable(
            name = "user_friends",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "friend_id")
    )
    @JsonIgnore
    private List<User> connectedUsers;

    // User ↔ Business connection (past payments)
    @ManyToMany
    @JoinTable(
            name = "user_connected_business",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "business_id")
    )
    @JsonIgnore
    private List<Business> connectedBusinesses;

    // User ↔ Business subscription (active subscriptions)
    @ManyToMany
    @JoinTable(
            name = "user_subscribed_business",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "business_id")
    )
    @JsonIgnore
    private List<Business> subscribedBusinesses;

    public User(String name, String email, String contactNumber, String password) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.password = password;
    }
}