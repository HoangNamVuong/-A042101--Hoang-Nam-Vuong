create database furama_resort;
use furama_resort;

create table kieu_thue(
id_kieu_thue int auto_increment primary key,
ten_kieu_thue varchar(45),
gia int
);

create table loai_dich_vu(
id_loai_dich_vu int auto_increment primary key,
ten_loai_dich_vu varchar(45)
);

create table dich_vu(
id_dich_vu int auto_increment primary key,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai varchar(45),
foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu)
);

create table vi_tri(
id_vi_tri int auto_increment primary key,
ten_vi_tri varchar(45)
);

create table trinh_do(
id_trinh_do int auto_increment primary key,
ten_trinh_do varchar(45)
);

create table bo_phan(
id_bo_phan int auto_increment primary key,
ten_bo_phan varchar(45)
);

create table nhan_vien(
id_nhan_vien int auto_increment primary key,
ho_ten int,
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
so_cmnd varchar(45),
luong varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_vi_tri) references vi_tri(id_vi_tri),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_bo_phan) references bo_phan(id_bo_phan)
);










