CREATE TABLE reservas (
  idreserva number(10)  NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  dni varchar(45) NOT NULL,
  hotel number(10)  NOT NULL,
  vuelo number(10)  NOT NULL,
   constraint vuelos_pk primary key (idreserva)
);