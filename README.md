# SOLID-Principles

A Java assignment that demonstrates how to refactor poorly structured code to properly follow the five SOLID principles of Object-Oriented Programming.

## What It Does

The project takes a simple order management system — one that calculates order totals, places orders, generates invoices, and sends email notifications — and restructures it so each class and interface has a clear, single responsibility with minimal coupling between them.

## SOLID Principles Applied

**Single Responsibility Principle (SRP)** Each class handles exactly one concern. Order logic, invoice generation, and notifications are separated into their own dedicated classes.

**Open/Closed Principle (OCP)** New notification types (such as SMS or push notifications) can be added by creating new classes without modifying any existing code.

**Liskov Substitution Principle (LSP)** `StandardOrder` and `DiscountedOrder` both implement the `Calculator` interface and can be used interchangeably in `OrderManager` without breaking the program.

**Interface Segregation Principle (ISP)** The original bloated `Order` interface is split into smaller, focused interfaces — `Order`, `Calculator`, and `Notifier` — so classes only implement what they actually need.

**Dependency Inversion Principle (DIP)** `OrderManager` depends on abstractions (interfaces), not concrete implementations. Dependencies are injected through the constructor, keeping the high-level logic decoupled from low-level details.

## UML Class Diagram
![Image](https://github.com/tricialabbao/SOLID-Principles/blob/main/SOLID%20Principles.png)
