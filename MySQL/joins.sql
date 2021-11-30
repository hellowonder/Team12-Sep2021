use cdacmumbai;
create table Dept(deptno int, dname char(20), location char(20));
insert into dept values(1,'TRN','Bby'),(2,'EXP','Dlh'),(3,'MKTG', 'Cal');
select * from dept;
select * from emp;

select ename, dname from emp,dept
where dept.deptno = emp.Empno;

select dname, ename,job from emp right outer join dept
on(dept.deptno = emp.deptno);
select * from emp;
select * from dept;

-- insert into emp value(6,'shubh',2000,4,'w',null);-- 
select dname, ename,location from emp left outer join dept
on(dept.deptno = emp.deptno);
select * from dept;
select * from emp;

insert into emp value(6,'shubh',2000,4,'w',null);
select dname, ename,location from emp left outer join dept
on(dept.deptno = emp.deptno)
union
select dname, ename,job from emp right outer join dept
on(dept.deptno = emp.deptno);

select dname, ename,job from emp,dept
where (dept.deptno != emp.deptno);

-- --inner join
use cdacmumbai;
show tables;
select * from emp;
select * from dept;

select Ename,emp.DeptNo,dname from emp
inner join dept on
emp.deptno = dept.deptno;

select Ename from emp
order by sal desc
limit 1,1;
select * from emp;

select ename, max(sal) from emp 
where sal < (select max(sal) from emp);

select * from emp where sal=(select sal from emp where ename='thomas');



select dname, ename from emp, dept; 

select dname, ename from emp, dept
where dept.deptno = emp.deptno; 

select dname, ename from emp, dept where dept.deptno != emp.deptno;

select dname, ename from emp right outer join dept
on (dept.deptno = emp.deptno);

select dname, ename from emp left outer join dept
on (dept.deptno = emp.deptno); 

select dname, ename from emp right outer join dept
on (dept.deptno = emp.deptno)
 union
select dname, ename from emp left outer join dept
on (dept.deptno = emp.deptno); 

select * from emp;
select a.ename, b.ename from emp as b, emp as a
where a.mgr = b.empno;













