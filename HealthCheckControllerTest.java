package com.example.healthcheckmonitoringservice.controller;

import com.example.healthcheckmonitoringservice.model.HealthCheck;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HealthCheckControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllHealthChecks() throws Exception {
        mockMvc.perform(get("/health-check"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetHealthCheckById() throws Exception {
        mockMvc.perform(get("/health-check/1"))
                .andExpect(status().isOk());
    }

    @Test
    public void testCreateHealthCheck() throws Exception {
        HealthCheck healthCheck = new HealthCheck("Test", "OK");
        mockMvc.perform(post("/health-check")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(healthCheck)))
                .andExpect(status().isOk());
    }

    private static String asJsonString(final Object obj) {
        return "{\"name\":\"" + obj + "\",\"status\":\"OK\"}";
    }
}