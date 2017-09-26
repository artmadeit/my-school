CREATE TABLE PERSON (
	id INT NOT NULL AUTO_INCREMENT,
	first_name varchar(255) NOT NULL,
	last_name varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

insert into PERSON (first_name, last_name) values ('Dave', 'Syer');