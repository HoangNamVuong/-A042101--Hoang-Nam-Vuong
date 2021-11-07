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
ho_ten varchar(45),
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
select*from nhan_vien;

create table loai_khach(
id_loai_khach int auto_increment primary key,
ten_loai_khach varchar(45)
);

create table khach_hang(
id_khach_hang int auto_increment primary key,
id_loai_khach int,
ten_khach_hang varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_loai_khach) references loai_khach(id_loai_khach)
);

create table dich_vu_di_kem(
id_dich_vu_di_kem int auto_increment primary key,
ten_dich_vu_di_kem varchar(45),
gia_tien int,
don_vi int,
trang_thai_kha_dung varchar(45)
);

create table hop_dong(
id_hop_dong int auto_increment primary key,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int,
foreign key(id_nhan_vien)references nhan_vien(id_nhan_vien),
foreign key(id_khach_hang)references khach_hang(id_khach_hang),
foreign key(id_dich_vu)references dich_vu(id_dich_vu)
);

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int auto_increment primary key,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
foreign key(id_hop_dong)references hop_dong(id_hop_dong),
foreign key(id_dich_vu_di_kem)references dich_vu_di_kem(id_dich_vu_di_kem)
);

-- 1 add value for table --
insert into vi_tri(id_vi_tri, ten_vi_tri)
values('1','Lễ tân'),
('2','Phục vụ'),
('3','Chuyên viên'),
('4','Giám sát'),
('5','Quản lý'),
('6','Giám đốc');

insert into bo_phan(id_bo_phan, ten_bo_phan)
values('1','Sale-Marketing'),
('2','Hành chính'),
('3','Phục vụ'),
('4','Quản lý');

insert into trinh_do(id_trinh_do, ten_trinh_do)
values('1','Trung cấp'),
('2','Cao đẳng'),
('3','Đại học'),
('4','Sau đại học');

insert into nhan_vien(id_nhan_vien, ho_ten, id_vi_tri, id_trinh_do, id_bo_phan, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi)
values('1','Nguyễn van Hoai','1','1','1','1992-06-29','12345689','700000','0916309250','hoai1992@gmail.com','Quảng bình'),
('2','Nguyễn Văn Sang','2','2','2','1998-03-07','12345689','700000','0916309250','nguyen@gmail.com','Quảng bình'),
('3','Ngô Thị Hoài Anh','3','3','3','1999-03-08','12345689','700000','0916309250','thu@gmail.com','Đăk-Lăk'),
('4','Lý Thuỳ Trang','4','4','4','1999-03-09','12345689','700000','0916309250','trang@gmail.com','Long an'),
('5','Trương Quang Hai','4','4','4','1999-03-09','12345689','700000','0916309250','hai@gmail.com','Quảng Ngãi'),
('6','Trần Thị Huệ','4','4','4','1999-03-09','12345689','700000','0916309250','trang@gmail.com','Quảng nam');

insert into loai_khach(id_loai_khach, ten_loai_khach)
values('1','Diamond'),
('2','Platinium'),
('3','Gold'),
('4','Silver'),
('5','Member');

insert into khach_hang(id_khach_hang, id_loai_khach, ten_khach_hang, ngay_sinh, so_cmnd, so_dien_thoai, email, dia_chi)
values('1','1','Nguyễn thị thanh','1997-03-15','123456789','0916309250','thanh@gnail.com','Đà nẵng'),
('2','4','Nguyễn văn thịnh','1999-03-15','123456789','0916309250','thinh@gnail.com','Quảng ngãi'),
('3','2','Hoàng hồng','2001-08-15','123456789','0916309250','hong@gnail.com','Quảng bình'),
('4','3','Ngô thị mỹ duyên','1998-03-15','123456789','0916309250','duyen@gnail.com','Quảng bình'),
('5','1','Nguyễn thị thu thủy','1985-11-15','123456789','0916309250','thuy@gnail.com','Đà nẵng'),
('6','1','Hồng','1997-03-15','123456789','0916309250','thanh@gnail.com','Đà nẵng'),
('7','4','Khánh','1999-03-15','123456789','0916309250','thinh@gnail.com','Quảng ngãi'),
('8','4','Thu','1999-03-15','123456789','0916309250','thinh@gnail.com','Quảng ngãi'),
('9','2','Hồng','1999-03-15','325545','5454545','tanh@gnail.com','Quang binh'),
('10','1','Nguyễn thị thanh','1997-03-15','123456789','0916309250','thanh@gnail.com','Vinh'),
('11','1','Nguyễn văn thịnh','1999-03-15','123456789','0916309250','thinh@gnail.com','Quảng ngãi'),
('12','1','Hoàng hồng','2001-08-15','123456789','0916309250','hong@gnail.com','Quảng ngãi');

insert into Loai_dich_vu(id_loai_dich_vu, ten_loai_dich_vu)
values('1','Villa'),
('2','House'),
('3','Room');

insert into kieu_thue(id_kieu_thue, ten_kieu_thue, gia)
values('1','Năm','500000'),
('2','Tháng','200000'),
('3','Ngày','10000'),
('4','Giờ','500');

insert into dich_vu
values('1','Villa 1','500','2','6','50000','1','2','còn phòng'),
('2','house1','500','2','6','50000','2','3','còn phòng'),
('3','Villa 2','500','2','6','50000','1','2','còn phòng'),
('4','Room1','500','2','6','50000','3','3','còn phòng'),
('5','house 2','500','2','6','50000','2','2','còn phòng'),
('6','Villa 3','500','2','6','50000','1','2','còn phòng');

insert into dich_vu_di_kem
values('1','Massage',200,'người','còn trống'),
('2','Karaoke',50,'giờ','còn trống'),
('3','Thức ăn',70,'Phần','còn'),
('4','Nước uống',15,'ly','còn'),
('5','Tham quan',200,'người','còn trống');

insert into	hop_dong
values('1','1','1','1','2021-11-02','2021-11-07','5005','700000'),
('2','4','4','3','2021-11-02','2021-11-07','5005','700000'),
('3','2','2','2','2021-11-02','2021-11-07','5005','700000'),
('4','5','3','1','2021-11-02','2021-11-07','5005','700000');

insert into hop_dong_chi_tiet
values('1','1','2','3'),
('2','2','3','3'),
('3','3','1','5'),
('4','4','4','4');

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select * from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'T%') and length(ho_ten < 15);

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
where((year(curdate()) - year(ngay_sinh) > 18) and (year(curdate()) - year(ngay_sinh) < 50 )and (dia_chi like 'Đà Nẵng' or 'Quảng Trị'));


-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng,
--      Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select * from khach_hang join hop_dong_chi_tiet join loai_khach;
select k.id_khach_hang, k.ten_khach_hang, h.so_luong, l.ten_loai_khach from khach_hang as k join hop_dong_chi_tiet as h join loai_khach as l
where l.ten_loai_khach = 'Diamond'
group by h.so_luong
order by count(so_luong);

















