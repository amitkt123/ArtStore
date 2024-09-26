 
# ArtStore

## Description

ArtStore is a Monolithic Spring Boot application designed to manage an online art store. This project includes features such as browsing available artworks, purchasing items, and managing orders. It demonstrates the integration of various APIs and services to handle product catalogs, shopping carts, and order processing.

## Features

- **Product Catalog**: View available artworks with details such as price, artist, and description.
- **Shopping Cart**: Add or remove items from the shopping cart.
- **Order Management**: Place and manage orders for the artworks.
- **API Integration**: Leverages external APIs for handling payments, inventory, and notifications.

## Prerequisites

- Java 11+
- Maven
- Spring Boot 2.5+
- MySQL or any relational database

## Technologies Used

- **Spring Boot**: Backend framework for building the application.
- **Thymeleaf**: Templating engine used for rendering views.
- **Spring Data JPA**: For database interactions.
- **MySQL**: Database for storing product and order details.
- **REST API**: Consumes external APIs for payment and notifications.

## Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/amitkt123/ArtStore.git
   cd ArtStore

## configure Database
spring.datasource.url=jdbc:mysql://localhost:3306/artstore_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
