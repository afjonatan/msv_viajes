package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Vuelo;
import repository.VuelosRepository;

@Service
public class VuelosServiceImpl implements VuelosService {
	@Autowired
	VuelosRepository repository;

	@Override
	public List<Vuelo> recuperarVuelosDisponibles(int plazas) {
		return repository.findAll().stream().filter(t -> t.getPlazas() >= plazas).collect(Collectors.toList());
	}

	@Override
	public void actualizarPlazas(int id, int plazas) {
		Vuelo vuelo = repository.findById(id).orElse(null);
		if (vuelo != null) {
			vuelo.setPlazas(vuelo.getPlazas() - plazas);
			repository.save(vuelo);
		}

	}

}
