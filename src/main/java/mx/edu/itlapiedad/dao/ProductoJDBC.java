package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Producto;

@Repository
public class ProductoJDBC implements ProductoDAO {
@Autowired
JdbcTemplate conexion;
String sql;
	@Override
	public List<Producto> consultar() {
		sql = "select * from productos";
		return conexion.query(sql, new ProductoRM());
	}

}
