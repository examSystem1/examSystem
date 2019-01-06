use examSystem;
create table user(
Uno char(8) not null primary key,
name varchar(255) not null,
password varchar(255) not null,
role enum("1","2")
);

create table course(
Cno varchar(255) not null primary key,
Cname varchar(255) not null
);
INSERT INTO `examsystem`.`course` (`Cno`, `Cname`) VALUES ('1', ' 数据库');
INSERT INTO `examsystem`.`course` (`Cno`, `Cname`) VALUES ('2', '操作系统');
create table CouChoose(
id int not null auto_increment primary key,
Cno varchar(255) not null,
Uno char(8) not null,
foreign key (Uno) references user(Uno),
foreign key (Cno) references course(Cno)
);

create table exam(
Eno int not null auto_increment primary key,
Ename varchar(255) not null,
Cno varchar(255) not null,
Uno char(8) not null,
beginDate date,
endDate date,
Etime int,
foreign key (Uno) references user(Uno),
foreign key (Cno) references course(Cno)
);

create table  topic(
id int not null auto_increment primary key,
Tname varchar(255) not null,
choice varchar(2555) not null,
answer  varchar(255) not null,
Cno varchar(255) not null,
foreign key (Cno) references course(Cno)
);