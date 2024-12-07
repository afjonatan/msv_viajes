CREATE TABLE vuelos (
  idvuelo number(10)  NOT NULL AUTO_INCREMENT,
  company varchar(45) NOT NULL,
  fecha varchar(45) NOT NULL,
  precio NUMBER(10,2) NOT NULL,
  plazas number(10)  NOT NULL,
  constraint vuelos_pk primary key (idvuelo)
);