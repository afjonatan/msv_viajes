package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Vuelo;
import service.VuelosService;

//@CrossOrigin(origins = "*") Esto se centraliza en el servidor Gateway
@RestController
public class VuelosController {

	@Autowired
	VuelosService service;

	@GetMapping(value = "vuelos/{plazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> devolverVuelos(@PathVariable int plazas) {
		return service.recuperarVuelosDisponibles(plazas);

	}

	@PutMapping(value = "vuelos/{idvuelo}/{plazas}")
	public void modificarVuelo(@PathVariable("idvuelo") int id, @PathVariable int plazas) {
		service.actualizarPlazas(id, plazas);
	}

}
