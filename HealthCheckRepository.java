package com.example.healthcheckmonitoringservice.repository;

import com.example.healthcheckmonitoringservice.model.HealthCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthCheckRepository extends JpaRepository<HealthCheck, Long> {
}