package mx.edu.itlapiedad.dao;

import java.util.List;


import mx.edu.itlapiedad.models.Producto;

public interface ProductoDAO {


	List<Producto> consultar();
	void insertarProducto(Producto pro);
    void actualizarProducto(Producto pro, int id);
    List<Producto> consultarI(int id);
	void eliminar(int id);
	
	
    
	

}
