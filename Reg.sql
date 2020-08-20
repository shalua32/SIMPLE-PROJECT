create database studentRegForm;

create table registration (

firstName varchar(25)NOT NULL,
secondName varchar(25) NOT NULL,
surname varchar (25) NOT NULL,
email  varchar (30)NOT NULL,
studentId varchar (25) NOT NULL UNIQUE,
password  varchar(25) NOT NULL,
mobNumber varchar (10) NOT NULL

primary key(studentId)
)engine=innoDB;