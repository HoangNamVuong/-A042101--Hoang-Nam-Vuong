create database quan_li_sinh_vien;
use quan_li_sinh_vien;

create table class(
class_id int primary key,
class_name varchar(60) not null,
start_date datetime not null,
status_class bit
);

create table student(
student_id int primary key,
student_name varchar(30) not null,
address varchar(50),
phone varchar(30),
stautus_student bit,
class_id int not null,
foreign key(class_id)references class(class_id)
);

create table subject (
sub_id int auto_increment primary key,
sub_name varchar(30) not null,
credit tinyint not null default 1 check(credit >= 1),
status_sub bit default 1
);

create table mark(
mark_id int auto_increment primary key,
sub_id int not null,
student_id int not null,
mark float default 0 check (mark between 0 and 100),
exam_time tinyint default 1,
unique(sub_id, student_id),
foreign key(sub_id) references subject(sub_id),
foreign key(student_id) references student(student_id)
);

select * from class;
insert into class values (1,'a1','2008-10-20',1);
insert into class values (2,'a2','2009-10-10',1);
insert into class values (3,'a3','2008-1-26',1);

select * from student;
insert into student (student_id, student_name, address, phone, stautus_student, class_id) values (1, 'Hung', 'Ha Noi', '0912113113', 1, 1);
insert into student (student_id, student_name, address, phone, stautus_student, class_id) values (2, 'nam', 'da nang', '0918983113', 1, 2);
select * from subject;
insert into subject
 VALUES (1, 'CF', 5, 1),
        (2, 'C', 6, 1),
        (3, 'HDJ', 5, 1),
        (4, 'RDBMS', 10, 1);
select * from mark;
insert into mark (mark_id,sub_id,student_id,exam_time) values (2,2,2,4);


