# 🧪 Spring Boot + Spring Data JPA + H2 Example

This is a basic Spring Boot application demonstrating **CRUD operations** using:

- **Spring Data JPA**
- **H2 in-memory database**
- **CommandLineRunner**
- **Maven project structure**

---

## 📌 Objective

Build and test a minimal Spring Boot app that:
- Uses an in-memory database (H2)
- Automatically creates a table based on a JPA entity
- Inserts sample data on startup
- Prints data to the console
- Lets you view and query the database using H2 Console

---

## 🛠️ Technologies Used

| Tool | Purpose |
|------|---------|
| Spring Boot | Application framework |
| Spring Data JPA | ORM and data access |
| H2 Database | In-memory relational database |
| Maven | Build and dependency management |
| Java 17+ | Language runtime |

---

## 🚀 How to Run This Project in Eclipse


### ✅ Step 1: Change the Port (if needed)

If port 8080 is in use, go to `src/main/resources/application.properties` and add:

```
server.port=8081
```

---

### ✅ Step 2: Run the Application

1. Go to:
   ```
   src/main/java/com/example/Application.java
   ```
2. **Right-click → Run As → Java Application**
3. In the Eclipse **Console**, you should see:
   ```
   Mayank
   Raj
   ```

---

### ✅ Step 3: Test Using H2 Console

#### 🔹 A. Open Browser:
```
http://localhost:8081/h2-console
```

#### 🔹 B. Fill in Connection Details:
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: *(leave blank)*
- Click **Connect**

#### 🔹 C. Run SQL Query:
```sql
SELECT * FROM CUSTOMER;
```

#### 🔹 D. Expected Output:
| ID | NAME   |
|----|--------|
| 1  | Mayank |
| 2  | Raj    |

---

## 📄 Key Files

| File | Description |
|------|-------------|
| `Application.java` | Main class + CommandLineRunner |
| `Customer.java` | JPA Entity for customers |
| `CustomerRepository.java` | Spring Data JPA repository |
| `application.properties` | DB and server config |
| `pom.xml` | Maven dependencies |

---
