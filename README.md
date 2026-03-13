[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/w7J0BqvO)
# Employee Payroll System - Method Overloading Demo

This repository contains a simple Java application that demonstrates the object-oriented programming concept of **Method Overloading**. 

The `PayrollSystem` class calculates employee salaries based on different sets of input parameters, showcasing how Java differentiates methods with the same name using their unique signatures (the number, type, and order of parameters).

## 🧠 Concept Covered: Method Overloading
Method overloading allows a class to have more than one method with the same name, provided their parameter lists are different. In this project, the `computeSalary` method is overloaded seven times to handle various real-world payroll scenarios.

## 📋 Scenarios Included

The application handles the following payroll calculations:

* **Scenario A (Base Salary):** Fetches a fixed base salary using an Employee ID.
* **Scenario B (Hourly Wage):** Calculates total pay based on hours worked and an hourly rate.
* **Scenario C (Bonus):** Calculates total pay by adding a bonus to a fixed base salary.
* **Scenario D (Annual to Monthly):** Converts a fixed annual contract salary into a monthly equivalent.
* **Scenario E (Overtime):** Calculates total pay including standard pay and overtime hours.
* **Scenario F (Deductions):** Calculates net pay after applying a specific type of deduction (e.g., Health Insurance) to the base pay. *(Uses a String parameter to uniquely identify the method signature).*
* **Scenario G (Comprehensive):** Calculates net pay by factoring in base pay, bonuses, and deductions.

