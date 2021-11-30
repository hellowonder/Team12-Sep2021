select sysdate() from dual;
select now() from dual;

select sysdate(), now() from dual;
select adddate(sysdate(),1) from dual;
select adddate(sysdate(),-1) from dual;
select addtime('2020-01-10 11:00:00',1) from dual;
select * from emp;