package com.gpay.user_service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gpay.user_service.model.User;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
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
    @JsonIgnore
    private List<User> connectedUsers;
}
