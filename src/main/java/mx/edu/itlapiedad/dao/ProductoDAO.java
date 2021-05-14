package mx.edu.itlapiedad.dao;

import java.util.List;


import mx.edu.itlapiedad.models.Producto;

public interface ProductoDAO {


	List<Producto> consultar();
	void insertarProducto(Producto pro);
<<<<<<< HEAD
	void actualizarProducto(Producto pro, int id);
=======
	List<Producto> consultarI(int id);
	
>>>>>>> a5f5a2b178dd2b130d746494ace68ab0b8152b7a

}
