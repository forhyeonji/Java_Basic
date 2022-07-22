use exam;
select * from member
;

select * from board;
;

alter table board drop writer;

update member
set name='다리미'
where id='bbbb222';


-- 조인(join) member테이블하고 board테이블하고 내부조인
-- 테이블 이름에 별칭을 주어 사용가능
select bno, title, name, regdate, cnt
from member as m, board b
where m.id=b.id;


-- 조인(join) member테이블하고 board테이블하고 내부조인
-- (표기법 : ANSI)
select bno, title, name, regdate, cnt
from member as m
join board b
on m.id=b.id;


select *
from emp as e
join dept as d
on e.deptno = d.deptno;


select empno, ename, job, mgr, sal, dname, loc
from emp e join dept d
on e.deptno = d.deptno
order by sal;


-- Left Outer Join
select *
from emp e left outer join dept d
on e.deptno = d.deptno
order by sal;

-- Right Outer Join
select *
from emp e right outer join dept d
on e.deptno = d.deptno
order by sal;


-- 부서별 계산
select count(*) as '총 직원수',
		sum(sal) as '총 급여금액',
        avg(sal) as '급여 평균',
        max(sal) as '최대 급여',
        min(sal) as '최저 급여',
        deptno as '그룹명'
 from emp
 group by deptno;


-- 그룹별로 나눈 후 조건주기
select count(*) as '총 직원수',
		sum(sal) as '총 급여금액',
        avg(sal) as '급여 평균',
        max(sal) as '최대 급여',
        min(sal) as '최저 급여',
        deptno as '그룹명'
 from emp
 group by deptno
 having avg(sal)>=2500;


select *
from emp;







-- 연습문제
-- 각 부서별로 지급되는 총 월급은?
select sum(sal) as '총 월급',
		deptno as '부서'
from emp
group by deptno;


-- 각 직업별로 월급이 제일 많은 사람과 제일 적은 사람의 차이는?
select max(sal) as '제일 높은 월급',
		min(sal) as '제일 낮은 월급',
		max(sal)-min(sal)	as '월급 차이',
        job as '직업'
from emp
group by job;


-- 커미션이 없는 사람 중에 각 부서별로 월급이 제일 작은 사람은?
select min(sal) as 'no 커미션 min 월급',
		ename as '이름'
from emp
where comm is null or comm = 0
group by deptno;

select min(sal), ename from emp
where sal in (select min(sal) from emp group by deptno)
group by deptno;


-- 급여가 3000대인 회원의 사원번호, 성명, 일하는 지역을 검색
select empno as '사원번호', ename as '성명', loc as '지역', sal as '급여'
from emp as e join dept as d
on e.deptno = d.deptno
where sal>=3000 and sal<4000;
-- where sal between 3000 and 3999;


-- 성명에 'LA'가 포함된 회원의 성명, 부서명, 일하는 지역을 검색
select  ename as '성명', dname as '부서명', loc as '지역'
from emp e join dept d
on e.deptno = d.deptno
where ename like '%LA%';



-- 서브쿼리 (select) join과 비슷
-- select (select * from 테이블명)
-- from 테이블명
-- where 조건
-- 급여가 2000 이상인 사원번호, 직업, 부서명을 조회 (join)
select empno, job, dname
from emp e join dept d
on e.deptno = d.deptno
where sal >=2000
;
-- 급여가 2000 이상인 사원번호, 직업, 부서명을 조회 (서브쿼리)
select empno, job, (select dname from dept d where e.deptno=d.deptno) '부서명'
from emp e
where sal>=2000
;



-- select *
-- from (select * from 테이블명) 가상의테이블이름
-- where 조건
-- 부서별 최대 인원수를 검색

select count(*) deptnocnt
from emp
group by deptno;

select max(deptnocnt)
from (select count(*) deptnocnt
		from emp
		group by deptno) maxdept;


-- 사원테이블의 평균급여보다 많이 받는 사원의 사원번호, 이름, 부서명을 검색
-- 조인여부 파악(emp, dept 필요)
select empno, ename, dname
from emp e join dept d
on e.deptno = d.deptno
where sal >= (select avg(sal) from emp);


select avg(sal) from emp group by deptno;
-- where sal >= 2175.0000
-- and sal >= 1566.66674
-- and sal >= 2916.6667



select empno, ename, dname, sal
from emp e join dept d
on e.deptno = d.deptno
where sal >= any(select avg(sal) from emp group by deptno);

select avg(sal) from emp group by deptno;

SELECT empno, ename, dname
FROM emp e JOIN dept d
ON e.deptno = d.deptno
WHERE ename IN (SELECT ename FROM emp WHERE comm>0);