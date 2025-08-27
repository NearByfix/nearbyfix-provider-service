package com.nearbyfix.Provider.Controller;

import com.nearbyfix.Provider.dto.ProviderDTO;
import com.nearbyfix.Provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/providers")
public class ProviderController {

    @Autowired
    ProviderService providerService;



    @PostMapping("/register")
    public ResponseEntity<ProviderDTO> register(@RequestBody ProviderDTO dto) {
        return ResponseEntity.ok(providerService.registerProvider(dto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProviderDTO>> getProviderList() {
        return ResponseEntity.ok(providerService.getAllProviderList());
    }

   /* @GetMapping("/{id}")
    public ResponseEntity<ProviderDTO> getProfile(@PathVariable Long id) {
        return ResponseEntity.ok(providerService.getProfile(id));
    }


    @PutMapping("/{id}")
    public ResponseEntity<ProviderDTO> updateProfile(@PathVariable Long id, @RequestBody ProviderDTO dto) {
        return ResponseEntity.ok(providerService.updateProfile(id, dto));
    }*/
}
