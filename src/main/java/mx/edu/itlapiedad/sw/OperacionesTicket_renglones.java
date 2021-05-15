package mx.edu.itlapiedad.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.Ticket_renglonesDAO;
import mx.edu.itlapiedad.models.Ticket_renglones;


@RestController
@RequestMapping("/app")
public class OperacionesTicket_renglones {
	@Autowired
	Ticket_renglonesDAO repositorio;

	
	@PostMapping("/ticket_renglones")
	public void insertarTicket_renglones(@RequestBody Ticket_renglones ti_ren) {
		repositorio.insertarTicket_renglones(ti_ren);
	}
	
	@PutMapping("/ticket_renglones/{id}")
	public void actualizar_ticket_renglones(@RequestBody Ticket_renglones ti_ren, @PathVariable int id) {
		repositorio.actualizarTicket_renglones(ti_ren,id);
	}
	
}
