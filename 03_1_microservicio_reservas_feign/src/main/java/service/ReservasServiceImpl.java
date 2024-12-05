package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inicio.VuelosFeign;
import model.Reserva;
import repository.ReservasJpaSpring;

@Service
public class ReservasServiceImpl implements ReservasService {
	@Autowired
	ReservasJpaSpring reservas;

	@Autowired
	VuelosFeign feignVuelos;

	@Override
	public void realizarReserva(Reserva reserva, int totalPersonas) {
		reservas.save(reserva);

		feignVuelos.modificarVuelo(reserva.getVuelo(), totalPersonas);

//		template.put(url + "/vuelos/{p1}/{p2}", null, reserva.getVuelo(), totalPersonas);

	}

	@Override
	public List<Reserva> getReservas() {
		return this.reservas.findAll();
	}

}
