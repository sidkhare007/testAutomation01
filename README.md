# Test Automation Framework

This is a POC automation framework supporting both UI (Selenium) and API (RestAssured) automation in Java using TestNG and Allure reporting.

## Structure

- **UI tests:** `src/test/java/com/example/ui`
- **API tests:** `src/test/java/com/example/api`
- **Drivers & Utils:** `src/main/java/com/example/drivers` and `src/main/java/com/example/utils`

## How to run

- Install Maven
- Run all tests:
  ```
  mvn clean test
  ```
- Generate and serve Allure report:
  ```
  allure serve target/allure-results
  ```

## Features

- Allure reporting for UI & API tests
- Sample UI & API tests for proof of concept
