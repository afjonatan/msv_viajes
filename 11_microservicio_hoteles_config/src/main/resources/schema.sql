CREATE TABLE hoteles (
  idhotel number(10) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  categoria number(10) NOT NULL,
  precio number(8,2) NOT NULL,
  disponible number(1) NOT NULL,
  constraint hoteles_pk primary key (idhotel)
);