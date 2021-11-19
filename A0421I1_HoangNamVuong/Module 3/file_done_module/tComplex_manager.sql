create database tComplex_manager;
use tComplex_manager;

create table trang_thai(
id_trang_thai int primary key,
kieu_trang_thai varchar(250)
);

create table loai_mat_bang(
id_loai_mat_bang int primary key,
kieu_mat_bang varchar(250)
);

create table so_tang(
id_so_tang int primary key,
ten_tang varchar(250)
);

create table tComplex(
id_mat_bang int auto_increment primary key,
ma_mat_bang varchar(250),
dien_tich varchar(250),
id_trang_thai int(250),
id_so_tang int,
id_loai_mat_bang int(250),
gia_tien varchar(250),
ngay_bat_dau date,
ngay_ket_thuc date,
foreign key(id_trang_thai) references trang_thai(id_trang_thai),
foreign key(id_so_tang) references so_tang(id_so_tang),
foreign key(id_loai_mat_bang) references loai_mat_bang(id_loai_mat_bang)
);

select * from tComplex;

DELIMITER $$
create procedure edit_tComplex_by_id(in p_id_mat_bang int, in p_ma_mat_bang varchar(50),in p_dien_tich varchar(50),in p_id_trang_thai int(250),in p_id_so_tang int,
                                         in id_loai_mat_bang int(250),in gia_tien varchar(250),in ngay_bat_dau date, in p_point int,in ngay_ket_thuc date)
begin
update tComplex 
set ma_mat_bang = p_ma_mat_bang, dien_tich = p_dien_tich, id_trang_thai = p_id_trang_thai, id_so_tang = p_id_so_tang, id_loai_mat_bang = id_loai_mat_bang,
    gia_tien = gia_tien, ngay_bat_dau = ngay_bat_dau, ngay_ket_thuc = ngay_ket_thuc
where id_mat_bang = p_id_mat_bang;
end $$
DELIMITER ;

insert into trang_thai values(1, "Trong");
insert into trang_thai values(2, "Ha tang");
insert into trang_thai values(3, "Day du");

insert into loai_mat_bang values(1, "Van phong chia se");
insert into loai_mat_bang values(2, "Van phong tron goi");

insert into so_tang values(1, "1");
insert into so_tang values(2, "2");
insert into so_tang values(3, "3");
insert into so_tang values(4, "4");
insert into so_tang values(5, "5");
insert into so_tang values(6, "6");
insert into so_tang values(7, "7");
insert into so_tang values(8, "8");
insert into so_tang values(9, "9");
insert into so_tang values(10, "10");
insert into so_tang values(11, "11");
insert into so_tang values(12, "12");
insert into so_tang values(13, "13");
insert into so_tang values(14, "14");
insert into so_tang values(15, "15");


 