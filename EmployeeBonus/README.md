# Employee Bonus Management System

## Overview

This project is a Spring Boot application that manages employee data and calculates bonus eligibility. The application exposes two APIs:
1. A POST API to store employee data.
2. A GET API to retrieve employees eligible for a bonus on a given date.

## Technologies Used

- Spring Boot
- Kotlin
- Gradle
- Spring Data JPA
- H2 Database
- Java Streams API
- Unit Testing with JUnit
- Exception Handling

## Project Structure

```plaintext
EmployeeBonus
├── build.gradle.kts
├── settings.gradle.kts
├── src
    ├── main
        ├── kotlin
            ├── com
                ├── example
                    ├── EmployeeBonus
                        ├── Application.kt
                        ├── entities
                            ├── Department.kt
                            ├── Employee.kt
                        ├── repositories
                            ├── DepartmentRepository.kt
                            ├── EmployeeRepository.kt
                        ├── services
                            ├── EmployeeService.kt
                        ├── controllers
                            ├── EmployeeController.kt
                        ├── exceptions
                            ├── GlobalExceptionHandler.kt
        ├── resources
            ├── application.properties
    ├── test
        ├── kotlin
            ├── com
                ├── example
                    ├── EmployeeBonus
                        ├── EmployeeControllerTest.kt
