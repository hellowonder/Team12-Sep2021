create table dummy2(ename char, sal int, comm int);
insert into dummy2 values('A',5000,500),('B',6000,null),('C',null,700);

select * from dummy2;
select sal + ifnull(comm,0)from dummy2;
select ifnull(sal,0) + ifnull(comm,0)from dummy2;