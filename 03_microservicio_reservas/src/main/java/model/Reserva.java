package model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the reservas database table.
 * 
 */
@Entity
@Table(name = "reservas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reserva implements Serializable {

	private static final long serialVersionUID = 3446550764009693823L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idreserva;

	private String dni;

	private int hotel;

	private String nombre;

	private int vuelo;

}