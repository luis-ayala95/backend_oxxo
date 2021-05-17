package mx.edu.itlapiedad.sw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("consultaTickets")
	public List<Tickets>consultarTickets(){
		return repositorio.consultar();
	}
	
	@PostMapping("/tickets")
	public void insertarTickets(@RequestBody Tickets ti) {
		repositorio.insertarTickets(ti);
	}
	
	@PutMapping("/tickets/{id}")
	public void actualizar_tickets(@RequestBody Tickets ti, @PathVariable int id) {
		repositorio.actualizarTickets(ti,id);
	}
	@DeleteMapping("/ticketsdelete/{id}")
	public void eliminarTicket(@PathVariable int id) {
	repositorio.eliminar(id);
	}
	@GetMapping("/consultaTicketsId/{id}")
	public List<Tickets>consultarTicketsId(@PathVariable int id){
		return repositorio.consultarId(id);
	}
}
