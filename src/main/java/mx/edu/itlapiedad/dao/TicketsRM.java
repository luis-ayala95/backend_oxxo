package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Tickets;

public class TicketsRM implements RowMapper<Tickets>{
	@Override
	public Tickets mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tickets tickets = new Tickets();
		tickets.setId(rs.getInt("id"));
		tickets.setFecha_hora(rs.getString("fecha_hora"));
		tickets.setTotal(rs.getFloat("total"));
		tickets.setCajero_id(rs.getInt("cajero_id"));
		
		return tickets;
	}

}
