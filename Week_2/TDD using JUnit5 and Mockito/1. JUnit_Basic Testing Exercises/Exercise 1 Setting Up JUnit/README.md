# JUnit Setup and Sample Tests.

This project demonstrates how to set up JUnit 4 in a Maven-based Java project using Visual Studio Code.

## Project Structure

```
Exercise 1 Setting Up JUnit /
├── pom.xml
├── src/
│   ├── main/java/com/example/Calculator.java
│   └── test/java/com/example/CalculatorTest.java
└── README.md
```

## How to Run in VS Code

1. **Open Project**  
   - Launch VS Code  
   - File → Open Folder… → select the project root (where `pom.xml` is).

2. **Install Extensions**  
   - Java Extension Pack (provides Maven and JUnit support)  
   - Ensure the Java Test Runner is enabled.

3. **Import Maven Projects**  
   - Click on the **Maven** view in the sidebar  
   - Click **Refresh** to download dependencies.

4. **Run Tests**  
   - Open the **Testing** view (beaker icon)  
   - Locate `CalculatorTest` and click the Run icon  
   - View results in the Testing panel.

5. **Run via Terminal**  
   ```bash
   mvn test
   ```

   Expected output:
   ```
   -------------------------------------------------------
    T E S T S
   -------------------------------------------------------
   Running com.example.CalculatorTest
   Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
   -------------------------------------------------------
   ```
