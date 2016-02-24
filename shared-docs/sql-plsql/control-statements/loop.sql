-- loop with if condition
DECLARE

COUNTER NUMBER(4);
BEGIN
    COUNTER:=5;
    LOOP
        COUNTER:=COUNTER-1;
        DBMS_OUTPUT.PUT_LINE(COUNTER);
      
        IF COUNTER = 0 THEN
        EXIT;
        END IF;
        
    END LOOP;
    
END;

-- loop with exit when condition

DECLARE

COUNTER NUMBER(4);
BEGIN
    COUNTER:=5;
    LOOP
        COUNTER:=COUNTER-1;
        DBMS_OUTPUT.PUT_LINE(COUNTER);
      
        exit when counter = 0;
        
        
    END LOOP;
    
END;

-- loop with while condition
DECLARE
COUNTER NUMBER(4);

BEGIN
    COUNTER:=5;
    while counter = 0
    LOOP
        COUNTER:=COUNTER-1;
        DBMS_OUTPUT.PUT_LINE(COUNTER);
    END LOOP;
END;

-- loop with for condition
DECLARE
COUNTER NUMBER(4);

BEGIN
    COUNTER:=5;
    
    for i IN  1..counter
    LOOP
       
        DBMS_OUTPUT.PUT_LINE(i);
    END LOOP;
END;

-- loop with for and reverse condition

DECLARE
COUNTER NUMBER(4);

BEGIN
    COUNTER:=5;
    
    for i IN reverse  1..counter
    LOOP
       
        DBMS_OUTPUT.PUT_LINE(i);
    END LOOP;
END;