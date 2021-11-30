show tables;
create table emp2(
Fname varchar(10), 
Lastname varchar(10) 
);

desc table emp2;

insert into emp2 values
('Arun','Purun'),
('Tarun','Arun'),
('Sirun','Kirun'),
('Nutan','Purun');

select * from emp2;
-- concatination
 select concat(fname, Lastname) from emp2;
 select concat(concat(fname,' '),lastname) from emp2;
 select lpad(name,25,'*') from emp2; 
 select rpad(ename,25,'*') from emp; 
 select concat( upper(substr(fname,1,1)),lower(substr(fname,2))) from emp2;
 
 select * from emp;
 select ltrim(ename) from emp;
 select rtrim(ename) from emp;
 select trim(ename) from emp;
 
 select substr("Shubham",3);
 select substr("Shubham",3,2);
 select substr("Shubham",-3);
 select substr("Shubham",3,2);
 
 select replace("Shubham", "bh","an");
 select instr("Shubham",'ub');
 select instr("Shaubham",'a');
 select length("Shubham");
 
 select ascii('Shubham');
 select ascii('Z') from dual;
 
 select char(65 using utf16) from dual;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 