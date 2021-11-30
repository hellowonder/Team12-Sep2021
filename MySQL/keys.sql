show tables;
create table dept3(
deptno int primary key,
dname varchar(10),
loc varchar(10)
);
insert into dept3 values
(1, 'TRN','Bby'),
(2,'EXP','Dlh'),
(3, 'MKTG','Cal');

create table emp3
(empno char(4) primary key,
ename varchar(25),
sal float,
deptno int,
mgr char
);
insert into emp3 values
(1,'A',5000,1,'1'),
(2,'B',6000,1,'1'),
(3,'C',7000,1,'1'),
(4,'D',9000,2,'2'),
(5,'E',8000,2,'2'),
(6,'F',9000,2,'2');

desc emp3;
alter table emp3 add foreign key (deptno) references dept3(deptno);