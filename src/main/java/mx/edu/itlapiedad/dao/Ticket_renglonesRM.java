package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Ticket_renglones;

public class Ticket_renglonesRM implements RowMapper<Ticket_renglones>{
	@Override
	public Ticket_renglones mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ticket_renglones ticket_ren = new Ticket_renglones();
		ticket_ren.setId(rs.getInt("id"));
		ticket_ren.setTicket_id(rs.getInt("ticket_id"));
		ticket_ren.setProducto_id(rs.getInt("producto_id"));
		ticket_ren.setCantidad(rs.getInt("cantidad"));
		ticket_ren.setPrecio(rs.getFloat("total"));
		ticket_ren.setImporte(rs.getFloat("importe"));
		
		return ticket_ren;
	}


}
