DROP TABLE if exists t_user;
CREATE TABLE t_user
(
    uid INT auto-increment, -- primary key column
    username VARCHAR(20) NOT NULL UNIQUE,
    password CHAR(32) NOT NULL,
    salt CHAR(36),
    phone VARCHAR(20),
    email VARCHAR(30),
    gender INT,--
    avatar VARCHAR(50),
    is_delete INT,--
    created_user VARCHAR(20),
    created_time DATETIME,
    modified_user VARCHAR(20),
    modified_time DATETIME,
    PRIMARY KEY (uid)
    -- specify more columns here
);