package mx.edu.itlapiedad.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.CajerosDAO;
import mx.edu.itlapiedad.models.Cajeros;


@RestController
@RequestMapping("/app")
public class OperacionesCajeros {
	@Autowired
	CajerosDAO repositorio;
	
	
	@PostMapping("/cajeros")
	public void insertarCajeros(@RequestBody Cajeros ca) {
		repositorio.insertarCajeros(ca);
	}
	
	@PutMapping("/cajeros/{id}")
	public void actualizar_cajeros(@RequestBody Cajeros ca,
			@PathVariable int id) {
		repositorio.actualizarCajeros(ca,id);
	}
	
}
