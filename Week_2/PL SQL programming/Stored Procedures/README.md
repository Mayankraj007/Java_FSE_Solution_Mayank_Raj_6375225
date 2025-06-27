# Exercise 3: Stored Procedures

This script (`exercise3_setup_and_run.sql`) sets up tables, inserts sample data, defines stored procedures, and demonstrates their use—all in one go.

## What the script does

1. **Setup**  
   - Drops existing `SavingsAccounts`, `Employees`, and `Accounts` tables (if any)  
   - Creates three tables:
     - **SavingsAccounts**: holds savings balances  
     - **Employees**: stores employee ID, department, and salary  
     - **Accounts**: general accounts for transfers  

2. **Sample Data**  
   - **SavingsAccounts**: 3 accounts with balances 1000, 2000, 3000  
   - **Employees**: 3 employees in departments 10 and 20  
   - **Accounts**: 3 accounts with balances 5000, 3000, 1000  

3. **Procedures**  
   - **ProcessMonthlyInterest**: applies 1% interest to all savings accounts  
   - **UpdateEmployeeBonus**: adds a bonus percentage to salaries in a given department  
   - **TransferFunds**: moves funds between two accounts with balance check  

4. **Execution & Verification**  
   - Calls each procedure in a PL/SQL block  
   - Prints confirmation via `DBMS_OUTPUT.PUT_LINE`  
   - Displays updated data with `SELECT` statements labeled by `PROMPT`

## How to run

1. **Open** an online Oracle editor (e.g. OneCompiler) or your local SQL*Plus/SQL Developer.  
2. **Paste** the contents of `exercise3_setup_and_run.sql` into the editor.  
3. **Ensure** server output is enabled (`SET SERVEROUTPUT ON`).  
4. **Execute** the entire script.  
5. **Observe**:
   - Initial tables and data  
   - Confirmation messages for each procedure  
   - Final data reflecting interest, bonuses, and fund transfer

---

## Output images are attached in new folder.