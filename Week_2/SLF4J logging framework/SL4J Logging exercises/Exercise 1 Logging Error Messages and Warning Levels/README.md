# Exercise 1: Logging Error Messages and Warning Levels

This project demonstrates how to configure and use SLF4J with Logback for logging error and warning messages in a simple Java application.

## Steps to Follow

1. **Create a new Maven project**  
   - In your IDE or from the command line, set up a standard Maven project structure.

2. **Add dependencies**  
   Add the following inside `<dependencies>` in your `pom.xml`:

   ```xml
   <dependency>
     <groupId>org.slf4j</groupId>
     <artifactId>slf4j-api</artifactId>
     <version>1.7.30</version>
   </dependency>
   <dependency>
     <groupId>ch.qos.logback</groupId>
     <artifactId>logback-classic</artifactId>
     <version>1.2.3</version>
   </dependency>
   ```

3. **Create the Java class**  
   Under `src/main/java/com/example/LoggingExample.java`:

   ```java
   package com.example;

   import org.slf4j.Logger;
   import org.slf4j.LoggerFactory;

   public class LoggingExample {
       private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

       public static void main(String[] args) {
           logger.error("This is an error message");
           logger.warn("This is a warning message");
       }
   }
   ```

4. **Run the application**  
   - **In VS Code**:  
     - Open folder in VS Code  
     - Run via the Java extension Run icon on `LoggingExample.java`  
   - **Via Maven**:  
     ```bash
     mvn compile exec:java -Dexec.mainClass="com.example.LoggingExample"
     ```

5. **Observe output**  
   You should see log lines like:
   ```
   ERROR com.example.LoggingExample - This is an error message
   WARN  com.example.LoggingExample - This is a warning message
   ```

---