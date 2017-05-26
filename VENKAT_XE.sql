SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE Discount AS
CURSOR c_group_discount
IS
SELECT distinct s.course_no,c.description
FROM section s,enrollment e,course c
WHERE s.section_id=e.section_id
AND c.cours_no=s.course_no
GROUP BY s.course_no,c.description,
e.section_id,section_id
HAVING COUNT(*)>=8;
BEGIN
FOR r_group_discount IN c_group_discount
LOOP
UPDATE course
SET cost=cost*.95
WHERE course_no=r_group_discount.course_no;
DBMS_OUTPUT.PUT_LINE
('A 5% discount has been given to'||
r_group_discount.course_no||' '||
r_group_discount.description
);
END LOOP;
END;
/
SET SERVEROUTPUT OFF;


EXECUTE Discount
SET SERVEROUTPUT ON;
CREATE OR REPLACE FUNCTION show_description
(i_course_nonumber)
RETURN varchar2
AS
  v_deescription varchar2(50);
  BEGIN 
  SELECT description 
  INTO v_description
  FROM course
  WHERE course_no=i_course_no;
  RETURN v_description;
  EXCEPTION
  WHEN NO_DATA_FOUND
  THEN
  RETURN('the course is notin the database');
  WHEN OTHERS
  THEN
  RETURN('Error in running show_descrption');
  END;
  /
  SET SERVEROUTPUT OFF;
  
  
set serveroutput on;  
create function findavg()
return float
as begin
declare @a float
select @a=avg(basicsalary) from emp
return @a
end;
/
  
select * from EMP;
