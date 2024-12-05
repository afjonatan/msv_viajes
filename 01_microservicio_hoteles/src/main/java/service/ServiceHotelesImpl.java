package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Hotel;
import repository.HotelesRepository;

@Service
public class ServiceHotelesImpl implements ServiceHoteles {

	@Autowired
	HotelesRepository repository;

	@Override
	public List<Hotel> devolverHotelesDisponibles() {
		List<Hotel> hoteles = this.repository.findAll();
		return hoteles.stream().filter(t -> t.getDisponible() == 1).collect(Collectors.toList());
	}

}
