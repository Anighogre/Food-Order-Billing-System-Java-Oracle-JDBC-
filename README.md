# 🍽️ Food Order Billing System (Java + Oracle JDBC)

## 💼 Project Overview
The **Food Order Billing System** is a Java-based console application that allows customers to place food orders, calculates total bills, and applies a **50% discount for first-time users**.  
It uses **Oracle Database** for persistent storage and **JDBC** for database connectivity.

---

## 📘 Problem Statement
You are required to implement a Food Order Billing System using **Java and Oracle JDBC**.  
The system should:
- Store customer order details.
- Apply a 50% discount for first-time users.
- Calculate and print the final bill.

---

## ✅ Functional Requirements

### 🔹 1. Add Order Details
- Store details such as:
  - Order ID
  - Customer Name
  - Food Item
  - Quantity
  - Price per Item
  - Phone Number  
- Use `PreparedStatement` to insert data securely.

### 🔹 2. First-Time User Detection
- A customer is identified by their **phone number**.
- If the phone number appears for the first time → apply **50% discount**.
- Repeat customers → pay full amount.

### 🔹 3. Calculate Final Bill
- Formula:  
  `Total Bill = Quantity × Price per Item`
- Apply 50% discount for first-time customers.

### 🔹 4. Print Bill
- Display customer name and final bill with discount information.

### 🔹 5. User Menu
Provide a simple menu-driven interface:
1. Place an order
2. Print the bill
3. Exit
