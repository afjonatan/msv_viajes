package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Reserva;
import repository.ReservasJpaSpring;

@Service
public class ReservasServiceImpl implements ReservasService {
	@Autowired
	ReservasJpaSpring reservas;
	@Autowired
	RestTemplate template;
	String url = "http://servicio-vuelos";

	@Override
	public void realizarReserva(Reserva reserva, int totalPersonas) {
		reservas.save(reserva);
		/* Como no le pasamos nada en el cuerpo ponemos null */
		template.put(url + "/vuelos/{p1}/{p2}", null, reserva.getVuelo(), totalPersonas);

	}

	@Override
	public List<Reserva> getReservas() {
		return this.reservas.findAll();
	}

}
