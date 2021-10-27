create database quan_ly_diem_thi;
use  quan_ly_diem_thi;

create table hoc_sinh(
id_hs varchar(20) primary key,
name_hs varchar(50), 
birthday_hs datetime,
class_hs varchar(20)
);

create table mon_hoc(
id_mh varchar(20) primary key,
name_mh varchar(50)
);

create table bang_diem(
id_hs varchar(20),
id_mh varchar(20),
diem_thi int,
ngay_kt datetime,
primary key(id_hs,id_mh),
foreign key(id_hs) references hoc_sinh(id_hs),
foreign key(id_mh) references mon_hoc(id_mh)
);

create table giao_vien(
id_gv varchar(50) primary key,
name_gv varchar(50),
phone_gv varchar(50)
);

select * from mon_hoc;
alter table mon_hoc add id_gv varchar(50);
alter table mon_hoc add constraint fk_id_gv foreign key(id_gv) references giao_vien(id_gv);



