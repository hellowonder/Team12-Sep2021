use cdacmumbai;
show tables;

delimiter //
create function Num_cube(n int)
returns int
deterministic
begin
	return (n * n * n);
end;//
delimiter ;

create table data(x int, y int);
delimiter //
create procedure xyz(a int)
begin
    declare b int;
    set b = Num_cube(a);
    insert into data values(a,b);    
end; //
delimiter ;

call xyz(10);
select * from data;





















