# Controller API for Performance Testing

This repository contains a Spring Boot Controller API designed for performance testing different methods of converting entity objects to DTOs (Data Transfer Objects). It includes three endpoints, each showcasing a different approach for this conversion:

## Endpoints

### 1. Java Conversion

- **Endpoint:** `/java`
- **Description:** This endpoint performs a performance test using plain Java code for entity to DTO conversion. It generates a large data set of users and measures the time it takes to convert them.

### 2. ModelMapper Conversion

- **Endpoint:** `/modelmapper`
- **Description:** This endpoint performs a performance test using the ModelMapper library for entity to DTO conversion. It generates a large data set of users and measures the time it takes to convert them using ModelMapper.

### 3. MapStruct Conversion

- **Endpoint:** `/mapstruct`
- **Description:** This endpoint performs a performance test using the MapStruct library for entity to DTO conversion. It generates a large data set of users and measures the time it takes to convert them using MapStruct.

## Usage

To use this API for performance testing, you can follow these steps:

1. Clone this repository to your local environment.
2. Build and run the Spring Boot application.
3. Access the API endpoints using tools like cURL, Postman, or a web browser.
4. Observe and compare the conversion times for different methods.

## Dependencies

This project uses the following dependencies:

- Spring Boot for building the API.
- ModelMapper for the ModelMapper conversion.
- MapStruct for the MapStruct conversion.