# Exercise 3: Assertions in JUnit

This project demonstrates how to use various JUnit assertions to validate test results.

## Scenario

Write tests using different JUnit assertions to verify conditions like equality, truth, nullity, etc.

## Project Structure

```
Exercise 3 Assertions in JUnit/
├── pom.xml
└── src/
    └── test/java/com/example/AssertionsTest.java
```

## Steps to Run

1. **Open in VS Code**  
   - Launch VS Code  
   - File → Open Folder… → select the project root (where `pom.xml` is)

2. **Install Extensions**  
   - Java Extension Pack (includes Maven and Test Runner support)

3. **Import Maven Project**  
   - In the **Maven** view, click **Refresh** to download dependencies

4. **Run Tests**  
   - Open the **Testing** view (beaker icon)  
   - Locate `AssertionsTest`  
   - Click the **Run** icon next to the class or individual test methods  
   - View results in the Testing panel

5. **Alternatively, via Terminal**  
   ```bash
   mvn test
   ```
   You should see output indicating all tests passed.

## Assertions Demonstrated

- `assertEquals(expected, actual)`  
- `assertTrue(condition)`  
- `assertFalse(condition)`  
- `assertNull(object)`  
- `assertNotNull(object)`
