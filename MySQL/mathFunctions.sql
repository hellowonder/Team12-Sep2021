create table dummy(sal float);
insert into dummy values
(1234.567),
(1561.019),
(1375.516),
(1749.167);

select round(sal) from dummy;
select round(sal,1) from dummy;
select round(sal,2) from dummy;
select round(sal,-2) from dummy;

select truncate(sal,0) from dummy;
select truncate(sal,1) from dummy;
select truncate(sal,2) from dummy;
select truncate(sal,-2) from dummy;

select ceil(sal) from dummy;

select floor(sal) from dummy;

select sign(-10) from dual;
select sign(0) from dual;
select sign(10) from dual;

select mod(9,5) from dual;
select mod(8.22,2.2) from dual; 

select sqrt(81) from dual;

select power(10,3) from dual;
select power(10,1/3) from dual;

select abs(-10) from dual; 








