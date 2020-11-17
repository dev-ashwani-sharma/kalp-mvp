create table customers
( id integer primary key ,
  name varchar(255),
  address varchar(1024),
  dob date,
  phone varchar(20),
  email varchar(128),
  type varchar(255), /* Daily/weekly/Monthly/Quaterly/Yearly */
  creation_date timestamp,
  updation_date timestamp,
  created_by varchar(255)
);

create table products
(
id integer primary key,
name varchar(255),
price decimal(12,2),
category_id integer,
description varchar(5000),
creation_date timestamp,
updation_date timestamp,
created_by varchar(255)
);



create table orders
(
id integer primary key,
customer_id integer,
type varchar(20),
amount decimal(12,2),
is_paid char(01),
start_date date,
end_date date,
description varchar(5000),
creation_date timestamp,
updation_date timestamp,
created_by varchar(255),
constraint fk_customer_id
	foreign key(customer_id)
	references customers(id)
);


create table order_details
(
id integer primary key,
order_id integer,
product_id integer,
units integer,
order_date date,
amount decimal(12,2),
description varchar(5000),
creation_date timestamp,
updation_date timestamp,
created_by varchar(255),
	constraint fk_order_id
	foreign key(order_id)
	references orders(id),
constraint fk_product_id
	foreign key(product_id)
	references products(id)
);


create table employee(
id integer primary key,
name varchar(255),
designation varchar(255),
join_date date,
contact varchar(20),
address varchar(1024),
description varchar(5000),
creation_date timestamp,
updation_date timestamp,
created_by varchar(255)
);


create table expense(
id integer primary key,
employee_id integer,
supplier_id integer,
name varchar(50),
amount decimal(12,2),
date date,
description varchar(5000),
creation_date timestamp,
updation_date timestamp,
created_by varchar(255),
constraint fk_employee_id
foreign key(employee_id)
	references employee(id)
);





