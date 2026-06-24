package com.alten.simulator.engine_simulator.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/engine")
@Tag(name = "Engine Controller", description = "Endpoints para el monitoreo y control del simulador de motor")
public class EngineController {

    @GetMapping("/status")
    @Operation(
            summary = "Obtener el estado del simulador",
            description = "Verifica la disponibilidad del sistema de validación y conectividad básica."
    )
    public ResponseEntity<EngineStatusResponse> getStatus() {
        // Usamos el Record de Java 17 para retornar un JSON limpio
        EngineStatusResponse response = new EngineStatusResponse("Engine Simulator Online", "1.0.0-SNAPSHOT");
        return ResponseEntity.ok(response);
    }

    /**
     * Un Record en Java 17 es una forma excelente y moderna de definir DTOs (Data Transfer Objects)
     * sin código repetitivo (boilerplate) como getters, setters o toString.
     */
    public record EngineStatusResponse(String message, String version) {}
}