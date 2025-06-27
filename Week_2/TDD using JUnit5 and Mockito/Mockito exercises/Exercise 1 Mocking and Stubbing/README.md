# Exercise 1: Mocking and Stubbing

This project shows how to use Mockito to mock external dependencies and stub method calls in unit tests.

## Scenario

Test a service (`MyService`) that depends on an external API (`ExternalApi`) by:

1. Creating a mock object for the external API.
2. Stubbing its `getData()` method to return predefined values.
3. Writing a test case that injects the mock into `MyService` and verifies behavior.

## Project Structure

```
Exercise 1 Mocking and Stubbing/
├── pom.xml
├── README.md
├── src/
│   ├── main/java/com/example/
│   │   ├── ExternalApi.java
│   │   └── MyService.java
│   └── test/java/com/example/
│       └── MyServiceTest.java
```

## Steps to Run in VS Code

1. **Open Project**  
   - Launch VS Code  
   - File → Open Folder… → select the project root (where `pom.xml` is)

2. **Install Extensions**  
   - Java Extension Pack (includes Maven and Test Runner support)

3. **Import Maven Project**  
   - In the **Maven** sidebar, click **Refresh** to download dependencies

4. **Run Tests**  
   - Open the **Testing** view (beaker icon)  
   - Locate `MyServiceTest`  
   - Click the Run icon to execute the test  
   - Observe test results (should pass without calling the real external API)

5. **Or via Terminal**  
   ```bash
   mvn test
   ```

All tests should pass, demonstrating successful mocking and stubbing with Mockito.
