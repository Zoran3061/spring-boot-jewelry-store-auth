# Spring Boot Jewelry Store API (JWT)

Backend REST API built with **Spring Boot** for a jewelry store application.  
The project includes **JWT authentication**, role-based authorization, and core e-commerce functionality.

---

## Features
- User registration & login (JWT)
- Role-based access control
- Product CRUD operations
- Jewelry categories (rings, gold, silver, etc.)
- Shopping cart
- Orders and order items
- Secure REST endpoints

---

## Tech Stack
- Java 17
- Spring Boot
- Spring Security (JWT)
- Spring Data JPA (Hibernate)
- Maven
- MySQL (phpMyAdmin compatible)

---

## Project Structure
```
src/main/java/com/metropolitan/pz
├── controller   # REST controllers
├── service      # Business logic
├── repository   # JPA repositories
├── entities     # Domain entities
├── security     # JWT & Spring Security
└── PzApplication.java
```

---

## Run Locally
1. Clone the repository:
   ```bash
   git clone https://github.com/Zoran3061/IT355-pz2.git
   ```
2. Configure database in `application.properties`
3. Run:
   ```bash
   mvn spring-boot:run
   ```
4. API available at:
   ```
   http://localhost:8080
   ```

---

## Notes
This project was developed for the **IT355 course** and is part of my backend portfolio, focusing on secure API design and clean Spring Boot architecture.

**Author:** Zoran
