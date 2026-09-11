# Reastournt

Reastournt is a Java-based restaurant management project built to understand how different components of a food ordering system can work together.

The project mainly focuses on **Low Level Design (LLD)** concepts and uses different design patterns to keep the code organized and make the system easier to extend.

## About the Project

This project simulates a simple restaurant ordering system where users can select a restaurant, view menu items, add items to a cart, and place different types of orders.

The project also demonstrates how design patterns can be used in a real-world application instead of using everything inside a single class.

## Features

* Restaurant management
* Restaurant selection
* Menu management
* Add and remove items from cart
* Calculate total cart price
* Place orders
* Support for different order types
* Payment strategy implementation
* Notification service
* Basic order management
* Uses different design patterns for better code structure

## Design Patterns Used

### 1. Factory Pattern

The Factory Pattern is used for creating different types of orders.

The project contains different factory classes such as:

* `OrderFactory`
* `NowOderFactory`
* `ScheduledOrderFactory`

This keeps the order creation logic separate from the main application code.

### 2. Strategy Pattern

The Strategy Pattern is used for handling different payment methods.

For example, the project contains a `PaymentStatergy` interface and implementations such as `NetBanking`.

This allows the payment method to be changed without changing the main order logic.

### 3. Manager Classes

Manager classes are used to handle the main operations of the system.

Some of the important managers are:

* `Reastourant_Manager`
* `OrderManager`

They are responsible for managing restaurants and orders instead of putting all the logic inside the main class.

## Project Structure

```text
src/
│
├── Factories/
│   ├── OrderFactory.java
│   ├── NowOderFactory.java
│   └── ScheduledOrderFactory.java
│
├── Main/
│   ├── Main.java
│   └── TomatoApp.java
│
├── Manager/
│   ├── OrderManager.java
│   └── Reastourant_Manager.java
│
├── Service/
│   └── NotificationService.java
│
├── Statergy/
│   ├── PaymentStatergy.java
│   └── NetBanking.java
│
└── model/
    ├── Cart.java
    ├── Menu.java
    ├── Reastournt.java
    ├── Order.java
    └── other model classes
```

The actual repository follows this package-based structure under `src`.

## How It Works

The basic flow of the application is:

```text
User
  ↓
Select Restaurant
  ↓
View Menu
  ↓
Add Items to Cart
  ↓
Calculate Total
  ↓
Select Order Type
  ↓
Create Order using Factory
  ↓
Choose Payment Method
  ↓
Process Payment
  ↓
Send Notification
```

The `Cart` class maintains the selected menu items and provides functionality for adding/removing items and calculating the total price.

For payments, the application uses the `PaymentStatergy` interface, allowing different payment implementations to follow the same contract.

## Technologies Used

* Java
* Object-Oriented Programming
* Java Collections
* Design Patterns
* Git & GitHub

## Concepts Practiced

While building this project, I practiced:

* OOP concepts
* Encapsulation
* Abstraction
* Interfaces
* Composition
* Java Collections
* Factory Pattern
* Strategy Pattern
* Separation of responsibilities
* Basic Low Level Design

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/shivanshjais22/Reastournt.git
```

### 2. Open the project

Open the project in any Java IDE such as:

* Eclipse
* Spring Tool Suite
* IntelliJ IDEA

### 3. Run the application

Run the `Main.java` file or the main application class to start the project.

## Learning Purpose

This project was mainly created as a practical way to learn **Low Level Design and Design Patterns in Java**.

Instead of implementing a restaurant system only for functionality, the project focuses on understanding how classes communicate with each other and where design patterns can be useful in a real application.

## Future Improvements

Some improvements that can be added later:

* Add database support
* Add user authentication
* Add more payment methods
* Add more order types
* Improve exception handling
* Add unit tests
* Add a REST API using Spring Boot
* Add a frontend for customers and restaurant managers


---

If you find this project useful for learning Java and LLD, feel free to explore the code and try adding your own features.
