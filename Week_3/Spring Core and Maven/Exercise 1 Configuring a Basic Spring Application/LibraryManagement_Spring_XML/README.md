# LibraryManagement (Spring XML Configuration Example)

This is a basic Spring application that demonstrates:

- Spring Core setup with XML configuration
- Bean wiring using setter injection
- Simple `BookService` and `BookRepository` structure

## Project Structure

```
LibraryManagement/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.library.repository/
│   │   │   │   └── BookRepository.java
│   │   │   ├── com.library.service/
│   │   │   │   └── BookService.java
│   │   │   └── com.library.main/
│   │   │       └── MainApp.java
│   │   └── resources/
│   │       └── applicationContext.xml
```

## How to Run

1. Open in Eclipse or any Java IDE that supports Maven.
2. Run `MainApp.java` as a Java application.
3. You will see: `Fetching list of books from the database...` printed.
