package com.example.healthcheckmonitoringservice.service;

import com.example.healthcheckmonitoringservice.model.HealthCheck;
import com.example.healthcheckmonitoringservice.repository.HealthCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthCheckService {

    private final HealthCheckRepository healthCheckRepository;

    @Autowired
    public HealthCheckService(HealthCheckRepository healthCheckRepository) {
        this.healthCheckRepository = healthCheckRepository;
    }

    public List<HealthCheck> getAllHealthChecks() {
        return healthCheckRepository.findAll();
    }

    public HealthCheck getHealthCheckById(Long id) {
        return healthCheckRepository.findById(id).orElse(null);
    }

    public HealthCheck createHealthCheck(HealthCheck healthCheck) {
        return healthCheckRepository.save(healthCheck);
    }
}