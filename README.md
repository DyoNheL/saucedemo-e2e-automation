# SauceDemo End-to-End Automation

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![TestNG](https://img.shields.io/badge/TestNG-Framework-blue)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-brightgreen)
![Allure](https://img.shields.io/badge/Allure-Reporting-red)

A Java-based Selenium automation framework for end-to-end testing of the SauceDemo e-commerce web application, using TestNG, Page Object Model, and Allure Reports with screenshot capture on failures.

---

## 🔧 Tech Stack

* **Language:** Java 8+
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Test Data:** TestNG DataProvider
* **Reporting:** Allure Report
* **Browser:** Google Chrome

---

## 🌐 Test Application

* **URL:** [https://www.saucedemo.com/](https://www.saucedemo.com/)

---

## ✅ Test Coverage

* Login with valid credentials
* Product selection and cart management
* Checkout process and order completion

---

## 📊 Reporting (Allure)

This framework integrates Allure Report to provide:

* Pass / Fail status per test
* Step-by-step execution details
* Test severity, epic, and feature tags
* Automatic screenshot attachment on failure

### 📸 Sample Allure Screenshots

> Allure Overview Report.

![Allure-Overview-Report](https://github.com/user-attachments/assets/0f96b1e8-2a2d-4a79-b8d8-2b7a73871abb)

> Project Suites

![Project-Suites](https://github.com/user-attachments/assets/2c5309bb-0445-44a6-af02-1d6084c9c9d6)

---


## ▶ How to Run the Tests

### 1️⃣ Prerequisites

* Java 8 or higher installed
* Maven installed
* Google Chrome installed
* Allure Commandline installed

---

### 2️⃣ Execute Tests

```bash
mvn clean test
```

---

### 3️⃣ Generate and View Allure Report

```bash
allure serve allure-results
```

> This will open the Allure report in your default browser.
