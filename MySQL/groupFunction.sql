select * from emp;
select count(ename),min(sal) from emp; 

select * from emp;
select deptno,ename, max(sal) from emp group by deptno; 

select * from emp;
select deptno,ename, sum(sal) from emp where sal > 7000 group by deptno;

select * from emp;
select deptno, sum(sal) from emp group by deptno having sum(sal) > 17000; 

select deptno, sum(sal) from emp  where sal > 7000 group by deptno having sum(sal) > 10000 order by 1; 







