desc emp;
desc customers;
show tables;
select * from customers;
select * from emp;

select Ename, sal, deptNo from emp
order by Ename;

select Cnum,City from customers
order by Cname;

select * from customers where rating = any(select cnum, city from customers where Rating = 100);