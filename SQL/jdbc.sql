-- Active: 1768356546460@@127.0.0.1@3306
create database bootcamp_db;

use bootcamp_db;
use bootcamp_2512;

create table students (
  id int primary key auto_increment,
  name varchar(50),
  email varchar(100)
);

select * from students;

insert into students values (1, "Alex", "alex@xx.com");