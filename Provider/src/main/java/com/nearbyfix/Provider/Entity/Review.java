package com.nearbyfix.Provider.Entity;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private int rating; // 1–5
    private String comment;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;
}

