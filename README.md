# Sky Route - Backend

The backend of **Sky Route**, a modern flight booking system built with **Spring Boot (Java)** and designed using a **microservices architecture**.

This repository contains all backend microservices for the Sky Route platform, including booking, payments, flight management, and user services.

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Cloud (for microservices)
- PostgreSQL / MySQL (database)
- Docker & Kubernetes (optional, for containerization)
- Maven (build & dependency management)

---

## 📂 Project Structure
skyroute-backend/
├── booking-service/ # Handles booking flights
├── payment-service/ # Processes payments
├── flight-service/ # Manages flights and availability
├── user-service/ # Handles user accounts & authentication
└── common/ # Shared configs, DTOs, utils

text

Each service is an independent Spring Boot application and communicates with others via REST APIs (future-ready for message queues like Kafka or RabbitMQ).

---

## 🚀 Getting Started

### 1. **Clone the repository**

```bash
git clone https://github.com/skyroute-org/skyroute-backend.git
cd skyroute-backend
2. Navigate to a service and run it
bash
cd booking-service
./mvnw spring-boot:run
3. Run tests
bash
./mvnw test
```
***📋 Prerequisites***

Java 17 or higher

Maven 3.6 or higher

PostgreSQL/MySQL (depending on service configuration)

Docker (optional, for containerized deployment)

***🔧 Configuration***

Each service contains its own application.properties or application.yml file for environment-specific configuration. Common configuration patterns include:

Database connection settings

Service discovery configuration

API gateway routes

Security settings

***🐳 Docker Support***

To build and run services using Docker:

```bash
# Build all services
docker-compose build

# Start all services
docker-compose up
```
