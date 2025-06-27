-- Enable output
SET SERVEROUTPUT ON;

-- Drop tables if they exist (for reruns)
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Loans';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Customers';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

-- 1) Create the Customers table
CREATE TABLE Customers (
  CustomerID   NUMBER         PRIMARY KEY,
  Name         VARCHAR2(100),
  DOB          DATE,
  Balance      NUMBER(12,2),
  IsVIP        VARCHAR2(5)    DEFAULT 'FALSE'
);

-- 2) Create the Loans table
CREATE TABLE Loans (
  LoanID        NUMBER        PRIMARY KEY,
  CustomerID    NUMBER        REFERENCES Customers(CustomerID),
  InterestRate  NUMBER(5,4),
  EndDate       DATE
);

-- Insert sample data into Customers
INSERT INTO Customers VALUES (1, 'Alice', DATE '1950-01-01', 5000, DEFAULT);
INSERT INTO Customers VALUES (2, 'Bob',   DATE '1940-05-20', 15000, DEFAULT);
INSERT INTO Customers VALUES (3, 'Carol', DATE '1970-10-10', 20000, DEFAULT);
INSERT INTO Customers VALUES (4, 'Dave',  DATE '1990-03-15', 12000, DEFAULT);
INSERT INTO Customers VALUES (5, 'Eve',   DATE '1958-11-30',  8000, DEFAULT);

-- Insert sample data into Loans
INSERT INTO Loans VALUES (101, 1, 0.0500, SYSDATE + 10);
INSERT INTO Loans VALUES (102, 2, 0.0600, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, 0.0550, SYSDATE - 5);
INSERT INTO Loans VALUES (104, 4, 0.0700, SYSDATE + 20);
INSERT INTO Loans VALUES (105, 5, 0.0650, SYSDATE + 25);

COMMIT;

-- Verify initial sample data
PROMPT ==== Customers (Initial) ====
SELECT * FROM Customers;
PROMPT ==== Loans (Initial) ====
SELECT * FROM Loans;


-- Scenario 1: 1% discount for age > 60
DECLARE
  CURSOR c_customers IS
    SELECT c.CustomerID, l.LoanID, l.InterestRate
      FROM Customers c
      JOIN Loans l ON c.CustomerID = l.CustomerID
     WHERE MONTHS_BETWEEN(SYSDATE, c.DOB) / 12 > 60;
BEGIN
  FOR rec IN c_customers LOOP
    UPDATE Loans
       SET InterestRate = rec.InterestRate - 0.01
     WHERE LoanID = rec.LoanID;
  END LOOP;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Scenario 1 completed: 1% discount applied.');
END;
/

-- Show results after Scenario 1
PROMPT ==== Loans After Scenario 1 ====
SELECT LoanID, CustomerID, InterestRate FROM Loans ORDER BY LoanID;

-- Scenario 2: promote to VIP if balance > 10,000
DECLARE
  CURSOR c_customers IS
    SELECT CustomerID
      FROM Customers
     WHERE Balance > 10000;
BEGIN
  FOR rec IN c_customers LOOP
    UPDATE Customers
       SET IsVIP = 'TRUE'
     WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Scenario 2 completed: VIP flags set.');
END;
/

-- Show results after Scenario 2
PROMPT ==== Customers After Scenario 2 ====
SELECT CustomerID, Name, Balance, IsVIP FROM Customers ORDER BY CustomerID;

-- Scenario 3: remind loans due in next 30 days
DECLARE
  CURSOR c_loans IS
    SELECT c.CustomerID,
           c.Name        AS CustomerName,
           l.LoanID,
           l.EndDate
      FROM Loans l
      JOIN Customers c ON c.CustomerID = l.CustomerID
     WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
  FOR rec IN c_loans LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ' || rec.LoanID ||
      ' for customer ' || rec.CustomerName ||
      ' is due on ' || TO_CHAR(rec.EndDate, 'YYYY-MM-DD')
    );
  END LOOP;
END;
/

-- Show results after Scenario 3
PROMPT ==== Loans After Scenario 3 ====
SELECT LoanID, CustomerID, EndDate FROM Loans ORDER BY LoanID;