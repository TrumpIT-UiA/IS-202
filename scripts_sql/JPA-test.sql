create database slit;

use slit;

create table student (
	student_id integer NOT NULL AUTO_INCREMENT,
    address varchar(60) NOT NULL,
	name varchar(90) NOT NULL,
    PRIMARY KEY (student_id)
    );
    