create database bootcamp_exercise1;

use bootcamp_exercise1;

create table regions (
  region_id int primary key,
  region_name varchar(25)
);

create table countries (
  country_id varchar(2) primary key,
  country_name varchar(40),
  region_id int not null,
  foreign key (region_id) references regions(region_id)
);

create table locations (
  location_id int primary key,
  street_address varchar(25),
  postal_code varchar(12),
  city varchar(30),
  state_province varchar(12),
  country_id varchar(2) not null,
  foreign key (country_id) references countries(country_id)
);

create table departments (
  department_id int primary key,
  deparment_name varchar(30),
  manager_id int,
  location_id int,
  foreign key (location_id) references locations(location_id)
);

create table employees (
  employee_id int primary key,
  first_name varchar(20),
  last_name varchar(25),
  email varchar(25),
  phone_number varchar(20),
  hire_date date,
  job_id varchar(10),
  salary decimal(7, 2),
  commission_pct decimal(7, 2),
  manager_id int,
  department_id int
);
alter table employees add constraint fk_department_id foreign key (department_id) references departments(department_id);

create table jobs (
	job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary decimal(7, 2),
    max_salary decimal(7, 2)
);

create table job_history (
	employee_id int not null,
    start_date date not null,
    primary key (employee_id, start_date),
    foreign key (employee_id) references employees(employee_id),
    end_date date not null,
    job_id varchar(10),
    department_id int
);
alter table job_history add constraint fk_job_id foreign key (job_id) references jobs(job_id);

insert into regions values
(1, 'Europe'), (2, 'Northern America'), (3, 'Asia'), 
(4, 'Africa'), (5, 'Southern America'), (6, 'Oceania')
;

insert into countries values
('DE', 'Germany', 1), ('IT', 'Italy', 1), ('GB', 'Britain', 1), ('FR', 'France', 1), 
('JP', 'Japan', 3), ('CN', 'China', 3), ('IN', 'India', 3),
('US', 'United States', 2),  ('CD', 'Canada', 2), ('MX', 'Mexico', 2)
;

insert into departments values
(10, 'Administration', 200, 1100),
(20, 'Marketing', 201, 1200),
(30, 'Purchasing', 202, 1400),
(40, 'IT', 203, 1300),
(50, 'HR', 204, 1500)
;

insert into jobs values
('ST_CLERK', 5,000.00, 60,000.00), 
('MK_REP', 8,000.00, 50,000.00), 
('PR_REP', 5,000.00, 70,000.00), 
('IT_PROG', 10,000.00, 80,000.00), 
('HR_MNG', 10,000.00, 60,000.00)
;

insert into employees values
(100, 'Steven', 'King', 'sking@xx.com', '515-1234567', '1987-06-17', 'ST_CLERK', 24000.00, 0.00, 200, 10),
(101, 'Neena', 'Kochhar', 'nko@xx.com', '515-1234568', '1987-06-18', 'MK_REP', 17000.00, 0.00, 201, 20),
(102, 'Lex', 'De Haan', 'dh@xx.com', '515-1234569', '1987-06-19', 'PR_REP', 17000.00, 0.00, 203, 30),
(103, 'Alexander', 'Hunold', 'alx@xx.com', '590-4234567', '1987-06-20', 'MK_REP', 9000.00, 0.00, 201, 20),
(104, 'Hugo', 'Joshua', 'hg@xx.oom', '540-8834567', '1998-01-15', 'IT_PROG', 30000.00, 0.00, 203, 40),
(105, 'Jane', 'Elaine', 'je@xx.com', '567-9534598', '2005-11-07', 'HR_MNG', 28000.00, 0.00, 204, 50)
;

select * from employees;



