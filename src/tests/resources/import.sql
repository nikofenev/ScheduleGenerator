DROP TABLE IF EXISTS userAvailability;
CREATE TABLE userAvailability (id int(7) NOT NULL, work_date_day date NOT NULL, available_from int(2) NOT NULL, available_to int(2) NOT NULL, typePermOrTemp varchar(10) NOT NULL, users_id int NOT NULL, CONSTRAINT userAvailability_pk PRIMARY KEY (id));

DROP TABLE IF EXISTS userShcedule;
CREATE TABLE userShcedule (id int(7) NOT NULL, start_work int(2) NOT NULL, end_work int(2) NOT NULL, work_date date NOT NULL, users_id int NOT NULL, CONSTRAINT userShcedule_pk PRIMARY KEY (id));

DROP TABLE IF EXISTS users_roles;
CREATE TABLE user_roles (user_name varchar(15) NOT NULL, role_name varchar(15) NOT NULL, CONSTRAINT user_roles_pk PRIMARY KEY (user_name,role_name));

DROP TABLE IF EXISTS users;
CREATE TABLE users (id int NOT NULL, user_name varchar(15) NOT NULL, user_pass varchar(15) NOT NULL, first_name varchar(30) NOT NULL, last_name varchar(30) NOT NULL, CONSTRAINT users_pk PRIMARY KEY (id));

ALTER TABLE userAvailability ADD CONSTRAINT userAvailability_users FOREIGN KEY userAvailability_users (users_id)
REFERENCES users (id);

ALTER TABLE userShcedule ADD CONSTRAINT userShcedule_users FOREIGN KEY userShcedule_users (users_id)
REFERENCES users (id);

INSERT INTO users VALUES (1,'neymar','neymar','Neymar','Junior'),(2,'niko','niko','Nikolay','Fenev');


