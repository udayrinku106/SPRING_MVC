DECLARE
  v_age number(4);
  v_sal emp.sal%type;
BEGIN

    SELECT SAL INTO V_SAL FROM EMP WHERE ENAME='SMITH';
    
    if v_sal > 200  then
    dbms_output.put_line('sal is greater than 200');
    elsif v_sal > 200 and v_sal < 500 then
    dbms_output.put_line('sal is between 200 and 500');
    else
    dbms_output.put_line('sal is either less than 200 or greater than 500');
    end if;
	
	
END;