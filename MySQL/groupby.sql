show databases;
use cdacmumbai;


create table emp(Empno int, Ename varchar(20), sal int, DeptNo int, job char(1), mgr int);
insert into emp values(1, 'Arun', 8000,1,'M',4),
(2,'Ali', 7000,1,'C',1),(3,'Kirun',3000,1,'C',1),(4,'Jack',9000,2,'M',null),
(5,'Thomas',8000,2,'C',4);

select * from emp;
select deptno,job, sum(sal) from emp group by job, deptno
having sum(sal) > 8000;
