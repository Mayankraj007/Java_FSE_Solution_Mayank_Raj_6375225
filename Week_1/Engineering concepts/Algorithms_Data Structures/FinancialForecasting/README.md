# Financial Forecasting – Recursive with Memoization

This Java project implements a financial forecasting tool that calculates future values based on compound growth using recursion and memoization.

## Objective

Build a recursive algorithm to project future financial value based on:
- An initial amount
- A constant growth rate
- A number of years

The implementation uses memoization to optimize recursive calculations.

## Files

- **FinancialForecasting.java**  
  The main Java file containing:
  - Recursive method `calculateFutureValue()`
  - User input via `Scanner`
  - Use of `HashMap` to store intermediate results (memoization)

## How It Works

The program recursively calculates the future value of an investment using:
```java
FV = PresentValue × (1 + growthRate)^years
```

Memoization ensures that each year’s future value is only computed once, improving efficiency.

## Sample Run

```
Enter the Initial Value: 10000
Enter the growth rate (in decimal): 0.08
Enter the number of years to project: 5
Future Value after 5 years: 14693.28
```

## Time & Space Complexity

- **Time Complexity**: O(n)
- **Space Complexity**: O(n) for recursion stack and memoization map

## How to Compile and Run

1. Save the file as `FinancialForecasting.java`
2. Compile:
   ```
   javac FinancialForecasting.java
   ```
3. Run:
   ```
   java FinancialForecasting
   ```
