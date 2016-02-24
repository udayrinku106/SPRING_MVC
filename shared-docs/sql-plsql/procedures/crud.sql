
-- INSERT OPERATION
create or replace procedure insert_person(in_id IN person.id%type,  in_name IN person.name%type)
is
begin
insert into person(id,name) values(in_id ,in_name);
commit;
dbms_output.put_line('1 record inserted into person table');

end;

exec insert_person(14,'person12');
-------------------------------------------------------------------------
-- UPDATE OPERATION
create or replace procedure update_person(in_id IN person.id%type,  in_name IN person.name%type)
is
begin
update person p set p.name=in_name where p.id=in_id;

commit;
dbms_output.put_line('1 record affected into person table');

end;

exec update_person(13,'person1');
-------------------------------------------------------------------------
-- DELETE PERSON
create or replace procedure delete_person(in_id IN person.id%type)
is
begin
delete person p  where p.id=in_id;

commit;
dbms_output.put_line('1 record deleted in person table');

end;

exec delete_person(13);
------------------------------------------------------------------------
-- SELECT ALL

create or replace procedure select_person(person_record_all OUT SYS_REFCURSOR)
is
begin

open person_record_all
for select id,name from person;
dbms_output.put_line('listing rows from person table');

end;

-- calling procedure from pl/sql

DECLARE 
  c_person_all SYS_REFCURSOR;
  rec_person person%ROWTYPE;
BEGIN
 
  --records are assign to cursor 'c_person_all'
 select_person(c_person_all);
 
  LOOP
 
        --fetch cursor 'c_person_all' into person table type 'rec_person'
	FETCH c_person_all INTO rec_person;
 
        --exit if no more records
        EXIT WHEN c_person_all%NOTFOUND;

        --print the matched username
        dbms_output.put_line(rec_person.id||rec_person.name);
 
  END LOOP;
 
  CLOSE c_person_all;
 
END;
/