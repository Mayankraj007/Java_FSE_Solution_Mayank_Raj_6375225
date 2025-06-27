# Control Structures Exercise: PL/SQL Script

This repository contains a single script (`setup_and_run.sql`) that you can run end-to-end in an online PL/SQL editor (e.g. OneCompiler) or any Oracle client. It will:

1. **Drop** existing `Customers` and `Loans` tables (if they exist)  
2. **Create** fresh `Customers` and `Loans` tables  
3. **Insert** sample data covering:
   - Customers both above and below 60 years old  
   - Customers both above and below \$10,000 balance  
   - Loans due in the past, within 30 days, and after 30 days  
4. **Verify** initial data with labelled `SELECT` queries  
5. **Run Scenario 1**: apply a 1% discount to interest rates for customers older than 60, then display updated loan rates  
6. **Run Scenario 2**: set `IsVIP = 'TRUE'` for customers with balance > \$10,000, then display updated customer records  
7. **Run Scenario 3**: print reminder messages for loans due in the next 30 days via `DBMS_OUTPUT.PUT_LINE`

---

## Files

- **setup_and_run.sql**  
  The only file. Contains all DDL, DML, and PL/SQL blocks.

---

## How to Run

1. Open [OneCompiler PL/SQL](https://onecompiler.com/oracle) (or your preferred Oracle environment).  
2. Create a new PL/SQL script and paste in the contents of `setup_and_run.sql`.  
3. Enable output (usually done automatically, or ensure `SET SERVEROUTPUT ON` is in your script).  
4. Execute the script.  

## Output images are attached in the word file .