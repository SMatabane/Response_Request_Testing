# ResReq
This project demonstrates API testing using the RestAssured library. The project covers the following API operations: GET, POST, PATCH, and DELETE. Test data is read from a text file, and the project includes logging capabilities as well as Allure reporting for detailed test analysis.

## Project Structure
.
├── src

│   ├── main

│   │   └── java        # Contains main Java classes

│   ├── test

│   │   └── java        # Contains test classes

├── resources

│   └── testdata.txt    # Test data file

├── allure-results      # Generated Allure report results

├── pom.xml             # Maven dependencies and plugins

└── README.md           # Project documentation

## Prerequisites

Before running the tests, ensure you have the following software installed:

Java 8+

Maven

Allure Commandline

## API Operations

The project covers the following API operations:

- GET - Retrieve information from an API endpoint.
- POST - Create new resources via API.
- PATCH - Update existing resources partially.
- DELETE - Remove resources from the system.
## Test Data

The test data is stored in a text file (src/resources) and is read dynamically during test execution. The format of the test data is as follows:
{
  "name": "morpheus",
  "job": "leader"
}

## Logging

The project generates logs during test execution, providing detailed information about the HTTP requests and responses, including:

- HTTP Method
- URI
- Request body
- Response body
- Logs are automatically captured and can be found in the console output during test execution.

## Allure Reporting

The project integrates Allure for enhanced test reporting. Allure reports provide a detailed breakdown of test results, including:

- Test descriptions
- Severity levels (e.g., CRITICAL, MINOR)
# Steps executed
- Logs and request/response bodies
# Example Allure Annotations:
- @Story("Story 1"): Defines a user story for better tracking.
- @Severity(SeverityLevel.CRITICAL): Specifies the importance of the test case.
- @Description("Get request testing"): Describes the test purpose in detail.


