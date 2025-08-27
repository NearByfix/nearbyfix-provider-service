package com.nearbyfix.Provider.service.impl;

import com.nearbyfix.Provider.Entity.Provider;
import com.nearbyfix.Provider.dto.ProviderDTO;
import com.nearbyfix.Provider.repository.ProviderRepository;

import com.nearbyfix.Provider.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl implements ProviderService {

    private final ProviderRepository providerRepository;


    private ProviderDTO mapToDTO(Provider provider) {
        return ProviderDTO.builder()
                .id(provider.getId())
                .fullName(provider.getFullName())
                .email(provider.getEmail())
                .phone(provider.getPhone())
                .kycStatus(provider.getKycStatus())
                .status(provider.getStatus())
                .services(provider.getServices())
                .bookings(provider.getBookings())
                .reviews(provider.getReviews())
                .build();
    }

    private Provider mapToEntity(ProviderDTO providerDTO) {
        return Provider.builder()
                .id(providerDTO.getId())
                .fullName(providerDTO.getFullName())
                .email(providerDTO.getEmail())
                .phone(providerDTO.getPhone())
                .kycStatus(providerDTO.getKycStatus())
                .status(providerDTO.getStatus())
                .services(providerDTO.getServices())
                .bookings(providerDTO.getBookings())
                .reviews(providerDTO.getReviews())
                .build();
    }



    @Override
    public ProviderDTO registerProvider(ProviderDTO ProviderDTO) {
        Provider provider = mapToEntity(ProviderDTO);
        Provider saved = providerRepository.save(provider);
        return mapToDTO(saved);
    }

    @Override
    public ProviderDTO updateProviderDTO(Long id, ProviderDTO ProviderDTO) {
        return null;
    }

    @Override
    public void deleteProviderDTO(Long id) {

    }

    @Override
    public ProviderDTO getProviderDTOById(Long id) {
        return null;
    }

    @Override
    public List<ProviderDTO> getProviderDTOsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<ProviderDTO> getProviderDTOsByLocation(String location) {
        return List.of();
    }

    @Override
    public List<ProviderDTO> searchProviderDTOs(String category, String location) {
        return List.of();
    }

    @Override
    public ProviderDTO login(String email, String password) {
        return null;
    }

    @Override
    public List<ProviderDTO> getAllProviderList() {
        return providerRepository.findAll().stream()
                .map(provider->  ProviderDTO.builder()
                        .id(provider.getId())
                        .fullName(provider.getFullName())
                        .email(provider.getEmail())
                        .phone(provider.getPhone())
                        .kycStatus(provider.getKycStatus())
                        .status(provider.getStatus())
                        .services(provider.getServices())
                        .bookings(provider.getBookings())
                        .reviews(provider.getReviews())
                        .build()
                ).toList();

    }
}
