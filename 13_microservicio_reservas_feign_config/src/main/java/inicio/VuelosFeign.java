package inicio;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(value = "servicio-vuelos")
public interface VuelosFeign {
	@PutMapping(value = "vuelos/{idvuelo}/{plazas}")
	void modificarVuelo(@PathVariable("idvuelo") int id, @PathVariable int plazas);
}
