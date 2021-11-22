create database product_manager;
use product_manager;

create table danh_muc(
id_danh_muc int primary key,
ten_danh_muc varchar(250)
);

create table product(
id_san_pham int auto_increment primary key,
ten varchar(250),
gia varchar(250),
so_luong varchar(250),
mau_sac varchar(250),
mo_ta varchar(250),
id_danh_muc int(250),
foreign key(id_danh_muc) references danh_muc(id_danh_muc)
);