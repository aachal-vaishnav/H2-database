# Spring Boot Student API – UUID & H2 Database

## Overview
This project is a Spring Boot REST API built to demonstrate **UUID-based primary keys** and **H2 in-memory database integration** using a clean layered architecture.

It focuses on:
- UUID as a globally unique identifier
- H2 in-memory database for testing
- Spring Data JPA integration
- Hibernate schema generation
- RESTful API design

This project reflects strong understanding of **backend fundamentals**, **database concepts**, and **Spring Boot internals**.

---

## Tech Stack
- Java 25
- Spring Boot 4
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- Lombok

---

## Architecture
```

Client → Controller → Service → Repository → H2 Database

````

Each layer has a single responsibility, following industry best practices.

---

## Key Concepts Demonstrated
- UUID (`128-bit`) primary key generation
- In-memory database lifecycle
- Hibernate auto schema creation
- REST API request/response flow
- JSON to Java object mapping

---

## API Endpoint

| Method | Endpoint | Description |
|------|--------|------------|
| POST | /student/create | Create a student |

---

## Sample API Response
```json
{
  "id": "f87fd607-0591-4fb4-aa8f-4b7307e40884",
  "name": "Aachal",
  "email": "aachal@gmail.com"
}
````

---

## H2 Console Access

* URL: `http://localhost:8080/h2-console`
* Driver: `org.h2.Driver`
* JDBC URL: `jdbc:h2:mem:student`

---

## How to Run

### Prerequisites

* Java 25
* Maven

### Steps

```bash
mvn clean install
mvn spring-boot:run
```

Application runs on:

```
http://localhost:8080
```

---

## Conclusion

This project demonstrates correct usage of UUIDs, in-memory databases, and Spring Boot REST architecture, suitable for testing, learning, and rapid development.
