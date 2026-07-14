package io.github.jopsantossilva2005.networkinventorymanager.controller;

import io.github.jopsantossilva2005.networkinventorymanager.dto.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<HealthResponse> healthResponse(){
        HealthResponse response = new HealthResponse("UP", "Network Inventory Manager", Instant.now());
        return ResponseEntity.ok(response);
    }


}
