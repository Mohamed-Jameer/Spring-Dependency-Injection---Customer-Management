# Spring Dependency Injection - Customer Management

This project demonstrates the use of **Spring Framework's Core Features**, particularly **Dependency Injection (DI)**, with a simple example of customer management. The application showcases how to define and inject dependencies using XML configuration.

---

## 📋 Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Expected Output](#expected-output)
- [Key Components](#key-components)
- [Learning Objectives](#learning-objectives)
- [Screenshots](#screenshots)
- [Future Enhancements](#future-enhancements)
- [Author](#author)
- [License](#license)

---

## 🛠️ Introduction

The goal of this project is to provide a hands-on example of **Spring's Inversion of Control (IoC)** container. We implement a simple model where two types of customers, **Gold** and **Platinum**, have associated addresses. The project uses constructor-based dependency injection to populate the data.

---

## ✨ Features

- **Flexible Configuration**: Easy management of dependencies using XML-based Spring configuration.
- **Reusable Components**: Modularity with shared `Customer` interface for extensibility.
- **Object Relationships**: Demonstrates how Spring wires dependencies between objects.

---

## 🖥️ Technologies Used

- **Programming Language**: Java (JDK 8+)
- **Framework**: Spring Core (XML-based configuration)
- **Build Tool**: Maven (optional)
- **IDE**: IntelliJ IDEA, Eclipse, or any Java-supported IDE

---

## 📁 Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   ├── com/
│   │   │   ├── ioc/
│   │   │   │   ├── classes/
│   │   │   │   │   ├── Address.java
│   │   │   │   │   ├── GoldCustomer.java
│   │   │   │   │   ├── PlatinumCustomer.java
│   │   │   │   ├── Interface/
│   │   │   │   │   ├── Customer.java
│   │   │   │   ├── main/
│   │   │   │   │   ├── Main.java
│   ├── resources/
│   │   ├── Tap.xml
└── README.md
