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