# Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown Methods in JUnit

This project demonstrates how to write JUnit 4 tests using the Arrange‑Act‑Assert (AAA) pattern, along with `@Before` and `@After` for setup and teardown.

## Scenario

Organize your tests with clear Arrange, Act, Assert sections, and use setup/teardown methods to initialize and clean up test fixtures.

## Project Structure

```
Exercise 4 Arrange-Act-Assert (AAA) Pattern/
├── pom.xml
├── README.md
├── src/
│   ├── main/java/com/example/Calculator.java
│   └── test/java/com/example/CalculatorAAATest.java
```

## Steps to Run in VS Code

1. **Open Project**  
   - Launch VS Code  
   - File → Open Folder… → select the project root

2. **Install Extensions**  
   - Java Extension Pack (includes Maven and Test Runner)

3. **Import Maven Project**  
   - In the **Maven** sidebar, click **Refresh** to download dependencies

4. **Run Tests**  
   - Open the **Testing** view (beaker icon)  
   - Find `CalculatorAAATest` and click the Run icon  
   - Inspect test results and see the Arrange, Act, Assert sections

5. **Or via Terminal**  
   ```bash
   mvn test
   ```

## What’s Demonstrated

- **Arrange**: setting up inputs  
- **Act**: calling the method under test  
- **Assert**: verifying outcomes with assertions  
- **@Before**: initializing the `Calculator` instance  
- **@After**: cleaning up test fixtures

