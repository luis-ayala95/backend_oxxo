package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.Cajeros;

public interface CajerosDAO {
	void insertarCajeros(Cajeros ca);
	void actualizarCajeros(Cajeros ca, int id);
	List<Cajeros> consultar();
	void eliminar(int id);

}
