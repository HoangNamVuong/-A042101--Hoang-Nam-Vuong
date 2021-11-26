create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
customer_id int auto_increment primary key,
customer_name varchar(50) not null,
customer_age int
);
create table orders(
order_id int auto_increment primary key,
customer_id int not null,
foreign key(customer_id) references customer(customer_id),
order_date datetime,
order_total_price varchar(50)
);
create table product(
product_id int auto_increment primary key,
product_name varchar(50),
product_price varchar(50)
);
create table order_detail(
order_id int not null,
product_id int not null,
order_detail_qty int not null,
foreign key(order_id) references orders(order_id),
foreign key(product_id) references product(product_id)
);
select * from customer;
insert into customer(customer_id,customer_name,customer_age) value (1, 'Minh Quan', 10);
insert into customer(customer_id,customer_name,customer_age) value (2, 'Ngoc Oanh', 20);
insert into customer(customer_id,customer_name,customer_age) value (3, 'Hong Ha', 50);
insert into customer(customer_id,customer_name,customer_age) value (6, 'new', 50);
select * from orders;
insert into orders(order_id,customer_id,order_date,order_total_price) values(1, 1, '2008-10-20', null);
insert into orders(order_id,customer_id,order_date,order_total_price) values(2, 2, '2008-10-2', null);
insert into orders(order_id,customer_id,order_date,order_total_price) values(3, 1, '2008-10-10', null);
select * from product;
insert into product(product_id,product_name,product_price) value (1, 'may giat', 3);
insert into product(product_id,product_name,product_price) value (2, 'dieu hoa', 5);
insert into product(product_id,product_name,product_price) value (3, 'tu lanh', 7);
insert into product(product_id,product_name,product_price) value (4, 'quat', 1);
insert into product(product_id,product_name,product_price) value (5, 'bep dien', 2);
select * from order_detail;
insert into order_detail(order_id,product_id,order_detail_qty) value (1, 3, 3);
insert into order_detail(order_id,product_id,order_detail_qty) value (1, 1, 7);
insert into order_detail(order_id,product_id,order_detail_qty) value (2, 3, 2);
insert into order_detail(order_id,product_id,order_detail_qty) value (3, 1, 1);
insert into order_detail(order_id,product_id,order_detail_qty) value (2, 1 ,8);
insert into order_detail(order_id,product_id,order_detail_qty) value (1, 5, 4);

select*from orders;
select*from product;
select*from customer;
select*from order_detail;
select * from customer as c join orders as o on c.customer_id = o.order_id join product as p on o.order_id = p.product_id;
select orders.order_id, orders.order_date, orders.order_total_price from orders;
select c.customer_name, p.product_name from customer as c  join orders as o on c.customer_id = o.order_id join product as p on o.order_id = p.product_id;
select c.customer_name from customer as c left join orders as o on c.customer_id = o.order_id where o.customer_id is null;





