package mx.edu.itlapiedad.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
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

}
