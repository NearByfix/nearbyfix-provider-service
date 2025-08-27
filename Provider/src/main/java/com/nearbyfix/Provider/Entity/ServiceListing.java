package com.nearbyfix.Provider.Entity;

import jakarta.persistence.*;

@Entity
public class ServiceListing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;   // Plumbing, Electrician, Cleaning
    private String description;
    private double price;
    private String availability; // e.g. 9 AM - 6 PM

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;
}

