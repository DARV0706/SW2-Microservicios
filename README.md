# 🛠️ Taller de Microservicios
Este repositorio contiene el desarrollo de un taller de microservicios, realizado como parte de una actividad académica para aprender y aplicar principios fundamentales del diseño e implementación de sistemas distribuidos utilizando arquitecturas basadas en microservicios. El proyecto fue desarrollado en equipo, siguiendo buenas prácticas de programación y despliegue.

# 📚 Objetivo del Taller
El objetivo principal de este taller fue implementar una aplicación basada en microservicios que permita gestionar un sistema de inventarios y pedidos. Este ejercicio incluyó la configuración, desarrollo, integración y despliegue de servicios independientes que interactúan a través de una API Gateway.

## 🚀 Arquitectura Implementada
La arquitectura del proyecto incluye los siguientes componentes principales:

- API Gateway: Maneja el enrutamiento y la autenticación entre los microservicios.
Microservicios:
- Products-service: Manejo de inventario de productos.
- Checkout-service: Gestión de órdenes.
- Base de Datos: No se manejo, se realizo una simulacion con una lista
- Comunicación: Se implementó comunicación entre microservicios mediante REST.

## 🛠️ Tecnologías Utilizadas
- Backend: Spring Boot
- Gestión de Configuración: Spring Cloud Config Server
- Autenticación: Keycloak
- Pruebas: Postman para API Testing

## 📊 Documentación Adicional
El proyecto incluye:

- Especificación de APIs (en formato OpenAPI/Swagger)
- Diagramas C4

## 🤝 Equipo de Trabajo
- Daniel Alejandro Ramos Vargas
- Mannuel Alejandro Terreros Rodriguez
