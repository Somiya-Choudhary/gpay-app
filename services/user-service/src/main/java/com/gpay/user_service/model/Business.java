package com.gpay.user_service.model;

import com.gpay.user_service.model.User;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "businesses")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String businessName;
    private String email;
    private String contactNumber;

    // If you want to know which users are connected to this business
    @ManyToMany(mappedBy = "connectedBusinesses")
    private List<User> connectedUsers;
}
