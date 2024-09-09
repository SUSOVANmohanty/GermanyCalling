# Selenium Web Automation - Login Test for "Germany Is Calling"

## Project Overview

This project is a Selenium-based automation script for testing the login functionality of the web application Germany is Calling. The script verifies the success and failure scenarios during the login process.

## Prerequisites

Before executing the tests, ensure the following are installed and configured in your environment:

- Java JDK 8 or above
- Maven (for project dependency management)
- Selenium WebDriver
- TestNG (for running the test cases)
- Google Chrome Browser
- ChromeDriver (automatically managed via WebDriverManager)

## Assumptions

- The project uses WebDriverManager to manage the ChromeDriver, so no need to manually download and configure the driver.
- The user credentials provided in the tests are assumed to be valid.
- The web application URL is https://app.germanyiscalling.com/, and it should be accessible during test execution.

## Project Structure

- **Base:** Contains the base class (Base.java) responsible for WebDriver setup and initialization.
- **Pages:** Contains the LoginPg.java page class that represents the login page of the web application. It uses the Page Object Model (POM) pattern.
- **PagesTestCase:** Contains the test class PageTest.java with test cases for verifying the login functionality.

## Dependencies

The dependencies required for this project are managed via Maven and can be found in the pom.xml file.

**Key dependencies:**

xml
Copy code
<dependencies>
     <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.11.0</version>
</dependency>
<dependency>
<groupId>io.github.bonigarcia</groupId>
<artifactId>webdrivermanager</artifactId>
<version>5.4.1</version>
</dependency>
<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.7.1</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi</artifactId>
<version>5.2.3</version>
</dependency>
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi-ooxml</artifactId>
<version>5.2.3</version>
</dependency>
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi-ooxml-schemas</artifactId>
<version>4.1.2</version>
</dependency>
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-http-jdk-client</artifactId>
<version>4.7.2</version>
</dependency>
<dependency>
<groupId>com.aventstack</groupId>
<artifactId>extentreports</artifactId>
<version>3.1.5</version>
</dependency>

## Test Execution Steps

Follow these steps to execute the tests:

- **Clone the repository (if hosted in a VCS):**

git clone <repository-url>

- **Navigate to the project directory:**

cd <project-directory>

- **Build the project:**

mvn clean install

- **Run the tests:** Execute the test cases using Maven or TestNG:

mvn test

## Test Cases
- **SuccessfulLoginTest**

Tests successful login with valid credentials.

**Expected URL after login:** https://app.germanyiscalling.com/cv/upload/
- **UnSuccessfulLoginTest**

Tests failed login with invalid credentials.

**Expected Behavior:** An error message is displayed with no redirection or failure in login.

