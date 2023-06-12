-- SQL dialect(방언) is not configured

-- DDL
-- create table : 새로운 table 를 db에 추가

-- create table table_name(
--    column_name_1 integer,
--     column_name_2 integer,
--     column_name_3 integer,
--     ...
-- );

-- id, name, email
create table students (
    id integer,
    name varchar(32),
    email text
);

-- id, username, first_name, last_name, email
create table students_2 (
    id integer,
    username text,
    first_name text,
    last_name text,
    email text
);

-- Constraints
-- not null constraint
create table students_not_null (
    id integer,
    username text,
    first_name text,
    last_name text,
    email text not null -- email 은 null 이 될 수 없다
);

-- Unique Constraint
create table students_unique (
    id integer,
    username text unique, -- username 은 Record 별로 고유하다
    first_name text,
    last_name text,
    email text
);

-- PK + Auto_Increment
create table students_pka (
    --id integer primary key, -- 기본키 설정
    id integer primary key autoincrement, -- 기본키 설정과 중복되지 않도록 설정
    username text,
    first_name text,
    last_name text,
    email text
);

-- Final
create table students (
    id integer primary key autoincrement,
    username text unique,
    first_name text,
    last_name text,
    email text not null
);

-- Alter Table
-- Rename To
alter table students_2 rename to students_3;
alter table students_3 rename to students_2;

-- Rename Column
alter table students_2 rename column first_name to given_name; -- given_name
alter table students_2 rename column given_name to first_name; -- first_name
alter table students_2 rename column last_name to sur_name; -- sur_name
alter table students_2 rename column sur_name to last_name; -- last_name

-- Add Column
alter table students_2 add column phone varchar(64); -- null 도 가능함
alter table students_2 add column phone_2 varchar(64) not null; -- 기본값이 없음[null 불가능]
alter table students_2 add column phone_3 varchar(64) not null DEFAULT ''; -- 기본값을 빈 문자열로 준다[null 불가능]

-- Drop Column
alter table students_2 drop column phone_3; -- 완전 삭제(Column)

-- Drop Table
drop table students_2; -- 완전 삭제(table)
drop table if exists students_2; -- 존재하면 삭제

