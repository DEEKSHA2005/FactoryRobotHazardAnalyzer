# Factory Robot Hazard Analyzer

## Overview
A console-based Java application that calculates the **hazard risk score** of a factory robot using:
- Arm Precision
- Worker Density
- Machinery State

Developed using **OOPS principles**, **custom exceptions**, and **GitFlow**.

---

## Formula
Hazard Risk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor)

---

# Use Case Descriptions (UC1 – UC8)

## 🔹 UC1 — Display Static Message
Displays the system name **“Factory Robot Hazard Analyzer”** when the program starts.  
Introduces the basic class structure and program execution.

---

## 🔹 UC2 — Accept Robot Hazard Inputs
Accepts user inputs:
- Arm Precision
- Worker Density
- Machinery State

Focuses on input handling using `Scanner` without validation.

---

## 🔹 UC3 — Calculate Hazard Risk (No Validation)
Calculates the hazard risk score using the given formula.  
Assumes inputs are valid and focuses only on implementing business logic.

---

## 🔹 UC4 — Input Validation using if–else
Validates:
- Arm Precision (0.0–1.0)
- Worker Density (1–20)

Displays error messages for invalid inputs using conditional statements.

---

## 🔹 UC5 — Refactor into Method
Moves validation and calculation logic into a separate method.  
Improves code readability and separation of concerns.

---

## 🔹 UC6 — Custom Exception Handling
Introduces `RobotSafetyException` to handle invalid inputs.  
Uses `throw` and `try-catch` for structured error handling.

---

## 🔹 UC7 — Machinery State Risk Mapping
Maps machinery state to risk factor:
- Worn → 1.3
- Faulty → 2.0
- Critical → 3.0

Throws exception for unsupported states.  
Ensures case-sensitive validation.

---

## 🔹 UC8 — Fully Modular OOPS Design
Refactors the application into multiple classes:
- `FactoryRobotHazardAnalyzer` → Input and output handling
- `RobotHazardAuditor` → Business logic and validation
- `RobotSafetyException` → Custom exception handling

Applies OOPS principles like encapsulation, abstraction, and modularity.

---

## GitFlow

- `main` → README & stable branch
- `develop` → All UC implementations
- `feature/UCx-*` → One branch per use case

---

## Sample Output

Robot Hazard Risk Score: 63.0
