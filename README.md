# FindIt

## Description
FindIt is a RESTful application developed with Spring Boot.
It allows users to manage lost and found items.

## Architecture

- Controller Layer: Handles HTTP requests.
- Service Layer: Contains business logic.
- Repository Layer: Accesses the database.
- Entity Layer: Represents data objects.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman

## REST Endpoints

GET /api/items

GET /api/items/{id}

POST /api/items

PUT /api/items/{id}

DELETE /api/items/{id}

## Features

- Create an item
- Retrieve all items
- Retrieve one item by ID
- Update an item
- Delete an item
