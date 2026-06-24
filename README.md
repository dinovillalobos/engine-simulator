# Engine Validation Simulator

Este proyecto es un simulador de software diseñado para la automatización de flujos de validación de motores, simulando la integración con sistemas de hardware embebido (HIL) como dSPACE o National Instruments.

## 🛠️ Stack Tecnológico
* **Java 17** (Uso de Records para optimización de DTOs)
* **Spring Boot 3.x** (Web, Validation)
* **Maven** (Gestión de dependencias)
* **SpringDoc OpenAPI / Swagger** (Documentación de contratos de software)

## 🚀 Arquitectura del Proyecto (Fase 1)
Actualmente el proyecto cuenta con el esqueleto base y la exposición de contratos mediante APIs RESTful de alta disponibilidad.

* **GET /api/v1/engine/status**: Verifica el estado de conexión del simulador.

## 📋 Próximas Implementaciones
* **Fase 2**: Integración de librerías nativas (.dll/.so) mediante **JNA/JNI** para la comunicación directa con el core de simulación de bajo nivel.
* **Fase 3**: Automatización de pruebas de integración con **REST Assured**.
