package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Cajeros;


public class CajerosRM implements RowMapper<Cajeros> {
	@Override
	public Cajeros mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cajeros cajeros = new Cajeros();
		cajeros.setId(rs.getInt("id"));
		cajeros.setNombre(rs.getString("nombre"));
		return cajeros;
	}
}
