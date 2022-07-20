-- 1
select empno, ename, sal
from emp;


-- 2
select ename, sal
from emp
where job='salesman' and sal >= 1000;


-- 3
select ename, job, sal
from emp
where job='manager'
order by sal desc;


-- 4
select ename, sal, job, hiredate, deptno
from emp
where ename = 'scott';


-- 5
select ename, sal, job, hiredate
from emp
where hiredate = '1981-11-17';


-- 6
select ename, sal
from emp
where sal >= 3600;


-- 7
select ename, sal, job, deptno
from emp
where sal <=1200;


-- 8
select ename, deptno, job
from emp
where job != 'salesman';


-- 9
select ename, sal
from emp
where sal not between 1000 and 3000;


-- 10
select ename, sal
from emp
where ename like '%t';


-- 11
select ename, sal
from emp
where comm is null;


-- 12
select ename, sal, job
from emp
where job != 'salesman'
and job != 'analyst'
and job != 'manager';


-- 13
select ename, sal, job
from emp
where job not in ('salesman','analyst','manager');

