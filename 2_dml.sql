select count(*) from users;

-- select * from users
-- select column_1, column_2, ..., column_n
-- from table_name;
-- id, first_name, last_name, age, balance, phone, email, country
select first_name, age
from users;

select first_name, last_name, age
from users;

-- 이름, 나이, 잔고(balance), 전화번호를 출력하는 select 문 작성하기
select first_name, last_name, age, balance, phone
from users;

-- Distinct : 중복없이 조회할때 사용함
select distinct country
from users;

select distinct first_name
from users;

-- Distinct 에 두개의 Column 을 작성하면 어떻게 될까?
select distinct first_name, last_name
from users;

-- Order by : 정렬한다는 의미
select first_name, age, balance
from users
order by first_name; -- first_name 기준으로 정렬하겠다는 의미임

-- Desc : 내림차순 정렬의 의미
select last_name, balance
from users
order by balance desc;

-- Order by 에 2가지 이상의 column 을 지정하면?
select first_name, last_name, balance, age
from users
order by balance desc , age desc;

-- Where : 조건을 덧붙일 때
-- 지원 : = != > < >= <=
select *
from users
where age >= 30;

select *
from users
where age < 30;

-- 40 이상 50 미만[AND]
select *
from users
where age >= 40 and age < 50;

-- 30 미만 60 이상[OR]
select *
from users
where age < 30 or age >= 60;

-- Where 문자열 Like : 특정한 패턴을 포함하거나 포함하지 않고 싶을 때 사용
-- email 이 naver.com 인 계정만 조회
select *
from users
where email
like '%naver.com'; -- % : 기호를 사용하면, 0개 이상의 문자와 일치한다고 가정합니다

select id, first_name, phone
from users
where phone
like '010%';

-- Not Like
select id, first_name, phone
from users
where phone
not like '010%';

