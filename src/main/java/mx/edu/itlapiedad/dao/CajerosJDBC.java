package mx.edu.itlapiedad.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Cajeros;
@Repository
public class CajerosJDBC implements CajerosDAO {
	@Autowired
	JdbcTemplate conexion;
	String sql;
	
	
	@Override
	public void insertarCajeros(Cajeros ca) {
	sql = "insert into cajeros (nombre) values (?)";
	conexion.update(sql,ca.getNombre());
	}

	@Override
	public void actualizarCajeros(Cajeros ca, int id) {
		// TODO Auto-generated method stub
		sql="UPDATE cajeros set nombre= ? where id=?";
		conexion.update(sql,ca.getNombre(),id);
		
	}
}
