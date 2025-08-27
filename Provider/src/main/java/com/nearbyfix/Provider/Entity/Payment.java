package com.nearbyfix.Provider.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private LocalDateTime date;
    private String status; // PENDING, SUCCESS, FAILED

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;
}

