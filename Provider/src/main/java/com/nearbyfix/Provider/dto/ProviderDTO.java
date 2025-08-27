package com.nearbyfix.Provider.dto;

import com.nearbyfix.Provider.Entity.Booking;
import com.nearbyfix.Provider.Entity.Review;
import com.nearbyfix.Provider.Entity.ServiceListing;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProviderDTO {
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String password;
    private String city;
    private String kycStatus;
    private String status;
    private List<ServiceListing> services;
    private List<Booking> bookings;
    private List<Review> reviews;
}

