use cdacmumbai;
show tables;
create table tempp(fir int, sec varchar(15));
delimiter //
create procedure abc()
begin
	declare x int;
    set x = 10;
    insert into tempp values(x,'inside abc');
end;//
delimiter ;
call abc();
select * from tempp;
drop procedure abc;

truncate table tempp;

delimiter //
create procedure abc1()
begin
	declare x int default 10;
    insert into tempp values(x,'inside abc2');
end;//
delimiter ;
call abc1;
select * from tempp;

delimiter //
create procedure abc2()
begin
	declare x char(15) default 'CDAC';
    insert into tempp values(1,x);
end;//
delimiter ;
call abc2;
select * from tempp;

-- WAP for HRA calculation ,HRA = 40% of sal
truncate table tempp;
delimiter //
create procedure abc3()
begin
	declare x char(15) default 'KING';
    declare y float default 3000;
    declare z float default 0.4;
    declare hra float;
    set hra = y*z;
    insert into tempp values(y,x);
    insert into tempp value(hra,'HRA');
end;//
delimiter ;
call abc3;

select * from tempp;
truncate table tempp;

delimiter //
create procedure abc4(x char(15),y float,z float)
begin
	declare hra float;
    set hra = y * z;
    insert into tempp values(y,x);
    insert into tempp  value(hra,'HRA');
end;//
delimiter ;
call abc4('King',12,12);
call abc4('Scott',0.15,12);
select * from tempp;









