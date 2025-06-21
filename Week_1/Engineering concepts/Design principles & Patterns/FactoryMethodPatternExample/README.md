# Factory Method Pattern – Document Creation Example

This project demonstrates the use of the Factory Method Design Pattern in Java by simulating a simple document management system. It shows how different types of documents (Word, PDF, Excel) can be created using their respective factory classes without the main program having to know the exact classes.

## Project Structure

The code is organized into three Java files for clarity:

- **Document.java**  
  Contains the `Document` interface and its implementations: `WordDocument`, `PdfDocument`, and `ExcelDocument`.

- **DocumentFactory.java**  
  Defines the abstract factory class `DocumentFactory` and its concrete implementations for each document type.

- **Test.java**  
  Contains the `main()` method which demonstrates how to use the factory classes to create and open different types of documents.

## How It Works

Each document type implements a common interface called `Document`, which includes a method `open()`. The factories encapsulate the object creation logic, allowing the main program to request a document without worrying about the actual class being used.

This approach follows the Factory Method Pattern principle of programming to an interface rather than a concrete class, making the system more flexible and easier to maintain.

## Sample Output

```
Opening a Word document.
Opening a PDF document.
Opening an Excel document.
```
