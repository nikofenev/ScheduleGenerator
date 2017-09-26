-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-09-25 17:12:50.933

-- tables
-- Table: userAvailability
CREATE TABLE userAvailability (
    id int(7) NOT NULL,
    work_date_day date NOT NULL,
    available_from int(2) NOT NULL,
    available_to int(2) NOT NULL,
    typePermOrTemp varchar(10) NOT NULL,
    users_id int NOT NULL,
    CONSTRAINT userAvailability_pk PRIMARY KEY (id)
);

-- Table: userShcedule
CREATE TABLE userShcedule (
    id int(7) NOT NULL,
    start_work int(2) NOT NULL,
    end_work int(2) NOT NULL,
    work_date date NOT NULL,
    users_id int NOT NULL,
    CONSTRAINT userShcedule_pk PRIMARY KEY (id)
);

-- Table: user_roles
CREATE TABLE user_roles (
    user_name varchar(15) NOT NULL,
    role_name varchar(15) NOT NULL,
    CONSTRAINT user_roles_pk PRIMARY KEY (user_name,role_name)
);

-- Table: users
CREATE TABLE users (
    id int NOT NULL,
    user_name varchar(15) NOT NULL,
    user_pass varchar(15) NOT NULL,
    first_name varchar(30) NOT NULL,
    last_name varchar(30) NOT NULL,
    CONSTRAINT users_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: userAvailability_users (table: userAvailability)
ALTER TABLE userAvailability ADD CONSTRAINT userAvailability_users FOREIGN KEY userAvailability_users (users_id)
    REFERENCES users (id);

-- Reference: userShcedule_users (table: userShcedule)
ALTER TABLE userShcedule ADD CONSTRAINT userShcedule_users FOREIGN KEY userShcedule_users (users_id)
    REFERENCES users (id);

-- End of file.

