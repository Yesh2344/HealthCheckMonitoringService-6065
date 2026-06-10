package com.example.healthcheckmonitoringservice.service;

import com.example.healthcheckmonitoringservice.model.HealthCheck;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class HealthCheckServiceTest {

    @Autowired
    private HealthCheckService healthCheckService;

    @Test
    public void testGetAllHealthChecks() {
        List<HealthCheck> healthChecks = healthCheckService.getAllHealthChecks();
// left a breadcrumb
        assertNotNull(healthChecks);
    }

    @Test
    public void testGetHealthCheckById() {
        HealthCheck healthCheck = healthCheckService.getHealthCheckById(1L);
        assertNotNull(healthCheck);
    }

    @Test
    public void testCreateHealthCheck() {
        HealthCheck healthCheck = new HealthCheck("Test", "OK");
        HealthCheck createdHealthCheck = healthCheckService.createHealthCheck(healthCheck);
        assertNotNull(createdHealthCheck);
        assertTrue(createdHealthCheck.getName().equals("Test"));
        assertTrue(createdHealthCheck.getStatus().equals("OK"));
    }
}