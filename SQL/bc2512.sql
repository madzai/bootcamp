-- SQL, case-insensitive

create database bootcamp_2512;

use bootcamp_2512;

create table customers (
  id int,
  first_name varchar(50),
  last_name varchar(50),
  dob date
);

select * from customers;

select * 
from customers
where last_name = 'Lau'
;

insert into customers (id, first_name, last_name, dob) values (1, 'Steven', 'Lau', '2000-01-31');
insert into customers (id, first_name, last_name, dob) values (2, 'Sally', 'Wong', '1995-12-20');
insert into customers (id, first_name, last_name, dob) values (3, 'Oscar', 'Lau', '1993-09-30');

-- Delete row(s) 
delete from customers where id = 2;

-- String Function (static)
select *
from customers
where instr(first_name, 'e') > 0;

select instr(first_name, 's')
from customers;

select first_name, instr(first_name, 'e')
from customers;

select last_name, instr(last_name, 'n')
from customers;

-- where -> AND OR
-- * means all columns
select first_name, last_name
from customers
where length(first_name) > 5 and length(last_name) = 3;

select first_name, last_name
from customers
where length(first_name) > 5 or length(last_name) = 3;

-- Alias
select c.id as customer_id, c.*
from customers c
where c.dob > '1995-10-30'; 

-- Row x Column
-- SQL Select Step:
-- 1. From (join table)
-- 2. where (condition) -> filter rows
-- 3. select column to read

-- orders (id, amount, order_datetime, order_no, payment_type)
create table orders (
	id integer,    
    order_datetime datetime,
    order_no varchar(30),
    payment_type integer,
    amount decimal(8, 2)
);

-- add column to table, the new columnn will be with null values
alter table customers add smoker varchar(1);
alter table customers modify first_name varchar(80);
select * from customers;

-- update column
update customers set smoker = 'Y' where id = 1;
update customers set smoker = 'N' where id = 3;

drop table orders;

select * from orders;

delete from orders;
truncate orders;

delete from orders
where id = 2;

-- insert row
insert into orders (id, order_datetime, order_no, payment_type, amount)
values (1, '2022-10-05 23:30:22', 'A20201005000001', 1, 990000.99);

-- Should be error, but trimmed automatically
-- insert into orders (id, order_datetime, order_no, payment_type, amount)
-- values (1, '2022-10-05 23:30:22', 'A20201005000001', 1, 990000.991);

-- rejected 
-- insert into orders (id, order_datetime, order_no, payment_type, amount)
-- values (1, '2022-10-05 23:30:22', 'A20201005000001', 1, 9900000.99);

insert into orders (id, order_datetime, order_no, payment_type, amount)
values (2, '2021-06-30 15:10:00', 'A2021063000002', 2, 100.09);

insert into orders (id, order_datetime, order_no, payment_type, amount)
values (3, '2023-09-21 10:35:00', 'A2023092100003', 1, 4500.20);

insert into orders (id, order_datetime, order_no, payment_type, amount)
values (4, '2014-07-31 20:35:00', 'A2014073100004', 3, 5000.00);

-- any type to varchar OK
insert into orders (id, order_datetime, order_no, payment_type, amount)
values (6, '2014-05-14 08:15:00', 23, 1, 500.00);

-- Another way to insert (need to include all fields)
insert into customers values (4, 'Leo', 'Chan', '2001-04-08', 'N');

-- more than one row
insert into customers
values (5, 'John', 'Lau', '2011-09-28', 'N')
, (6, 'Alex', 'Chan', '2012-05-12', 'Y');

select * from customers;

-- Find Smoker and last_name Chan, show first_name and dob
select c.first_name, c.dob 
from customers c
where c.smoker = 'Y' 
and c.last_name = 'Chan';

-- min, max, sum, avg, count -> return one row as result
select min(amount), max(amount), sum(amount), avg(amount), count(1), count(*), count(amount), count(id), max(id)
from orders;

select o.*, 1
from orders o;

select * from orders;

select sum(o.amount) as total_amount, 
	min(o.amount) as min_amount, 
	max(o.amount) as max_amount, 
	count(o.amount) as order_count,
	avg(o.amount) as avg_amount  -- Step 2
from orders o
where o.amount > 1000; -- Step 1

select * from customers;

alter table customers add district varchar(2); -- HK, KL, NT
update customers set district = 'HK' where id < 4;
update customers set district = 'NT' where id = 4;
update customers set district = 'KL' where id > 4;

-- group by
select district, max(dob) as youngest
from customers
group by district;

select c.*, timestampdiff(YEAR, c.dob, now()) as age
from customers c;

-- smoker (avg)
select smoker, avg(timestampdiff(YEAR, dob, now())) as average_age, count(1)
from customers
group by smoker;

-- Postgresql -> age()

-- Where (Filter data) - Step 1
-- Group by + Having (Filter Group) - Step 2
select smoker, sum(timestampdiff(YEAR, dob, now())) as sum_age, count(1)
from customers
where dob >= '2000-01-01'
group by smoker
having min(timestampdiff(YEAR, dob, now())) <= 13;

-- if else
select case when c.smoker = 'Y'
			then 'SMOKER'
            else 'NON-SMOKER'
		end as smoker_label,
        c.*
from customers c;

-- Departments (id, dept_name, dept_code)
-- Employees (id, e_name, dept_code, salary, gender)

-- group by dept_code + having ...
-- group by gender + having ...

create table departments (
	id int,
    dept_name varchar(50),
    dept_code varchar(2)
);

create table employees (
	id int,
    e_name varchar(50),
    dept_code varchar(2),
    salary decimal(8, 2),
    gender varchar(1)
);

insert into departments
values (1, 'Infomration Technology', 'IT'),
(2, 'Human Resources', 'HR'),
(3, 'Marketing', 'MK'),
(4, 'Administration', 'AD'),
(5, 'Accounting', 'AC');

insert into employees
values 
(1, 'John', 'IT', 18000.00, 'M'),
(2, 'Mary', 'HR', 51000.00, 'F'),
(3, 'Kelly', 'HR', 42000.00, 'F'),
(4, 'Victoria', 'IT', 23000.00, 'F'),
(5, 'Jenny', 'MK', 20000.00, 'F');

select * from departments;
select * from employees;

drop table departments;
drop table employees;

truncate departments;
truncate employees;

select dept_code, gender, max(id), avg(salary), max(salary), count(1)
from employees
group by dept_code, gender;

-- group by gender + having ...
select distinct gender, dept_code
from employees;

-- Join (One-to-Many)
select * from customers;
select * from orders;

-- Add customer_id in table orders
alter table orders add customer_id int;
update orders set customer_id = 1 where id < 3;
update orders set customer_id = 2 where id > 2 and id < 5;
update orders set customer_id = 3 where id > 4;
-- update orders set customer_id = 4 where id = 4;
-- update orders set customer_id = 5 where id = 5;
-- update orders set customer_id = 6 where id = 6;

-- INNER JOIN
select c.*, o.* from customers c inner join orders o;

-- Customers who have orders (Customer + Order Data)
select 
    c.id as customer_id,
    c.first_name as cust_first_name,
    c.last_name as cust_last_name,
    o.order_no as order_no,
    o.amount as order_amount,
    c.smoker as smoker,
    c.district as district
from customers c inner join orders o on o.customer_id = c.id;

-- Customers who have no order (Customer data)
-- Not Exist
select c.*
from customers c
where not exists (select 1 from orders o where o.customer_id = c.id);

-- Customers who have orders + Customers who have no order (customers who have null order details)
select c.*, o.*
from customers c left join orders o on o.customer_id = c.id;

-- In this case, right join === inner join (non-nullable one-to-many)
select c.*, o.*
from customers c right join orders o on o.customer_id = c.id;

-- Exists
select c.*
from customers c
where exists (select * from orders o where o.customer_id = c.id);


-- One-to-One (User Login + Profile)
-- One-to-Many (Customer + Order) (Post + Comment) (Department + Employee) 
	-- a. Nullable: (Adopter + Pet)
    -- b. Non-nullable: (Customer + Order) (Post + Comment) (Department + Employee)
-- Many-to-Many (Student + Subject) (Doctor + Hospital) (Teams + Users) (Book Authors)


-- Foreign Key -> ensure the value exists in another table

-- Primary Key
create table authors (
    id int primary key,
    name varchar(20)
);

create table books (
    id int primary key,
    name varchar(100),
    bar_code varchar(50),
    author_id int not null,
    foreign key (author_id) references authors(id)
);

select * from authors;
select * from books;

insert into authors values (1, 'J K Rowling');
insert into authors values (2, 'Stephen King');
insert into authors values (3, 'Stephen Hawking');
insert into books values (1, 'Harry Potter 1', 'HP1', 1);
insert into books values (2, 'Harry Potter 2', 'HP2', 1);
insert into books values (3, 'Harry Potter 3', 'HP3', 1);
insert into books values (4, 'A Brief History of Time', 'ABHOF_sh', 3);
insert into books values (5, 'The Shining', 'TS_sk', 2);
insert into books values (6, 'It', 'IT_sk', 2);
insert into books values (7, 'The Mist', 'TM_sk', 2);