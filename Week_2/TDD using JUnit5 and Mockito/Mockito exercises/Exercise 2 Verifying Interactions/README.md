# Exercise 2: Verifying Interactions

This project demonstrates how to use Mockito to verify that methods are called with specific arguments.

## Scenario

Ensure that a method on an external dependency (`ExternalApi`) is invoked by your service (`MyService`).

## Steps

1. **Create a mock object** for the external API.  
2. **Call** the method under test (`fetchData`) on your service.  
3. **Verify** that `getData()` was called on the mock.

## Project Structure

```
Exercise 2 Verifying Interactions/
├── pom.xml
├── README.md
├── src/
    ├── main/java/com/example/
    │   ├── ExternalApi.java
    │   └── MyService.java
    └── test/java/com/example/
        └── MyServiceVerifyTest.java
```

## How to Run in VS Code

1. **Open Project**  
   - Launch VS Code and open the folder containing `pom.xml`.

2. **Install Extensions**  
   - Java Extension Pack for Maven and JUnit support.

3. **Import Maven Project**  
   - In the Maven sidebar, click **Refresh**.

4. **Run Tests**  
   - Open the Testing view (beaker icon).  
   - Locate `MyServiceVerifyTest` and click Run.  
   - Alternatively, run in terminal:
     ```bash
     mvn test
     ```

You should see the test pass, confirming that `getData()` was indeed called on the mock.
