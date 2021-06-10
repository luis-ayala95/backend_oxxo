package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Ticket_renglones_importe;
import mx.edu.itlapiedad.models.Tickets;

@Repository
public class TicketsJDBC implements TicketsDAO{
	@Autowired
	JdbcTemplate conexion;
	String sql;
	
	@Override
	public void insertarTickets(Tickets ti) {
	sql = "insert into tickets (fecha_hora,total,cajero_id ) values (?,?,?)";
	conexion.update(sql,ti.getFecha_hora(), ti.getTotal(), ti.getCajero_id() );
	}

	@Override
	public void actualizarTickets(Tickets ti, int id) {
		sql="UPDATE tickets set fecha_hora= ?, total=?, cajero_id=? where id=?";
		conexion.update(sql,ti.getFecha_hora(),ti.getTotal(), ti.getCajero_id(),id);
		
	}

	@Override
	public List<Tickets> consultar() {
		sql = "select * from tickets";
		return conexion.query(sql, new TicketsRM());
		
	}

	@Override
	public void eliminar(int id) {
		sql = "delete from tickets where id=?";
		conexion.update(sql,id);
		
	}

	@Override
	public List<Tickets> consultarId(int id) {
		sql = "select * from tickets where id=?";
		return conexion.query(sql, new TicketsRM(),id);
	}
/*
	@Override
	public List<Ticket_renglones_importe> totalImporte() {
		sql="select cajeros.id, sum(importe) as totalImporte, cajeros.nombre"
				+ "from ticket_renglones "
				+ "join tickets "
				+ "on ticket_renglones.TICKET_id = tickets.id "
				+ "join cajeros on cajeros.id=tickets.CAJERO_id"
				+ "where id=1";
		return conexion.query(sql, new Ticket_renglones_importeRM());
	}*/
}
