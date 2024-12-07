package model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the hoteles database table.
 * 
 */
@Entity
@Table(name = "hoteles")
@Getter
@Setter
@NoArgsConstructor
public class Hotel implements Serializable {

	private static final long serialVersionUID = 5656410144879725816L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idhotel;

	private int categoria;

	private byte disponible;

	private String nombre;

	private double precio;

}