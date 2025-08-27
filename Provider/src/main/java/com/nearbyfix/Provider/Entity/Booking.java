package com.nearbyfix.Provider.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String customerPhone;
    private String serviceCategory;
    private LocalDateTime bookingDate;
    private String status; // PENDING, ACCEPTED, REJECTED, COMPLETED

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;
}
