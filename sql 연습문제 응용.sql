select* from emp;
select* from dept;

-- 1) 'allen'의 직무와 같은 사람의 이름, 부서명, 급여, 직무를 출력하세요.
select ename, dname, sal, job
from emp e join dept d
on e.deptno = d.deptno
where job=(select job from emp where ename='allen');


-- 2) jones가 속해있는 부서의 모든 사람의 사원번호, 이름, 입사일, 급여를 출력하세요.
select empno, ename, hiredate, sal
from emp
where job=(select job from emp where ename='jones');


-- 3) 전체 사원의 평균 임금보다 많은 사원의 사원번호, 이름, 부서명, 입사일, 지역, 급여를 출력하세요.
select empno, ename, job, hiredate, loc, sal
from emp e join dept d
on e.deptno = d.deptno
where sal >= (select avg(sal) from emp);


-- 4) 10번 부서와 같은 일을 하는 사원의 사원번호, 이름, 부서명, 지역, 급여를 급여가 많은 순으로 출력하세요.
select empno, ename, dname, loc, sal
from emp e join dept d
on e.deptno = d.deptno
where dname=(select dname from dept where deptno=10)
order by sal desc;


-- 5) 'martin'이나 'scott'의 급여와 같은 사원의 사원번호, 이름, 급여를 출력하세요.
select empno, ename, sal
from emp
where sal = any (select sal from emp where ename='martin' or ename='scott');


-- 6) 부서번호가 30번 부서의 최고 급여보다 높은 사원의 사원번호, 이름, 급여를 출력하세요.
select empno, ename, sal
from emp
where sal>(select max(sal) from emp where deptno = 30);


-- 7) 사원중에서 급여(sal)와 보너스(comm)를 합친 금액이 가장 많은 경우와 가장 적은 경우, 평균 금액을 구하세요.
select max(sal+ifnull(comm,"0")) as '최고연봉', min(sal+ifnull(comm,"0")) as '최저연봉', avg(sal+ifnull(comm,"0")) as '평균급여'
from emp;


-- 8) 부서별로 급여합계를 구하세요.
select sum(sal) as '급여합계', deptno '부서'
from emp
group by deptno;

-- 9) 급여가 3000이상이면 급여+급여의 15%의 격려금을,
--    급여가 2000이상이면 급여+급여의 10% 격려금을,
--    급여가 1000이상이면 급여+급여의 5% 격려금을,
--    그렇지 않으면 급여를 구하여
--    이름, 직업, 급여, 격려금을 표시하시오.
select ename '이름', job '직업', sal '급여',
	case
		when sal>=3000 then (sal+sal)*0.15
		when sal>=2000 then (sal+sal)*0.10
		when sal>=1000 then (sal+sal)*0.05
		else sal
	end as '격려금'
from emp;


-- 10) 'martin'과 같은 매니저(mgr)와 일하는 이름, 직업, 급여, 부서명, 지역을 구하시오.
select ename, job, sal, dname, loc, mgr
from emp e join dept d
on e.deptno = d.deptno
where mgr in (select mgr from emp where ename='martin');


-- 11) 부서명이 'research'인 사람의 이름, 직업, 급여, 부서명을 표시하시오.
select ename, job, sal, dname
from emp e join dept d
on e.deptno = d.deptno
where dname='research';


-- ★★★ 12) 각 부서별 평균 급여를 구하고, 그 중에서 평균 급여가 가장 적은 부서의
--     평균 급여보다 적게 받는 사원들의 부서명, 지역, 급여를 구하세요.
select dname, loc, sal
from emp e join dept d 
on e.deptno = d.deptno
;

select min(davg)
from (select avg(sal) davg
from emp e join dept d
on e.deptno = d.deptno
group by dname) c ;


select dname, loc, sal
from emp e join dept d
on e.deptno = d.deptno
where sal<(
select min(davg)
from (select avg(sal) davg
from emp e join dept d
on e.deptno = d.deptno
group by dname) c );


-- 13) 'BLAKE'와 같은 부서에 있는 사원들의 이름과 고용일을 뽑는데 'BLAKE'는 빼고 출력하라.
select ename, hiredate
from emp
where deptno = (select deptno from emp where ename='blake') and ename!='blake';


-- 14) 이름에 'T'를 포함하고 있는 사원들과 같은 부서에서 근무하고있는 사원의 사원번호와 이름을 출력하라.
select empno '사원번호', ename '이름'
from emp
where ename like '%t%';


-- 15) 자신의 급여가 평균 급여보다 많고, 이름에 'S'가 들어가는 사원과 동일한 부서에서 근무하는 모든 사원의
--     사원번호, 이름, 급여를 출력하라.
select avg(sal) from emp;

select deptno, ename from emp where ename like '%s%';

select *
from emp
where deptno = any(select deptno from emp where ename like '%s%');

select empno, ename, sal
from emp
where sal>(select avg(sal) from emp)
and deptno=any(select deptno from emp where ename like '%s%');


-- 16) 커미션을 받는 사원과 부서번호, 월급이 같은 사원의 이름, 월급, 부서번호를 출력하라.
select comm, ename, deptno, sal
from emp
where comm is not null and comm!=0;

select ename, sal, deptno, comm
from emp
where deptno=any(
					select deptno
                    from emp
                    where comm is not null
                    and comm!=0)
and sal=any(
					select sal
                    from emp
                    where comm is not null
                    and comm!=0);


-- 17) 직업명과 사원의 등급을 직업이 'PRESIDENT' 이면 'A',
--     직업이 'ANALYST' 이면 'B',
--     직업이 'MANAGER' 이면 'C',
--     직업이 'SALESMAN' 이면 'D',
--     직업이 'CLEARK' 이면 'E' 로 표시하시오.
select ename '이름', job '직업',
case
	when job='PRESIDENT' then 'A'
	when job='ANALYST' then 'B'
    when job='MANAGER' then 'C'
    when job='SALESMAN' then 'D'
    else 'E'
end as '등급'
from emp;


-- ★★★ 18) 10번 부서중에서 30번 부서에는 없는 업무를 하는 사원의 사원번호, 이름, 부서명,입사일, 지역을 출력하라.
select empno, ename, dname, hiredate, loc, e.deptno, job
from emp e join dept d
on e.deptno = d.deptno
where e.job not in(select job from emp where deptno=30) and e.deptno=10;

select *
from emp
where deptno=30;

select empno, ename, hiredate, deptno
from emp
where job not in(select job from emp where deptno=30) and deptno=10;




-- 19) 급여가 30번 부서의 최고 급여보다 높은 사원의 사원번호, 이름, 급여를 출력하라.
select empno, ename, sal
from emp
where sal>(select max(sal) from emp where deptno=30);


-- 20) 급여가 30번 부서의 최저 급여보다 낮은 사원의 사원번호, 이름, 급여를 출력하라.
select empno, ename, sal
from emp
where sal<(select min(sal) from emp where deptno=30);



-- 21) 사원 중에서 입사일이 가장 빠른 사원의 사원번호, 이름, 입사일, 부서명을 출력하세요.
select empno, ename, hiredate, dname
from emp e join dept d
on e.deptno = d.deptno
where hiredate = (select min(hiredate) from emp);


-- 22) 평균 연봉보다 많이 받는 사원들의 사원번호, 이름, 연봉을 연봉이 높은 순으로 정렬하여 출력하세요.
--     (연봉은 sal*12+comm으로 계산)
--     HINT : IFNULL사용(구글로 검색해보세요.)
select empno, ename, sal*12+ifnull(comm,0) as '연봉'
from emp
order by 연봉 desc;


-- 23) EMP와 DEPT TABLE을 JOIN하여 부서 번호, 부서명, 이름, 급여를 출력하라.
select e.deptno, dname, ename, sal
from emp e join dept d
on e.deptno = d.deptno;


-- 24) 이름이 'ALLEN'인 사원의 부서명을 출력하라.
select ename, dname
from emp e join dept d
on e.deptno = d.deptno
where ename='allen';


-- 25) DEPT Table 에는 존재하는 부서코드이지만 해당부서에 근무하는 사람이 존재하지 않는 경우의 결과를 출력하라.
select *
from emp e right outer join dept d
on e.deptno = d.deptno
where empno is null;