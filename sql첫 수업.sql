create database exam;
use exam;

create table member(
	id varchar(20)			primary key,
    password varchar(30)	not null,
    name varchar(5)			,
    birth date				, -- birth varchar(8) 또는 datetime(날짜시간 둘다)
    gender varchar(1)		
);
-- member 테이블에 주소 컬럼 추가
alter table member add column address varchar(30);
-- member 테이블에 비밀번호 컬럼의 글자수를 20자로 변경alter
alter table member modify column password varchar(20) not null;
-- member 테이블 제거
drop table member;

create table member(
	id varchar(20) primary key,
    password varchar(30) not null,
    addr varchar(30) not null,
    phone varchar(11),
    email varchar(20),
    name varchar(5),
    age varchar(3)

);


alter table member modify column age int;
alter table member modify column password varchar(20);


insert into member(id, password, addr, phone, email, name, age)
		values('abcd1234', '1234', '울산', '010', 'green@naver.com', '정자바', 10);
        
-- member 테이블에 있는 모든 컬럼을 조회        
-- select 컬럼명 from 테이블명
select * from member;
select id, email from member;
insert into member(id, password, addr, phone, email, name, age)
		values('abcd12345', '1234', '울산', '010', 'green@naver.com', '정자바', 10);
        
select id from member;
delete from member
where id='abcd12345';

select * from member;
insert into member(id, password, addr)
		values('efg','1131','부산');
select * from member;
delete from member
	where id='efg';


select * from member;

-- 개명 (정자바 → 정씨샵)
-- update 테이블명
-- set 변경하고자하는 컬럼명 = 새로운 값;
update member
	set name = '정씨샵';
    
-- 비밀번호 변경
update member
	set password = '5678';

-- member 테이블에 있는 모든 컬럼을 조회.
-- select 컬럼명 from 테이블명
-- select * from member;

-- member 테이블 중에서 아이디가 'abcd1234'인 데이터의 모든 컬럼을 조회.
-- select 컬럼명
-- from 테이블명
-- where 조건식

select * from member;
insert into member(id, password, addr, name)
		values('zzz1111', '5678', '울산', '정자바');

select * from member;

select * from member where id='abcd1234';

update member
	set password='1234'
    where id='abcd1234';
    
select * from member;

update member
	set password='5678'
	where id='abcd1234';

select * from member;

update member
	set password='1234';
    
select * from member;

-- 아이디가 'abcd1234'인 데이터는 member 테이블에서 삭제
-- delete from 테이블명 
-- where 조건식

delete from member
	where id='abcd1234';

select * from member;


-- insert 여러개의 자료 한꺼번에 넣기

insert into member (id, password, addr)
values ('aaaa1234','8484','서울'),
	('bbbb222','9999','부산');
    
select * from member;

create table board(
	bno int auto_increment primary key,
    title varchar(30) not null,
    content varchar(100),
    writer varchar(20) not null,
    regdate datetime,
    cnt int(5),
    id varchar(100)
)

select * from board;

insert into board (bno, title, content, writer, cnt, id)
values (1,'안녕','운영진입니다.','운영진',1,'admin');

select * from board;
insert into board (title, content, writer, cnt, id)
values ('제목','내용 추가','정자바',2,'aaaa1234');

select * from board;

update board
set regdate = now()
where writer = '운영진';

select * from board;

update board
set regdate = now()
where writer = '정자바';

select * from board;

insert into board(title, content, writer, regdate, cnt, id)
values ('핸지짱','운동가기 귀찮아ㅠ','핸지쓰',now(),27,'hyeonji');

select * from board;
insert into board(title, content, writer, regdate, cnt, id)
values ('메롱','뭘바!','깡패',now(),17,'goast'),
	('오늘날씨가','짱습하네용','곤듀',now(),36,'공주');
    
select * from board;
delete from board
where writer='깡패';

select * from board;

alter table board auto_increment = 1;
select * from board;

update board
set cnt = '0';

select * from board;

delete from board
where bno=5;

select * from board;

update board
set regdate=sysdate();

select * from board;

alter table board modify column cnt int;

select * from board;

alter table board modify column cnt int default 0;

insert into board(title, content, writer, regdate, id)
	values ('오늘날씨가','짱습하네용','곤듀',now(),'공주');
    
select * from board;

use exam;

select * from member;

update member
set password = 5678, name='정씨샵'
where id='zzz1111';

select * from member;
select * from board;
update board
set id = 'zzz1111';

select * from board;

-- alter문으로 foreign key 설정
alter table board add constraint boardid_fk2
foreign key (id) references member(id)
on delete cascade -- 부모테이블 데이터 삭제시 자식테이블 데이터도 자동 삭제
on update cascade -- 부모테이블 데이터 변경시 자식테이블 데이터도 자동 변경
;

insert into board(title, content, writer, regdate, id)
values ('안녕','외래키테스트입니다.','메롱',now(),'zzz1111');

select * from member;

insert into board(title, content, writer, regdate, id)
values ('안녕2','외래키테스트입니다2','히히',now(),'bbbb222');

select * from board;

delete from member where id='bbbb222';

alter table board drop constraint boardid_fk;

alter table board add constraint boardid_fk
foreign key (id) references member(id)
on delete cascade -- 부모테이블 데이터 삭제시 자식테이블 데이터도 자동 삭제
on update cascade -- 부모테이블 데이터 변경시 자식테이블 데이터도 자동 변경
;

