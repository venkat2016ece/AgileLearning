--to delete table customers
DROP TABLE CUSTOMERS;
--to create table
CREATE TABLE CUSTOMERS(
   ID   INT              NOT NULL,
   NAME VARCHAR (20)     NOT NULL,
   AGE  INT              NOT NULL,
   ADDRESS  CHAR (25) ,
   SALARY   DECIMAL (18, 2),       
   PRIMARY KEY (ID)
);
--to describe table columns
DESC CUSTOMERS;
--inserting values to table customers
INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (1, 'Ramesh', 32, 'Ahmedabad', 2000.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (2, 'Khilan', 25, 'Delhi', 1500.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (3, 'kaushik', 23, 'Kota', 2000.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (4, 'Chaitali', 25, 'Mumbai', 6500.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (5, 'Hardik', 27, 'Bhopal', 8500.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (6, 'Komal', 22, 'MP', 4500.00 );

--to view data in table customers
select *from customers;

--to fetch the data from a database table which returns this --data in the form of a result table. These result tables are --called result-sets.

 SELECT ID, NAME, SALARY FROM CUSTOMERS;

SELECT ID, NAME, SALARY 
FROM CUSTOMERS
WHERE SALARY > 2000;


SELECT ID, NAME, SALARY 
FROM CUSTOMERS
WHERE NAME = 'Hardik';

--to update the data or modify
UPDATE CUSTOMERS
SET ADDRESS = 'Pune'
WHERE ID = 6;

UPDATE CUSTOMERS
SET ADDRESS = 'Pune', SALARY = 1000.00;

--to delete the row
DELETE FROM table_name
WHERE [condition];

 DELETE FROM CUSTOMERS
WHERE ID = 6;

--The SQL TOP clause is used to fetch a TOP N number or X --percent records from a table.
--SELECT TOP 3 * FROM CUSTOMERS; Top is available in SQL server only.
 SELECT * FROM CUSTOMERS WHERE ROWNUM <= 3;

--sort the result in an ascending order by the NAME and the --SALARY -
SELECT * FROM CUSTOMERS
   ORDER BY NAME, SALARY;
--sort the result in the descending order by NAME.
SELECT * FROM CUSTOMERS
   ORDER BY NAME DESC;

--If you want to know the total amount of the salary on each --customer, then the GROUP BY query
 
SELECT NAME, SUM(SALARY) FROM CUSTOMERS
   GROUP BY NAME;


--if you want to know the total amount of salary on each --customer, then the GROUP BY query

SELECT NAME, SUM(SALARY) FROM CUSTOMERS
   GROUP BY NAME;

--to eliminate the duplicate records.
ELECT DISTINCT SALARY FROM CUSTOMERS
   ORDER BY SALARY;

--to join the 2 tables
SELECT ID, NAME, AGE, AMOUNT
   FROM CUSTOMERS, ORDERS
   WHERE  CUSTOMERS.ID = ORDERS.CUSTOMER_ID;

--








--to select the NOT NULL values.
SELECT  ID, NAME, AGE, ADDRESS, SALARY
   FROM CUSTOMERS
   WHERE SALARY IS NOT NULL;

--to change the table name temporarly using ALIAS SYNTAX
SELECT  ID AS CUSTOMER_ID, NAME AS CUSTOMER_NAME
   FROM CUSTOMERS
   WHERE SALARY IS NOT NULL;

--to add or drop the columns in the table
ALTER TABLE CUSTOMERS ADD SEX char(1);
ALTER TABLE CUSTOMERS DROP SEX;


--to remove complete data from the existing data strucher
TRUNCATE TABLE CUSTOMERS;

-- to create the view table
CREATE VIEW CUSTOMERS_VIEW AS
SELECT name, age
FROM  CUSTOMERS;

--to create the view with check option

CREATE VIEW CUSTOMERS_VIEW1 AS
SELECT name, age
FROM  CUSTOMERS
WHERE age IS NOT NULL
WITH CHECK OPTION;

--update
UPDATE CUSTOMERS_VIEW
   SET AGE = 35
   WHERE name = 'Ramesh';

--to delete
DELETE FROM CUSTOMERS_VIEW
   WHERE age = 22;

--to drop the views table
DROP VIEW CUSTOMERS_VIEW;

--HAVING CLAUSE followed by GROUP BY

SELECT ID, NAME, AGE, ADDRESS, SALARY
FROM CUSTOMERS
GROUP BY age
HAVING COUNT(age) >= 2;

--