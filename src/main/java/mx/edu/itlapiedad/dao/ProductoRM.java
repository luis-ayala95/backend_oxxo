package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Producto;

public class ProductoRM implements RowMapper<Producto>{

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Producto producto = new Producto();
		producto.setId(rs.getInt("id"));
		producto.setDescripcion(rs.getString("descripcion"));
		producto.setPrecio(rs.getInt("precio"));
		producto.setCodigo_barras(rs.getString("codigo_barras"));
		producto.setExistencia(rs.getInt("existencia"));
		return producto;
	}

}
