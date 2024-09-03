CREATE DATABASE SMARTSCAN;
USE SMARTSCAN;

CREATE TABLE  InfoDB (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOMBRE varchar(100) character set  utf8mb4 NOT NULL,
    IDENTIDAD varchar(50) character set utf8mb4 NOT NULL,
    FECHA_NACIMIENTO DATE NULL,
    MOTOR varchar(500) character set utf8mb4 NOT NULL,
    PLACA varchar(50) character set utf8mb4 NOT NULL,
    ANIO INTEGER NOT NULL,
    COLOR varchar(100) character set utf8mb4 NOT NULL,
    CHASIS varchar(100) character set utf8mb4 NOT NULL,
    PAIS varchar(2) character set utf8mb4 NOT NULL
);

select * from InfoDB