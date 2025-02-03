# Currency Converter API

## Overview
This is a Spring Boot application that integrates with a public API to provide real-time currency conversion functionality. The application fetches exchange rates from a public API and allows users to convert amounts between currencies.

## Features
- Fetch real-time exchange rates.
- Convert an amount from one currency to another.
- Handles errors such as unavailable external APIs and invalid currency codes.
- Includes unit tests for service layer using JUnit.

## Technologies Used
- Java
- Spring Boot
- Maven
- REST API
- JUnit

## Endpoints
### Fetch Exchange Rates
**GET** `/api/rates?base=USD`
- Fetches exchange rates for the given base currency.
- Default base currency is `USD` if not provided.

### Convert Currency
**POST** `/api/convert`
- Converts an amount from one currency to another using fetched exchange rates.
- **Request Body:**
  ```json
  {
    "from": "USD",
    "to": "EUR",
    "amount": 100
  }
  ```
- **Response:**
  ```json
  {
    "from": "USD",
    "to": "EUR",
    "amount": 100,
    "convertedAmount": 94.5
  }
  ```

## Error Handling
- Handles cases where the external API is unavailable.
- Returns appropriate responses for invalid currency codes.

## Setup and Running the Application
### Prerequisites
- Java 17+
- Maven

### Steps to Run
1. Clone the repository:
   ```sh
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```sh
   cd currency-converter-api
   ```
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

### Testing
Run unit tests using:
```sh
mvn test
```

## API Documentation


## License


