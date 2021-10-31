create database products_demo;
use products_demo;
create table products(
id int primary key,
product_code varchar(50),
product_name varchar(50),
product_price varchar(50)
);

insert into products(id, product_code, product_name, product_price) values (1, 'h1','computer', '10');
insert into products(id, product_code, product_name, product_price) values (3, 'h3','calculator', '16');
insert into products(id, product_code, product_name, product_price) values (2, 'h2','car', '111');

select * from products;

create unique index id_index on products(id);
create index composite_index on products(product_name, product_price);
explain select*from products;

