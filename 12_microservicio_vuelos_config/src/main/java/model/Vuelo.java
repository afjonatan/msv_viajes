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
 * The persistent class for the vuelos database table.
 * 
 */

@Entity
@Table(name = "vuelos")
@Getter
@Setter
@NoArgsConstructor
public class Vuelo implements Serializable {

	private static final long serialVersionUID = 2127755833476597967L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idvuelo;

	private String company;

	private String fecha;

	private int plazas;

	private double precio;

}