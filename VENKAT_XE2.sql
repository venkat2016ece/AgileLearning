SET SERVEROUTPUT ON;
DECLARE
v_test  VARCHAR2(15);
BEGIN
v_test :=  'venkat';
DBMS_OUTPUT.PUT_LINE(v_test);
END;


SELECT * FROM EMP;

--SELECT INTO

SET SERVEROUTPUT ON;
DECLARE
v_salary NUMBER(8);
BEGIN
SELECT SAL INTO v_salary FROM EMP
WHERE EMPNO=7782;
DBMS_OUTPUT.PUT_LINE(v_salary);
END;
/
DECLARE
v_salary NUMBER(8);
v_fname VARCHAR2(20);
BEGIN
SELECT SAL,ENAME  INTO v_salary,v_fname  FROM EMP
WHERE EMPNO=7839;
DBMS_OUTPUT.PUT_LINE(v_fname ||' has salary' || v_salary);
END;
/



--%type(anchor data type)
 create table students(
 STU_ID number(2),
 FIRST_NAME  VARCHAR(8)
 );
 
 INSERT INTO students values(1,'VENKAT');
 insert into students values(2,'NARESH');
 
 
 SET SERVEROUTPUT ON;
 DECLARE
 v_fname students.FIRST_NAME %TYPE;
 BEGIN
 SELECT FIRST_NAME INTO v_fname FROM students WHERE STU_ID=1;
 DBMS_OUTPUT.PUT_LINE(v_fname);
 END;
 /
 
 
 DECLARE
 --v_fname VARCHAR2(8);
 v_fname STUDENTS.FIRST_NAME %type;
 BEGIN
 SELECT FIRST_NAME INTO v_fname  FROM STUDENTS WHERE STU_ID=1;
 DBMS_OUTPUT.PUT_LINE(v_fname);
 END;
 /
 
 ALTER TABLE  students MODIFY first_name CHAR(10);
 
 
 --CONSTANTS IN PL/sql
 /*constant is a user defined identifier whose value remains unchanged throghout the program
 
 YOU MUST INTIALIZE CONSTANT DATATYPE AT ITS DECLARATION 
 
 syntax:Constant_name  CONSTANT_DATATYPE(dw):=value;  */
 
 SET SERVEROUTPUT ON;
 DECLARE
 v_pi CONSTANT NUMBER(7,6) :=3.141592;
 BEGIN
 DBMS_OUTPUT.PUT_LINE(v_pi);
 END;
 /
 
 
 -- IT WON'T WORK
 SET SERVEROUTPUT ON;
 DECLARE
 v_pi CONSTANT NUMBER(7,6);
 BEGIN
 v_pi :=3.141592;
 DBMS_OUTPUT.PUT_LINE(v_pi);
 END;
 /
 
 --DEFAULT KEYWORD
 DECLARE
 v_pi CONSTANT NUMBER (7,6) NOT NULL DEFAULT 3.141592;
 BEGIN
 DBMS_OUTPUT.PUT_LINE(v_pi);
 END;
 
 
 --BIND VARIABLES (HOST VARIABLES)
 /*BIND VARIABLES IN ORACLES DATABASE CAN BE DEFINED AS THE VARIABLES  THAT WE CREATED IN SQL*PLUS AND THEN REFERENCE IN PL/SQL*/
 
 --1st way
 
VARIABLE v_bind1 VARCHAR2(11);
EXECUTE: v_bind1 := 'venkataswamy';
--2 nd way of intializing bind variables
SET SERVEROUTPUT ON;
BEGIN
:v_bind1:='venkat';
END;
DBMS_OUTPUT.PUT_LINE(:v_bind1);
/
print v_bind1;



SET AUTOPRINT ON;
VARIABLE v_bind2 VARCHAR2(30);
EXEC: v_bind2 := 'manish';


/*control statements
IF THEN
IF THEN ELSE
IF THEN ELSE IF     */

--IF THEN
SET SERVEROUTPUT ON;
DECLARE 
v_name NUMBER :=9;
BEGIN
IF v_name<10 THEN
DBMS_OUTPUT.PUT_LINE('INSIDE THE IS');
END IF;
DBMS_OUTPUT.PUT_LINE('OUTSIDE THE IF');
END;
/
SET SERVEROUTPUT ON;
DECLARE
v_website VARCHAR2(30) :='SHOPPINGCART.COM';
v_author  VARCHAR2(30) :='VENKAT';
BEGIN

IF v_website ='SHOPPINGCART.COM' AND v_author ='VENKAT' THEN
DBMS_OUTPUT.PUT_LINE('everything is awesome');
END IF;
DBMS_OUTPUT.PUT_LINE('NOT FINE');
END;
/


--IF THEN ELSE
SET SERVEROUTPUT ON;
DECLARE
v_number number := &enter_a_number;
BEGIN
IF MOD(v_number,2)=0 THEN
DBMS_OUTPUT.PUT_LINE(v_number||'IS EVEN');
ELSE
DBMS_OUTPUT.PUT_LINE(v_number||'IS ODD');
END IF;
DBMS_OUTPUT.PUT_LINE('IF THEN ELSE CONSTRUCT IS COMPLETE');
END;
/

--IF THEN ELSE IF
SET SERVEROUTPUT ON;
DECLARE
v_place VARCHAR2(30) := '&enterplace';
BEGIN
dbms_output.put_line(v_place);
IF(v_place ='METROPOLIS') THEN
dbms_output.put_line('CITY IS PROTECTED BY SUPERMAN');
ELSIF (v_place='Gotham') THEN
dbms_output.put_line('CITY IS PROTECTED BY BATMAN');
ELSIF (v_place='Amazon') THEN
dbms_output.put_line('CITY IS PROTECTED BY WONDER WOMEN');
ELSE
dbms_output.put_line('PLEASE CALL AVENGERS');
END IF;
dbms_output.put_line('THANKS FOR CONTACTING US');
END;



SET SERVEROUTPUT ON;
DECLARE 
   a number(3) := 100; 
BEGIN 
   IF ( a = 10 ) THEN 
      dbms_output.put_line('Value of a is 10' ); 
   ELSIF ( a = 20 ) THEN 
      dbms_output.put_line('Value of a is 20' ); 
   ELSIF ( a = 30 ) THEN 
      dbms_output.put_line('Value of a is 30' ); 
   ELSE 
       dbms_output.put_line('None of the values is matching'); 
   END IF; 
   dbms_output.put_line('Exact value of a is: '|| a );  
END; 
/ 
SET SERVEROUTPUT OFF;



/*
LOOPS 
1.SIMPLE LOOP
2.WHILE LOOP
3.NUMERIC FORLOOP
4.CURSOR FORLOOP*/


SET SERVEROUTPUT ON;
DECLARE
v_counter NUMBER :=0;
v_result NUMBER;
BEGIN
LOOP
v_counter := v_counter+1;
v_result :=19*v_counter;
DBMS_OUTPUT.PUT_LINE('19'||'x'||v_counter||'='||v_result);
/*IF v_counter>=10 THEN
EXIT;
END IF;*/
EXIT WHEN v_counter >=10;
END LOOP;
END;



--while loop
SET  SERVEROUTPUT ON;
DECLARE
v_counter NUMBER :=1;
v_result NUMBER;
BEGIN
WHILE v_counter <=10 LOOP
v_result :=19*v_counter;
DBMS_OUTPUT.PUT_LINE('19'||'x'||v_counter||'='||v_result);
v_counter :=v_counter+1;
END LOOP;
DBMS_OUTPUT.PUT_LINE('OUTSIDE THE LOOP');
END;


DECLARE
v_test BOOLEAN := TRUE;
v_counter NUMBER :=0;
BEGIN
WHILE v_test LOOP
v_counter :=v_counter+1;
DBMS_OUTPUT.PUT_LINE(v_counter);
--LOOP TERMINATION CODE
IF v_counter =10 THEN
v_test :=FALSE;
END IF;
END LOOP;
DBMS_OUTPUT.PUT_LINE('outside the loop');
END;




--NUMERIC FOR LOOP
SET SERVEROUTPUT ON;
BEGIN
FOR v_counter IN 1 .. 10 LOOP
DBMS_OUTPUT.PUT_LINE(v_counter);
END LOOP;
END;


SET SERVEROUTPUT ON;
BEGIN
FOR v_counter IN REVERSE 1 .. 10 LOOP
DBMS_OUTPUT.PUT_LINE(v_counter);
END LOOP;
END;


DECLARE
v_result NUMBER;
BEGIN
FOR v_counter IN 1..10 LOOP
v_result :=19*v_counter;
DBMS_OUTPUT.PUT_LINE('19'||'x'||v_counter||'='||v_result);
END LOOP;
END;





/*
TRIGGERS
NAMED PL/SQL BOLCKS WHICH ARE STORED IN THE DATABASE BLOCK
SPECIALIZED STORED PROGRAMS WHICH EXICUTE IMPLICITLY WHEN A TRIGGERING EVENT OCCURING

EVENTS
A DML STATEMENT
A DDL STATEMENT
A SYSTEM EVENT
A USER EVENT

TYPES 
DML TRIGGERS
DDL TRIGGERS
SYSTEM/DATABASE EVENT TRIGGERS
INSTEAD OF TRIGGERS
COMPOUND TRIGGERS*/


--DML TRIGGER
 
CREATE TABLE superheroes(
sh_name VARCHAR2(20)
);

SET SERVEROUTPUT ON;
CREATE OR REPLACE TRIGGER bi_superheroes
BEFORE INSERT ON superheroes
FOR EACH ROW
ENABLE 
DECLARE
v_user VARCHAR2(20);
BEGIN
SELECT user INTO v_user FROM dual;
DBMS_OUTPUT.PUT_LINE('you just inserted a line mr.'||v_user);
END;
/

INSERT  INTO superheroes VALUES('Ironman');


CREATE OR REPLACE TRIGGER bi_superheroes
BEFORE UPDATE ON superheroes
FOR EACH ROW
ENABLE 
DECLARE
v_user VARCHAR2(20);
BEGIN
SELECT user INTO v_user FROM dual;
DBMS_OUTPUT.PUT_LINE('you just inserted a line mr.'||v_user);
END;
/

UPDATE superheroes SET sh_name='Superman' WHERE sh_name='Ironman';


--
SET SERVEROUTPUT ON;
CREATE OR REPLACE TRIGGER tr_superheroes
BEFORE INSERT OR DELETE OR UPDATE ON superheroes
FOR EACH ROW
ENABLE
DECLARE
v_user VARCAHR2(20);
BEGIN
SELECT user INTO v_user FROM dual;
IF INSERTING THEN
DBMS_OUTPUT.PUT_LINE('one row inserted by'||v_user);
ELSIF DELETING THEN
DBMS_OUTPUT.PUT_LINE('one row deleted by'||v_user);
ELSIF UPDATING THEN
DBMS_OUTPUT.PUT_LINE('one row updated by '||v_user);
END IF;
END;

INSERT INTO superheroes values ('BATMAN');
UPDATE superheroes SET sh_name ='superman' WHERE sh_name ='BATMAN';
DELETE FROM superheroes WHERE sh_name='superman';



--table auditing using DML triggers

CREATE TABLE sh_audit(
new_name VARCHAR2(30),
old_name VARCHAR2(30),
user_name VARCHAR2(30),
entry_date VARCHAR2(30),
operation VARCHAR2(30)
);



CREATE OR REPLACE TRIGGER superheroes_audit
BEFORE INSERT OR DELETE OR UPDATE ON superheroes
FOR EACH ROW
ENABLE
DECLARE
v_user  VARCHAR2(30);
v_date VARCHAR2(30);
BEGIN
SELECT user,TO_CHAR(sysdate,'DD/MM/YYYY HH24:MI:SS') INTO v_user,v_date FROM dual;
IF INSERTING THEN 
INSERT INTO sh_audit(new_name,old_name,user_name,entry_date,operaton) 
values(:NEW.sh_name,null,v_user,v_date,'INSERT');
ELSIF DELETING THEN
INSERT INTO sh_audit(new_name,old_name,user_name,entry_date,operaton)
values(NULL,:OLD.sh_name,null,v_user,v_date,'DELETE');
ELSIF UPDATING THEN
INSERT INTO sh_audit(new_name,old_name,user_name,entry_date,operaton)
values (:NEW.sh_name,:OLD.sh_name,v_user,v_date,'UPDATE');
END IF;
END;
/


SELECT *FROM sh_audit;
INSERT INTO superheroes VALUES ('superman');
UPDATE superheroes SET sh_name='Iromman' WHERE sh_name='superman';
DELETE FROM superheroes WHERE sh_name='Ironman';





/*synchronized backup copy

backu table gets automatically populated with the  main table simultaniously */

desc SUPERHEROES;
select *from SUPERHEROES;

CREATE TABLE superheroes_backUp AS SELECT * FROM  superheroes WHERE 1=2;

CREATE OR REPLACE TRIGGER sh_backup
BEFORE INSERT  OR DELETE OR UPDATE ON superheroes
FOR EACH ROW
ENABLE
BEGIN
IF INSERTING THEN
INSERT INTO superheroes_backup(sh_name) values(:NEW.sh_name);
ELSIF DELETING THEN
DELETE FROM superheroes_backup  WHERE sh_name=:OLD.sh_name;
ELSIF UPDATING THEN
UPDATE superheroes_backup SET sh_name=:NEW.sh_name WHERE sh_name=:OLD.sh_name;
END IF;
END;
/

SELECT *FROM  SUPERHEROES
SELECT *from superheroes_backup;
INSERT INTO SUPERHEROES VALUES('BATSMAN');
INSERT INTO SUPERHEROES VALUES('superman');
UPDATE superheroes SET sh_name ='Ironman' WHERE sh_name ='BATMAN';
DELETE FROM superheroes WHERE sh_name='superman';




/*DDL Trigger with Schema Auditing Example

using DDL triggers you can track changes to the database */

/*CREATE TABLE schema_audit(
ddl_date VARCHAR2(15),
object_created  VARCHAR2(15),
object_name  VARCHAR2(15),
ddl_operation VARCHAR2(15)
);

CREATE OR REPLACE TRIGGER hr_audit_tr
AFTER DDL ON SCHEMA
BEGIN
INSERT INTO schema_audit VALUES(
sysdate,
sys_context('USERNV','CURRENT_USER),
ora_dict_obj_type,
ora_dict_obj_name,
ora_sysevent
);
END;





SELECT *FROM  schema_audit;
CREATE TABLE rebellionRider(r_num  NUMBER);
INSERT INTO rebellionRider VALUES(8);
SELECT *FROM   rebellionRider;
TRUNCATE TABLE rebellionRider;
DROP TABLE rebellionRider;
*/


-- Create Database Event 'LogOn' Trigger 

CREATE TABLE hr_event_audit(
event_type VARCHAR2(20),
logon_date DATE,
logon_time  VARCHAR2(15),
logof_date DATE,
logof_time VARCHAR2(15)
);

CREATE OR REPLACE TRIGGER hr_logon_audit
AFTER LOGON ON SCHEMA
BEGIN
INSERT INTO hr_evnt_audit VALUES(
ora_sysevent,
sysdate,
TO_CHAR(sysdate,'hh24:mm:dd');
NULL,
NULL
);
COMMIT;
END;
/




-- Database Event 'Log Off' Trigger


SELECT *FROM hr_evnt_audit;































select *from emp;


--CURSORS
--CREATING A EXPLICIT CURSORS

SET SERVEROUTPUT ON;
DECLARE
v_name VARCHAR2(30);
--declare the cursor
CURSOR cur_venkat IS
SELECT  ENAME FROM EMP
WHERE EMPNO>7839;
BEGIN
OPEN cur_venkat;
LOOP
FETCH cur_venkat INTO v_name;
DBMS_OUTPUT.PUT_LINE(v_name);
EXIT WHEN cur_venkat%NOTFOUND;
END LOOP;
CLOSE cur_venkat;
END;
/
SET SERVEROUTPUT OFF;



--CURSOR PARAMETER
SET SERVEROUTPUT ON;
DECLARE 
v_name VARCHAR2(30);
CURSOR p_cur_venkat(var_e_id VARCHAR2) IS
SELECT ENAME FROM EMP
WHERE EMPNO>var_e_id;
BEGIN
OPEN p_cur_venkat(105);
LOOP
FETCH p_cur_venkat INTO v_name;
EXIT WHEN p_cur_venkat%NOTFOUND;
DBMS_OUTPUT.PUT_LINE(v_name);
END LOOP;
CLOSE p_cur_venkat;
END;
/
SET SERVEROUTPUT OFF;




--DEFAULT PARAMETER
SET SERVEROUTPUT ON;
DECLARE 
v_name VARCHAR2(30);
v_id  NUMBER(10);
CURSOR cur_venky(v_id NUMBER :=7900) IS 
SELECT ENAME,EMPNO FROM EMP
WHERE EMPNO>v_id;
BEGIN
OPEN cur_venky(7800);
LOOP
FETCH cur_venky INTO v_name,v_id;
EXIT WHEN cur_venky%NOTFOUND;
DBMS_OUTPUT.PUT_LINE(v_name||' '||v_id);
END LOOP;
CLOSE cur_venky;
END;
/
SET SERVEROUTPUT OFF;


--CURSOR FORLOOP
SET SERVEROUTPUT ON;
DECLARE 
CURSOR cur_venkat IS 
SELECT ENAME,JOB FROM EMP
WHERE EMPNO>7600;
BEGIN
FOR L_IDX IN cur_venkAt
LOOP
DBMS_OUTPUT.PUT_LINE(L_IDX.ENAME||' '||L_IDX.JOB);
END LOOP;
END;
/
SET SERVEROUTPUT OFF;
select *from emp;


--CURSOR FORLOOP WITH PARAMETER
SET SERVEROUTPUT ON;
DECLARE 
CURSOR cur_venkat(var_eid NUMBER)IS
SELECT ENAME,JOB FROM EMP
WHERE EMPNO>var_eid;
BEGIN
FOR L_IDX IN cur_venkat(7500)
LOOP
DBMS_OUTPUT.PUT_LINE(L_IDX.ENAME||' '||L_IDX.JOB);
END LOOP;
END;
/
SET SERVEROUTPUT OFF;

--TABLE BASED RECORDS
SET SERVEROUTPUT ON;
DECLARE
v_emp EMP%ROWTYPE;
BEGIN
SELECT *INTO v_emp FROM EMP
WHERE EMPNO=7839;
DBMS_OUTPUT.PUT_LINE(v_emp.ENAME||' '||v_emp.SAL);
DBMS_OUTPUT.PUT_LINE(v_emp.HIREDATE);
END;
/
SET SERVEROUTPUT OFF;



SET SERVEROUTPUT ON;
DECLARE
v_emp   EMP%ROWTYPE;
BEGIN
SELECT ENAME INTO v_emp.ENAME FROM EMP  WHERE EMPNO=7839;
DBMS_OUTPUT.PUT_LINE(v_emp.ENAME);
END;
/
SET SERVEROUTPUT OFF;


--CURSOR BASED
SET SERVEROUTPUT ON;
DECLARE
CURSOR cur_venkat  IS 
SELECT ENAME,SAL FROM EMP 
WHERE EMPNO=7839;
var_emp  cur_venkat%ROWTYPE;
BEGIN
OPEN cur_venkat;
FETCH cur_venkat  INTO var_emp;
DBMS_OUTPUT.PUT_LINE(var_emp.ENAME);
DBMS_OUTPUT.PUT_LINE(var_emp.SAL);
CLOSE cur_venkat;
END;
/
SET SERVEROUTPUT OFF;




SET SERVEROUTPUT ON;
DECLARE 
CURSOR cur_venkat IS
SELECT ENAME,SAL FROM EMP
WHERE EMPNO>7800;
var_emp cur_venkat%ROWTYPE;
BEGIN
OPEN cur_venkat;
LOOP
FETCH cur_venkat INTO var_emp;
EXIT WHEN cur_venkat%NOTFOUND;
DBMS_OUTPUT.PUT_LINE(var_emp.ENAME||' ' ||var_emp.SAL);
END LOOP;
CLOSE cur_venkat;
END;
/
SET SERVEROUTPUT OFF;



SELECT *FROM DEPT;
SELECT *FROM EMP;



--USER DEFINED RECORD
SET SERVEROUTPUT ON;
DECLARE
TYPE rv_dpt IS RECORD(
f_name VARCHAR2(20),
d_name DEPT.DNAME%TYPE
);
var1 rv_dpt;
BEGIN
SELECT ENAME,DNAME INTO var1.f_name,var1.d_name
FROM EMP JOIN DEPT USING (DEPTNO) WHERE EMPNO=7566;
DBMS_OUTPUT.PUT_LINE(var1.f_name||' '||var1.d_name);
END;
/
SET SERVEROUTPUT OFF;


/*EXCEPTIONS
TYPES OF EXCEPTIONS
1.System defined exceptions
2.user defined exceptions
declare user defined exceptions
3 ways
1.using variable of exception type
2.using PRAGMA exceptions INIT functions
3.using RAISE_APPLICATIONS_ERRORS methods
*/
SET SERVEROUTPUT ON;
DECLARE
var_dividend NUMBER :=24;
var_divisor  NUMBER:=8;
var_result NUMBER;
ex_DivZero  EXCEPTION;
BEGIN 
IF var_divisor =0 THEN
RAISE ex_DivZero;
END IF;
var_result :=var_dividend/var_divisor;
DBMS_OUTPUT.PUT_LINE('RESULT='||var_result);
EXCEPTION WHEN ex_DivZero  THEN
DBMS_OUTPUT.PUT_LINE('ERROR ERROR!-YOUR DIVISOR IS ZERO');
END;
/
SET SERVEROUTPUT OFF;


--RAISE APPLICATION ERROR
SET SERVEROUTPUT ON;
ACCEPT var_age NUMBER PROMPT'what is your age?';
DECLARE
age NUMBER :=&var_age;
BEGIN
IF age<18 THEN
RAISE_APPLICATION_ERROR(-2008,'you should be 18 or above for the drinks!');
END IF ;
DBMS_OUTPUT.PUT_LINE('sure what would  you like to have?');
EXCEPTION WHEN others THEN
DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/
SET SERVEROUTPUT OFF;

--pragma exception 
SET SERVEROUTPUT ON;
DECLARE
ex_age EXCEPTION;
age NUMBER :=19;
PRAGMA EXCEPTION_INIT(ex_age,-20017);
BEGIN
IF age<18 THEN
RAISE_APPLICATION_ERROR( -20017, ' VENKAT!');
END IF;

DBMS_OUTPUT.PUT_LINE('sure!what would you like to have?');

EXCEPTION WHEN ex_age THEN
DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/
SET SERVEROUTPUT OFF;

--functions for calculating the area of circle
SET SERVEROUTPUT ON;
CREATE OR REPLACE FUNCTION circle_area(radius NUMBER);
RETURN NUMBER AS
pi CONSTANT NUMBER(7,3):=3.141;
area NUMBER(7,3);
BEGIN
--Area of a circle pi*r*r;
area:= pi*(radius*radius);
RETURN area;
END;

--EXECUTE circle_area(5);
SET SERVEROUTPUT ON;
BEGIN
DBMS_OUTPUT.PUT_LINE(select SYSDATE from dual);
 END;
 
select SYSDATE from dual;

SET SERVEROUTPUT ON;
BEGIN
 DBMS_OUTPUT.PUT_LINE(circle_area (25));
 END;
 /






SET SERVEROUTPUT ON;
DECLARE
vr_area NUMBER(7,3);
BEGIN
vr_area := circle_area(25);

DBMS_OUTPUT.PUT_LINE(vr_area);
END;
/
SET SERVEROUTPUT OFF;




SELECT *FROM EMP;



--procedure
SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE pr_rebellionRider AS
var_name VARCHAR2(20):='VENKAT';
var_web VARCHAR2(20):='RebellionRider.com';
BEGIN

DBMS_OUTPUT.PUT_LINE('whats up internet i am'||var_name|| 'from' ||var_web);

END;


  EXECUTE pr_rebellionRider;

SET SERVEROUTPUT ON;
BEGIN
DBMS_OUTPUT.PUT_LINE('HAI THERE');
END;
/
SET SERVEROUTPUT OFF;




EXECUTE pr_RebellionRider;

EXEC pr_RebellionRider;


SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE emp_sal(dep_id NUMBER, sal_raise NUMBER)
IS
BEGIN
UPDATE emp SET sal =sal*sal_raise WHERE deptno = dep_id;
END;
/


EXECUTE emp_sal(10,10);

SELECT * FROM emp;








SET SERVEROUTPUT ON;
CREATE OR REPLACE function findavg()
returns float as 
begin
declare @a float
select @a=avg(SAL) from emp
return @a
end;



SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE greetings 
AS
BEGIN 
DBMS_OUTPUT.PUT_LINE('Hello World!'); 
END;
/
SET SERVEROUTPUT OFF;



SET SERVEROUTPUT ON;
DECLARE 
   a number; 
   b number; 
   c number;
PROCEDURE findMin(x IN number, y IN number, z OUT number) IS 
BEGIN 
   IF x < y THEN 
      z:= x; 
   ELSE 
      z:= y; 
   END IF; 
END;   
BEGIN 
   a:= 23; 
   b:= 45; 
   findMin(a, b, c); 
   dbms_output.put_line(' Minimum of (23, 45) : ' || c); 
END; 
/

SET SERVEROUTPUT ON;
DECLARE 
   a number; 
PROCEDURE squareNum(x IN OUT number) IS 
BEGIN 
  x := x * x; 
END;  
BEGIN 
   a:= 23; 
   squareNum(a); 
   dbms_output.put_line(' Square of (23): ' || a); 
END; 
/




SET SERVEROUTPUT ON;
CREATE OR REPLACE FUNCTION totalCustomers 
RETURN number IS 
   total number(2) := 0; 
BEGIN 
   SELECT count(*) into total 
   FROM customers; 
    
   RETURN total; 
END; 
/ 



SELECT CURRENT_TIMESTAMP from dual;
