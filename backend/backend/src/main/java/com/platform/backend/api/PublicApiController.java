package com.platform.backend.api;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicApiController {

    
    @GetMapping("/api/v1/health")
    public Map<String, Object> health() {

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("status", "UP");
        response.put("service", "platform-backend");
        response.put("timestamp", Instant.now().toString());

        return response;
    }
}
