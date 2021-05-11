package mx.edu.itlapiedad.dao;

import java.util.List;


import mx.edu.itlapiedad.models.Producto;

public interface ProductoDAO {


	List<Producto> consultar();
	void insertarProducto(Producto pro);
	List<Producto> consultarI(int id);
	

}
