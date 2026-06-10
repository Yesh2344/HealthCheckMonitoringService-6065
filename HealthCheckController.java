package com.example.healthcheckmonitoringservice.controller;

import com.example.healthcheckmonitoringservice.model.HealthCheck;
import com.example.healthcheckmonitoringservice.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {

    private final HealthCheckService healthCheckService;

    @Autowired
    public HealthCheckController(HealthCheckService healthCheckService) {
        this.healthCheckService = healthCheckService;
    }

    @GetMapping
    public ResponseEntity<List<HealthCheck>> getAllHealthChecks() {
        return ResponseEntity.ok(healthCheckService.getAllHealthChecks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HealthCheck> getHealthCheckById(@PathVariable Long id) {
        return ResponseEntity.ok(healthCheckService.getHealthCheckById(id));
    }

    @PostMapping
    public ResponseEntity<HealthCheck> createHealthCheck(@RequestBody HealthCheck healthCheck) {
        return ResponseEntity.ok(healthCheckService.createHealthCheck(healthCheck));
    }
}