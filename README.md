# Reastournt

A simple Java-based restaurant management project.

I built this project to practice **Java, OOP, and Low Level Design concepts** by creating a small restaurant/order system.

## What this project does

The application allows you to:

* Manage restaurants
* Add and view menu items
* Select items and add them to a cart
* Calculate the total price
* Create different types of orders
* Choose a payment method
* Send notifications

## Project Structure

The code is divided into different packages so that each part of the application has its own responsibility.

```text
src
│
├── Factories    → Creates different types of orders
├── Main         → Starts the application
├── Manager      → Handles restaurant and order operations
├── Service      → Application services
├── Statergy     → Payment-related logic
└── model        → Restaurant, Order, Cart, Menu, etc.
```

## Design Patterns

I have used a few design patterns in this project.

### Factory Pattern

Used for creating different types of orders.

For example, the application can create a normal order or a scheduled order through the factory classes.

### Strategy Pattern

Used for payment methods.

The payment logic is separated using a `PaymentStatergy` interface, so different payment methods can be added without changing the main order logic.

## Technologies

* Java
* OOP
* Java Collections
* Design Patterns
* Git & GitHub

## Application Flow

```text
Restaurant
    ↓
Menu
    ↓
Select Items
    ↓
Cart
    ↓
Create Order
    ↓
Payment
    ↓
Notification
```

## Why I Built This

This project was created mainly to get more comfortable with **Java and Low Level Design** and to understand how different classes and design patterns can work together in a real-world type of application.

## Future Improvements

* Add database support
* Add more payment options
* Add user login
* Add REST APIs using Spring Boot
* Add a frontend
* Add unit testing

## Author

**Shivansh Jais**

GitHub: [shivanshjais22](https://github.com/shivanshjais22)
