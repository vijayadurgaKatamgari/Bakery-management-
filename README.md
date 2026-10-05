# 🍰 Home Bakery Order Management System

PBL full-stack application for a home bakery.

## Technology Stack

- Java 17
- Spring Boot
- Spring Web / REST API
- Spring Data JPA
- Hibernate
- MySQL
- React
- Vite
- Axios
- HTML/CSS/JavaScript

## Project Structure

```text
Home-Bakery-Order-Management
├── backend
│   ├── pom.xml
│   └── src/main
│       ├── java/com/bakery
│       │   ├── BakeryApplication.java
│       │   ├── config
│       │   ├── controller
│       │   ├── entity
│       │   ├── repository
│       │   └── service
│       └── resources/application.properties
├── frontend
│   ├── package.json
│   ├── index.html
│   └── src
│       ├── App.jsx
│       ├── main.jsx
│       └── style.css
├── database
│   └── bakery.sql
└── README.md
```

## 1. MySQL

Create the database:

```sql
CREATE DATABASE bakery_db;
```

Then run `database/bakery.sql` after the Spring Boot application has started once, because JPA creates the `products` table automatically.

## 2. Configure MySQL

Open:

`backend/src/main/resources/application.properties`

Change:

```properties
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

to your real MySQL password.

## 3. Run Backend

Open a terminal in `backend`:

```bash
mvn spring-boot:run
```

Backend URL:

`http://localhost:8080`

Test:

`http://localhost:8080/api/products`

## 4. Run Frontend

Open another terminal in `frontend`:

```bash
npm install
npm run dev
```

Frontend URL:

`http://localhost:5173`

## REST APIs

### Products

- GET `/api/products`
- GET `/api/products/{id}`
- POST `/api/products`
- PUT `/api/products/{id}`
- DELETE `/api/products/{id}`

### Orders

- GET `/api/orders`
- GET `/api/orders/{id}`
- POST `/api/orders`
- PUT `/api/orders/{id}/status`

## Application Flow

```text
React
  ↓
REST API
  ↓
Spring Boot Controller
  ↓
Service
  ↓
JPA Repository
  ↓
Hibernate
  ↓
MySQL
```

## Main Features

- Product catalogue
- Product categories
- Product customization
- Quantity
- Delivery date
- Customer address/contact
- Order validation
- Order confirmation
- Total calculation
- Delivery status
- Product CRUD APIs
- Order management APIs
- Responsive UI

## GitHub

```bash
git init
git add .
git commit -m "Initial Home Bakery Order Management System"
git branch -M main
git remote add origin YOUR_GITHUB_REPOSITORY_URL
git push -u origin main
```
