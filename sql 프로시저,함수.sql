-- 프로시저
-- create procedure 프로시저명()
-- begin
-- 	if
-- 	 SQL 문장1
-- 	 SQL 문장2
-- 	 SQL 문장3
-- end

desc emp;






-- 프로시저 (부서번호가 10번 사원을 출력)
delimiter //
create procedure pr1(a int(2))
begin

		select * from emp where deptno=a;

end
//
delimiter ;


-- pr1프로시저 호출 (부서번호 10을 매개변수 a에 셋팅)
call pr1(20);









show global variables like 'log_bin_trust_function_creators';

SET GLOBAL log_bin_trust_function_creators = 1; //ON



-- 함수
delimiter //
create function fu1(a int, b int) returns int
begin

		select avg(sal)
        into r
        from emp;
        return r;

end
//
delimiter ;


-- fu1 함수 호출
select fu1(10, 20);


-- 함수
delimiter //
create function fu2() returns int
begin
	
		-- 변수 선언 (declare)
        declare r double;
		select avg(sal)
        into r
        from emp;
        return r;

end
//
delimiter ;

select fu2();

show function status where db='exam';
drop function fu2;

drop function f_sales;

delimiter //
create function f_sales(s int) returns int
begin
    declare q int;
	select sum(sal)
    into q
    from emp
    where deptno=s;
    return q; 
end
//
delimiter ;

select f_sales(30);

select sum(sal), deptno
from emp
where deptno=30;