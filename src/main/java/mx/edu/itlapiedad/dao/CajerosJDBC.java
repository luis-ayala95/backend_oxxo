package mx.edu.itlapiedad.dao;

import java.util.List;

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

	@Override
	public List<Cajeros> consultar() {
		sql="select * from cajeros";
		return conexion.query(sql, new CajerosRM());
	}

	@Override
	public void eliminar(int id) {
		sql ="delete from cajeros where id=?";
		conexion.update(sql,id);
		
	}

	@Override
	public List<Cajeros> consultarI(int id) {
		sql = "select * from cajeros where id=?";
		return   conexion.query(sql, new CajerosRM(),id);
	}
}
