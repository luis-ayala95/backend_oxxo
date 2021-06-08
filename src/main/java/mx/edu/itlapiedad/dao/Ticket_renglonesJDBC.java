package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Ticket_renglones;


@Repository
public class Ticket_renglonesJDBC implements Ticket_renglonesDAO{
	@Autowired
	JdbcTemplate conexion;
	String sql;
	
	@Override
	public void insertarTicket_renglones(Ticket_renglones ti_ren) {
	sql = "insert into ticket_renglones (ticket_id,producto_id,cantidad, precio ) values (?,?,?,?)";
	conexion.update(sql,ti_ren.getTicket_id(), ti_ren.getProducto_id(), ti_ren.getCantidad(), ti_ren.getPrecio());
	}

	@Override
	public void actualizarTicket_renglones(Ticket_renglones ti_ren, int id) {
		sql="UPDATE ticket_renglones set ticket_id= ?, producto_id=?, cantidad=?, precio=? where id=?";
	conexion.update(sql,ti_ren.getTicket_id(),ti_ren.getProducto_id(),ti_ren.getCantidad(),ti_ren.getPrecio(),id);
		
	}
	@Override
	public List<Ticket_renglones> totalImporte(int id) {
		sql="select tickets.cajero_id, sum(ticket_renglones.importe) as totalImporte" + 
				"from ticket_renglones" + 
				"join tickets on ticket_renglones.TICKET_id = tickets.id" + 
				"join cajeros on cajeros.id=tickets.CAJERO_id" + 
				"where cajeros.id=?;";
		return conexion.query(sql, new Ticket_renglonesRM());
	}

}
