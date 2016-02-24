DECLARE
  v_ename emp.ename%type;
  v_min_sal emp.sal%type;
  v_max_sal emp.sal%type;
  v_avg_sal emp.sal%type;
BEGIN
  SELECT ename INTO v_ename FROM emp WHERE empno=7369;
  dbms_output.put_line('Name: '||v_ename);
  
  SELECT MAX(sal),min(sal) into v_max_sal,v_min_sal from emp;

  v_avg_sal:=(v_max_sal + v_min_sal)/2;
  
  dbms_output.put_line('Average Sal: '||v_avg_sal);

END;

