# LibraryManagement_DI (Spring Dependency Injection Example)

This is an enhanced Spring application demonstrating **Dependency Injection** using XML-based configuration.

## Features

- Demonstrates Setter-based Dependency Injection using Spring IoC container
- Uses `BookService` and `BookRepository` with beans configured in `applicationContext.xml`

## Project Structure

```
LibraryManagement_DI/
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
│   │   │       └── LibraryManagementApplication.java
│   │   └── resources/
│   │       └── applicationContext.xml
```

## 🚀 How to Run

1. Open in Eclipse or any Java IDE that supports Maven.
2. Run `LibraryManagementApplication.java` as a Java application.
3. Output: `Fetching list of books from the database using Dependency Injection...`