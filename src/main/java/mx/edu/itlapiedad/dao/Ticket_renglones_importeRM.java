package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Ticket_renglones_importe;


public class Ticket_renglones_importeRM implements RowMapper<Ticket_renglones_importe>{
	@Override
	public Ticket_renglones_importe mapRow(ResultSet rs, int rowNum) throws SQLException {

		Ticket_renglones_importe ticket_ren = new Ticket_renglones_importe();
		ticket_ren.setId(rs.getInt("id"));
		ticket_ren.setImporte(rs.getFloat("totalImporte"));
		ticket_ren.setNombre(rs.getString("nombre"));
		
		return ticket_ren;

	}


	
}

	
