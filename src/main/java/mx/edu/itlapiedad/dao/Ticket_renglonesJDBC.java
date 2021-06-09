package mx.edu.itlapiedad.dao;

import java.security.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import mx.edu.itlapiedad.models.Ticket_renglones;
import mx.edu.itlapiedad.models.Ticket_renglones_importe;


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
	public void eliminar(int id) {
		sql = "delete from ticket_renglones where id=?";
		conexion.update(sql, id);
		
	}

	@Override
	public List<Ticket_renglones> consultar() {
		sql = "select * from  ticket_renglones";
		return conexion.query(sql, new Ticket_renglonesRM());
	}

	@Override
	public List<Ticket_renglones> consultarId(int id) {
		// TODO Auto-generated method stub
		sql = "select * from  ticket_renglones where id=?";
		return conexion.query(sql, new Ticket_renglonesRM(),id);
	}

	@Override
	public List<Ticket_renglones> totalImporte(int cajero_id, Timestamp fecha_hora) {
		sql="select tickets.cajero_id, sum(ticket_renglones.importe) as totalImporte "
				+ "from ticket_renglones join tickets "
				+ "on ticket_renglones.TICKET_id = tickets.id "
				+ "join cajeros on cajeros.id=tickets.CAJERO_id"
				+ "where tickets.cajero_id=? and tickets.fecha_hora between ? and ?";
		return conexion.query(sql, new Ticket_renglonesRM(),cajero_id,fecha_hora);
	}
	@Override
	public List<Ticket_renglones_importe> buscar_importe_cajero_fecha(int id,Timestamp fecha_hora) {
		
		String sql_query = "SELECT  cajeros.id, sum(importe) as importe, tickets.fecha_hora "
				+ "FROM ticket_renglones  "
				+ "JOIN tickets ON ticket_renglones.TICKET_id = tickets.id "
				+ "JOIN cajeros  ON cajeros.id=tickets.CAJERO_id  "
				+ "WHERE  cajeros.id=? and fecha_hora between ? and ?";
		return conexion.query(sql_query, new RowMapper<Ticket_renglones_importe>() {
			public Ticket_renglones_importe mapRow(ResultSet rs, int rowNum) throws SQLException {
				Ticket_renglones_importe 
				ticket_renglones = new Ticket_renglones_importe();
				ticket_renglones.setImporte(rs.getFloat("importe"));

				return ticket_renglones;

			
			}

		}, id,fecha_hora);
	}

}
