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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.Ticket_renglonesDAO;

import mx.edu.itlapiedad.models.Ticket_renglones;
import mx.edu.itlapiedad.models.Ticket_renglones_importe;


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
	
	@GetMapping("consultarTickets_renglones")
	public List<Ticket_renglones>consultarTicket_renglones(){
		return repositorio.consultar();
	}
	
	@DeleteMapping("/ticket_renglones/{id}")
	public void eliminarProducto(@PathVariable int id) {
		repositorio.eliminar(id);
	}
	@GetMapping("/consultarTickets_renglonesId/{id}")
	public List<Ticket_renglones>consultarTicket_renglonesId(@PathVariable int id){
		return repositorio.consultarId(id);
	}

	@GetMapping("/TotalImportePorCajero/{id}")
	public List<Ticket_renglones_importe>totalImportePorCajero(@PathVariable int id, @RequestParam String fecha_inicial, @RequestParam String fecha_final ){
		return repositorio.totalImporte(id, fecha_inicial, fecha_final);
	}
		
}
