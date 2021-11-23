create database student_management;
use student_management;

create table student(
`id` int,
`name` varchar(250),
`address` varchar(250)
);
insert into student values(1,"nam vuong","da nang");
insert into student values(2,"hoang nam vuong","quang binh");
update student set id = 0 where id = 1;
update student set id = 1 where id = 2;

create table Class(
`id` int,
`name` varchar(250)
);

create table Teacher(
`id` int,
`name` varchar(250),
`age` int auto_increment primary key,
`country` varchar(250)
);
-- --daluufile--  