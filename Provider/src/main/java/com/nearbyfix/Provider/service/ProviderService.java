package com.nearbyfix.Provider.service;
import com.nearbyfix.Provider.dto.ProviderDTO;

import java.util.List;

public interface ProviderService {

    ProviderDTO registerProvider(ProviderDTO ProviderDTO);

    ProviderDTO updateProviderDTO(Long id, ProviderDTO ProviderDTO);

    void deleteProviderDTO(Long id);

    ProviderDTO getProviderDTOById(Long id);

    List<ProviderDTO> getProviderDTOsByCategory(String category);

    List<ProviderDTO> getProviderDTOsByLocation(String location);

    List<ProviderDTO> searchProviderDTOs(String category, String location);

    ProviderDTO login(String email, String password);

    List<ProviderDTO> getAllProviderList();
}
