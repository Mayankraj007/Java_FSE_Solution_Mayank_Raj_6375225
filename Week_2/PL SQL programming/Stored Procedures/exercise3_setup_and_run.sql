-- Enable DBMS output
SET SERVEROUTPUT ON;

-- Drop tables if they exist (for reruns)
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE SavingsAccounts';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Employees';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Accounts';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

-- Create tables
CREATE TABLE SavingsAccounts (
  AccountID   NUMBER       PRIMARY KEY,
  Balance     NUMBER(12,2)
);

CREATE TABLE Employees (
  EmployeeID    NUMBER       PRIMARY KEY,
  DepartmentID  NUMBER,
  Salary        NUMBER(12,2)
);

CREATE TABLE Accounts (
  AccountID   NUMBER       PRIMARY KEY,
  Balance     NUMBER(12,2)
);

-- Insert sample data into SavingsAccounts
INSERT INTO SavingsAccounts VALUES (201, 1000.00);
INSERT INTO SavingsAccounts VALUES (202, 2000.00);
INSERT INTO SavingsAccounts VALUES (203, 3000.00);

-- Insert sample data into Employees
INSERT INTO Employees VALUES (101, 10, 50000.00);
INSERT INTO Employees VALUES (102, 10, 60000.00);
INSERT INTO Employees VALUES (103, 20, 55000.00);

-- Insert sample data into Accounts
INSERT INTO Accounts VALUES (301, 5000.00);
INSERT INTO Accounts VALUES (302, 3000.00);
INSERT INTO Accounts VALUES (303, 1000.00);

COMMIT;

-- Verify initial data
PROMPT ==== SavingsAccounts (Initial) ====
SELECT * FROM SavingsAccounts ORDER BY AccountID;
PROMPT ==== Employees (Initial) ====
SELECT * FROM Employees ORDER BY EmployeeID;
PROMPT ==== Accounts (Initial) ====
SELECT * FROM Accounts ORDER BY AccountID;

-- Scenario 1: Process monthly interest for savings accounts
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  FOR rec IN (SELECT AccountID, Balance FROM SavingsAccounts) LOOP
    UPDATE SavingsAccounts
       SET Balance = rec.Balance * 1.01
     WHERE AccountID = rec.AccountID;
  END LOOP;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('ProcessMonthlyInterest executed.');
END;
/

-- Scenario 2: Update employee bonus by department
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_department_id IN NUMBER,
  p_bonus_pct     IN NUMBER
) AS
BEGIN
  FOR rec IN (SELECT EmployeeID, Salary FROM Employees WHERE DepartmentID = p_department_id) LOOP
    UPDATE Employees
       SET Salary = rec.Salary * (1 + p_bonus_pct/100)
     WHERE EmployeeID = rec.EmployeeID;
  END LOOP;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('UpdateEmployeeBonus executed for department ' || p_department_id);
END;
/

-- Scenario 3: Transfer funds between accounts
CREATE OR REPLACE PROCEDURE TransferFunds(
  p_source_acct  IN NUMBER,
  p_target_acct  IN NUMBER,
  p_amount       IN NUMBER
) AS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_source_acct;
  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account');
  END IF;
  UPDATE Accounts
     SET Balance = Balance - p_amount
   WHERE AccountID = p_source_acct;
  UPDATE Accounts
     SET Balance = Balance + p_amount
   WHERE AccountID = p_target_acct;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('TransferFunds executed: ' || p_amount || ' from ' || p_source_acct || ' to ' || p_target_acct);
END;
/

-- Execute procedures and show results
BEGIN
  ProcessMonthlyInterest;
  UpdateEmployeeBonus(10, 5);
  TransferFunds(301, 302, 1000);
END;
/

-- Show results after running procedures
PROMPT ==== SavingsAccounts After Interest ====
SELECT * FROM SavingsAccounts ORDER BY AccountID;
PROMPT ==== Employees After Bonus (Dept 10) ====
SELECT * FROM Employees WHERE DepartmentID = 10 ORDER BY EmployeeID;
PROMPT ==== Accounts After Transfer ====
SELECT * FROM Accounts ORDER BY AccountID;
