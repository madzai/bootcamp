create database bootcamp_db;

use bootcamp_db;

create table students (
  id int primary key auto_increment,
  name varchar(50),
  email varchar(100)
);

select * from students;

insert into students values (1, "Alex", "alex@xx.com");