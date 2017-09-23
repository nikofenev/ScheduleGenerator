DROP TABLE IF EXISTS users;
CREATE TABLE users (id int(7) NOT NULL AUTO_INCREMENT, user_name varchar(15) NOT NULL, user_pass varchar(15) NOT NULL, first_name  varchar(25) NOT NULL, last_name  varchar(30) NOT NULL, PRIMARY KEY (id));
INSERT INTO users VALUES (1,'neymar','neymar','Neymar','Junior'),(2,'niko','niko','Nikolay','Fenev');
