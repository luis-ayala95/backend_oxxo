package mx.edu.itlapiedad.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import mx.edu.itlapiedad.dao.TicketsDAO;
import mx.edu.itlapiedad.models.Tickets;
@RestController
@RequestMapping("/app")

public class OperacionesTickets {
	@Autowired
	TicketsDAO repositorio;

	
	@PostMapping("/tickets")
	public void insertarTickets(@RequestBody Tickets ti) {
		repositorio.insertarTickets(ti);
	}
	
	@PutMapping("/tickets/{id}")
	public void actualizar_tickets(@RequestBody Tickets ti, @PathVariable int id) {
		repositorio.actualizarTickets(ti,id);
	}
	
}
