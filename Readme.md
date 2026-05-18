# Hybrid QA Framework: Combined Testing Project

A hybrid software testing project showcasing the balance between automated regression testing and manual user experience (UX) verification.

## 🎯 Project Objective
The main goal of this repository is to demonstrate an efficient software development lifecycle approach by covering performance, usability, and core functionality.

## 🛠️ Tech Stack & Tools
* **Automation:** Java, Selenium WebDriver (v4+)
* **Testing Framework:** TestNG (Annotations & Assertions)
* **Design Pattern:** Page Object Model (POM)
* **Project Management:** Maven (`pom.xml`)
* **Manual Artifacts:** Markdown-based Test Cases & Defect Logs
* **Target Application:** SauceLabs Swag Labs (SauceDemo)

## 📌 Project Structure
```text
Hybrid-Selenium-QA-Project/
├── ManualTesting/          # Manual UI/UX test cases and bug reports
├── src/test/java/
│   ├── pages/             # Page Object Classes (UI Element Locators & Actions)
│   │   └── LoginPage.java
│   └── tests/             # TestNG Execution Scripts (Valid/Invalid Validations)
│       └── LoginTest.java
└── pom.xml                # Project dependencies and compiler configuration
```

