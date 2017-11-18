-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-10-06 03:30:13.582

-- tables
-- Table: shiftsPermanent
CREATE TABLE shiftsPermanent (
    id int NOT NULL,
    work_day varchar(12) NOT NULL,
    open_time decimal(4,2) NOT NULL,
    close_time decimal(4,2) NOT NULL,
    CONSTRAINT shiftsPermanent_pk PRIMARY KEY (id)
);

-- Table: storeHours
CREATE TABLE storeHours (
    id int NOT NULL,
    work_date date NOT NULL,
    open_time decimal(4,2) NOT NULL,
    close_time decimal(4,2) NOT NULL,
    store_closed bool NOT NULL,
    stores_id int NOT NULL,
    CONSTRAINT storeHours_pk PRIMARY KEY (id)
);

-- Table: storeShifts
CREATE TABLE storeShifts (
    id int NOT NULL,
    stores_id int NOT NULL,
    shiftsPermanent_id int NOT NULL,
    CONSTRAINT storeShifts_pk PRIMARY KEY (id)
);

-- Table: stores
CREATE TABLE stores (
    id int NOT NULL,
    store_name varchar(30) NOT NULL,
    users_id int NOT NULL,
    CONSTRAINT stores_pk PRIMARY KEY (id)
);

-- Table: userAvailabilityPermanent
CREATE TABLE userAvailabilityPermanent (
    id int(7) NOT NULL,
    work_day varchar(12) NOT NULL,
    available_from int(2) NOT NULL,
    available_to int(2) NOT NULL,
    users_id int NOT NULL,
    CONSTRAINT userAvailabilityPermanent_pk PRIMARY KEY (id)
);

-- Table: userAvailabilityTemporary
CREATE TABLE userAvailabilityTemporary (
    id int NOT NULL,
    work_date date NOT NULL,
    available_from int(2) NOT NULL,
    available_to int(2) NOT NULL,
    day_off bool NOT NULL,
    users_id int NOT NULL,
    CONSTRAINT userAvailabilityTemporary_pk PRIMARY KEY (id)
);

-- Table: userSchedule
CREATE TABLE userSchedule (
    id int(7) NOT NULL,
    start_work int(2) NOT NULL,
    end_work int(2) NOT NULL,
    work_date date NOT NULL,
    users_id int NOT NULL,
    CONSTRAINT userSchedule_pk PRIMARY KEY (id)
);

-- Table: user_roles
CREATE TABLE user_roles (
    user_name varchar(15) NOT NULL,
    role_name varchar(15) NOT NULL,
    users_id int NOT NULL,
    CONSTRAINT user_roles_pk PRIMARY KEY (user_name,role_name)
);

-- Table: users
CREATE TABLE users (
    id int NOT NULL,
    user_name varchar(15) NOT NULL,
    user_pass varchar(15) NOT NULL,
    first_name varchar(30) NOT NULL,
    last_name varchar(30) NOT NULL,
    job_title varchar(20) NOT NULL,
    performance int(1) NOT NULL,
    CONSTRAINT users_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: storeHours_stores (table: storeHours)
ALTER TABLE storeHours ADD CONSTRAINT storeHours_stores FOREIGN KEY storeHours_stores (stores_id)
REFERENCES stores (id);

-- Reference: storeShifts_shiftsPermanent (table: storeShifts)
ALTER TABLE storeShifts ADD CONSTRAINT storeShifts_shiftsPermanent FOREIGN KEY storeShifts_shiftsPermanent (shiftsPermanent_id)
REFERENCES storeShifts (id);

-- Reference: storeShifts_stores (table: storeShifts)
ALTER TABLE storeShifts ADD CONSTRAINT storeShifts_stores FOREIGN KEY storeShifts_stores (stores_id)
REFERENCES stores (id);

-- Reference: stores_users (table: stores)
ALTER TABLE stores ADD CONSTRAINT stores_users FOREIGN KEY stores_users (users_id)
REFERENCES users (id);

-- Reference: userAvailabilityTemporary_users (table: userAvailabilityTemporary)
ALTER TABLE userAvailabilityTemporary ADD CONSTRAINT userAvailabilityTemporary_users FOREIGN KEY userAvailabilityTemporary_users (users_id)
REFERENCES users (id);

-- Reference: userAvailability_users (table: userAvailabilityPermanent)
ALTER TABLE userAvailabilityPermanent ADD CONSTRAINT userAvailability_users FOREIGN KEY userAvailability_users (users_id)
REFERENCES users (id);

-- Reference: userSchedule_users (table: userSchedule)
ALTER TABLE userSchedule ADD CONSTRAINT userSchedule_users FOREIGN KEY userSchedule_users (users_id)
REFERENCES users (id);

-- Reference: user_roles_users (table: user_roles)
ALTER TABLE user_roles ADD CONSTRAINT user_roles_users FOREIGN KEY user_roles_users (users_id)
REFERENCES users (id);

INSERT INTO users VALUES (1,'admin','admin','Admin','Adminov','manager',5),(2,'niko','niko','Nikolay','Fenev','bartender',5);
INSERT INTO user_roles VALUES ('admin','administrator', 1),('niko','registered-user', 2);

-- End of file.


