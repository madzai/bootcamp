use bootcamp_2512;

-- auto_increment -> find the max and then + 1
create table regions1 (
	region_id integer primary key auto_increment,
	region_namem varchar(25)
);

create table countries1 (
	country_id varchar(2) primary key,
    country_name varchar(40),
    region_id integer not null,
    foreign key (region_id) references regions1(region_id)
);

create table locations1 (
	location_id integer primary key auto_increment,
    street_address varchar(25),
    postal_Code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id varchar(2) not null,
    foreign key (country_id) references countries1(country_id)
);

create table departments1 (
	department_id integer primary key auto_increment,
    department_name varchar(30),
    manager_id integer,
    location_id integer not null,
    foreign key (location_id) references locations1(location_id)
);

create table jobs1 (
	job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary integer,
    max_salary integer
);

create table employees1 (
	employee_id integer primary key auto_increment,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25),
    phone_number varchar(20),
    hire_date date,
    job_id varchar(10) not null,
    salary decimal(8,2),
    commission_pct decimal(8,2),
    manager_id integer,
    department_id integer not null,
    foreign key (job_id) references jobs1(job_id),
    foreign key (department_id) references departments1(department_id)
);

create table job_history1 (
	employee_id integer,
    start_date date,
    end_date date,
	job_id varchar(10) not null,
    department_id integer not null,
    primary key(employee_id, start_date), 
    foreign key (employee_id) references employees1(employee_id),
    foreign key (job_id) references jobs1(job_id),
    foreign key (department_id) references departments1(department_id)
);

insert into regions1 values (1, 'ABC');
insert into countries1 values ('UK', 'XXX', 1);
insert into countries1 values ('US', 'YYY', 1);
insert into locations1 values (1, 'XXX', 'TTTT', 'VVV', 'KKK', 'UK');

insert into departments1 values (1, 'IT', 2, 1);
insert into departments1 values (2, 'HR', 3, 1);

insert into jobs1 values ('DEV', 'DEVELOPER', 20000, 40000);
insert into jobs1 values ('DEV_M', 'DEVELOPER MANAGER', 30000, 60000);
insert into jobs1 values ('RECR', 'RECRUITER', 18000, 25000);
insert into jobs1 values ('RECR_M', 'RECRUITER MANAGER', 30000, 45000);

insert into employees1 values (1, 'John', 'Lau', 'xxx', '123456', '2000-01-31', 'DEV', 30000, 0, 2, 1);
insert into employees1 values (2, 'Mary', 'Wong', 'yyy', '23123', '2002-12-31', 'DEV_M', 50000, 0, null, 1);
insert into employees1 values (3, 'Steve', 'Chan', 'www', '5555', '2019-02-28', 'RECR_M', 40000, 0, null, 2);
insert into employees1 values (4, 'Kelly', 'Lau', 'vvv', '21321222', '1999-03-09', 'RECR', 19000, 0, 3, 2);

select * from employees1;